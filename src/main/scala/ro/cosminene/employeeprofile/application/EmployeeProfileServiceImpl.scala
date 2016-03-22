package ro.cosminene.employeeprofile.application

import ro.cosminene.employeeprofile.domain.{Contact, EmployeeProfile, Name, Position}
import ro.cosminene.employeeprofile.infrastructure.MapEmployeeProfileRepository

class EmployeeProfileServiceImpl extends EmployeeProfileService {

  private val repository: MapEmployeeProfileRepository = new MapEmployeeProfileRepository()

  def createEmployeeProfile(data: EmployeeProfileData): String = {

    val id: String = repository.uniqueId()
    val name: Name = Name(data.firstName, data.lastName)
    val contact: Contact = Contact(data.phone, data.email)
    val position: Position = Position(data.positionId, data.positionTitle, data.positionGrade)
    val profile = EmployeeProfile(id, name, contact, position)

    repository.save(profile)
    profile.id
  }

  override def retrieveEmployeeProfile(profileId: String): Option[EmployeeProfileData] = {

    val profile: EmployeeProfile = repository.read(profileId).get
    Some(EmployeeProfileData(Some(profile.id),
      profile.name.first, profile.name.last,
      profile.contact.phone, profile.contact.email,
      profile.position.id, profile.position.title, profile.position.grade))
  }
}
