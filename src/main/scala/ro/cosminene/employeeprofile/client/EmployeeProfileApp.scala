package ro.cosminene.employeeprofile.client

import ro.cosminene.employeeprofile.application.{EmployeeProfileData, EmployeeProfileServiceImpl}

object EmployeeProfileApp extends App {

  val inputEmployeeProfileData = EmployeeProfileData(
    None,
    "John", "Doe",
    "0040720000000", "john.doe@domain.com",
    "1", "Chief Mint Rubber", "C-Level")
  val employeeProfileServiceImpl: EmployeeProfileServiceImpl = new EmployeeProfileServiceImpl()

  val id = employeeProfileServiceImpl.createEmployeeProfile(inputEmployeeProfileData)
  println(s"Added employee profile with id: $id")
  println(inputEmployeeProfileData)

  private val outputEmployeeProfileData: EmployeeProfileData = employeeProfileServiceImpl.retrieveEmployeeProfile(id).get
  println("Retrieved employee profile data:")
  println(outputEmployeeProfileData)
}
