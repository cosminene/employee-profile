package ro.cosminene.employeeprofile.domain

trait EmployeeProfileRepository extends Repository {

  def uniqueId(): String

  def save(profile: EmployeeProfile): Unit

  def read(profileId: String): Option[EmployeeProfile]

  def find(): Set[EmployeeProfile]
}
