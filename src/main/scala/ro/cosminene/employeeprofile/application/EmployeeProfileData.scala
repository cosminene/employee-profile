package ro.cosminene.employeeprofile.application

case class EmployeeProfileData(id: Option[String],
                               firstName: String, lastName: String,
                               phone: String, email: String,
                               positionId: String, positionTitle: String, positionGrade: String)
  extends DataTransferObject
