package ro.cosminene.employeeprofile.application

trait EmployeeProfileService extends ApplicationService {

  def createEmployeeProfile(data: EmployeeProfileData): String

  def retrieveEmployeeProfile(profileId: String): Option[EmployeeProfileData]
}