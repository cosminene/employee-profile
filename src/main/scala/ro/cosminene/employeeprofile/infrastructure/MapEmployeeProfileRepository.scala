package ro.cosminene.employeeprofile.infrastructure

import java.util.UUID

import scala.collection._
import ro.cosminene.employeeprofile.domain.{EmployeeProfile, EmployeeProfileRepository, Position}

class MapEmployeeProfileRepository extends EmployeeProfileRepository {

  import MapEmployeeProfileRepository._

  override def uniqueId(): String = UUID.randomUUID().toString

  override def save(profile: EmployeeProfile): Unit = {
    employeeProfiles(profile.id) = profile
  }

  override def read(profileId: String): Option[EmployeeProfile] = {
    employeeProfiles.get(profileId)
  }

  override def find(): immutable.Set[EmployeeProfile] = {
    employeeProfiles.valuesIterator.toSet
  }
}

object MapEmployeeProfileRepository {

  val employeeProfiles: mutable.Map[String, EmployeeProfile] = mutable.Map()
  val positions: mutable.Map[String, Position] = mutable.Map("1" -> Position("1", "Chief Mint Rubber", "C Grade"))
}
