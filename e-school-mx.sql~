-- MySQL dump 10.13  Distrib 5.5.42, for linux2.6 (x86_64)
--
-- Host: localhost    Database: villaeducativa
-- ------------------------------------------------------
-- Server version	5.5.42

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES UTF8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `activity_feed`
--

DROP TABLE IF EXISTS `activity_feed`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `activity_feed` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `initiator_id` int(11) NOT NULL,
  `activity_type` int(11) NOT NULL,
  `goal_id` int(11) DEFAULT NULL,
  `goal_name` varchar(120) DEFAULT NULL,
  `field_name` varchar(120) DEFAULT NULL,
  `initial_field_value` varchar(120) DEFAULT NULL,
  `new_field_value` varchar(120) DEFAULT NULL,
  `activity_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `activity_feed`
--

LOCK TABLES `activity_feed` WRITE;
/*!40000 ALTER TABLE `activity_feed` DISABLE KEYS */;
/*!40000 ALTER TABLE `activity_feed` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `activity_type`
--

DROP TABLE IF EXISTS `activity_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `activity_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(120) NOT NULL,
  `text` varchar(120) NOT NULL,
  `color_code` varchar(120) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `activity_type`
--

LOCK TABLES `activity_type` WRITE;
/*!40000 ALTER TABLE `activity_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `activity_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `additional_exam_groups`
--

DROP TABLE IF EXISTS `additional_exam_groups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `additional_exam_groups` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `batch_id` int(11) DEFAULT NULL,
  `exam_type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_published` tinyint(1) DEFAULT '0',
  `result_published` tinyint(1) DEFAULT '0',
  `students_list` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `exam_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `additional_exam_groups`
--

LOCK TABLES `additional_exam_groups` WRITE;
/*!40000 ALTER TABLE `additional_exam_groups` DISABLE KEYS */;
/*!40000 ALTER TABLE `additional_exam_groups` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `additional_exam_scores`
--

DROP TABLE IF EXISTS `additional_exam_scores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `additional_exam_scores` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `additional_exam_id` int(11) DEFAULT NULL,
  `marks` decimal(7,2) DEFAULT NULL,
  `grading_level_id` int(11) DEFAULT NULL,
  `remarks` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_failed` tinyint(1) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `additional_exam_scores`
--

LOCK TABLES `additional_exam_scores` WRITE;
/*!40000 ALTER TABLE `additional_exam_scores` DISABLE KEYS */;
/*!40000 ALTER TABLE `additional_exam_scores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `additional_exams`
--

DROP TABLE IF EXISTS `additional_exams`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `additional_exams` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `additional_exam_group_id` int(11) DEFAULT NULL,
  `subject_id` int(11) DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `maximum_marks` int(11) DEFAULT NULL,
  `minimum_marks` int(11) DEFAULT NULL,
  `grading_level_id` int(11) DEFAULT NULL,
  `weightage` int(11) DEFAULT '0',
  `event_id` int(11) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `additional_exams`
--

LOCK TABLES `additional_exams` WRITE;
/*!40000 ALTER TABLE `additional_exams` DISABLE KEYS */;
/*!40000 ALTER TABLE `additional_exams` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `additional_fields`
--

DROP TABLE IF EXISTS `additional_fields`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `additional_fields` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `additional_fields`
--

LOCK TABLES `additional_fields` WRITE;
/*!40000 ALTER TABLE `additional_fields` DISABLE KEYS */;
/*!40000 ALTER TABLE `additional_fields` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `allotment`
--

DROP TABLE IF EXISTS `allotment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `allotment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` varchar(120) DEFAULT NULL,
  `bed_no` varchar(120) DEFAULT NULL,
  `room_no` varchar(120) DEFAULT NULL,
  `floor` varchar(120) DEFAULT NULL,
  `status` varchar(120) DEFAULT NULL,
  `created` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `allotment`
--

LOCK TABLES `allotment` WRITE;
/*!40000 ALTER TABLE `allotment` DISABLE KEYS */;
/*!40000 ALTER TABLE `allotment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `apply_leaves`
--

DROP TABLE IF EXISTS `apply_leaves`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `apply_leaves` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` int(11) DEFAULT NULL,
  `employee_leave_types_id` int(11) DEFAULT NULL,
  `is_half_day` tinyint(1) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `reason` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `approved` tinyint(1) DEFAULT '0',
  `viewed_by_manager` tinyint(1) DEFAULT '0',
  `manager_remark` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `apply_leaves`
--

LOCK TABLES `apply_leaves` WRITE;
/*!40000 ALTER TABLE `apply_leaves` DISABLE KEYS */;
/*!40000 ALTER TABLE `apply_leaves` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `archived_employee_additional_details`
--

DROP TABLE IF EXISTS `archived_employee_additional_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `archived_employee_additional_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` int(11) DEFAULT NULL,
  `additional_field_id` int(11) DEFAULT NULL,
  `additional_info` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `archived_employee_additional_details`
--

LOCK TABLES `archived_employee_additional_details` WRITE;
/*!40000 ALTER TABLE `archived_employee_additional_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `archived_employee_additional_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `archived_employee_bank_details`
--

DROP TABLE IF EXISTS `archived_employee_bank_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `archived_employee_bank_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` int(11) DEFAULT NULL,
  `bank_field_id` int(11) DEFAULT NULL,
  `bank_info` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `archived_employee_bank_details`
--

LOCK TABLES `archived_employee_bank_details` WRITE;
/*!40000 ALTER TABLE `archived_employee_bank_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `archived_employee_bank_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `archived_employee_salary_structures`
--

DROP TABLE IF EXISTS `archived_employee_salary_structures`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `archived_employee_salary_structures` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` int(11) DEFAULT NULL,
  `payroll_category_id` int(11) DEFAULT NULL,
  `amount` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `archived_employee_salary_structures`
--

LOCK TABLES `archived_employee_salary_structures` WRITE;
/*!40000 ALTER TABLE `archived_employee_salary_structures` DISABLE KEYS */;
/*!40000 ALTER TABLE `archived_employee_salary_structures` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `archived_employees`
--

DROP TABLE IF EXISTS `archived_employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `archived_employees` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_category_id` int(11) DEFAULT NULL,
  `employee_number` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `joining_date` date DEFAULT NULL,
  `first_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `middle_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gender` tinyint(1) DEFAULT NULL,
  `job_title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `employee_position_id` int(11) DEFAULT NULL,
  `employee_department_id` int(11) DEFAULT NULL,
  `reporting_manager_id` int(11) DEFAULT NULL,
  `employee_grade_id` int(11) DEFAULT NULL,
  `qualification` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `experience_detail` text COLLATE utf8_unicode_ci,
  `experience_year` int(11) DEFAULT NULL,
  `experience_month` int(11) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `status_description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `marital_status` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `children_count` int(11) DEFAULT NULL,
  `father_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `mother_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `husband_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `blood_group` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nationality_id` int(11) DEFAULT NULL,
  `home_address_line1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `home_address_line2` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `home_city` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `home_state` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `home_country_id` int(11) DEFAULT NULL,
  `home_pin_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_address_line1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_address_line2` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_city` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_state` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_country_id` int(11) DEFAULT NULL,
  `office_pin_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_phone1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_phone2` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `mobile_phone` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `home_phone` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fax` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `photo_file_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `photo_content_type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `photo_data` mediumblob,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `photo_file_size` int(11) DEFAULT NULL,
  `former_id` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `archived_employees`
--

LOCK TABLES `archived_employees` WRITE;
/*!40000 ALTER TABLE `archived_employees` DISABLE KEYS */;
/*!40000 ALTER TABLE `archived_employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `archived_exam_scores`
--

DROP TABLE IF EXISTS `archived_exam_scores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `archived_exam_scores` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `exam_id` int(11) DEFAULT NULL,
  `marks` decimal(7,2) DEFAULT NULL,
  `grading_level_id` int(11) DEFAULT NULL,
  `remarks` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_failed` tinyint(1) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index_archived_exam_scores_on_student_id_and_exam_id` (`student_id`,`exam_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `archived_exam_scores`
--

LOCK TABLES `archived_exam_scores` WRITE;
/*!40000 ALTER TABLE `archived_exam_scores` DISABLE KEYS */;
/*!40000 ALTER TABLE `archived_exam_scores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `archived_guardians`
--

DROP TABLE IF EXISTS `archived_guardians`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `archived_guardians` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ward_id` int(11) DEFAULT NULL,
  `first_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `relation` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_phone1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_phone2` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `mobile_phone` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_address_line1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_address_line2` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `city` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `state` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `country_id` int(11) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `occupation` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `income` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `education` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `archived_guardians`
--

LOCK TABLES `archived_guardians` WRITE;
/*!40000 ALTER TABLE `archived_guardians` DISABLE KEYS */;
/*!40000 ALTER TABLE `archived_guardians` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `archived_students`
--

DROP TABLE IF EXISTS `archived_students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `archived_students` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `admission_no` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `class_roll_no` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `admission_date` date DEFAULT NULL,
  `first_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `middle_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `batch_id` int(11) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `gender` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `blood_group` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `birth_place` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nationality_id` int(11) DEFAULT NULL,
  `language` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `religion` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `student_category_id` int(11) DEFAULT NULL,
  `address_line1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address_line2` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `city` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `state` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pin_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `country_id` int(11) DEFAULT NULL,
  `phone1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `phone2` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `photo_file_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `photo_content_type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `photo_data` mediumblob,
  `status_description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_active` tinyint(1) DEFAULT '1',
  `is_deleted` tinyint(1) DEFAULT '0',
  `immediate_contact_id` int(11) DEFAULT NULL,
  `is_sms_enabled` tinyint(1) DEFAULT '1',
  `former_id` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `photo_file_size` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `archived_students`
--

LOCK TABLES `archived_students` WRITE;
/*!40000 ALTER TABLE `archived_students` DISABLE KEYS */;
/*!40000 ALTER TABLE `archived_students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assets`
--

DROP TABLE IF EXISTS `assets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assets` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` text COLLATE utf8_unicode_ci,
  `amount` int(11) DEFAULT NULL,
  `is_inactive` tinyint(1) DEFAULT '0',
  `is_deleted` tinyint(1) DEFAULT '0',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assets`
--

LOCK TABLES `assets` WRITE;
/*!40000 ALTER TABLE `assets` DISABLE KEYS */;
/*!40000 ALTER TABLE `assets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attendances`
--

DROP TABLE IF EXISTS `attendances`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attendances` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `period_table_entry_id` int(11) DEFAULT NULL,
  `forenoon` tinyint(1) DEFAULT '0',
  `afternoon` tinyint(1) DEFAULT '0',
  `reason` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendances`
--

LOCK TABLES `attendances` WRITE;
/*!40000 ALTER TABLE `attendances` DISABLE KEYS */;
/*!40000 ALTER TABLE `attendances` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `authassignment`
--

DROP TABLE IF EXISTS `authassignment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `authassignment` (
  `itemname` varchar(64) NOT NULL,
  `userid` varchar(64) NOT NULL,
  `bizrule` text,
  `data` text,
  PRIMARY KEY (`itemname`,`userid`),
  CONSTRAINT `authassignment_ibfk_1` FOREIGN KEY (`itemname`) REFERENCES `authitem` (`name`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authassignment`
--

LOCK TABLES `authassignment` WRITE;
/*!40000 ALTER TABLE `authassignment` DISABLE KEYS */;
INSERT INTO `authassignment` VALUES ('Admin','1',NULL,'N;');
/*!40000 ALTER TABLE `authassignment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `authitem`
--

DROP TABLE IF EXISTS `authitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `authitem` (
  `name` varchar(64) NOT NULL,
  `type` int(11) NOT NULL,
  `description` text,
  `bizrule` text,
  `data` text,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authitem`
--

LOCK TABLES `authitem` WRITE;
/*!40000 ALTER TABLE `authitem` DISABLE KEYS */;
INSERT INTO `authitem` VALUES ('Accounting.*',1,NULL,NULL,'N;'),('Accounting.Add',0,NULL,NULL,'N;'),('Accounting.Admin',0,NULL,NULL,'N;'),('Accounting.Assesments',0,NULL,NULL,'N;'),('Accounting.Attentance',0,NULL,NULL,'N;'),('Accounting.Batch',0,NULL,NULL,'N;'),('Accounting.Create',0,NULL,NULL,'N;'),('Accounting.Delete',0,NULL,NULL,'N;'),('Accounting.Events',0,NULL,NULL,'N;'),('Accounting.Index',0,NULL,NULL,'N;'),('Accounting.Manage',0,NULL,NULL,'N;'),('Accounting.Savesearch',0,NULL,NULL,'N;'),('Accounting.Update',0,NULL,NULL,'N;'),('Accounting.View',0,NULL,NULL,'N;'),('Accounting.Website',0,NULL,NULL,'N;'),('Admin',2,NULL,NULL,'N;'),('Assesments.*',1,NULL,NULL,'N;'),('Assesments.Add',0,NULL,NULL,'N;'),('Assesments.Admin',0,NULL,NULL,'N;'),('Assesments.Assesments',0,NULL,NULL,'N;'),('Assesments.Attentance',0,NULL,NULL,'N;'),('Assesments.Batch',0,NULL,NULL,'N;'),('Assesments.Create',0,NULL,NULL,'N;'),('Assesments.Delete',0,NULL,NULL,'N;'),('Assesments.Events',0,NULL,NULL,'N;'),('Assesments.Index',0,NULL,NULL,'N;'),('Assesments.Manage',0,NULL,NULL,'N;'),('Assesments.Savesearch',0,NULL,NULL,'N;'),('Assesments.Update',0,NULL,NULL,'N;'),('Assesments.View',0,NULL,NULL,'N;'),('Assesments.Website',0,NULL,NULL,'N;'),('attendance manager',2,'attendance manager',NULL,'N;'),('Attendance.Default.*',1,NULL,NULL,'N;'),('Attendance.Default.Index',0,NULL,NULL,'N;'),('Attendance.EmployeeAttendances.*',1,NULL,NULL,'N;'),('Attendance.EmployeeAttendances.Addnew',0,NULL,NULL,'N;'),('Attendance.EmployeeAttendances.Admin',0,NULL,NULL,'N;'),('Attendance.EmployeeAttendances.Create',0,NULL,NULL,'N;'),('Attendance.EmployeeAttendances.Delete',0,NULL,NULL,'N;'),('Attendance.EmployeeAttendances.DeleteLeave',0,NULL,NULL,'N;'),('Attendance.EmployeeAttendances.EditLeave',0,NULL,NULL,'N;'),('Attendance.EmployeeAttendances.Index',0,NULL,NULL,'N;'),('Attendance.EmployeeAttendances.Pdf',0,NULL,NULL,'N;'),('Attendance.EmployeeAttendances.Update',0,NULL,NULL,'N;'),('Attendance.EmployeeAttendances.View',0,NULL,NULL,'N;'),('Attendance.EmployeeLeaveTypes.*',1,NULL,NULL,'N;'),('Attendance.EmployeeLeaveTypes.Admin',0,NULL,NULL,'N;'),('Attendance.EmployeeLeaveTypes.Create',0,NULL,NULL,'N;'),('Attendance.EmployeeLeaveTypes.Delete',0,NULL,NULL,'N;'),('Attendance.EmployeeLeaveTypes.Index',0,NULL,NULL,'N;'),('Attendance.EmployeeLeaveTypes.Update',0,NULL,NULL,'N;'),('Attendance.EmployeeLeaveTypes.View',0,NULL,NULL,'N;'),('Attendance.StudentAttentance.*',1,NULL,NULL,'N;'),('Attendance.StudentAttentance.Addnew',0,NULL,NULL,'N;'),('Attendance.StudentAttentance.Admin',0,NULL,NULL,'N;'),('Attendance.StudentAttentance.Attentancepdf',0,NULL,NULL,'N;'),('Attendance.StudentAttentance.Attentstud',0,NULL,NULL,'N;'),('Attendance.StudentAttentance.Create',0,NULL,NULL,'N;'),('Attendance.StudentAttentance.Delete',0,NULL,NULL,'N;'),('Attendance.StudentAttentance.DeleteLeave',0,NULL,NULL,'N;'),('Attendance.StudentAttentance.EditLeave',0,NULL,NULL,'N;'),('Attendance.StudentAttentance.Index',0,NULL,NULL,'N;'),('Attendance.StudentAttentance.Pdf',0,NULL,NULL,'N;'),('Attendance.StudentAttentance.Pdf1',0,NULL,NULL,'N;'),('Attendance.StudentAttentance.Sendsms',0,NULL,NULL,'N;'),('Attendance.StudentAttentance.Studentattendancepdf',0,NULL,NULL,'N;'),('Attendance.StudentAttentance.Update',0,NULL,NULL,'N;'),('Attendance.StudentAttentance.View',0,NULL,NULL,'N;'),('Attendances.*',1,NULL,NULL,'N;'),('Attendances.Addnew',0,NULL,NULL,'N;'),('Attendances.Attentance',0,NULL,NULL,'N;'),('Attendances.Index',0,NULL,NULL,'N;'),('Attendances.ReturnForm',0,NULL,NULL,'N;'),('Attendances.ReturnView',0,NULL,NULL,'N;'),('Cal.Cron.*',1,NULL,NULL,'N;'),('Cal.Cron.Index',0,NULL,NULL,'N;'),('Cal.EventsType.*',1,NULL,NULL,'N;'),('Cal.EventsType.Index',0,NULL,NULL,'N;'),('Cal.EventsType.ReturnForm',0,NULL,NULL,'N;'),('Cal.EventsType.ReturnView',0,NULL,NULL,'N;'),('Cal.Main.*',1,NULL,NULL,'N;'),('Cal.Main.Browse',0,NULL,NULL,'N;'),('Cal.Main.CreateHelper',0,NULL,NULL,'N;'),('Cal.Main.Delete',0,NULL,NULL,'N;'),('Cal.Main.List',0,NULL,NULL,'N;'),('Cal.Main.Move',0,NULL,NULL,'N;'),('Cal.Main.RemoveHelper',0,NULL,NULL,'N;'),('Cal.Main.Resize',0,NULL,NULL,'N;'),('Cal.Main.Update',0,NULL,NULL,'N;'),('Cal.Main.Userpreference',0,NULL,NULL,'N;'),('CmsNode.*',1,NULL,NULL,'N;'),('CmsNode.Admin',0,NULL,NULL,'N;'),('CmsNode.Create',0,NULL,NULL,'N;'),('CmsNode.Delete',0,NULL,NULL,'N;'),('CmsNode.Index',0,NULL,NULL,'N;'),('CmsNode.Update',0,NULL,NULL,'N;'),('CmsNode.View',0,NULL,NULL,'N;'),('Configurations.*',1,NULL,NULL,'N;'),('Configurations.Admin',0,NULL,NULL,'N;'),('Configurations.Create',0,NULL,NULL,'N;'),('Configurations.Delete',0,NULL,NULL,'N;'),('Configurations.DisplayLogoImage',0,NULL,NULL,'N;'),('Configurations.DisplaySavedImage',0,NULL,NULL,'N;'),('Configurations.Index',0,NULL,NULL,'N;'),('Configurations.Remove',0,NULL,NULL,'N;'),('Configurations.Setup',0,NULL,NULL,'N;'),('Configurations.Update',0,NULL,NULL,'N;'),('Configurations.View',0,NULL,NULL,'N;'),('Countries.*',1,NULL,NULL,'N;'),('Countries.Admin',0,NULL,NULL,'N;'),('Countries.Create',0,NULL,NULL,'N;'),('Countries.Delete',0,NULL,NULL,'N;'),('Countries.Index',0,NULL,NULL,'N;'),('Countries.Update',0,NULL,NULL,'N;'),('Countries.View',0,NULL,NULL,'N;'),('Courses.*',1,NULL,NULL,'N;'),('Courses.Admin',0,NULL,NULL,'N;'),('Courses.Batches.*',1,NULL,NULL,'N;'),('Courses.Batches.Activate',0,NULL,NULL,'N;'),('Courses.Batches.Addnew',0,NULL,NULL,'N;'),('Courses.Batches.Addupdate',0,NULL,NULL,'N;'),('Courses.Batches.Admin',0,NULL,NULL,'N;'),('Courses.Batches.Batchstudents',0,NULL,NULL,'N;'),('Courses.Batches.Create',0,NULL,NULL,'N;'),('Courses.Batches.Deactivate',0,NULL,NULL,'N;'),('Courses.Batches.Delete',0,NULL,NULL,'N;'),('Courses.Batches.Index',0,NULL,NULL,'N;'),('Courses.Batches.Manage',0,NULL,NULL,'N;'),('Courses.Batches.Promote',0,NULL,NULL,'N;'),('Courses.Batches.Remove',0,NULL,NULL,'N;'),('Courses.Batches.Settings',0,NULL,NULL,'N;'),('Courses.Batches.Update',0,NULL,NULL,'N;'),('Courses.Batches.View',0,NULL,NULL,'N;'),('Courses.ClassTiming.*',1,NULL,NULL,'N;'),('Courses.ClassTiming.Index',0,NULL,NULL,'N;'),('Courses.ClassTiming.ReturnForm',0,NULL,NULL,'N;'),('Courses.ClassTiming.ReturnView',0,NULL,NULL,'N;'),('Courses.ClassTimings.*',1,NULL,NULL,'N;'),('Courses.ClassTimings.Addnew',0,NULL,NULL,'N;'),('Courses.ClassTimings.Admin',0,NULL,NULL,'N;'),('Courses.ClassTimings.Create',0,NULL,NULL,'N;'),('Courses.ClassTimings.Delete',0,NULL,NULL,'N;'),('Courses.ClassTimings.Edit',0,NULL,NULL,'N;'),('Courses.ClassTimings.Index',0,NULL,NULL,'N;'),('Courses.ClassTimings.Update',0,NULL,NULL,'N;'),('Courses.ClassTimings.View',0,NULL,NULL,'N;'),('Courses.Courses.*',1,NULL,NULL,'N;'),('Courses.Courses.Admin',0,NULL,NULL,'N;'),('Courses.Courses.Create',0,NULL,NULL,'N;'),('Courses.Courses.Deactivate',0,NULL,NULL,'N;'),('Courses.Courses.Delete',0,NULL,NULL,'N;'),('Courses.Courses.Edit',0,NULL,NULL,'N;'),('Courses.Courses.Index',0,NULL,NULL,'N;'),('Courses.Courses.Managecourse',0,NULL,NULL,'N;'),('Courses.Courses.ReqTest01',0,NULL,NULL,'N;'),('Courses.Courses.Update',0,NULL,NULL,'N;'),('Courses.Courses.View',0,NULL,NULL,'N;'),('Courses.Create',0,NULL,NULL,'N;'),('Courses.Default.*',1,NULL,NULL,'N;'),('Courses.Default.Index',0,NULL,NULL,'N;'),('Courses.Defaultsubjects.*',1,NULL,NULL,'N;'),('Courses.Defaultsubjects.Index',0,NULL,NULL,'N;'),('Courses.Defaultsubjects.ReturnForm',0,NULL,NULL,'N;'),('Courses.Defaultsubjects.ReturnView',0,NULL,NULL,'N;'),('Courses.Delete',0,NULL,NULL,'N;'),('Courses.Edit',0,NULL,NULL,'N;'),('Courses.ElectiveGroups.*',1,NULL,NULL,'N;'),('Courses.ElectiveGroups.Admin',0,NULL,NULL,'N;'),('Courses.ElectiveGroups.Create',0,NULL,NULL,'N;'),('Courses.ElectiveGroups.Delete',0,NULL,NULL,'N;'),('Courses.ElectiveGroups.Index',0,NULL,NULL,'N;'),('Courses.ElectiveGroups.Update',0,NULL,NULL,'N;'),('Courses.ElectiveGroups.View',0,NULL,NULL,'N;'),('Courses.Electives.*',1,NULL,NULL,'N;'),('Courses.Electives.Admin',0,NULL,NULL,'N;'),('Courses.Electives.Create',0,NULL,NULL,'N;'),('Courses.Electives.Delete',0,NULL,NULL,'N;'),('Courses.Electives.Index',0,NULL,NULL,'N;'),('Courses.Electives.Update',0,NULL,NULL,'N;'),('Courses.Electives.View',0,NULL,NULL,'N;'),('Courses.Exam.*',1,NULL,NULL,'N;'),('Courses.Exam.Index',0,NULL,NULL,'N;'),('Courses.Exam.ReturnForm',0,NULL,NULL,'N;'),('Courses.Exam.ReturnView',0,NULL,NULL,'N;'),('Courses.ExamGroups.*',1,NULL,NULL,'N;'),('Courses.ExamGroups.Admin',0,NULL,NULL,'N;'),('Courses.ExamGroups.Create',0,NULL,NULL,'N;'),('Courses.ExamGroups.Delete',0,NULL,NULL,'N;'),('Courses.ExamGroups.Deletenew',0,NULL,NULL,'N;'),('Courses.ExamGroups.Index',0,NULL,NULL,'N;'),('Courses.ExamGroups.Manage',0,NULL,NULL,'N;'),('Courses.ExamGroups.Update',0,NULL,NULL,'N;'),('Courses.ExamGroups.View',0,NULL,NULL,'N;'),('Courses.Exams.*',1,NULL,NULL,'N;'),('Courses.Exams.Admin',0,NULL,NULL,'N;'),('Courses.Exams.Create',0,NULL,NULL,'N;'),('Courses.Exams.Delete',0,NULL,NULL,'N;'),('Courses.Exams.Index',0,NULL,NULL,'N;'),('Courses.Exams.Manage',0,NULL,NULL,'N;'),('Courses.Exams.Update',0,NULL,NULL,'N;'),('Courses.Exams.View',0,NULL,NULL,'N;'),('Courses.ExamScores.*',1,NULL,NULL,'N;'),('Courses.ExamScores.Admin',0,NULL,NULL,'N;'),('Courses.ExamScores.Create',0,NULL,NULL,'N;'),('Courses.ExamScores.Delete',0,NULL,NULL,'N;'),('Courses.ExamScores.Deleteall',0,NULL,NULL,'N;'),('Courses.ExamScores.Index',0,NULL,NULL,'N;'),('Courses.ExamScores.Pdf',0,NULL,NULL,'N;'),('Courses.ExamScores.Update',0,NULL,NULL,'N;'),('Courses.ExamScores.View',0,NULL,NULL,'N;'),('Courses.GradingLevels.*',1,NULL,NULL,'N;'),('Courses.GradingLevels.Default',0,NULL,NULL,'N;'),('Courses.GradingLevels.Index',0,NULL,NULL,'N;'),('Courses.GradingLevels.ReturnForm',0,NULL,NULL,'N;'),('Courses.GradingLevels.ReturnView',0,NULL,NULL,'N;'),('Courses.Index',0,NULL,NULL,'N;'),('Courses.Managecourse',0,NULL,NULL,'N;'),('Courses.ReqTest01',0,NULL,NULL,'N;'),('Courses.StudentAttentance.*',1,NULL,NULL,'N;'),('Courses.StudentAttentance.Addnew',0,NULL,NULL,'N;'),('Courses.StudentAttentance.Admin',0,NULL,NULL,'N;'),('Courses.StudentAttentance.Assessmentpdf',0,NULL,NULL,'N;'),('Courses.StudentAttentance.Attentancepdf',0,NULL,NULL,'N;'),('Courses.StudentAttentance.Attentstud',0,NULL,NULL,'N;'),('Courses.StudentAttentance.Create',0,NULL,NULL,'N;'),('Courses.StudentAttentance.Delete',0,NULL,NULL,'N;'),('Courses.StudentAttentance.DeleteLeave',0,NULL,NULL,'N;'),('Courses.StudentAttentance.EditLeave',0,NULL,NULL,'N;'),('Courses.StudentAttentance.Index',0,NULL,NULL,'N;'),('Courses.StudentAttentance.Pdf',0,NULL,NULL,'N;'),('Courses.StudentAttentance.Pdf1',0,NULL,NULL,'N;'),('Courses.StudentAttentance.Studentattendancepdf',0,NULL,NULL,'N;'),('Courses.StudentAttentance.Studentpdf',0,NULL,NULL,'N;'),('Courses.StudentAttentance.Update',0,NULL,NULL,'N;'),('Courses.StudentAttentance.View',0,NULL,NULL,'N;'),('Courses.StudentAttentanceC.*',1,NULL,NULL,'N;'),('Courses.StudentAttentanceC.Addnew',0,NULL,NULL,'N;'),('Courses.StudentAttentanceC.Admin',0,NULL,NULL,'N;'),('Courses.StudentAttentanceC.Attentancepdf',0,NULL,NULL,'N;'),('Courses.StudentAttentanceC.Attentstud',0,NULL,NULL,'N;'),('Courses.StudentAttentanceC.Create',0,NULL,NULL,'N;'),('Courses.StudentAttentanceC.Delete',0,NULL,NULL,'N;'),('Courses.StudentAttentanceC.Index',0,NULL,NULL,'N;'),('Courses.StudentAttentanceC.Pdf',0,NULL,NULL,'N;'),('Courses.StudentAttentanceC.Pdf1',0,NULL,NULL,'N;'),('Courses.StudentAttentanceC.Update',0,NULL,NULL,'N;'),('Courses.StudentAttentanceC.View',0,NULL,NULL,'N;'),('Courses.Subject.*',1,NULL,NULL,'N;'),('Courses.Subject.Index',0,NULL,NULL,'N;'),('Courses.Subject.ReturnForm',0,NULL,NULL,'N;'),('Courses.Subject.ReturnView',0,NULL,NULL,'N;'),('Courses.SubjectName.*',1,NULL,NULL,'N;'),('Courses.SubjectName.Admin',0,NULL,NULL,'N;'),('Courses.SubjectName.Create',0,NULL,NULL,'N;'),('Courses.SubjectName.Delete',0,NULL,NULL,'N;'),('Courses.SubjectName.Index',0,NULL,NULL,'N;'),('Courses.SubjectName.Update',0,NULL,NULL,'N;'),('Courses.SubjectName.View',0,NULL,NULL,'N;'),('Courses.SubjectNameAjax.*',1,NULL,NULL,'N;'),('Courses.SubjectNameAjax.Index',0,NULL,NULL,'N;'),('Courses.SubjectNameAjax.ReturnForm',0,NULL,NULL,'N;'),('Courses.SubjectNameAjax.ReturnView',0,NULL,NULL,'N;'),('Courses.Subjects.*',1,NULL,NULL,'N;'),('Courses.Subjects.Addnew',0,NULL,NULL,'N;'),('Courses.Subjects.Addnew1',0,NULL,NULL,'N;'),('Courses.Subjects.Admin',0,NULL,NULL,'N;'),('Courses.Subjects.Create',0,NULL,NULL,'N;'),('Courses.Subjects.Delete',0,NULL,NULL,'N;'),('Courses.Subjects.Index',0,NULL,NULL,'N;'),('Courses.Subjects.Subjects',0,NULL,NULL,'N;'),('Courses.Subjects.Update',0,NULL,NULL,'N;'),('Courses.Subjects.View',0,NULL,NULL,'N;'),('Courses.TimetableEntries.*',1,NULL,NULL,'N;'),('Courses.TimetableEntries.Admin',0,NULL,NULL,'N;'),('Courses.TimetableEntries.Create',0,NULL,NULL,'N;'),('Courses.TimetableEntries.Delete',0,NULL,NULL,'N;'),('Courses.TimetableEntries.Dynamiccities',0,NULL,NULL,'N;'),('Courses.TimetableEntries.Index',0,NULL,NULL,'N;'),('Courses.TimetableEntries.Remove',0,NULL,NULL,'N;'),('Courses.TimetableEntries.Settime',0,NULL,NULL,'N;'),('Courses.TimetableEntries.Update',0,NULL,NULL,'N;'),('Courses.TimetableEntries.View',0,NULL,NULL,'N;'),('Courses.Update',0,NULL,NULL,'N;'),('Courses.View',0,NULL,NULL,'N;'),('Courses.Weekdays.*',1,NULL,NULL,'N;'),('Courses.Weekdays.Addnew',0,NULL,NULL,'N;'),('Courses.Weekdays.Admin',0,NULL,NULL,'N;'),('Courses.Weekdays.Batch',0,NULL,NULL,'N;'),('Courses.Weekdays.Create',0,NULL,NULL,'N;'),('Courses.Weekdays.Delete',0,NULL,NULL,'N;'),('Courses.Weekdays.Exportpdf',0,NULL,NULL,'N;'),('Courses.Weekdays.Index',0,NULL,NULL,'N;'),('Courses.Weekdays.Pdf',0,NULL,NULL,'N;'),('Courses.Weekdays.Publish',0,NULL,NULL,'N;'),('Courses.Weekdays.Timetable',0,NULL,NULL,'N;'),('Courses.Weekdays.Update',0,NULL,NULL,'N;'),('Courses.Weekdays.View',0,NULL,NULL,'N;'),('Dashboard.Default.*',1,NULL,NULL,'N;'),('Dashboard.Default.Calendar',0,NULL,NULL,'N;'),('Dashboard.Default.Events',0,NULL,NULL,'N;'),('Dashboard.Default.Index',0,NULL,NULL,'N;'),('Dashboard.Default.Sample',0,NULL,NULL,'N;'),('Dashboard.Default.View',0,NULL,NULL,'N;'),('Downloads.Default.*',1,NULL,NULL,'N;'),('Downloads.Default.Index',0,NULL,NULL,'N;'),('Downloads.Default.Upload',0,NULL,NULL,'N;'),('Downloads.FileCategory.*',1,NULL,NULL,'N;'),('Downloads.FileCategory.Admin',0,NULL,NULL,'N;'),('Downloads.FileCategory.Create',0,NULL,NULL,'N;'),('Downloads.FileCategory.Delete',0,NULL,NULL,'N;'),('Downloads.FileCategory.Index',0,NULL,NULL,'N;'),('Downloads.FileCategory.Update',0,NULL,NULL,'N;'),('Downloads.FileCategory.View',0,NULL,NULL,'N;'),('Downloads.FileUploads.*',1,NULL,NULL,'N;'),('Downloads.FileUploads.Admin',0,NULL,NULL,'N;'),('Downloads.FileUploads.Batch',0,NULL,NULL,'N;'),('Downloads.FileUploads.Create',0,NULL,NULL,'N;'),('Downloads.FileUploads.Delete',0,NULL,NULL,'N;'),('Downloads.FileUploads.Index',0,NULL,NULL,'N;'),('Downloads.FileUploads.Removefile',0,NULL,NULL,'N;'),('Downloads.FileUploads.Update',0,NULL,NULL,'N;'),('Downloads.FileUploads.View',0,NULL,NULL,'N;'),('Downloads.Students.*',1,NULL,NULL,'N;'),('Downloads.Students.Index',0,NULL,NULL,'N;'),('Downloads.Teachers.*',1,NULL,NULL,'N;'),('Downloads.Teachers.Admin',0,NULL,NULL,'N;'),('Downloads.Teachers.Create',0,NULL,NULL,'N;'),('Downloads.Teachers.Delete',0,NULL,NULL,'N;'),('Downloads.Teachers.Index',0,NULL,NULL,'N;'),('Downloads.Teachers.Removefile',0,NULL,NULL,'N;'),('Downloads.Teachers.Update',0,NULL,NULL,'N;'),('Downloads.Teachers.View',0,NULL,NULL,'N;'),('ElectiveGroups.*',1,NULL,NULL,'N;'),('ElectiveGroups.Admin',0,NULL,NULL,'N;'),('ElectiveGroups.Create',0,NULL,NULL,'N;'),('ElectiveGroups.Delete',0,NULL,NULL,'N;'),('ElectiveGroups.Index',0,NULL,NULL,'N;'),('ElectiveGroups.Update',0,NULL,NULL,'N;'),('ElectiveGroups.View',0,NULL,NULL,'N;'),('Electives.*',1,NULL,NULL,'N;'),('Electives.Admin',0,NULL,NULL,'N;'),('Electives.Create',0,NULL,NULL,'N;'),('Electives.Delete',0,NULL,NULL,'N;'),('Electives.Index',0,NULL,NULL,'N;'),('Electives.Update',0,NULL,NULL,'N;'),('Electives.View',0,NULL,NULL,'N;'),('Employees.Default.*',1,NULL,NULL,'N;'),('Employees.Default.Index',0,NULL,NULL,'N;'),('Employees.EmployeeAttendances.*',1,NULL,NULL,'N;'),('Employees.EmployeeAttendances.Addnew',0,NULL,NULL,'N;'),('Employees.EmployeeAttendances.Admin',0,NULL,NULL,'N;'),('Employees.EmployeeAttendances.Create',0,NULL,NULL,'N;'),('Employees.EmployeeAttendances.Delete',0,NULL,NULL,'N;'),('Employees.EmployeeAttendances.DeleteLeave',0,NULL,NULL,'N;'),('Employees.EmployeeAttendances.EditLeave',0,NULL,NULL,'N;'),('Employees.EmployeeAttendances.Emppdf',0,NULL,NULL,'N;'),('Employees.EmployeeAttendances.Index',0,NULL,NULL,'N;'),('Employees.EmployeeAttendances.Pdf',0,NULL,NULL,'N;'),('Employees.EmployeeAttendances.Update',0,NULL,NULL,'N;'),('Employees.EmployeeAttendances.View',0,NULL,NULL,'N;'),('Employees.EmployeeCategories.*',1,NULL,NULL,'N;'),('Employees.EmployeeCategories.Admin',0,NULL,NULL,'N;'),('Employees.EmployeeCategories.Create',0,NULL,NULL,'N;'),('Employees.EmployeeCategories.Delete',0,NULL,NULL,'N;'),('Employees.EmployeeCategories.Index',0,NULL,NULL,'N;'),('Employees.EmployeeCategories.Update',0,NULL,NULL,'N;'),('Employees.EmployeeCategories.View',0,NULL,NULL,'N;'),('Employees.EmployeeDepartments.*',1,NULL,NULL,'N;'),('Employees.EmployeeDepartments.Admin',0,NULL,NULL,'N;'),('Employees.EmployeeDepartments.Create',0,NULL,NULL,'N;'),('Employees.EmployeeDepartments.Delete',0,NULL,NULL,'N;'),('Employees.EmployeeDepartments.Index',0,NULL,NULL,'N;'),('Employees.EmployeeDepartments.Update',0,NULL,NULL,'N;'),('Employees.EmployeeDepartments.View',0,NULL,NULL,'N;'),('Employees.EmployeeGrades.*',1,NULL,NULL,'N;'),('Employees.EmployeeGrades.Admin',0,NULL,NULL,'N;'),('Employees.EmployeeGrades.Create',0,NULL,NULL,'N;'),('Employees.EmployeeGrades.Delete',0,NULL,NULL,'N;'),('Employees.EmployeeGrades.Index',0,NULL,NULL,'N;'),('Employees.EmployeeGrades.Update',0,NULL,NULL,'N;'),('Employees.EmployeeGrades.View',0,NULL,NULL,'N;'),('Employees.EmployeeLeaveTypes.*',1,NULL,NULL,'N;'),('Employees.EmployeeLeaveTypes.Admin',0,NULL,NULL,'N;'),('Employees.EmployeeLeaveTypes.Create',0,NULL,NULL,'N;'),('Employees.EmployeeLeaveTypes.Delete',0,NULL,NULL,'N;'),('Employees.EmployeeLeaveTypes.Index',0,NULL,NULL,'N;'),('Employees.EmployeeLeaveTypes.Update',0,NULL,NULL,'N;'),('Employees.EmployeeLeaveTypes.View',0,NULL,NULL,'N;'),('Employees.EmployeePositions.*',1,NULL,NULL,'N;'),('Employees.EmployeePositions.Admin',0,NULL,NULL,'N;'),('Employees.EmployeePositions.Create',0,NULL,NULL,'N;'),('Employees.EmployeePositions.Delete',0,NULL,NULL,'N;'),('Employees.EmployeePositions.Index',0,NULL,NULL,'N;'),('Employees.EmployeePositions.Update',0,NULL,NULL,'N;'),('Employees.EmployeePositions.View',0,NULL,NULL,'N;'),('Employees.Employees.*',1,NULL,NULL,'N;'),('Employees.Employees.Addinfo',0,NULL,NULL,'N;'),('Employees.Employees.Address',0,NULL,NULL,'N;'),('Employees.Employees.Admin',0,NULL,NULL,'N;'),('Employees.Employees.Contact',0,NULL,NULL,'N;'),('Employees.Employees.Create',0,NULL,NULL,'N;'),('Employees.Employees.Create2',0,NULL,NULL,'N;'),('Employees.Employees.Delete',0,NULL,NULL,'N;'),('Employees.Employees.Deletes',0,NULL,NULL,'N;'),('Employees.Employees.DisplaySavedImage',0,NULL,NULL,'N;'),('Employees.Employees.Index',0,NULL,NULL,'N;'),('Employees.Employees.Manage',0,NULL,NULL,'N;'),('Employees.Employees.Pdf',0,NULL,NULL,'N;'),('Employees.Employees.Remove',0,NULL,NULL,'N;'),('Employees.Employees.Update',0,NULL,NULL,'N;'),('Employees.Employees.Update2',0,NULL,NULL,'N;'),('Employees.Employees.View',0,NULL,NULL,'N;'),('Employees.EmployeesSubjects.*',1,NULL,NULL,'N;'),('Employees.EmployeesSubjects.Admin',0,NULL,NULL,'N;'),('Employees.EmployeesSubjects.Assign',0,NULL,NULL,'N;'),('Employees.EmployeesSubjects.Create',0,NULL,NULL,'N;'),('Employees.EmployeesSubjects.Current',0,NULL,NULL,'N;'),('Employees.EmployeesSubjects.Delete',0,NULL,NULL,'N;'),('Employees.EmployeesSubjects.Deleterow',0,NULL,NULL,'N;'),('Employees.EmployeesSubjects.Employee',0,NULL,NULL,'N;'),('Employees.EmployeesSubjects.Index',0,NULL,NULL,'N;'),('Employees.EmployeesSubjects.Remove',0,NULL,NULL,'N;'),('Employees.EmployeesSubjects.Subject',0,NULL,NULL,'N;'),('Employees.EmployeesSubjects.Update',0,NULL,NULL,'N;'),('Employees.EmployeesSubjects.View',0,NULL,NULL,'N;'),('Employees.Savedsearches.*',1,NULL,NULL,'N;'),('Employees.Savedsearches.Addnew',0,NULL,NULL,'N;'),('Employees.Savedsearches.Admin',0,NULL,NULL,'N;'),('Employees.Savedsearches.Create',0,NULL,NULL,'N;'),('Employees.Savedsearches.Delete',0,NULL,NULL,'N;'),('Employees.Savedsearches.Index',0,NULL,NULL,'N;'),('Employees.Savedsearches.Update',0,NULL,NULL,'N;'),('Employees.Savedsearches.View',0,NULL,NULL,'N;'),('Events.*',1,NULL,NULL,'N;'),('Events.Index',0,NULL,NULL,'N;'),('Events.ReturnForm',0,NULL,NULL,'N;'),('Events.ReturnView',0,NULL,NULL,'N;'),('exam',2,'supervisor',NULL,'N;'),('Examination.Default.*',1,NULL,NULL,'N;'),('Examination.Default.Index',0,NULL,NULL,'N;'),('Examination.Exam.*',1,NULL,NULL,'N;'),('Examination.Exam.Index',0,NULL,NULL,'N;'),('Examination.Exam.ReturnForm',0,NULL,NULL,'N;'),('Examination.Exam.ReturnView',0,NULL,NULL,'N;'),('Examination.ExamGroups.*',1,NULL,NULL,'N;'),('Examination.ExamGroups.Admin',0,NULL,NULL,'N;'),('Examination.ExamGroups.Create',0,NULL,NULL,'N;'),('Examination.ExamGroups.Delete',0,NULL,NULL,'N;'),('Examination.ExamGroups.Deletenew',0,NULL,NULL,'N;'),('Examination.ExamGroups.Index',0,NULL,NULL,'N;'),('Examination.ExamGroups.Manage',0,NULL,NULL,'N;'),('Examination.ExamGroups.Update',0,NULL,NULL,'N;'),('Examination.ExamGroups.View',0,NULL,NULL,'N;'),('Examination.Exams.*',1,NULL,NULL,'N;'),('Examination.Exams.Admin',0,NULL,NULL,'N;'),('Examination.Exams.Create',0,NULL,NULL,'N;'),('Examination.Exams.Delete',0,NULL,NULL,'N;'),('Examination.Exams.Index',0,NULL,NULL,'N;'),('Examination.Exams.Manage',0,NULL,NULL,'N;'),('Examination.Exams.Update',0,NULL,NULL,'N;'),('Examination.Exams.View',0,NULL,NULL,'N;'),('Examination.ExamScores.*',1,NULL,NULL,'N;'),('Examination.ExamScores.Admin',0,NULL,NULL,'N;'),('Examination.ExamScores.Create',0,NULL,NULL,'N;'),('Examination.ExamScores.Delete',0,NULL,NULL,'N;'),('Examination.ExamScores.Deleteall',0,NULL,NULL,'N;'),('Examination.ExamScores.Index',0,NULL,NULL,'N;'),('Examination.ExamScores.Pdf',0,NULL,NULL,'N;'),('Examination.ExamScores.Update',0,NULL,NULL,'N;'),('Examination.ExamScores.View',0,NULL,NULL,'N;'),('Examination.GradingLevels.*',1,NULL,NULL,'N;'),('Examination.GradingLevels.Default',0,NULL,NULL,'N;'),('Examination.GradingLevels.Index',0,NULL,NULL,'N;'),('Examination.GradingLevels.ReturnForm',0,NULL,NULL,'N;'),('Examination.GradingLevels.ReturnView',0,NULL,NULL,'N;'),('FeeCollectionParticulars.*',1,NULL,NULL,'N;'),('FeeCollectionParticulars.Index',0,NULL,NULL,'N;'),('FeeCollectionParticulars.ReturnForm',0,NULL,NULL,'N;'),('FeeCollectionParticulars.ReturnView',0,NULL,NULL,'N;'),('Fees.Default.*',1,NULL,NULL,'N;'),('Fees.Default.Index',0,NULL,NULL,'N;'),('Fees.FeeCollectionParticulars.*',1,NULL,NULL,'N;'),('Fees.FeeCollectionParticulars.Index',0,NULL,NULL,'N;'),('Fees.FeeCollectionParticulars.ReturnForm',0,NULL,NULL,'N;'),('Fees.FeeCollectionParticulars.ReturnView',0,NULL,NULL,'N;'),('Fees.FinanceFeeCategories.*',1,NULL,NULL,'N;'),('Fees.FinanceFeeCategories.Index',0,NULL,NULL,'N;'),('Fees.FinanceFeeCategories.ReturnForm',0,NULL,NULL,'N;'),('Fees.FinanceFeeCategories.ReturnView',0,NULL,NULL,'N;'),('Fees.FinanceFeeCategoriesCont.*',1,NULL,NULL,'N;'),('Fees.FinanceFeeCategoriesCont.Additionalfees',0,NULL,NULL,'N;'),('Fees.FinanceFeeCategoriesCont.Additionalview',0,NULL,NULL,'N;'),('Fees.FinanceFeeCategoriesCont.Admin',0,NULL,NULL,'N;'),('Fees.FinanceFeeCategoriesCont.Create',0,NULL,NULL,'N;'),('Fees.FinanceFeeCategoriesCont.Delete',0,NULL,NULL,'N;'),('Fees.FinanceFeeCategoriesCont.Index',0,NULL,NULL,'N;'),('Fees.FinanceFeeCategoriesCont.Master',0,NULL,NULL,'N;'),('Fees.FinanceFeeCategoriesCont.Update',0,NULL,NULL,'N;'),('Fees.FinanceFeeCategoriesCont.View',0,NULL,NULL,'N;'),('Fees.FinanceFeeCollections.*',1,NULL,NULL,'N;'),('Fees.FinanceFeeCollections.Index',0,NULL,NULL,'N;'),('Fees.FinanceFeeCollections.ReturnForm',0,NULL,NULL,'N;'),('Fees.FinanceFeeCollections.ReturnView',0,NULL,NULL,'N;'),('Fees.FinanceFeeParticulars.*',1,NULL,NULL,'N;'),('Fees.FinanceFeeParticulars.Index',0,NULL,NULL,'N;'),('Fees.FinanceFeeParticulars.ReturnForm',0,NULL,NULL,'N;'),('Fees.FinanceFeeParticulars.ReturnView',0,NULL,NULL,'N;'),('Fees.FinanceFeeParticularsCont.*',1,NULL,NULL,'N;'),('Fees.FinanceFeeParticularsCont.Admin',0,NULL,NULL,'N;'),('Fees.FinanceFeeParticularsCont.Create',0,NULL,NULL,'N;'),('Fees.FinanceFeeParticularsCont.Delete',0,NULL,NULL,'N;'),('Fees.FinanceFeeParticularsCont.Index',0,NULL,NULL,'N;'),('Fees.FinanceFeeParticularsCont.Manage',0,NULL,NULL,'N;'),('Fees.FinanceFeeParticularsCont.Update',0,NULL,NULL,'N;'),('Fees.FinanceFeeParticularsCont.View',0,NULL,NULL,'N;'),('Fees.FinanceFees.*',1,NULL,NULL,'N;'),('Fees.FinanceFees.Admin',0,NULL,NULL,'N;'),('Fees.FinanceFees.Cashregister',0,NULL,NULL,'N;'),('Fees.FinanceFees.Create',0,NULL,NULL,'N;'),('Fees.FinanceFees.Delete',0,NULL,NULL,'N;'),('Fees.FinanceFees.Index',0,NULL,NULL,'N;'),('Fees.FinanceFees.Paid',0,NULL,NULL,'N;'),('Fees.FinanceFees.Payfees',0,NULL,NULL,'N;'),('Fees.FinanceFees.Prec',0,NULL,NULL,'N;'),('Fees.FinanceFees.Printreceipt',0,NULL,NULL,'N;'),('Fees.FinanceFees.Sendsms',0,NULL,NULL,'N;'),('Fees.FinanceFees.Unpaid',0,NULL,NULL,'N;'),('Fees.FinanceFees.Unpaidpdf',0,NULL,NULL,'N;'),('Fees.FinanceFees.Update',0,NULL,NULL,'N;'),('Fees.FinanceFees.View',0,NULL,NULL,'N;'),('FinanceFeeCategories.*',1,NULL,NULL,'N;'),('FinanceFeeCategories.Index',0,NULL,NULL,'N;'),('FinanceFeeCategories.ReturnForm',0,NULL,NULL,'N;'),('FinanceFeeCategories.ReturnView',0,NULL,NULL,'N;'),('FinanceFeeCategoriesCont.*',1,NULL,NULL,'N;'),('FinanceFeeCategoriesCont.Additionalfees',0,NULL,NULL,'N;'),('FinanceFeeCategoriesCont.Additionalview',0,NULL,NULL,'N;'),('FinanceFeeCategoriesCont.Admin',0,NULL,NULL,'N;'),('FinanceFeeCategoriesCont.Create',0,NULL,NULL,'N;'),('FinanceFeeCategoriesCont.Delete',0,NULL,NULL,'N;'),('FinanceFeeCategoriesCont.Index',0,NULL,NULL,'N;'),('FinanceFeeCategoriesCont.Master',0,NULL,NULL,'N;'),('FinanceFeeCategoriesCont.Update',0,NULL,NULL,'N;'),('FinanceFeeCategoriesCont.View',0,NULL,NULL,'N;'),('FinanceFeeCollections.*',1,NULL,NULL,'N;'),('FinanceFeeCollections.Index',0,NULL,NULL,'N;'),('FinanceFeeCollections.ReturnForm',0,NULL,NULL,'N;'),('FinanceFeeCollections.ReturnView',0,NULL,NULL,'N;'),('FinanceFeeParticulars.*',1,NULL,NULL,'N;'),('FinanceFeeParticulars.Index',0,NULL,NULL,'N;'),('FinanceFeeParticulars.ReturnForm',0,NULL,NULL,'N;'),('FinanceFeeParticulars.ReturnView',0,NULL,NULL,'N;'),('FinanceFeeParticularsCont.*',1,NULL,NULL,'N;'),('FinanceFeeParticularsCont.Admin',0,NULL,NULL,'N;'),('FinanceFeeParticularsCont.Create',0,NULL,NULL,'N;'),('FinanceFeeParticularsCont.Delete',0,NULL,NULL,'N;'),('FinanceFeeParticularsCont.Index',0,NULL,NULL,'N;'),('FinanceFeeParticularsCont.Manage',0,NULL,NULL,'N;'),('FinanceFeeParticularsCont.Update',0,NULL,NULL,'N;'),('FinanceFeeParticularsCont.View',0,NULL,NULL,'N;'),('FinanceFees.*',1,NULL,NULL,'N;'),('FinanceFees.Admin',0,NULL,NULL,'N;'),('FinanceFees.Create',0,NULL,NULL,'N;'),('FinanceFees.Delete',0,NULL,NULL,'N;'),('FinanceFees.Index',0,NULL,NULL,'N;'),('FinanceFees.Payfees',0,NULL,NULL,'N;'),('FinanceFees.Update',0,NULL,NULL,'N;'),('FinanceFees.View',0,NULL,NULL,'N;'),('Hostel.Allotment.*',1,NULL,NULL,'N;'),('Hostel.Allotment.Admin',0,NULL,NULL,'N;'),('Hostel.Allotment.Alloterror',0,NULL,NULL,'N;'),('Hostel.Allotment.Create',0,NULL,NULL,'N;'),('Hostel.Allotment.Delete',0,NULL,NULL,'N;'),('Hostel.Allotment.Index',0,NULL,NULL,'N;'),('Hostel.Allotment.Roominfo',0,NULL,NULL,'N;'),('Hostel.Allotment.Update',0,NULL,NULL,'N;'),('Hostel.Allotment.View',0,NULL,NULL,'N;'),('Hostel.Default.*',1,NULL,NULL,'N;'),('Hostel.Default.Index',0,NULL,NULL,'N;'),('Hostel.Floor.*',1,NULL,NULL,'N;'),('Hostel.Floor.Admin',0,NULL,NULL,'N;'),('Hostel.Floor.Create',0,NULL,NULL,'N;'),('Hostel.Floor.Delete',0,NULL,NULL,'N;'),('Hostel.Floor.Index',0,NULL,NULL,'N;'),('Hostel.Floor.Manage',0,NULL,NULL,'N;'),('Hostel.Floor.Update',0,NULL,NULL,'N;'),('Hostel.Floor.View',0,NULL,NULL,'N;'),('Hostel.FoodInfo.*',1,NULL,NULL,'N;'),('Hostel.FoodInfo.Admin',0,NULL,NULL,'N;'),('Hostel.FoodInfo.Create',0,NULL,NULL,'N;'),('Hostel.FoodInfo.Delete',0,NULL,NULL,'N;'),('Hostel.FoodInfo.Deleteall',0,NULL,NULL,'N;'),('Hostel.FoodInfo.Index',0,NULL,NULL,'N;'),('Hostel.FoodInfo.Manage',0,NULL,NULL,'N;'),('Hostel.FoodInfo.Update',0,NULL,NULL,'N;'),('Hostel.FoodInfo.View',0,NULL,NULL,'N;'),('Hostel.Hosteldetails.*',1,NULL,NULL,'N;'),('Hostel.Hosteldetails.Admin',0,NULL,NULL,'N;'),('Hostel.Hosteldetails.Create',0,NULL,NULL,'N;'),('Hostel.Hosteldetails.Delete',0,NULL,NULL,'N;'),('Hostel.Hosteldetails.Deleteall',0,NULL,NULL,'N;'),('Hostel.Hosteldetails.Index',0,NULL,NULL,'N;'),('Hostel.Hosteldetails.Manage',0,NULL,NULL,'N;'),('Hostel.Hosteldetails.Update',0,NULL,NULL,'N;'),('Hostel.Hosteldetails.View',0,NULL,NULL,'N;'),('Hostel.MessFee.*',1,NULL,NULL,'N;'),('Hostel.MessFee.Admin',0,NULL,NULL,'N;'),('Hostel.MessFee.Create',0,NULL,NULL,'N;'),('Hostel.MessFee.Delete',0,NULL,NULL,'N;'),('Hostel.MessFee.Index',0,NULL,NULL,'N;'),('Hostel.MessFee.Update',0,NULL,NULL,'N;'),('Hostel.MessFee.View',0,NULL,NULL,'N;'),('Hostel.MessManage.*',1,NULL,NULL,'N;'),('Hostel.MessManage.Admin',0,NULL,NULL,'N;'),('Hostel.MessManage.Create',0,NULL,NULL,'N;'),('Hostel.MessManage.Delete',0,NULL,NULL,'N;'),('Hostel.MessManage.Index',0,NULL,NULL,'N;'),('Hostel.MessManage.Manage',0,NULL,NULL,'N;'),('Hostel.MessManage.MessDetails',0,NULL,NULL,'N;'),('Hostel.MessManage.MessInfo',0,NULL,NULL,'N;'),('Hostel.MessManage.Payfees',0,NULL,NULL,'N;'),('Hostel.MessManage.Print',0,NULL,NULL,'N;'),('Hostel.MessManage.Update',0,NULL,NULL,'N;'),('Hostel.MessManage.View',0,NULL,NULL,'N;'),('Hostel.Registration.*',1,NULL,NULL,'N;'),('Hostel.Registration.Admin',0,NULL,NULL,'N;'),('Hostel.Registration.Autocomplete',0,NULL,NULL,'N;'),('Hostel.Registration.Change',0,NULL,NULL,'N;'),('Hostel.Registration.Create',0,NULL,NULL,'N;'),('Hostel.Registration.Delete',0,NULL,NULL,'N;'),('Hostel.Registration.Error',0,NULL,NULL,'N;'),('Hostel.Registration.Index',0,NULL,NULL,'N;'),('Hostel.Registration.Messchange',0,NULL,NULL,'N;'),('Hostel.Registration.Save',0,NULL,NULL,'N;'),('Hostel.Registration.Update',0,NULL,NULL,'N;'),('Hostel.Registration.View',0,NULL,NULL,'N;'),('Hostel.Registration.Warning',0,NULL,NULL,'N;'),('Hostel.Room.*',1,NULL,NULL,'N;'),('Hostel.Room.Admin',0,NULL,NULL,'N;'),('Hostel.Room.Allot',0,NULL,NULL,'N;'),('Hostel.Room.Autocomplete',0,NULL,NULL,'N;'),('Hostel.Room.Change',0,NULL,NULL,'N;'),('Hostel.Room.Create',0,NULL,NULL,'N;'),('Hostel.Room.Delete',0,NULL,NULL,'N;'),('Hostel.Room.Error',0,NULL,NULL,'N;'),('Hostel.Room.Index',0,NULL,NULL,'N;'),('Hostel.Room.Manage',0,NULL,NULL,'N;'),('Hostel.Room.Roomchange',0,NULL,NULL,'N;'),('Hostel.Room.Roomlist',0,NULL,NULL,'N;'),('Hostel.Room.Roomrequest',0,NULL,NULL,'N;'),('Hostel.Room.Roomsearch',0,NULL,NULL,'N;'),('Hostel.Room.Update',0,NULL,NULL,'N;'),('Hostel.Room.View',0,NULL,NULL,'N;'),('Hostel.RoomDetails.*',1,NULL,NULL,'N;'),('Hostel.RoomDetails.Admin',0,NULL,NULL,'N;'),('Hostel.RoomDetails.Create',0,NULL,NULL,'N;'),('Hostel.RoomDetails.Delete',0,NULL,NULL,'N;'),('Hostel.RoomDetails.Index',0,NULL,NULL,'N;'),('Hostel.RoomDetails.Manage',0,NULL,NULL,'N;'),('Hostel.RoomDetails.Update',0,NULL,NULL,'N;'),('Hostel.RoomDetails.View',0,NULL,NULL,'N;'),('Hostel.Roomrequest.*',1,NULL,NULL,'N;'),('Hostel.Roomrequest.Admin',0,NULL,NULL,'N;'),('Hostel.Roomrequest.Create',0,NULL,NULL,'N;'),('Hostel.Roomrequest.Delete',0,NULL,NULL,'N;'),('Hostel.Roomrequest.Index',0,NULL,NULL,'N;'),('Hostel.Roomrequest.Update',0,NULL,NULL,'N;'),('Hostel.Roomrequest.View',0,NULL,NULL,'N;'),('Hostel.Settings.*',1,NULL,NULL,'N;'),('Hostel.Settings.Admin',0,NULL,NULL,'N;'),('Hostel.Settings.Create',0,NULL,NULL,'N;'),('Hostel.Settings.Delete',0,NULL,NULL,'N;'),('Hostel.Settings.Index',0,NULL,NULL,'N;'),('Hostel.Settings.Notifications',0,NULL,NULL,'N;'),('Hostel.Settings.Remind',0,NULL,NULL,'N;'),('Hostel.Settings.Settings',0,NULL,NULL,'N;'),('Hostel.Settings.Update',0,NULL,NULL,'N;'),('Hostel.Settings.View',0,NULL,NULL,'N;'),('Hostel.Vacate.*',1,NULL,NULL,'N;'),('Hostel.Vacate.Admin',0,NULL,NULL,'N;'),('Hostel.Vacate.Autocomplete',0,NULL,NULL,'N;'),('Hostel.Vacate.Create',0,NULL,NULL,'N;'),('Hostel.Vacate.Delete',0,NULL,NULL,'N;'),('Hostel.Vacate.Index',0,NULL,NULL,'N;'),('Hostel.Vacate.Roomvacate',0,NULL,NULL,'N;'),('Hostel.Vacate.Update',0,NULL,NULL,'N;'),('Hostel.Vacate.View',0,NULL,NULL,'N;'),('Importcsv.Default.*',1,NULL,NULL,'N;'),('Importcsv.Default.Index',0,NULL,NULL,'N;'),('Importcsv.Default.Upload',0,NULL,NULL,'N;'),('Importcsv.DefaultControl.*',1,NULL,NULL,'N;'),('Importcsv.DefaultControl.ImportGoogleContacts',0,NULL,NULL,'N;'),('Importcsv.DefaultControl.Index',0,NULL,NULL,'N;'),('Importcsv.DefaultControl.Upload',0,NULL,NULL,'N;'),('Inbox.Default.*',1,NULL,NULL,'N;'),('Inbox.Default.Index',0,NULL,NULL,'N;'),('Inbox.Default.New',0,NULL,NULL,'N;'),('Inbox.Default.View',0,NULL,NULL,'N;'),('Install.Default.*',1,NULL,NULL,'N;'),('Install.Default.DownloadEnvironment',0,NULL,NULL,'N;'),('Install.Default.Htaccess',0,NULL,NULL,'N;'),('Install.Default.Index',0,NULL,NULL,'N;'),('Install.Default.Step1',0,NULL,NULL,'N;'),('Install.Default.Step2',0,NULL,NULL,'N;'),('Install.Default.Step3',0,NULL,NULL,'N;'),('Install.Default.Step4',0,NULL,NULL,'N;'),('Install.Default.Step44',0,NULL,NULL,'N;'),('Install.Default.Step5',0,NULL,NULL,'N;'),('Leads.*',1,NULL,NULL,'N;'),('Leads.Add',0,NULL,NULL,'N;'),('Leads.Admin',0,NULL,NULL,'N;'),('Leads.Assesments',0,NULL,NULL,'N;'),('Leads.Attentance',0,NULL,NULL,'N;'),('Leads.Batch',0,NULL,NULL,'N;'),('Leads.Create',0,NULL,NULL,'N;'),('Leads.Delete',0,NULL,NULL,'N;'),('Leads.Events',0,NULL,NULL,'N;'),('Leads.Index',0,NULL,NULL,'N;'),('Leads.Manage',0,NULL,NULL,'N;'),('Leads.Savesearch',0,NULL,NULL,'N;'),('Leads.Update',0,NULL,NULL,'N;'),('Leads.View',0,NULL,NULL,'N;'),('Leads.Website',0,NULL,NULL,'N;'),('librarian',2,'librarian',NULL,'N;'),('Library.Authors.*',1,NULL,NULL,'N;'),('Library.Authors.Authordetails',0,NULL,NULL,'N;'),('Library.Authors.Index',0,NULL,NULL,'N;'),('Library.Authors.ReturnForm',0,NULL,NULL,'N;'),('Library.Authors.ReturnView',0,NULL,NULL,'N;'),('Library.Book.*',1,NULL,NULL,'N;'),('Library.Book.Admin',0,NULL,NULL,'N;'),('Library.Book.Allbooks',0,NULL,NULL,'N;'),('Library.Book.Autocomplete',0,NULL,NULL,'N;'),('Library.Book.Autocomplete1',0,NULL,NULL,'N;'),('Library.Book.Bookdetails',0,NULL,NULL,'N;'),('Library.Book.Booklist',0,NULL,NULL,'N;'),('Library.Book.BookSearch',0,NULL,NULL,'N;'),('Library.Book.Create',0,NULL,NULL,'N;'),('Library.Book.Delete',0,NULL,NULL,'N;'),('Library.Book.Index',0,NULL,NULL,'N;'),('Library.Book.Manage',0,NULL,NULL,'N;'),('Library.Book.Remove',0,NULL,NULL,'N;'),('Library.Book.Subjects',0,NULL,NULL,'N;'),('Library.Book.Update',0,NULL,NULL,'N;'),('Library.Book.View',0,NULL,NULL,'N;'),('Library.BookFine.*',1,NULL,NULL,'N;'),('Library.BookFine.Admin',0,NULL,NULL,'N;'),('Library.BookFine.Create',0,NULL,NULL,'N;'),('Library.BookFine.Delete',0,NULL,NULL,'N;'),('Library.BookFine.Index',0,NULL,NULL,'N;'),('Library.BookFine.Update',0,NULL,NULL,'N;'),('Library.BookFine.View',0,NULL,NULL,'N;'),('Library.BorrowBook.*',1,NULL,NULL,'N;'),('Library.BorrowBook.Admin',0,NULL,NULL,'N;'),('Library.BorrowBook.Autocomplete',0,NULL,NULL,'N;'),('Library.BorrowBook.Create',0,NULL,NULL,'N;'),('Library.BorrowBook.Delete',0,NULL,NULL,'N;'),('Library.BorrowBook.Error',0,NULL,NULL,'N;'),('Library.BorrowBook.Index',0,NULL,NULL,'N;'),('Library.BorrowBook.ListBook',0,NULL,NULL,'N;'),('Library.BorrowBook.Remind',0,NULL,NULL,'N;'),('Library.BorrowBook.Studentdetails',0,NULL,NULL,'N;'),('Library.BorrowBook.Update',0,NULL,NULL,'N;'),('Library.BorrowBook.View',0,NULL,NULL,'N;'),('Library.Category.*',1,NULL,NULL,'N;'),('Library.Category.Admin',0,NULL,NULL,'N;'),('Library.Category.Create',0,NULL,NULL,'N;'),('Library.Category.Delete',0,NULL,NULL,'N;'),('Library.Category.Index',0,NULL,NULL,'N;'),('Library.Category.Update',0,NULL,NULL,'N;'),('Library.Category.View',0,NULL,NULL,'N;'),('Library.Default.*',1,NULL,NULL,'N;'),('Library.Default.Index',0,NULL,NULL,'N;'),('Library.Publication.*',1,NULL,NULL,'N;'),('Library.Publication.Admin',0,NULL,NULL,'N;'),('Library.Publication.Create',0,NULL,NULL,'N;'),('Library.Publication.Delete',0,NULL,NULL,'N;'),('Library.Publication.Index',0,NULL,NULL,'N;'),('Library.Publication.Update',0,NULL,NULL,'N;'),('Library.Publication.View',0,NULL,NULL,'N;'),('Library.ReturnBook.*',1,NULL,NULL,'N;'),('Library.ReturnBook.Admin',0,NULL,NULL,'N;'),('Library.ReturnBook.Create',0,NULL,NULL,'N;'),('Library.ReturnBook.Delete',0,NULL,NULL,'N;'),('Library.ReturnBook.Index',0,NULL,NULL,'N;'),('Library.ReturnBook.Manage',0,NULL,NULL,'N;'),('Library.ReturnBook.Returnbook',0,NULL,NULL,'N;'),('Library.ReturnBook.Update',0,NULL,NULL,'N;'),('Library.ReturnBook.View',0,NULL,NULL,'N;'),('Library.Settings.*',1,NULL,NULL,'N;'),('Library.Settings.Admin',0,NULL,NULL,'N;'),('Library.Settings.Create',0,NULL,NULL,'N;'),('Library.Settings.Delete',0,NULL,NULL,'N;'),('Library.Settings.Index',0,NULL,NULL,'N;'),('Library.Settings.Remind',0,NULL,NULL,'N;'),('Library.Settings.Sendsms',0,NULL,NULL,'N;'),('Library.Settings.Settings',0,NULL,NULL,'N;'),('Library.Settings.Update',0,NULL,NULL,'N;'),('Library.Settings.View',0,NULL,NULL,'N;'),('Mailbox.Ajax.*',1,NULL,NULL,'N;'),('Mailbox.Ajax.Auto',0,NULL,NULL,'N;'),('Mailbox.Default.*',1,NULL,NULL,'N;'),('Mailbox.Default.Index',0,NULL,NULL,'N;'),('Mailbox.Groups.*',1,NULL,NULL,'N;'),('Mailbox.Groups.Admin',0,NULL,NULL,'N;'),('Mailbox.Groups.Create',0,NULL,NULL,'N;'),('Mailbox.Groups.Delete',0,NULL,NULL,'N;'),('Mailbox.Groups.Index',0,NULL,NULL,'N;'),('Mailbox.Groups.Message',0,NULL,NULL,'N;'),('Mailbox.Groups.Messagedetails',0,NULL,NULL,'N;'),('Mailbox.Groups.Update',0,NULL,NULL,'N;'),('Mailbox.Groups.View',0,NULL,NULL,'N;'),('Mailbox.Message.*',1,NULL,NULL,'N;'),('Mailbox.Message.Admin',0,NULL,NULL,'N;'),('Mailbox.Message.Create',0,NULL,NULL,'N;'),('Mailbox.Message.Data',0,NULL,NULL,'N;'),('Mailbox.Message.Ddel',0,NULL,NULL,'N;'),('Mailbox.Message.Del',0,NULL,NULL,'N;'),('Mailbox.Message.Delete',0,NULL,NULL,'N;'),('Mailbox.Message.Fdel',0,NULL,NULL,'N;'),('Mailbox.Message.Folder',0,NULL,NULL,'N;'),('Mailbox.Message.Forward',0,NULL,NULL,'N;'),('Mailbox.Message.Inbox',0,NULL,NULL,'N;'),('Mailbox.Message.Index',0,NULL,NULL,'N;'),('Mailbox.Message.Message',0,NULL,NULL,'N;'),('Mailbox.Message.New',0,NULL,NULL,'N;'),('Mailbox.Message.Newgroup',0,NULL,NULL,'N;'),('Mailbox.Message.Reply',0,NULL,NULL,'N;'),('Mailbox.Message.Sdel',0,NULL,NULL,'N;'),('Mailbox.Message.Sent',0,NULL,NULL,'N;'),('Mailbox.Message.Sentitems',0,NULL,NULL,'N;'),('Mailbox.Message.Sentmessage',0,NULL,NULL,'N;'),('Mailbox.Message.Star',0,NULL,NULL,'N;'),('Mailbox.Message.Stardel',0,NULL,NULL,'N;'),('Mailbox.Message.Starred',0,NULL,NULL,'N;'),('Mailbox.Message.Trash',0,NULL,NULL,'N;'),('Mailbox.Message.Unstar',0,NULL,NULL,'N;'),('Mailbox.Message.Update',0,NULL,NULL,'N;'),('Mailbox.Message.Ustar',0,NULL,NULL,'N;'),('Mailbox.Message.View',0,NULL,NULL,'N;'),('Mailbox.News.*',1,NULL,NULL,'N;'),('Mailbox.News.Index',0,NULL,NULL,'N;'),('Mailbox.News.Info',0,NULL,NULL,'N;'),('Mailbox.User.*',1,NULL,NULL,'N;'),('Mailbox.User.Admin',0,NULL,NULL,'N;'),('Mailbox.User.Create',0,NULL,NULL,'N;'),('Mailbox.User.Data',0,NULL,NULL,'N;'),('Mailbox.User.Delete',0,NULL,NULL,'N;'),('Mailbox.User.Draft',0,NULL,NULL,'N;'),('Mailbox.User.Events',0,NULL,NULL,'N;'),('Mailbox.User.Folder',0,NULL,NULL,'N;'),('Mailbox.User.Folders',0,NULL,NULL,'N;'),('Mailbox.User.Forward',0,NULL,NULL,'N;'),('Mailbox.User.Inbox',0,NULL,NULL,'N;'),('Mailbox.User.Inboxbottom',0,NULL,NULL,'N;'),('Mailbox.User.Inboxmessage',0,NULL,NULL,'N;'),('Mailbox.User.Inboxtask',0,NULL,NULL,'N;'),('Mailbox.User.Index',0,NULL,NULL,'N;'),('Mailbox.User.Patientprofile',0,NULL,NULL,'N;'),('Mailbox.User.Sentitems',0,NULL,NULL,'N;'),('Mailbox.User.Star',0,NULL,NULL,'N;'),('Mailbox.User.Taskdetails',0,NULL,NULL,'N;'),('Mailbox.User.Update',0,NULL,NULL,'N;'),('Mailbox.User.View',0,NULL,NULL,'N;'),('Mailbox.Userfolder.*',1,NULL,NULL,'N;'),('Mailbox.Userfolder.Admin',0,NULL,NULL,'N;'),('Mailbox.Userfolder.Create',0,NULL,NULL,'N;'),('Mailbox.Userfolder.Delete',0,NULL,NULL,'N;'),('Mailbox.Userfolder.Index',0,NULL,NULL,'N;'),('Mailbox.Userfolder.Update',0,NULL,NULL,'N;'),('Mailbox.Userfolder.View',0,NULL,NULL,'N;'),('Mailbox_.Default.*',1,NULL,NULL,'N;'),('Mailbox_.Default.Index',0,NULL,NULL,'N;'),('Mailbox_.Groups.*',1,NULL,NULL,'N;'),('Mailbox_.Groups.Admin',0,NULL,NULL,'N;'),('Mailbox_.Groups.Create',0,NULL,NULL,'N;'),('Mailbox_.Groups.Delete',0,NULL,NULL,'N;'),('Mailbox_.Groups.Index',0,NULL,NULL,'N;'),('Mailbox_.Groups.Message',0,NULL,NULL,'N;'),('Mailbox_.Groups.Messagedetails',0,NULL,NULL,'N;'),('Mailbox_.Groups.Update',0,NULL,NULL,'N;'),('Mailbox_.Groups.View',0,NULL,NULL,'N;'),('Mailbox_.Message.*',1,NULL,NULL,'N;'),('Mailbox_.Message.Admin',0,NULL,NULL,'N;'),('Mailbox_.Message.Create',0,NULL,NULL,'N;'),('Mailbox_.Message.Data',0,NULL,NULL,'N;'),('Mailbox_.Message.Ddel',0,NULL,NULL,'N;'),('Mailbox_.Message.Del',0,NULL,NULL,'N;'),('Mailbox_.Message.Delete',0,NULL,NULL,'N;'),('Mailbox_.Message.Fdel',0,NULL,NULL,'N;'),('Mailbox_.Message.Folder',0,NULL,NULL,'N;'),('Mailbox_.Message.Forward',0,NULL,NULL,'N;'),('Mailbox_.Message.Index',0,NULL,NULL,'N;'),('Mailbox_.Message.Message',0,NULL,NULL,'N;'),('Mailbox_.Message.Reply',0,NULL,NULL,'N;'),('Mailbox_.Message.Sdel',0,NULL,NULL,'N;'),('Mailbox_.Message.Sentitems',0,NULL,NULL,'N;'),('Mailbox_.Message.Sentmessage',0,NULL,NULL,'N;'),('Mailbox_.Message.Star',0,NULL,NULL,'N;'),('Mailbox_.Message.Stardel',0,NULL,NULL,'N;'),('Mailbox_.Message.Starred',0,NULL,NULL,'N;'),('Mailbox_.Message.Unstar',0,NULL,NULL,'N;'),('Mailbox_.Message.Update',0,NULL,NULL,'N;'),('Mailbox_.Message.Ustar',0,NULL,NULL,'N;'),('Mailbox_.Message.View',0,NULL,NULL,'N;'),('Mailbox_.User.*',1,NULL,NULL,'N;'),('Mailbox_.User.Admin',0,NULL,NULL,'N;'),('Mailbox_.User.Create',0,NULL,NULL,'N;'),('Mailbox_.User.Data',0,NULL,NULL,'N;'),('Mailbox_.User.Delete',0,NULL,NULL,'N;'),('Mailbox_.User.Draft',0,NULL,NULL,'N;'),('Mailbox_.User.Events',0,NULL,NULL,'N;'),('Mailbox_.User.Folder',0,NULL,NULL,'N;'),('Mailbox_.User.Folders',0,NULL,NULL,'N;'),('Mailbox_.User.Forward',0,NULL,NULL,'N;'),('Mailbox_.User.Inbox',0,NULL,NULL,'N;'),('Mailbox_.User.Inboxbottom',0,NULL,NULL,'N;'),('Mailbox_.User.Inboxmessage',0,NULL,NULL,'N;'),('Mailbox_.User.Inboxtask',0,NULL,NULL,'N;'),('Mailbox_.User.Index',0,NULL,NULL,'N;'),('Mailbox_.User.Patientprofile',0,NULL,NULL,'N;'),('Mailbox_.User.Sentitems',0,NULL,NULL,'N;'),('Mailbox_.User.Star',0,NULL,NULL,'N;'),('Mailbox_.User.Taskdetails',0,NULL,NULL,'N;'),('Mailbox_.User.Update',0,NULL,NULL,'N;'),('Mailbox_.User.View',0,NULL,NULL,'N;'),('Mailbox_.Userfolder.*',1,NULL,NULL,'N;'),('Mailbox_.Userfolder.Admin',0,NULL,NULL,'N;'),('Mailbox_.Userfolder.Create',0,NULL,NULL,'N;'),('Mailbox_.Userfolder.Delete',0,NULL,NULL,'N;'),('Mailbox_.Userfolder.Index',0,NULL,NULL,'N;'),('Mailbox_.Userfolder.Update',0,NULL,NULL,'N;'),('Mailbox_.Userfolder.View',0,NULL,NULL,'N;'),('Messages.Compose.*',1,NULL,NULL,'N;'),('Messages.Compose.Compose',0,NULL,NULL,'N;'),('Messages.Delete.*',1,NULL,NULL,'N;'),('Messages.Delete.Delete',0,NULL,NULL,'N;'),('Messages.Inbox.*',1,NULL,NULL,'N;'),('Messages.Inbox.Inbox',0,NULL,NULL,'N;'),('Messages.Index.*',1,NULL,NULL,'N;'),('Messages.Index.Index',0,NULL,NULL,'N;'),('Messages.Sent.*',1,NULL,NULL,'N;'),('Messages.Sent.Sent',0,NULL,NULL,'N;'),('Messages.Suggest.*',1,NULL,NULL,'N;'),('Messages.Suggest.User',0,NULL,NULL,'N;'),('Messages.View.*',1,NULL,NULL,'N;'),('Messages.View.View',0,NULL,NULL,'N;'),('parent',2,'For parent Portal',NULL,'N;'),('Parentportal.Default.*',1,NULL,NULL,'N;'),('Parentportal.Default.Attendance',0,NULL,NULL,'N;'),('Parentportal.Default.Attendance1',0,NULL,NULL,'N;'),('Parentportal.Default.Eventlist',0,NULL,NULL,'N;'),('Parentportal.Default.Events',0,NULL,NULL,'N;'),('Parentportal.Default.Exams',0,NULL,NULL,'N;'),('Parentportal.Default.Fees',0,NULL,NULL,'N;'),('Parentportal.Default.Index',0,NULL,NULL,'N;'),('Parentportal.Default.Leftside',0,NULL,NULL,'N;'),('Parentportal.Default.Messages',0,NULL,NULL,'N;'),('Parentportal.Default.Newmessage',0,NULL,NULL,'N;'),('Parentportal.Default.Profile',0,NULL,NULL,'N;'),('Parentportal.Default.Reports',0,NULL,NULL,'N;'),('Parentportal.Default.Studentprofile',0,NULL,NULL,'N;'),('Parentportal.Default.View',0,NULL,NULL,'N;'),('Parentportal.Default.Viewmessage',0,NULL,NULL,'N;'),('Report.Default.*',1,NULL,NULL,'N;'),('Report.Default.Advancedreport',0,NULL,NULL,'N;'),('Report.Default.Assessment',0,NULL,NULL,'N;'),('Report.Default.Assessmentpdf',0,NULL,NULL,'N;'),('Report.Default.Batch',0,NULL,NULL,'N;'),('Report.Default.Batchname',0,NULL,NULL,'N;'),('Report.Default.Empindividualpdf',0,NULL,NULL,'N;'),('Report.Default.Employeeattendance',0,NULL,NULL,'N;'),('Report.Default.Empmonthlypdf',0,NULL,NULL,'N;'),('Report.Default.Empoverallpdf',0,NULL,NULL,'N;'),('Report.Default.Empyearlypdf',0,NULL,NULL,'N;'),('Report.Default.Index',0,NULL,NULL,'N;'),('Report.Default.Studentattendance',0,NULL,NULL,'N;'),('Report.Default.Studentexam',0,NULL,NULL,'N;'),('Report.Default.Studentexampdf',0,NULL,NULL,'N;'),('Report.Default.Studentindividualpdf',0,NULL,NULL,'N;'),('Report.Default.Studentmonthlypdf',0,NULL,NULL,'N;'),('Report.Default.Studentoverallpdf',0,NULL,NULL,'N;'),('Report.Default.Studentyearlypdf',0,NULL,NULL,'N;'),('Reports.*',1,NULL,NULL,'N;'),('Reports.Add',0,NULL,NULL,'N;'),('Reports.Admin',0,NULL,NULL,'N;'),('Reports.Assesments',0,NULL,NULL,'N;'),('Reports.Attentance',0,NULL,NULL,'N;'),('Reports.Batch',0,NULL,NULL,'N;'),('Reports.Create',0,NULL,NULL,'N;'),('Reports.Delete',0,NULL,NULL,'N;'),('Reports.Events',0,NULL,NULL,'N;'),('Reports.Index',0,NULL,NULL,'N;'),('Reports.Manage',0,NULL,NULL,'N;'),('Reports.Savesearch',0,NULL,NULL,'N;'),('Reports.Update',0,NULL,NULL,'N;'),('Reports.View',0,NULL,NULL,'N;'),('Reports.Website',0,NULL,NULL,'N;'),('Rights1.Assignment.*',1,NULL,NULL,'N;'),('Rights1.Assignment.Revoke',0,NULL,NULL,'N;'),('Rights1.Assignment.User',0,NULL,NULL,'N;'),('Rights1.Assignment.View',0,NULL,NULL,'N;'),('Rights1.AuthItem.*',1,NULL,NULL,'N;'),('Rights1.AuthItem.Assign',0,NULL,NULL,'N;'),('Rights1.AuthItem.Create',0,NULL,NULL,'N;'),('Rights1.AuthItem.Delete',0,NULL,NULL,'N;'),('Rights1.AuthItem.Generate',0,NULL,NULL,'N;'),('Rights1.AuthItem.Operations',0,NULL,NULL,'N;'),('Rights1.AuthItem.Permissions',0,NULL,NULL,'N;'),('Rights1.AuthItem.RemoveChild',0,NULL,NULL,'N;'),('Rights1.AuthItem.Revoke',0,NULL,NULL,'N;'),('Rights1.AuthItem.Roles',0,NULL,NULL,'N;'),('Rights1.AuthItem.Sortable',0,NULL,NULL,'N;'),('Rights1.AuthItem.Tasks',0,NULL,NULL,'N;'),('Rights1.AuthItem.Update',0,NULL,NULL,'N;'),('Rights1.Install.*',1,NULL,NULL,'N;'),('Rights1.Install.Confirm',0,NULL,NULL,'N;'),('Rights1.Install.Error',0,NULL,NULL,'N;'),('Rights1.Install.Ready',0,NULL,NULL,'N;'),('Rights1.Install.Run',0,NULL,NULL,'N;'),('Rights12.Assignment.*',1,NULL,NULL,'N;'),('Rights12.Assignment.Revoke',0,NULL,NULL,'N;'),('Rights12.Assignment.User',0,NULL,NULL,'N;'),('Rights12.Assignment.View',0,NULL,NULL,'N;'),('Rights12.AuthItem.*',1,NULL,NULL,'N;'),('Rights12.AuthItem.Assign',0,NULL,NULL,'N;'),('Rights12.AuthItem.Create',0,NULL,NULL,'N;'),('Rights12.AuthItem.Delete',0,NULL,NULL,'N;'),('Rights12.AuthItem.Generate',0,NULL,NULL,'N;'),('Rights12.AuthItem.Operations',0,NULL,NULL,'N;'),('Rights12.AuthItem.Permissions',0,NULL,NULL,'N;'),('Rights12.AuthItem.RemoveChild',0,NULL,NULL,'N;'),('Rights12.AuthItem.Revoke',0,NULL,NULL,'N;'),('Rights12.AuthItem.Roles',0,NULL,NULL,'N;'),('Rights12.AuthItem.Sortable',0,NULL,NULL,'N;'),('Rights12.AuthItem.Tasks',0,NULL,NULL,'N;'),('Rights12.AuthItem.Update',0,NULL,NULL,'N;'),('Rights12.Install.*',1,NULL,NULL,'N;'),('Rights12.Install.Confirm',0,NULL,NULL,'N;'),('Rights12.Install.Ready',0,NULL,NULL,'N;'),('Rights12.Install.Run',0,NULL,NULL,'N;'),('Savedsearches.*',1,NULL,NULL,'N;'),('Savedsearches.Addnew',0,NULL,NULL,'N;'),('Savedsearches.Admin',0,NULL,NULL,'N;'),('Savedsearches.Create',0,NULL,NULL,'N;'),('Savedsearches.Delete',0,NULL,NULL,'N;'),('Savedsearches.Deleteemp',0,NULL,NULL,'N;'),('Savedsearches.Deletestudent',0,NULL,NULL,'N;'),('Savedsearches.Index',0,NULL,NULL,'N;'),('Savedsearches.Update',0,NULL,NULL,'N;'),('Savedsearches.View',0,NULL,NULL,'N;'),('Site.*',1,NULL,NULL,'N;'),('Site.Autocomplete',0,NULL,NULL,'N;'),('Site.Bookmark',0,NULL,NULL,'N;'),('Site.Contact',0,NULL,NULL,'N;'),('Site.Emanage',0,NULL,NULL,'N;'),('Site.Employeeautocomplete',0,NULL,NULL,'N;'),('Site.Error',0,NULL,NULL,'N;'),('Site.Explorer',0,NULL,NULL,'N;'),('Site.Index',0,NULL,NULL,'N;'),('Site.Login',0,NULL,NULL,'N;'),('Site.Logout',0,NULL,NULL,'N;'),('Site.Manage',0,NULL,NULL,'N;'),('Site.Parentautocomplete',0,NULL,NULL,'N;'),('Site.Parentemailcomplete',0,NULL,NULL,'N;'),('Site.Search',0,NULL,NULL,'N;'),('Site.Student',0,NULL,NULL,'N;'),('SmsSettings.*',1,NULL,NULL,'N;'),('SmsSettings.Admin',0,NULL,NULL,'N;'),('SmsSettings.Create',0,NULL,NULL,'N;'),('SmsSettings.Delete',0,NULL,NULL,'N;'),('SmsSettings.Index',0,NULL,NULL,'N;'),('SmsSettings.Update',0,NULL,NULL,'N;'),('SmsSettings.View',0,NULL,NULL,'N;'),('Store.BuyProduct.*',1,NULL,NULL,'N;'),('Store.BuyProduct.Admin',0,NULL,NULL,'N;'),('Store.BuyProduct.Autocomplete',0,NULL,NULL,'N;'),('Store.BuyProduct.Create',0,NULL,NULL,'N;'),('Store.BuyProduct.Delete',0,NULL,NULL,'N;'),('Store.BuyProduct.Index',0,NULL,NULL,'N;'),('Store.BuyProduct.Studentdetails',0,NULL,NULL,'N;'),('Store.BuyProduct.Update',0,NULL,NULL,'N;'),('Store.BuyProduct.View',0,NULL,NULL,'N;'),('Store.Default.*',1,NULL,NULL,'N;'),('Store.Default.Index',0,NULL,NULL,'N;'),('Store.ProductSearch.*',1,NULL,NULL,'N;'),('Store.ProductSearch.Admin',0,NULL,NULL,'N;'),('Store.ProductSearch.Create',0,NULL,NULL,'N;'),('Store.ProductSearch.Delete',0,NULL,NULL,'N;'),('Store.ProductSearch.Index',0,NULL,NULL,'N;'),('Store.ProductSearch.Update',0,NULL,NULL,'N;'),('Store.ProductSearch.View',0,NULL,NULL,'N;'),('Store.StoreCategory.*',1,NULL,NULL,'N;'),('Store.StoreCategory.Index',0,NULL,NULL,'N;'),('Store.StoreCategory.ReturnForm',0,NULL,NULL,'N;'),('Store.StoreCategory.ReturnView',0,NULL,NULL,'N;'),('Store.StoreProduct.*',1,NULL,NULL,'N;'),('Store.StoreProduct.Admin',0,NULL,NULL,'N;'),('Store.StoreProduct.Create',0,NULL,NULL,'N;'),('Store.StoreProduct.Delete',0,NULL,NULL,'N;'),('Store.StoreProduct.Index',0,NULL,NULL,'N;'),('Store.StoreProduct.Manage',0,NULL,NULL,'N;'),('Store.StoreProduct.Update',0,NULL,NULL,'N;'),('Store.StoreProduct.View',0,NULL,NULL,'N;'),('Store.StoreProducts.*',1,NULL,NULL,'N;'),('Store.StoreProducts.Index',0,NULL,NULL,'N;'),('Store.StoreProducts.ReturnForm',0,NULL,NULL,'N;'),('Store.StoreProducts.ReturnView',0,NULL,NULL,'N;'),('student',2,'For student Portal',NULL,'N;'),('Studentportal.Default.*',1,NULL,NULL,'N;'),('Studentportal.Default.Attendance',0,NULL,NULL,'N;'),('Studentportal.Default.Eventlist',0,NULL,NULL,'N;'),('Studentportal.Default.Exams',0,NULL,NULL,'N;'),('Studentportal.Default.Fees',0,NULL,NULL,'N;'),('Studentportal.Default.Index',0,NULL,NULL,'N;'),('Studentportal.Default.Leftside',0,NULL,NULL,'N;'),('Studentportal.Default.Messages',0,NULL,NULL,'N;'),('Studentportal.Default.Profile',0,NULL,NULL,'N;'),('Studentportal.Default.Reports',0,NULL,NULL,'N;'),('Studentportal.Default.Timetable',0,NULL,NULL,'N;'),('Studentportal.Default.View',0,NULL,NULL,'N;'),('Studentportal.Default.Viewmessage',0,NULL,NULL,'N;'),('Students.Default.*',1,NULL,NULL,'N;'),('Students.Default.Index',0,NULL,NULL,'N;'),('Students.Guardians.*',1,NULL,NULL,'N;'),('Students.Guardians.Addguardian',0,NULL,NULL,'N;'),('Students.Guardians.Admin',0,NULL,NULL,'N;'),('Students.Guardians.Create',0,NULL,NULL,'N;'),('Students.Guardians.Delete',0,NULL,NULL,'N;'),('Students.Guardians.Index',0,NULL,NULL,'N;'),('Students.Guardians.Update',0,NULL,NULL,'N;'),('Students.Guardians.View',0,NULL,NULL,'N;'),('Students.Savedsearches.*',1,NULL,NULL,'N;'),('Students.Savedsearches.Addnew',0,NULL,NULL,'N;'),('Students.Savedsearches.Admin',0,NULL,NULL,'N;'),('Students.Savedsearches.Create',0,NULL,NULL,'N;'),('Students.Savedsearches.Delete',0,NULL,NULL,'N;'),('Students.Savedsearches.Index',0,NULL,NULL,'N;'),('Students.Savedsearches.Update',0,NULL,NULL,'N;'),('Students.Savedsearches.View',0,NULL,NULL,'N;'),('Students.StudentAdditionalFields.*',1,NULL,NULL,'N;'),('Students.StudentAdditionalFields.Admin',0,NULL,NULL,'N;'),('Students.StudentAdditionalFields.Create',0,NULL,NULL,'N;'),('Students.StudentAdditionalFields.Delete',0,NULL,NULL,'N;'),('Students.StudentAdditionalFields.Index',0,NULL,NULL,'N;'),('Students.StudentAdditionalFields.Update',0,NULL,NULL,'N;'),('Students.StudentAdditionalFields.View',0,NULL,NULL,'N;'),('Students.StudentAttentance.*',1,NULL,NULL,'N;'),('Students.StudentAttentance.Addnew',0,NULL,NULL,'N;'),('Students.StudentAttentance.Admin',0,NULL,NULL,'N;'),('Students.StudentAttentance.Attentancepdf',0,NULL,NULL,'N;'),('Students.StudentAttentance.Attentstud',0,NULL,NULL,'N;'),('Students.StudentAttentance.Create',0,NULL,NULL,'N;'),('Students.StudentAttentance.Delete',0,NULL,NULL,'N;'),('Students.StudentAttentance.DeleteLeave',0,NULL,NULL,'N;'),('Students.StudentAttentance.EditLeave',0,NULL,NULL,'N;'),('Students.StudentAttentance.Index',0,NULL,NULL,'N;'),('Students.StudentAttentance.Pdf',0,NULL,NULL,'N;'),('Students.StudentAttentance.Pdf1',0,NULL,NULL,'N;'),('Students.StudentAttentance.Studentattendancepdf',0,NULL,NULL,'N;'),('Students.StudentAttentance.Studentpdf',0,NULL,NULL,'N;'),('Students.StudentAttentance.Update',0,NULL,NULL,'N;'),('Students.StudentAttentance.View',0,NULL,NULL,'N;'),('Students.StudentCategories.*',1,NULL,NULL,'N;'),('Students.StudentCategories.Admin',0,NULL,NULL,'N;'),('Students.StudentCategories.Create',0,NULL,NULL,'N;'),('Students.StudentCategories.Delete',0,NULL,NULL,'N;'),('Students.StudentCategories.Index',0,NULL,NULL,'N;'),('Students.StudentCategories.Update',0,NULL,NULL,'N;'),('Students.StudentCategories.View',0,NULL,NULL,'N;'),('Students.StudentCategory.*',1,NULL,NULL,'N;'),('Students.StudentCategory.Index',0,NULL,NULL,'N;'),('Students.StudentCategory.ReturnForm',0,NULL,NULL,'N;'),('Students.StudentCategory.ReturnView',0,NULL,NULL,'N;'),('Students.StudentLeave.*',1,NULL,NULL,'N;'),('Students.StudentLeave.Index',0,NULL,NULL,'N;'),('Students.StudentLeave.ReturnForm',0,NULL,NULL,'N;'),('Students.StudentLeave.ReturnView',0,NULL,NULL,'N;'),('Students.StudentPreviousDatas.*',1,NULL,NULL,'N;'),('Students.StudentPreviousDatas.Admin',0,NULL,NULL,'N;'),('Students.StudentPreviousDatas.Create',0,NULL,NULL,'N;'),('Students.StudentPreviousDatas.Delete',0,NULL,NULL,'N;'),('Students.StudentPreviousDatas.Index',0,NULL,NULL,'N;'),('Students.StudentPreviousDatas.Update',0,NULL,NULL,'N;'),('Students.StudentPreviousDatas.View',0,NULL,NULL,'N;'),('Students.Students.*',1,NULL,NULL,'N;'),('Students.Students.Active',0,NULL,NULL,'N;'),('Students.Students.Add',0,NULL,NULL,'N;'),('Students.Students.Admin',0,NULL,NULL,'N;'),('Students.Students.Assesments',0,NULL,NULL,'N;'),('Students.Students.Attentance',0,NULL,NULL,'N;'),('Students.Students.Batch',0,NULL,NULL,'N;'),('Students.Students.Create',0,NULL,NULL,'N;'),('Students.Students.Delete',0,NULL,NULL,'N;'),('Students.Students.Deletes',0,NULL,NULL,'N;'),('Students.Students.DisplaySavedImage',0,NULL,NULL,'N;'),('Students.Students.Events',0,NULL,NULL,'N;'),('Students.Students.Fees',0,NULL,NULL,'N;'),('Students.Students.Inactive',0,NULL,NULL,'N;'),('Students.Students.Index',0,NULL,NULL,'N;'),('Students.Students.Manage',0,NULL,NULL,'N;'),('Students.Students.Payfees',0,NULL,NULL,'N;'),('Students.Students.Pdf',0,NULL,NULL,'N;'),('Students.Students.Printpdf',0,NULL,NULL,'N;'),('Students.Students.Remove',0,NULL,NULL,'N;'),('Students.Students.Savesearch',0,NULL,NULL,'N;'),('Students.Students.Search',0,NULL,NULL,'N;'),('Students.Students.Update',0,NULL,NULL,'N;'),('Students.Students.View',0,NULL,NULL,'N;'),('Students.Students.Website',0,NULL,NULL,'N;'),('teacher',2,'For teachers portal',NULL,'N;'),('Teachersportal.Default.*',1,NULL,NULL,'N;'),('Teachersportal.Default.Addnew',0,NULL,NULL,'N;'),('Teachersportal.Default.Addscores',0,NULL,NULL,'N;'),('Teachersportal.Default.AllExam',0,NULL,NULL,'N;'),('Teachersportal.Default.Attendance',0,NULL,NULL,'N;'),('Teachersportal.Default.Attendance2',0,NULL,NULL,'N;'),('Teachersportal.Default.Attendance3',0,NULL,NULL,'N;'),('Teachersportal.Default.ClassExam',0,NULL,NULL,'N;'),('Teachersportal.Default.Delete',0,NULL,NULL,'N;'),('Teachersportal.Default.Deleteall',0,NULL,NULL,'N;'),('Teachersportal.Default.DeleteLeave',0,NULL,NULL,'N;'),('Teachersportal.Default.EditLeave',0,NULL,NULL,'N;'),('Teachersportal.Default.EmployeeAttendance',0,NULL,NULL,'N;'),('Teachersportal.Default.EmployeeTimetable',0,NULL,NULL,'N;'),('Teachersportal.Default.Eventlist',0,NULL,NULL,'N;'),('Teachersportal.Default.Examination',0,NULL,NULL,'N;'),('Teachersportal.Default.Index',0,NULL,NULL,'N;'),('Teachersportal.Default.Messages',0,NULL,NULL,'N;'),('Teachersportal.Default.Profile',0,NULL,NULL,'N;'),('Teachersportal.Default.StudentAttendance',0,NULL,NULL,'N;'),('Teachersportal.Default.StudentTimetable',0,NULL,NULL,'N;'),('Teachersportal.Default.Timetable',0,NULL,NULL,'N;'),('Teachersportal.Default.Update',0,NULL,NULL,'N;'),('Teachersportal.Default.View',0,NULL,NULL,'N;'),('Timetable.ClassTiming.*',1,NULL,NULL,'N;'),('Timetable.ClassTiming.Index',0,NULL,NULL,'N;'),('Timetable.ClassTiming.ReturnForm',0,NULL,NULL,'N;'),('Timetable.ClassTiming.ReturnView',0,NULL,NULL,'N;'),('Timetable.Default.*',1,NULL,NULL,'N;'),('Timetable.Default.Index',0,NULL,NULL,'N;'),('Timetable.TimetableEntries.*',1,NULL,NULL,'N;'),('Timetable.TimetableEntries.Admin',0,NULL,NULL,'N;'),('Timetable.TimetableEntries.Create',0,NULL,NULL,'N;'),('Timetable.TimetableEntries.Delete',0,NULL,NULL,'N;'),('Timetable.TimetableEntries.Dynamiccities',0,NULL,NULL,'N;'),('Timetable.TimetableEntries.Index',0,NULL,NULL,'N;'),('Timetable.TimetableEntries.Remove',0,NULL,NULL,'N;'),('Timetable.TimetableEntries.Settime',0,NULL,NULL,'N;'),('Timetable.TimetableEntries.Update',0,NULL,NULL,'N;'),('Timetable.TimetableEntries.View',0,NULL,NULL,'N;'),('Timetable.view.*',1,NULL,NULL,'N;'),('Timetable.view.Index',0,NULL,NULL,'N;'),('Timetable.view.ReturnForm',0,NULL,NULL,'N;'),('Timetable.view.ReturnView',0,NULL,NULL,'N;'),('Timetable.Weekdays.*',1,NULL,NULL,'N;'),('Timetable.Weekdays.Addnew',0,NULL,NULL,'N;'),('Timetable.Weekdays.Admin',0,NULL,NULL,'N;'),('Timetable.Weekdays.Batch',0,NULL,NULL,'N;'),('Timetable.Weekdays.Batchname',0,NULL,NULL,'N;'),('Timetable.Weekdays.Create',0,NULL,NULL,'N;'),('Timetable.Weekdays.Delete',0,NULL,NULL,'N;'),('Timetable.Weekdays.Exportpdf',0,NULL,NULL,'N;'),('Timetable.Weekdays.Fulltimetable',0,NULL,NULL,'N;'),('Timetable.Weekdays.Index',0,NULL,NULL,'N;'),('Timetable.Weekdays.Pdf',0,NULL,NULL,'N;'),('Timetable.Weekdays.Publish',0,NULL,NULL,'N;'),('Timetable.Weekdays.Timetable',0,NULL,NULL,'N;'),('Timetable.Weekdays.Update',0,NULL,NULL,'N;'),('Timetable.Weekdays.View',0,NULL,NULL,'N;'),('Translate.Edit.*',1,NULL,NULL,'N;'),('Translate.Edit.Admin',0,NULL,NULL,'N;'),('Translate.Edit.Create',0,NULL,NULL,'N;'),('Translate.Edit.Delete',0,NULL,NULL,'N;'),('Translate.Edit.Missing',0,NULL,NULL,'N;'),('Translate.Edit.Missingdelete',0,NULL,NULL,'N;'),('Translate.Edit.Update',0,NULL,NULL,'N;'),('Translate.Translate.*',1,NULL,NULL,'N;'),('Translate.Translate.Index',0,NULL,NULL,'N;'),('Transport.BusLog.*',1,NULL,NULL,'N;'),('Transport.BusLog.Admin',0,NULL,NULL,'N;'),('Transport.BusLog.Create',0,NULL,NULL,'N;'),('Transport.BusLog.Delete',0,NULL,NULL,'N;'),('Transport.BusLog.Index',0,NULL,NULL,'N;'),('Transport.BusLog.Manage',0,NULL,NULL,'N;'),('Transport.BusLog.Update',0,NULL,NULL,'N;'),('Transport.BusLog.View',0,NULL,NULL,'N;'),('Transport.Default.*',1,NULL,NULL,'N;'),('Transport.Default.Index',0,NULL,NULL,'N;'),('Transport.DriverDetails.*',1,NULL,NULL,'N;'),('Transport.DriverDetails.Admin',0,NULL,NULL,'N;'),('Transport.DriverDetails.Assign',0,NULL,NULL,'N;'),('Transport.DriverDetails.Create',0,NULL,NULL,'N;'),('Transport.DriverDetails.Delete',0,NULL,NULL,'N;'),('Transport.DriverDetails.Deletedetails',0,NULL,NULL,'N;'),('Transport.DriverDetails.Error',0,NULL,NULL,'N;'),('Transport.DriverDetails.Index',0,NULL,NULL,'N;'),('Transport.DriverDetails.Manage',0,NULL,NULL,'N;'),('Transport.DriverDetails.Update',0,NULL,NULL,'N;'),('Transport.DriverDetails.View',0,NULL,NULL,'N;'),('Transport.FuelConsumption.*',1,NULL,NULL,'N;'),('Transport.FuelConsumption.Admin',0,NULL,NULL,'N;'),('Transport.FuelConsumption.Create',0,NULL,NULL,'N;'),('Transport.FuelConsumption.Delete',0,NULL,NULL,'N;'),('Transport.FuelConsumption.Index',0,NULL,NULL,'N;'),('Transport.FuelConsumption.Update',0,NULL,NULL,'N;'),('Transport.FuelConsumption.View',0,NULL,NULL,'N;'),('Transport.RouteDetails.*',1,NULL,NULL,'N;'),('Transport.RouteDetails.Admin',0,NULL,NULL,'N;'),('Transport.RouteDetails.Create',0,NULL,NULL,'N;'),('Transport.RouteDetails.Delete',0,NULL,NULL,'N;'),('Transport.RouteDetails.Deletedetails',0,NULL,NULL,'N;'),('Transport.RouteDetails.Index',0,NULL,NULL,'N;'),('Transport.RouteDetails.Manage',0,NULL,NULL,'N;'),('Transport.RouteDetails.Routedetails',0,NULL,NULL,'N;'),('Transport.RouteDetails.Update',0,NULL,NULL,'N;'),('Transport.RouteDetails.View',0,NULL,NULL,'N;'),('Transport.StopDetails.*',1,NULL,NULL,'N;'),('Transport.StopDetails.Admin',0,NULL,NULL,'N;'),('Transport.StopDetails.Create',0,NULL,NULL,'N;'),('Transport.StopDetails.Delete',0,NULL,NULL,'N;'),('Transport.StopDetails.Edit',0,NULL,NULL,'N;'),('Transport.StopDetails.Index',0,NULL,NULL,'N;'),('Transport.StopDetails.Manage',0,NULL,NULL,'N;'),('Transport.StopDetails.Remove',0,NULL,NULL,'N;'),('Transport.StopDetails.RemoveAll',0,NULL,NULL,'N;'),('Transport.StopDetails.Update',0,NULL,NULL,'N;'),('Transport.StopDetails.View',0,NULL,NULL,'N;'),('Transport.Transportation.*',1,NULL,NULL,'N;'),('Transport.Transportation.Admin',0,NULL,NULL,'N;'),('Transport.Transportation.Autocomplete',0,NULL,NULL,'N;'),('Transport.Transportation.Autocomplete1',0,NULL,NULL,'N;'),('Transport.Transportation.Create',0,NULL,NULL,'N;'),('Transport.Transportation.Delete',0,NULL,NULL,'N;'),('Transport.Transportation.Error',0,NULL,NULL,'N;'),('Transport.Transportation.Index',0,NULL,NULL,'N;'),('Transport.Transportation.Payfees',0,NULL,NULL,'N;'),('Transport.Transportation.Print',0,NULL,NULL,'N;'),('Transport.Transportation.Reallot',0,NULL,NULL,'N;'),('Transport.Transportation.Remove',0,NULL,NULL,'N;'),('Transport.Transportation.Routes',0,NULL,NULL,'N;'),('Transport.Transportation.Save',0,NULL,NULL,'N;'),('Transport.Transportation.Settings',0,NULL,NULL,'N;'),('Transport.Transportation.Studentsearch',0,NULL,NULL,'N;'),('Transport.Transportation.Update',0,NULL,NULL,'N;'),('Transport.Transportation.View',0,NULL,NULL,'N;'),('Transport.Transportation.Viewall',0,NULL,NULL,'N;'),('Transport.Transportation.Warning',0,NULL,NULL,'N;'),('Transport.VehicleDetails.*',1,NULL,NULL,'N;'),('Transport.VehicleDetails.Admin',0,NULL,NULL,'N;'),('Transport.VehicleDetails.Create',0,NULL,NULL,'N;'),('Transport.VehicleDetails.Delete',0,NULL,NULL,'N;'),('Transport.VehicleDetails.Deletedetails',0,NULL,NULL,'N;'),('Transport.VehicleDetails.Index',0,NULL,NULL,'N;'),('Transport.VehicleDetails.Manage',0,NULL,NULL,'N;'),('Transport.VehicleDetails.Update',0,NULL,NULL,'N;'),('Transport.VehicleDetails.View',0,NULL,NULL,'N;'),('User.*',1,NULL,NULL,'N;'),('User.Activation.*',1,NULL,NULL,'N;'),('User.Activation.Activation',0,NULL,NULL,'N;'),('User.Admin',0,NULL,NULL,'N;'),('User.Admin.*',1,NULL,NULL,'N;'),('User.Admin.Admin',0,NULL,NULL,'N;'),('User.Admin.Create',0,NULL,NULL,'N;'),('User.Admin.Delete',0,NULL,NULL,'N;'),('User.Admin.Update',0,NULL,NULL,'N;'),('User.Admin.View',0,NULL,NULL,'N;'),('User.Create',0,NULL,NULL,'N;'),('User.Default.*',1,NULL,NULL,'N;'),('User.Default.Index',0,NULL,NULL,'N;'),('User.Delete',0,NULL,NULL,'N;'),('User.Index',0,NULL,NULL,'N;'),('User.Login.*',1,NULL,NULL,'N;'),('User.Login.Login',0,NULL,NULL,'N;'),('User.Logout.*',1,NULL,NULL,'N;'),('User.Logout.Logout',0,NULL,NULL,'N;'),('User.Profile.*',1,NULL,NULL,'N;'),('User.Profile.Changepassword',0,NULL,NULL,'N;'),('User.Profile.Edit',0,NULL,NULL,'N;'),('User.Profile.Profile',0,NULL,NULL,'N;'),('User.ProfileField.*',1,NULL,NULL,'N;'),('User.ProfileField.Admin',0,NULL,NULL,'N;'),('User.ProfileField.Create',0,NULL,NULL,'N;'),('User.ProfileField.Delete',0,NULL,NULL,'N;'),('User.ProfileField.Update',0,NULL,NULL,'N;'),('User.ProfileField.View',0,NULL,NULL,'N;'),('User.Recovery.*',1,NULL,NULL,'N;'),('User.Recovery.Recovery',0,NULL,NULL,'N;'),('User.Registration.*',1,NULL,NULL,'N;'),('User.Registration.Registration',0,NULL,NULL,'N;'),('User.Update',0,NULL,NULL,'N;'),('User.User.*',1,NULL,NULL,'N;'),('User.User.Index',0,NULL,NULL,'N;'),('User.User.View',0,NULL,NULL,'N;'),('User.View',0,NULL,NULL,'N;'),('UserSettings.*',1,NULL,NULL,'N;'),('UserSettings.Admin',0,NULL,NULL,'N;'),('UserSettings.Create',0,NULL,NULL,'N;'),('UserSettings.Delete',0,NULL,NULL,'N;'),('UserSettings.Index',0,NULL,NULL,'N;'),('UserSettings.Update',0,NULL,NULL,'N;'),('UserSettings.View',0,NULL,NULL,'N;');
/*!40000 ALTER TABLE `authitem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `authitemchild`
--

DROP TABLE IF EXISTS `authitemchild`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `authitemchild` (
  `parent` varchar(64) NOT NULL,
  `child` varchar(64) NOT NULL,
  PRIMARY KEY (`parent`,`child`),
  KEY `child` (`child`),
  CONSTRAINT `authitemchild_ibfk_1` FOREIGN KEY (`parent`) REFERENCES `authitem` (`name`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `authitemchild_ibfk_2` FOREIGN KEY (`child`) REFERENCES `authitem` (`name`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authitemchild`
--

LOCK TABLES `authitemchild` WRITE;
/*!40000 ALTER TABLE `authitemchild` DISABLE KEYS */;
INSERT INTO `authitemchild` VALUES ('attendance manager','Attendance.Default.*'),('exam','Attendance.Default.*'),('exam','Attendance.Default.Index'),('attendance manager','Attendance.EmployeeAttendances.*'),('exam','Attendance.EmployeeAttendances.*'),('exam','Attendance.EmployeeLeaveTypes.*'),('attendance manager','Attendance.StudentAttentance.*'),('exam','Attendance.StudentAttentance.*'),('attendance manager','Attendances.*'),('exam','Attendances.*'),('exam','Attendances.Attentance'),('exam','Attendances.Index'),('parent','Cal.EventsType.*'),('student','Cal.EventsType.*'),('teacher','Cal.EventsType.*'),('attendance manager','Configurations.*'),('exam','Configurations.*'),('librarian','Configurations.*'),('attendance manager','Courses.*'),('exam','Courses.*'),('attendance manager','Courses.Batches.*'),('exam','Courses.Batches.*'),('exam','Courses.ClassTiming.*'),('exam','Courses.ClassTimings.*'),('attendance manager','Courses.Courses.*'),('exam','Courses.Courses.*'),('exam','Courses.Default.*'),('exam','Courses.Defaultsubjects.*'),('attendance manager','Courses.StudentAttentance.*'),('exam','Courses.Subjects.*'),('exam','Courses.TimetableEntries.*'),('student','Downloads.Students.*'),('teacher','Downloads.Teachers.*'),('exam','Examination.Default.*'),('exam','Examination.Default.Index'),('exam','Examination.Exam.*'),('exam','Examination.Exam.Index'),('exam','Examination.ExamGroups.*'),('exam','Examination.Exams.*'),('exam','Examination.ExamScores.*'),('exam','Examination.GradingLevels.*'),('student','Hostel.Allotment.*'),('student','Hostel.Default.*'),('student','Hostel.Floor.*'),('student','Hostel.MessFee.*'),('student','Hostel.MessManage.*'),('student','Hostel.Registration.*'),('student','Hostel.Room.*'),('librarian','Library.Authors.*'),('student','Library.Authors.*'),('librarian','Library.Book.*'),('student','Library.Book.*'),('librarian','Library.BookFine.*'),('librarian','Library.BorrowBook.*'),('librarian','Library.Category.*'),('librarian','Library.Default.*'),('student','Library.Default.*'),('librarian','Library.Publication.*'),('librarian','Library.ReturnBook.*'),('librarian','Library.Settings.*'),('attendance manager','Mailbox.Ajax.*'),('exam','Mailbox.Ajax.*'),('librarian','Mailbox.Ajax.*'),('parent','Mailbox.Ajax.*'),('teacher','Mailbox.Ajax.*'),('exam','Mailbox.Ajax.Auto'),('parent','Mailbox.Ajax.Auto'),('teacher','Mailbox.Ajax.Auto'),('attendance manager','Mailbox.Default.*'),('exam','Mailbox.Default.*'),('librarian','Mailbox.Default.*'),('parent','Mailbox.Default.*'),('teacher','Mailbox.Default.*'),('exam','Mailbox.Default.Index'),('attendance manager','Mailbox.Groups.*'),('exam','Mailbox.Groups.*'),('librarian','Mailbox.Groups.*'),('parent','Mailbox.Groups.*'),('teacher','Mailbox.Groups.*'),('exam','Mailbox.Groups.Create'),('exam','Mailbox.Groups.Delete'),('exam','Mailbox.Groups.Index'),('exam','Mailbox.Groups.Message'),('exam','Mailbox.Groups.Messagedetails'),('exam','Mailbox.Groups.Update'),('exam','Mailbox.Groups.View'),('attendance manager','Mailbox.Message.*'),('exam','Mailbox.Message.*'),('librarian','Mailbox.Message.*'),('parent','Mailbox.Message.*'),('teacher','Mailbox.Message.*'),('exam','Mailbox.Message.Admin'),('exam','Mailbox.Message.Data'),('exam','Mailbox.Message.Ddel'),('exam','Mailbox.Message.Del'),('exam','Mailbox.Message.Delete'),('exam','Mailbox.Message.Fdel'),('exam','Mailbox.Message.Forward'),('exam','Mailbox.Message.Inbox'),('parent','Mailbox.Message.Inbox'),('teacher','Mailbox.Message.Inbox'),('exam','Mailbox.Message.Index'),('exam','Mailbox.Message.Message'),('exam','Mailbox.Message.New'),('parent','Mailbox.Message.New'),('teacher','Mailbox.Message.New'),('exam','Mailbox.Message.Reply'),('parent','Mailbox.Message.Reply'),('teacher','Mailbox.Message.Reply'),('parent','Mailbox.Message.Sent'),('teacher','Mailbox.Message.Sent'),('exam','Mailbox.Message.Stardel'),('exam','Mailbox.Message.Starred'),('parent','Mailbox.Message.Trash'),('teacher','Mailbox.Message.Trash'),('exam','Mailbox.Message.Unstar'),('exam','Mailbox.Message.Update'),('exam','Mailbox.Message.Ustar'),('exam','Mailbox.Message.View'),('exam','Mailbox.News.*'),('librarian','Mailbox.News.*'),('parent','Mailbox.News.*'),('teacher','Mailbox.News.*'),('parent','Mailbox.News.Index'),('teacher','Mailbox.News.Index'),('parent','Mailbox.News.Info'),('teacher','Mailbox.News.Info'),('exam','Mailbox.User.*'),('parent','Mailbox.User.*'),('teacher','Mailbox.User.*'),('exam','Mailbox.Userfolder.*'),('exam','Mailbox_.Default.*'),('exam','Mailbox_.Groups.*'),('exam','Mailbox_.Message.*'),('exam','Mailbox_.User.*'),('exam','Mailbox_.Userfolder.*'),('exam','Messages.Compose.*'),('parent','Messages.Compose.*'),('student','Messages.Compose.*'),('teacher','Messages.Compose.*'),('exam','Messages.Compose.Compose'),('exam','Messages.Delete.*'),('parent','Messages.Delete.*'),('student','Messages.Delete.*'),('teacher','Messages.Delete.*'),('exam','Messages.Delete.Delete'),('exam','Messages.Inbox.*'),('parent','Messages.Inbox.*'),('student','Messages.Inbox.*'),('teacher','Messages.Inbox.*'),('exam','Messages.Inbox.Inbox'),('exam','Messages.Index.*'),('librarian','Messages.Index.*'),('parent','Messages.Index.*'),('student','Messages.Index.*'),('teacher','Messages.Index.*'),('exam','Messages.Index.Index'),('exam','Messages.Sent.*'),('parent','Messages.Sent.*'),('student','Messages.Sent.*'),('teacher','Messages.Sent.*'),('exam','Messages.Suggest.*'),('parent','Messages.Suggest.*'),('student','Messages.Suggest.*'),('teacher','Messages.Suggest.*'),('exam','Messages.Suggest.User'),('exam','Messages.View.*'),('parent','Messages.View.*'),('student','Messages.View.*'),('teacher','Messages.View.*'),('exam','Messages.View.View'),('student','parent'),('parent','Parentportal.Default.*'),('parent','Parentportal.Default.Attendance'),('parent','Parentportal.Default.Events'),('exam','Site.*'),('student','Studentportal.Default.*'),('student','Studentportal.Default.Attendance'),('student','Studentportal.Default.Exams'),('student','Studentportal.Default.Fees'),('student','Studentportal.Default.Index'),('student','Studentportal.Default.Leftside'),('student','Studentportal.Default.Profile'),('attendance manager','Students.Students.*'),('parent','Students.Students.DisplaySavedImage'),('student','Students.Students.DisplaySavedImage'),('teacher','Teachersportal.Default.*'),('teacher','Teachersportal.Default.Profile');
/*!40000 ALTER TABLE `authitemchild` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `author`
--

DROP TABLE IF EXISTS `author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `author` (
  `auth_id` int(11) NOT NULL AUTO_INCREMENT,
  `author_name` varchar(120) DEFAULT NULL,
  `desc` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`auth_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `author`
--

LOCK TABLES `author` WRITE;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
/*!40000 ALTER TABLE `author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bank_fields`
--

DROP TABLE IF EXISTS `bank_fields`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bank_fields` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bank_fields`
--

LOCK TABLES `bank_fields` WRITE;
/*!40000 ALTER TABLE `bank_fields` DISABLE KEYS */;
/*!40000 ALTER TABLE `bank_fields` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `batch_events`
--

DROP TABLE IF EXISTS `batch_events`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `batch_events` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `event_id` int(11) DEFAULT NULL,
  `batch_id` int(11) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index_batch_events_on_batch_id` (`batch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `batch_events`
--

LOCK TABLES `batch_events` WRITE;
/*!40000 ALTER TABLE `batch_events` DISABLE KEYS */;
/*!40000 ALTER TABLE `batch_events` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `batch_students`
--

DROP TABLE IF EXISTS `batch_students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `batch_students` (
  `student_id` int(11) DEFAULT NULL,
  `batch_id` int(11) DEFAULT NULL,
  KEY `index_batch_students_on_batch_id_and_student_id` (`batch_id`,`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `batch_students`
--

LOCK TABLES `batch_students` WRITE;
/*!40000 ALTER TABLE `batch_students` DISABLE KEYS */;
/*!40000 ALTER TABLE `batch_students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `batches`
--

DROP TABLE IF EXISTS `batches`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `batches` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  `start_date` datetime DEFAULT NULL,
  `end_date` datetime DEFAULT NULL,
  `is_active` tinyint(1) DEFAULT '1',
  `is_deleted` tinyint(1) DEFAULT '0',
  `employee_id` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `course_id` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `batches`
--

LOCK TABLES `batches` WRITE;
/*!40000 ALTER TABLE `batches` DISABLE KEYS */;
/*!40000 ALTER TABLE `batches` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blog_user`
--

DROP TABLE IF EXISTS `blog_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blog_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(128) NOT NULL,
  `password` varchar(128) NOT NULL,
  `salt` varchar(128) NOT NULL,
  `email` varchar(128) NOT NULL,
  `profile` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blog_user`
--

LOCK TABLES `blog_user` WRITE;
/*!40000 ALTER TABLE `blog_user` DISABLE KEYS */;
INSERT INTO `blog_user` VALUES (1,'admin','85086cc748169c4d55265e585629d958','5046e9bf5e4df2.93692799','webmaster@example.com',NULL),(2,'demo','a7fd45bb0ce0674973bc3b904f4a2dee','5056bcbae704d9.47098758','webmaster@example.com',NULL),(3,'ram','5ddc82bb699005cbb82b1762b8bb5a38','500cf2e141bde2.08684101','',NULL),(4,'rajith','cf852905b22b19bd216c95c43d23e176','4fdeff089fab28.09813984','',NULL),(5,'matt','30a7c56fbc249e46e9f6a4cb8674f426','4fdf18e12548e0.06506305','',NULL),(7,'anupama','f0bd34de82913a2b09ea5b5af2078648','4fffcbadd7f048.52108473','',NULL),(8,'rajithtrap','5dcb44634bc3761eaabbe1a72f91aef9','5028dd56ccaf68.55152489','',NULL);
/*!40000 ALTER TABLE `blog_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `isbn` varchar(120) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `subject` varchar(255) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `edition` varchar(255) DEFAULT NULL,
  `publisher` varchar(255) DEFAULT NULL,
  `copy` int(255) DEFAULT NULL,
  `copy_taken` varchar(120) DEFAULT NULL,
  `book_position` varchar(120) DEFAULT NULL,
  `shelf_no` varchar(120) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `status` varchar(120) DEFAULT NULL,
  `is_deleted` int(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book_fine`
--

DROP TABLE IF EXISTS `book_fine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book_fine` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` varchar(120) DEFAULT NULL,
  `book_id` varchar(120) DEFAULT NULL,
  `amount` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book_fine`
--

LOCK TABLES `book_fine` WRITE;
/*!40000 ALTER TABLE `book_fine` DISABLE KEYS */;
/*!40000 ALTER TABLE `book_fine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `borrow_book`
--

DROP TABLE IF EXISTS `borrow_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `borrow_book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` varchar(120) DEFAULT NULL,
  `book_name` varchar(120) DEFAULT NULL,
  `subject` varchar(120) DEFAULT NULL,
  `book_id` varchar(120) DEFAULT NULL,
  `issue_date` date DEFAULT NULL,
  `due_date` date DEFAULT NULL,
  `created` date DEFAULT NULL,
  `status` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `borrow_book`
--

LOCK TABLES `borrow_book` WRITE;
/*!40000 ALTER TABLE `borrow_book` DISABLE KEYS */;
/*!40000 ALTER TABLE `borrow_book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bus_log`
--

DROP TABLE IF EXISTS `bus_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bus_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vehicle_id` varchar(120) DEFAULT NULL,
  `start_time_reading` varchar(120) DEFAULT NULL,
  `end_time_reading` varchar(120) DEFAULT NULL,
  `fuel_consumption` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bus_log`
--

LOCK TABLES `bus_log` WRITE;
/*!40000 ALTER TABLE `bus_log` DISABLE KEYS */;
/*!40000 ALTER TABLE `bus_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `buy_product`
--

DROP TABLE IF EXISTS `buy_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `buy_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) NOT NULL,
  `pr_name` varchar(200) NOT NULL,
  `pr_brand` varchar(200) NOT NULL,
  `pr_quantity` int(11) DEFAULT NULL,
  `product_id` int(11) NOT NULL,
  `issued_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `buy_product`
--

LOCK TABLES `buy_product` WRITE;
/*!40000 ALTER TABLE `buy_product` DISABLE KEYS */;
/*!40000 ALTER TABLE `buy_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `cat_id` int(11) NOT NULL AUTO_INCREMENT,
  `cat_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`cat_id`),
  KEY `cat_id` (`cat_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `class_timings`
--

DROP TABLE IF EXISTS `class_timings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `class_timings` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `batch_id` int(11) DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `start_time` varchar(120) COLLATE utf8_unicode_ci DEFAULT NULL,
  `end_time` varchar(120) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_break` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index_class_timings_on_batch_id_and_start_time_and_end_time` (`batch_id`,`start_time`,`end_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `class_timings`
--

LOCK TABLES `class_timings` WRITE;
/*!40000 ALTER TABLE `class_timings` DISABLE KEYS */;
/*!40000 ALTER TABLE `class_timings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cms_attachment`
--

DROP TABLE IF EXISTS `cms_attachment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cms_attachment` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `contentId` int(10) unsigned NOT NULL,
  `filename` varchar(255) NOT NULL,
  `extension` varchar(50) NOT NULL,
  `mimeType` varchar(255) NOT NULL,
  `byteSize` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `contentId` (`contentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cms_attachment`
--

LOCK TABLES `cms_attachment` WRITE;
/*!40000 ALTER TABLE `cms_attachment` DISABLE KEYS */;
/*!40000 ALTER TABLE `cms_attachment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cms_content`
--

DROP TABLE IF EXISTS `cms_content`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cms_content` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nodeId` int(10) unsigned NOT NULL,
  `locale` varchar(50) NOT NULL,
  `heading` varchar(255) DEFAULT NULL,
  `body` longtext,
  `css` longtext,
  `url` varchar(255) DEFAULT NULL,
  `pageTitle` varchar(255) DEFAULT NULL,
  `breadcrumb` varchar(255) DEFAULT NULL,
  `metaTitle` varchar(255) DEFAULT NULL,
  `metaDescription` varchar(255) DEFAULT NULL,
  `metaKeywords` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `contentId_locale` (`nodeId`,`locale`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cms_content`
--

LOCK TABLES `cms_content` WRITE;
/*!40000 ALTER TABLE `cms_content` DISABLE KEYS */;
/*!40000 ALTER TABLE `cms_content` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cms_node`
--

DROP TABLE IF EXISTS `cms_node`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cms_node` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated` timestamp NULL DEFAULT NULL,
  `parentId` int(10) NOT NULL DEFAULT '0',
  `name` varchar(255) NOT NULL,
  `deleted` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `name_deleted` (`name`,`deleted`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cms_node`
--

LOCK TABLES `cms_node` WRITE;
/*!40000 ALTER TABLE `cms_node` DISABLE KEYS */;
/*!40000 ALTER TABLE `cms_node` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `configurations`
--

DROP TABLE IF EXISTS `configurations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `configurations` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `config_key` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `config_value` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index_configurations_on_config_key` (`config_key`(10)),
  KEY `index_configurations_on_config_value` (`config_value`(10))
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `configurations`
--

LOCK TABLES `configurations` WRITE;
/*!40000 ALTER TABLE `configurations` DISABLE KEYS */;
INSERT INTO `configurations` VALUES (1,'InstitutionName','Villa Educativa'),(2,'InstitutionAddress','1'),(3,'InstitutionPhoneNo','1234567890'),(4,'StudentAttendanceType','Daily'),(5,'CurrencyType','Indian'),(6,'Locale','en_us'),(7,'AdmissionNumberAutoIncrement','1'),(8,'EmployeeNumberAutoIncrement','1'),(9,'TotalSmsCount',NULL),(10,'AvailableModules',NULL),(11,'AvailableModules',NULL),(12,'NetworkState','Online'),(13,'FinancialYearStartDate','06/01/2013'),(14,'FinancialYearEndDate','06/01/2014'),(15,'AutomaticLeaveReset',NULL),(16,'LeaveResetPeriod',NULL),(17,'LastAutoLeaveReset',NULL),(18,'logo','0'),(19,'date_format',NULL),(20,'time_format',NULL),(21,'welcome_message','0');
/*!40000 ALTER TABLE `configurations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `countries`
--

DROP TABLE IF EXISTS `countries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `countries` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=196 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `countries`
--

LOCK TABLES `countries` WRITE;
/*!40000 ALTER TABLE `countries` DISABLE KEYS */;
INSERT INTO `countries` VALUES (1,'Afghanistan'),(2,'Albania'),(3,'Algeria'),(4,'Andorra'),(5,'Angola'),(6,'Antigua & Deps'),(7,'Argentina'),(8,'Armenia'),(9,'Australia'),(10,'Austria'),(11,'Azerbaijan'),(12,'Bahamas'),(13,'Bahrain'),(14,'Bangladesh'),(15,'Barbados'),(16,'Belarus'),(17,'Belgium'),(18,'Belize'),(19,'Benin'),(20,'Bhutan'),(21,'Bolivia'),(22,'Bosnia Herzegovina'),(23,'Botswana'),(24,'Brazil'),(25,'Brunei'),(26,'Bulgaria'),(27,'Burkina'),(28,'Burundi'),(29,'Cambodia'),(30,'Cameroon'),(31,'Canada'),(32,'Cape Verde'),(33,'Central African Rep'),(34,'Chad'),(35,'Chile'),(36,'China'),(37,'Colombia'),(38,'Comoros'),(39,'Congo'),(40,'Congo {Democratic Rep}'),(41,'Costa Rica'),(42,'Croatia'),(43,'Cuba'),(44,'Cyprus'),(45,'Czech Republic'),(46,'Denmark'),(47,'Djibouti'),(48,'Dominica'),(49,'Dominican Republic'),(50,'East Timor'),(51,'Ecuador'),(52,'Egypt'),(53,'El Salvador'),(54,'Equatorial Guinea'),(55,'Eritrea'),(56,'Estonia'),(57,'Ethiopia'),(58,'Fiji'),(59,'Finland'),(60,'France'),(61,'Gabon'),(62,'Gambia'),(63,'Georgia'),(64,'Germany'),(65,'Ghana'),(66,'Greece'),(67,'Grenada'),(68,'Guatemala'),(69,'Guinea'),(70,'Guinea-Bissau'),(71,'Guyana'),(72,'Haiti'),(73,'Honduras'),(74,'Hungary'),(75,'Iceland'),(76,'India'),(77,'Indonesia'),(78,'Iran'),(79,'Iraq'),(80,'Ireland {Republic}'),(81,'Israel'),(82,'Italy'),(83,'Ivory Coast'),(84,'Jamaica'),(85,'Japan'),(86,'Jordan'),(87,'Kazakhstan'),(88,'Kenya'),(89,'Kiribati'),(90,'Korea North'),(91,'Korea South'),(92,'Kosovo'),(93,'Kuwait'),(94,'Kyrgyzstan'),(95,'Laos'),(96,'Latvia'),(97,'Lebanon'),(98,'Lesotho'),(99,'Liberia'),(100,'Libya'),(101,'Liechtenstein'),(102,'Lithuania'),(103,'Luxembourg'),(104,'Macedonia'),(105,'Madagascar'),(106,'Malawi'),(107,'Malaysia'),(108,'Maldives'),(109,'Mali'),(110,'Malta'),(111,'Montenegro'),(112,'Marshall Islands'),(113,'Mauritania'),(114,'Mauritius'),(115,'Mexico'),(116,'Micronesia'),(117,'Moldova'),(118,'Monaco'),(119,'Mongolia'),(120,'Morocco'),(121,'Mozambique'),(122,'Myanmar, {Burma}'),(123,'Namibia'),(124,'Nauru'),(125,'Nepal'),(126,'Netherlands'),(127,'New Zealand'),(128,'Nicaragua'),(129,'Niger'),(130,'Nigeria'),(131,'Norway'),(132,'Oman'),(133,'Pakistan'),(134,'Palau'),(135,'Panama'),(136,'Papua New Guinea'),(137,'Paraguay'),(138,'Peru'),(139,'Philippines'),(140,'Poland'),(141,'Portugal'),(142,'Qatar'),(143,'Romania'),(144,'Russian Federation'),(145,'Rwanda'),(146,'St Kitts & Nevis'),(147,'St Lucia'),(148,'Saint Vincent & the Grenadines'),(149,'Samoa'),(150,'San Marino'),(151,'Sao Tome & Principe'),(152,'Saudi Arabia'),(153,'Senegal'),(154,'Serbia'),(155,'Seychelles'),(156,'Sierra Leone'),(157,'Singapore'),(158,'Slovakia'),(159,'Slovenia'),(160,'Solomon Islands'),(161,'Somalia'),(162,'South Africa'),(163,'Spain'),(164,'Sri Lanka'),(165,'Sudan'),(166,'Suriname'),(167,'Swaziland'),(168,'Sweden'),(169,'Switzerland'),(170,'Syria'),(171,'Taiwan'),(172,'Tajikistan'),(173,'Tanzania'),(174,'Thailand'),(175,'Togo'),(176,'Tonga'),(177,'Trinidad & Tobago'),(178,'Tunisia'),(179,'Turkey'),(180,'Turkmenistan'),(181,'Tuvalu'),(182,'Uganda'),(183,'Ukraine'),(184,'United Arab Emirates'),(185,'United Kingdom'),(186,'United States'),(187,'Uruguay'),(188,'Uzbekistan'),(189,'Vanuatu'),(190,'Vatican City'),(191,'Venezuea'),(192,'Vietnam'),(193,'Yemen'),(194,'Zambia'),(195,'Zimbabwe');
/*!40000 ALTER TABLE `countries` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `courses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `section_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courses`
--

LOCK TABLES `courses` WRITE;
/*!40000 ALTER TABLE `courses` DISABLE KEYS */;
/*!40000 ALTER TABLE `courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `draft`
--

DROP TABLE IF EXISTS `draft`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `draft` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `uid` int(50) NOT NULL,
  `mid` int(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `draft`
--

LOCK TABLES `draft` WRITE;
/*!40000 ALTER TABLE `draft` DISABLE KEYS */;
/*!40000 ALTER TABLE `draft` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driver_details`
--

DROP TABLE IF EXISTS `driver_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `driver_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vehicle_id` varchar(120) DEFAULT NULL,
  `first_name` varchar(120) DEFAULT NULL,
  `last_name` varchar(120) DEFAULT NULL,
  `address` varchar(120) DEFAULT NULL,
  `dob` varchar(120) DEFAULT NULL,
  `age` varchar(120) DEFAULT NULL,
  `license_no` varchar(120) DEFAULT NULL,
  `expiry_date` date DEFAULT NULL,
  `status` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driver_details`
--

LOCK TABLES `driver_details` WRITE;
/*!40000 ALTER TABLE `driver_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `driver_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `elective_groups`
--

DROP TABLE IF EXISTS `elective_groups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `elective_groups` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `batch_id` int(11) DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `elective_groups`
--

LOCK TABLES `elective_groups` WRITE;
/*!40000 ALTER TABLE `elective_groups` DISABLE KEYS */;
/*!40000 ALTER TABLE `elective_groups` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `electives`
--

DROP TABLE IF EXISTS `electives`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `electives` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `elective_group_id` int(11) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `electives`
--

LOCK TABLES `electives` WRITE;
/*!40000 ALTER TABLE `electives` DISABLE KEYS */;
/*!40000 ALTER TABLE `electives` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_additional_details`
--

DROP TABLE IF EXISTS `employee_additional_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_additional_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` int(11) DEFAULT NULL,
  `additional_field_id` int(11) DEFAULT NULL,
  `additional_info` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_additional_details`
--

LOCK TABLES `employee_additional_details` WRITE;
/*!40000 ALTER TABLE `employee_additional_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_additional_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_attendances`
--

DROP TABLE IF EXISTS `employee_attendances`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_attendances` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `attendance_date` date DEFAULT NULL,
  `employee_id` int(11) DEFAULT NULL,
  `employee_leave_type_id` int(11) DEFAULT NULL,
  `reason` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_half_day` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_attendances`
--

LOCK TABLES `employee_attendances` WRITE;
/*!40000 ALTER TABLE `employee_attendances` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_attendances` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_bank_details`
--

DROP TABLE IF EXISTS `employee_bank_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_bank_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` int(11) DEFAULT NULL,
  `bank_field_id` int(11) DEFAULT NULL,
  `bank_info` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_bank_details`
--

LOCK TABLES `employee_bank_details` WRITE;
/*!40000 ALTER TABLE `employee_bank_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_bank_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_categories`
--

DROP TABLE IF EXISTS `employee_categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prefix` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_categories`
--

LOCK TABLES `employee_categories` WRITE;
/*!40000 ALTER TABLE `employee_categories` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_department_events`
--

DROP TABLE IF EXISTS `employee_department_events`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_department_events` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `event_id` int(11) DEFAULT NULL,
  `employee_department_id` int(11) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_department_events`
--

LOCK TABLES `employee_department_events` WRITE;
/*!40000 ALTER TABLE `employee_department_events` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_department_events` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_departments`
--

DROP TABLE IF EXISTS `employee_departments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_departments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_departments`
--

LOCK TABLES `employee_departments` WRITE;
/*!40000 ALTER TABLE `employee_departments` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_departments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_grades`
--

DROP TABLE IF EXISTS `employee_grades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_grades` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `priority` int(11) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `max_hours_day` int(11) DEFAULT NULL,
  `max_hours_week` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_grades`
--

LOCK TABLES `employee_grades` WRITE;
/*!40000 ALTER TABLE `employee_grades` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_grades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_leave_types`
--

DROP TABLE IF EXISTS `employee_leave_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_leave_types` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `max_leave_count` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `carry_forward` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_leave_types`
--

LOCK TABLES `employee_leave_types` WRITE;
/*!40000 ALTER TABLE `employee_leave_types` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_leave_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_leaves`
--

DROP TABLE IF EXISTS `employee_leaves`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_leaves` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` int(11) DEFAULT NULL,
  `employee_leave_type_id` int(11) DEFAULT NULL,
  `leave_count` decimal(5,1) DEFAULT '0.0',
  `leave_taken` decimal(5,1) DEFAULT '0.0',
  `reset_date` date DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_leaves`
--

LOCK TABLES `employee_leaves` WRITE;
/*!40000 ALTER TABLE `employee_leaves` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_leaves` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_positions`
--

DROP TABLE IF EXISTS `employee_positions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_positions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `employee_category_id` int(11) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_positions`
--

LOCK TABLES `employee_positions` WRITE;
/*!40000 ALTER TABLE `employee_positions` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_positions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_salary_structures`
--

DROP TABLE IF EXISTS `employee_salary_structures`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_salary_structures` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` int(11) DEFAULT NULL,
  `payroll_category_id` int(11) DEFAULT NULL,
  `amount` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_salary_structures`
--

LOCK TABLES `employee_salary_structures` WRITE;
/*!40000 ALTER TABLE `employee_salary_structures` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_salary_structures` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employees` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(120) NOT NULL,
  `employee_category_id` int(11) DEFAULT NULL,
  `employee_number` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `joining_date` date DEFAULT NULL,
  `first_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `middle_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gender` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `job_title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `employee_position_id` int(11) DEFAULT NULL,
  `employee_department_id` int(11) DEFAULT NULL,
  `reporting_manager_id` int(11) DEFAULT NULL,
  `employee_grade_id` int(11) DEFAULT NULL,
  `qualification` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `experience_detail` text COLLATE utf8_unicode_ci,
  `experience_year` int(11) DEFAULT NULL,
  `experience_month` int(11) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `status_description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `marital_status` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `children_count` int(11) DEFAULT NULL,
  `father_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `mother_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `husband_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `blood_group` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nationality_id` int(11) DEFAULT NULL,
  `home_address_line1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `home_address_line2` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `home_city` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `home_state` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `home_country_id` int(11) DEFAULT NULL,
  `home_pin_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_address_line1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_address_line2` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_city` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_state` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_country_id` int(11) DEFAULT NULL,
  `office_pin_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_phone1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_phone2` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `mobile_phone` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `home_phone` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fax` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `photo_file_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `photo_content_type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `photo_data` longblob,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `photo_file_size` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `is_deleted` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `index_employees_on_employee_number` (`employee_number`(10))
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees_subjects`
--

DROP TABLE IF EXISTS `employees_subjects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employees_subjects` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` int(11) DEFAULT NULL,
  `subject_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index_employees_subjects_on_subject_id` (`subject_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees_subjects`
--

LOCK TABLES `employees_subjects` WRITE;
/*!40000 ALTER TABLE `employees_subjects` DISABLE KEYS */;
/*!40000 ALTER TABLE `employees_subjects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `events`
--

DROP TABLE IF EXISTS `events`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `events` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL,
  `title` varchar(1000) DEFAULT NULL,
  `desc` text NOT NULL,
  `type` int(255) NOT NULL,
  `allDay` smallint(5) unsigned NOT NULL DEFAULT '0',
  `start` int(10) unsigned DEFAULT NULL,
  `end` int(10) unsigned DEFAULT NULL,
  `editable` tinyint(1) NOT NULL DEFAULT '1',
  `placeholder` varchar(120) DEFAULT NULL,
  `code` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `events`
--

LOCK TABLES `events` WRITE;
/*!40000 ALTER TABLE `events` DISABLE KEYS */;
INSERT INTO `events` VALUES (1,1,'PRUEBA','HOLA',1,1,1428841800,1428876000,1,'0',0);
/*!40000 ALTER TABLE `events` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `events_helper`
--

DROP TABLE IF EXISTS `events_helper`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `events_helper` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` int(255) NOT NULL,
  `user_id` int(10) unsigned NOT NULL,
  `title` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `events_helper`
--

LOCK TABLES `events_helper` WRITE;
/*!40000 ALTER TABLE `events_helper` DISABLE KEYS */;
/*!40000 ALTER TABLE `events_helper` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `events_old`
--

DROP TABLE IF EXISTS `events_old`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `events_old` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `start_date` datetime DEFAULT NULL,
  `end_date` datetime DEFAULT NULL,
  `is_common` tinyint(1) DEFAULT '0',
  `is_holiday` tinyint(1) DEFAULT '0',
  `is_exam` tinyint(1) DEFAULT '0',
  `is_due` tinyint(1) DEFAULT '0',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `origin_id` int(11) DEFAULT NULL,
  `origin_type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index_events_on_is_common_and_is_holiday_and_is_exam` (`is_common`,`is_holiday`,`is_exam`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `events_old`
--

LOCK TABLES `events_old` WRITE;
/*!40000 ALTER TABLE `events_old` DISABLE KEYS */;
/*!40000 ALTER TABLE `events_old` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `events_type`
--

DROP TABLE IF EXISTS `events_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `events_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(120) DEFAULT NULL,
  `colour_code` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `events_type`
--

LOCK TABLES `events_type` WRITE;
/*!40000 ALTER TABLE `events_type` DISABLE KEYS */;
INSERT INTO `events_type` VALUES (1,'Exam','#fc8d8d'),(2,'Holidays','#9ff78f'),(3,'Notice','#ffa600'),(4,'Meeting','#689af7');
/*!40000 ALTER TABLE `events_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `events_user_preference`
--

DROP TABLE IF EXISTS `events_user_preference`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `events_user_preference` (
  `user_id` int(10) unsigned NOT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `mobile_alert` tinyint(1) NOT NULL DEFAULT '0',
  `email` varchar(40) DEFAULT NULL,
  `email_alert` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `events_user_preference`
--

LOCK TABLES `events_user_preference` WRITE;
/*!40000 ALTER TABLE `events_user_preference` DISABLE KEYS */;
INSERT INTO `events_user_preference` VALUES (1,NULL,0,NULL,0),(4,NULL,0,NULL,0);
/*!40000 ALTER TABLE `events_user_preference` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exam_groups`
--

DROP TABLE IF EXISTS `exam_groups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exam_groups` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `batch_id` int(11) DEFAULT NULL,
  `exam_type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_published` tinyint(1) DEFAULT '0',
  `result_published` tinyint(1) DEFAULT '0',
  `exam_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam_groups`
--

LOCK TABLES `exam_groups` WRITE;
/*!40000 ALTER TABLE `exam_groups` DISABLE KEYS */;
/*!40000 ALTER TABLE `exam_groups` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exam_scores`
--

DROP TABLE IF EXISTS `exam_scores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exam_scores` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `exam_id` int(11) DEFAULT NULL,
  `marks` decimal(7,2) DEFAULT NULL,
  `grading_level_id` int(11) DEFAULT NULL,
  `remarks` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_failed` tinyint(1) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index_exam_scores_on_student_id_and_exam_id` (`student_id`,`exam_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam_scores`
--

LOCK TABLES `exam_scores` WRITE;
/*!40000 ALTER TABLE `exam_scores` DISABLE KEYS */;
/*!40000 ALTER TABLE `exam_scores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exams`
--

DROP TABLE IF EXISTS `exams`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exams` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `exam_group_id` int(11) DEFAULT NULL,
  `subject_id` int(11) DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `maximum_marks` decimal(10,2) DEFAULT NULL,
  `minimum_marks` decimal(10,2) DEFAULT NULL,
  `grading_level_id` int(11) DEFAULT NULL,
  `weightage` int(11) DEFAULT '0',
  `event_id` int(11) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index_exams_on_exam_group_id_and_subject_id` (`exam_group_id`,`subject_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exams`
--

LOCK TABLES `exams` WRITE;
/*!40000 ALTER TABLE `exams` DISABLE KEYS */;
/*!40000 ALTER TABLE `exams` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fee_collection_discounts`
--

DROP TABLE IF EXISTS `fee_collection_discounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fee_collection_discounts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `receiver_id` int(11) DEFAULT NULL,
  `finance_fee_collection_id` int(11) DEFAULT NULL,
  `discount` decimal(15,2) DEFAULT NULL,
  `is_amount` tinyint(1) DEFAULT '0',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fee_collection_discounts`
--

LOCK TABLES `fee_collection_discounts` WRITE;
/*!40000 ALTER TABLE `fee_collection_discounts` DISABLE KEYS */;
/*!40000 ALTER TABLE `fee_collection_discounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fee_collection_particulars`
--

DROP TABLE IF EXISTS `fee_collection_particulars`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fee_collection_particulars` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` text COLLATE utf8_unicode_ci,
  `amount` decimal(12,2) DEFAULT NULL,
  `finance_fee_collection_id` int(11) DEFAULT NULL,
  `student_category_id` int(11) DEFAULT NULL,
  `admission_no` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fee_collection_particulars`
--

LOCK TABLES `fee_collection_particulars` WRITE;
/*!40000 ALTER TABLE `fee_collection_particulars` DISABLE KEYS */;
/*!40000 ALTER TABLE `fee_collection_particulars` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fee_discounts`
--

DROP TABLE IF EXISTS `fee_discounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fee_discounts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `receiver_id` int(11) DEFAULT NULL,
  `finance_fee_category_id` int(11) DEFAULT NULL,
  `discount` decimal(15,2) DEFAULT NULL,
  `is_amount` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fee_discounts`
--

LOCK TABLES `fee_discounts` WRITE;
/*!40000 ALTER TABLE `fee_discounts` DISABLE KEYS */;
/*!40000 ALTER TABLE `fee_discounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fee_receipt_details`
--

DROP TABLE IF EXISTS `fee_receipt_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fee_receipt_details` (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `student` int(11) NOT NULL,
  `batch` int(11) NOT NULL,
  `collection` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fee_receipt_details`
--

LOCK TABLES `fee_receipt_details` WRITE;
/*!40000 ALTER TABLE `fee_receipt_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `fee_receipt_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `file_uploads`
--

DROP TABLE IF EXISTS `file_uploads`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `file_uploads` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `category` int(11) NOT NULL,
  `placeholder` varchar(50) DEFAULT NULL,
  `course` int(11) DEFAULT NULL,
  `batch` int(11) DEFAULT NULL,
  `file` varchar(200) NOT NULL,
  `file_type` varchar(50) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `file_uploads`
--

LOCK TABLES `file_uploads` WRITE;
/*!40000 ALTER TABLE `file_uploads` DISABLE KEYS */;
/*!40000 ALTER TABLE `file_uploads` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `file_uploads_category`
--

DROP TABLE IF EXISTS `file_uploads_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `file_uploads_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(100) NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `file_uploads_category`
--

LOCK TABLES `file_uploads_category` WRITE;
/*!40000 ALTER TABLE `file_uploads_category` DISABLE KEYS */;
/*!40000 ALTER TABLE `file_uploads_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `finance_donations`
--

DROP TABLE IF EXISTS `finance_donations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `finance_donations` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `donor` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `amount` decimal(15,2) DEFAULT NULL,
  `transaction_id` int(11) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `transaction_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `finance_donations`
--

LOCK TABLES `finance_donations` WRITE;
/*!40000 ALTER TABLE `finance_donations` DISABLE KEYS */;
/*!40000 ALTER TABLE `finance_donations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `finance_fee_categories`
--

DROP TABLE IF EXISTS `finance_fee_categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `finance_fee_categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` text COLLATE utf8_unicode_ci,
  `batch_id` int(11) DEFAULT NULL,
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0',
  `is_master` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `finance_fee_categories`
--

LOCK TABLES `finance_fee_categories` WRITE;
/*!40000 ALTER TABLE `finance_fee_categories` DISABLE KEYS */;
/*!40000 ALTER TABLE `finance_fee_categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `finance_fee_collections`
--

DROP TABLE IF EXISTS `finance_fee_collections`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `finance_fee_collections` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `due_date` date DEFAULT NULL,
  `fee_category_id` int(11) DEFAULT NULL,
  `batch_id` int(11) DEFAULT NULL,
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `index_finance_fee_collections_on_fee_category_id` (`fee_category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `finance_fee_collections`
--

LOCK TABLES `finance_fee_collections` WRITE;
/*!40000 ALTER TABLE `finance_fee_collections` DISABLE KEYS */;
/*!40000 ALTER TABLE `finance_fee_collections` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `finance_fee_particulars`
--

DROP TABLE IF EXISTS `finance_fee_particulars`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `finance_fee_particulars` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` text COLLATE utf8_unicode_ci,
  `amount` decimal(15,2) DEFAULT NULL,
  `finance_fee_category_id` int(11) DEFAULT NULL,
  `student_category_id` int(11) DEFAULT NULL,
  `admission_no` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `finance_fee_particulars`
--

LOCK TABLES `finance_fee_particulars` WRITE;
/*!40000 ALTER TABLE `finance_fee_particulars` DISABLE KEYS */;
/*!40000 ALTER TABLE `finance_fee_particulars` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `finance_fee_structure_elements`
--

DROP TABLE IF EXISTS `finance_fee_structure_elements`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `finance_fee_structure_elements` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` decimal(15,2) DEFAULT NULL,
  `label` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `batch_id` int(11) DEFAULT NULL,
  `student_category_id` int(11) DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  `fee_collection_id` int(11) DEFAULT NULL,
  `deleted` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `finance_fee_structure_elements`
--

LOCK TABLES `finance_fee_structure_elements` WRITE;
/*!40000 ALTER TABLE `finance_fee_structure_elements` DISABLE KEYS */;
/*!40000 ALTER TABLE `finance_fee_structure_elements` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `finance_fees`
--

DROP TABLE IF EXISTS `finance_fees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `finance_fees` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fee_collection_id` int(11) DEFAULT NULL,
  `transaction_id` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  `is_paid` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `index_finance_fees_on_fee_collection_id_and_student_id` (`fee_collection_id`,`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `finance_fees`
--

LOCK TABLES `finance_fees` WRITE;
/*!40000 ALTER TABLE `finance_fees` DISABLE KEYS */;
/*!40000 ALTER TABLE `finance_fees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `finance_transaction_categories`
--

DROP TABLE IF EXISTS `finance_transaction_categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `finance_transaction_categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_income` tinyint(1) DEFAULT NULL,
  `deleted` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `finance_transaction_categories`
--

LOCK TABLES `finance_transaction_categories` WRITE;
/*!40000 ALTER TABLE `finance_transaction_categories` DISABLE KEYS */;
/*!40000 ALTER TABLE `finance_transaction_categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `finance_transaction_triggers`
--

DROP TABLE IF EXISTS `finance_transaction_triggers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `finance_transaction_triggers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `finance_category_id` int(11) DEFAULT NULL,
  `percentage` decimal(8,2) DEFAULT NULL,
  `title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `finance_transaction_triggers`
--

LOCK TABLES `finance_transaction_triggers` WRITE;
/*!40000 ALTER TABLE `finance_transaction_triggers` DISABLE KEYS */;
/*!40000 ALTER TABLE `finance_transaction_triggers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `finance_transactions`
--

DROP TABLE IF EXISTS `finance_transactions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `finance_transactions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `amount` decimal(15,2) DEFAULT NULL,
  `fine_included` tinyint(1) DEFAULT '0',
  `category_id` int(11) DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  `finance_fees_id` int(11) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `transaction_date` date DEFAULT NULL,
  `fine_amount` decimal(10,2) DEFAULT '0.00',
  `master_transaction_id` int(11) DEFAULT '0',
  `finance_id` int(11) DEFAULT NULL,
  `finance_type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `payee_id` int(11) DEFAULT NULL,
  `payee_type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `receipt_no` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `voucher_no` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `finance_transactions`
--

LOCK TABLES `finance_transactions` WRITE;
/*!40000 ALTER TABLE `finance_transactions` DISABLE KEYS */;
/*!40000 ALTER TABLE `finance_transactions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `floor`
--

DROP TABLE IF EXISTS `floor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `floor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hostel_id` varchar(120) DEFAULT NULL,
  `floor_no` varchar(120) DEFAULT NULL,
  `no_of_rooms` varchar(120) DEFAULT NULL,
  `created` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `floor`
--

LOCK TABLES `floor` WRITE;
/*!40000 ALTER TABLE `floor` DISABLE KEYS */;
/*!40000 ALTER TABLE `floor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `folder`
--

DROP TABLE IF EXISTS `folder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `folder` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `uid` int(50) NOT NULL,
  `mid` int(50) NOT NULL,
  `fid` int(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `folder`
--

LOCK TABLES `folder` WRITE;
/*!40000 ALTER TABLE `folder` DISABLE KEYS */;
/*!40000 ALTER TABLE `folder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `food_info`
--

DROP TABLE IF EXISTS `food_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `food_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `food_preference` varchar(120) DEFAULT NULL,
  `amount` varchar(120) DEFAULT NULL,
  `is_deleted` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food_info`
--

LOCK TABLES `food_info` WRITE;
/*!40000 ALTER TABLE `food_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `food_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fuel_consumption`
--

DROP TABLE IF EXISTS `fuel_consumption`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fuel_consumption` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vehicle_id` varchar(120) DEFAULT NULL,
  `fuel_consumed` varchar(120) DEFAULT NULL,
  `amount` varchar(120) DEFAULT NULL,
  `consumed_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fuel_consumption`
--

LOCK TABLES `fuel_consumption` WRITE;
/*!40000 ALTER TABLE `fuel_consumption` DISABLE KEYS */;
/*!40000 ALTER TABLE `fuel_consumption` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grading_levels`
--

DROP TABLE IF EXISTS `grading_levels`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `grading_levels` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `batch_id` int(11) DEFAULT NULL,
  `min_score` int(11) DEFAULT NULL,
  `order` int(11) DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index_grading_levels_on_batch_id_and_is_deleted` (`batch_id`,`is_deleted`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grading_levels`
--

LOCK TABLES `grading_levels` WRITE;
/*!40000 ALTER TABLE `grading_levels` DISABLE KEYS */;
INSERT INTO `grading_levels` VALUES (1,'A',NULL,90,NULL,0,'2012-02-20 13:41:10','2012-02-20 13:41:10'),(2,'B',NULL,80,NULL,0,'2012-02-20 13:41:10','2012-02-20 13:41:10'),(3,'C',NULL,70,NULL,0,'2012-02-20 13:41:11','2012-02-20 13:41:11'),(4,'D',NULL,60,NULL,0,'2012-02-20 13:41:11','2012-02-20 13:41:11'),(5,'E',NULL,50,NULL,0,'2012-02-20 13:41:11','2012-02-20 13:41:11'),(6,'F',NULL,40,NULL,0,'2012-02-20 13:41:11','2012-02-20 13:41:11');
/*!40000 ALTER TABLE `grading_levels` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grouped_exams`
--

DROP TABLE IF EXISTS `grouped_exams`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `grouped_exams` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `exam_group_id` int(11) DEFAULT NULL,
  `batch_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index_grouped_exams_on_batch_id` (`batch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grouped_exams`
--

LOCK TABLES `grouped_exams` WRITE;
/*!40000 ALTER TABLE `grouped_exams` DISABLE KEYS */;
/*!40000 ALTER TABLE `grouped_exams` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groups`
--

DROP TABLE IF EXISTS `groups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `groups` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `grp_name` varchar(50) NOT NULL,
  `users_ids` varchar(120) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groups`
--

LOCK TABLES `groups` WRITE;
/*!40000 ALTER TABLE `groups` DISABLE KEYS */;
/*!40000 ALTER TABLE `groups` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guardians`
--

DROP TABLE IF EXISTS `guardians`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guardians` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(120) NOT NULL,
  `ward_id` int(11) DEFAULT NULL,
  `first_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `relation` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_phone1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_phone2` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `mobile_phone` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_address_line1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `office_address_line2` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `city` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `state` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `country_id` int(11) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `occupation` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `income` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `education` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guardians`
--

LOCK TABLES `guardians` WRITE;
/*!40000 ALTER TABLE `guardians` DISABLE KEYS */;
/*!40000 ALTER TABLE `guardians` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hosteldetails`
--

DROP TABLE IF EXISTS `hosteldetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hosteldetails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hostel_name` varchar(120) DEFAULT NULL,
  `address` varchar(120) DEFAULT NULL,
  `is_deleted` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hosteldetails`
--

LOCK TABLES `hosteldetails` WRITE;
/*!40000 ALTER TABLE `hosteldetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `hosteldetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `individual_payslip_categories`
--

DROP TABLE IF EXISTS `individual_payslip_categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `individual_payslip_categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` int(11) DEFAULT NULL,
  `salary_date` date DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `amount` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_deduction` tinyint(1) DEFAULT NULL,
  `include_every_month` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `individual_payslip_categories`
--

LOCK TABLES `individual_payslip_categories` WRITE;
/*!40000 ALTER TABLE `individual_payslip_categories` DISABLE KEYS */;
/*!40000 ALTER TABLE `individual_payslip_categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `languages`
--

DROP TABLE IF EXISTS `languages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `languages` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `languages`
--

LOCK TABLES `languages` WRITE;
/*!40000 ALTER TABLE `languages` DISABLE KEYS */;
INSERT INTO `languages` VALUES (1,'English','en'),(2,'Spanish','es');
/*!40000 ALTER TABLE `languages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `liabilities`
--

DROP TABLE IF EXISTS `liabilities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `liabilities` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` text COLLATE utf8_unicode_ci,
  `amount` int(11) DEFAULT NULL,
  `is_solved` tinyint(1) DEFAULT '0',
  `is_deleted` tinyint(1) DEFAULT '0',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `liabilities`
--

LOCK TABLES `liabilities` WRITE;
/*!40000 ALTER TABLE `liabilities` DISABLE KEYS */;
/*!40000 ALTER TABLE `liabilities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `logo`
--

DROP TABLE IF EXISTS `logo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `logo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `photo_file_name` varchar(120) NOT NULL,
  `photo_content_type` varchar(120) NOT NULL,
  `photo_file_size` varchar(120) NOT NULL,
  `photo_data` blob NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logo`
--

LOCK TABLES `logo` WRITE;
/*!40000 ALTER TABLE `logo` DISABLE KEYS */;
/*!40000 ALTER TABLE `logo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mailbox_conversation`
--

DROP TABLE IF EXISTS `mailbox_conversation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mailbox_conversation` (
  `conversation_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `initiator_id` int(10) NOT NULL,
  `interlocutor_id` int(10) NOT NULL,
  `subject` varchar(100) NOT NULL DEFAULT '',
  `bm_read` tinyint(3) NOT NULL DEFAULT '0',
  `bm_deleted` tinyint(3) NOT NULL DEFAULT '0',
  `modified` int(10) unsigned NOT NULL,
  `is_system` enum('yes','no') NOT NULL DEFAULT 'no',
  `initiator_del` tinyint(1) unsigned DEFAULT '0',
  `interlocutor_del` tinyint(1) unsigned DEFAULT '0',
  PRIMARY KEY (`conversation_id`),
  KEY `initiator_id` (`initiator_id`),
  KEY `interlocutor_id` (`interlocutor_id`),
  KEY `conversation_ts` (`modified`),
  KEY `subject` (`subject`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mailbox_conversation`
--

LOCK TABLES `mailbox_conversation` WRITE;
/*!40000 ALTER TABLE `mailbox_conversation` DISABLE KEYS */;
/*!40000 ALTER TABLE `mailbox_conversation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mailbox_message`
--

DROP TABLE IF EXISTS `mailbox_message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mailbox_message` (
  `message_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `conversation_id` int(10) unsigned NOT NULL,
  `created` int(10) unsigned NOT NULL DEFAULT '0',
  `sender_id` int(10) unsigned NOT NULL DEFAULT '0',
  `recipient_id` int(10) unsigned NOT NULL DEFAULT '0',
  `text` mediumtext NOT NULL,
  `crc64` bigint(20) NOT NULL,
  PRIMARY KEY (`message_id`),
  KEY `sender_profile_id` (`sender_id`),
  KEY `recipient_profile_id` (`recipient_id`),
  KEY `conversation_id` (`conversation_id`),
  KEY `timestamp` (`created`),
  KEY `crc64` (`crc64`),
  FULLTEXT KEY `text` (`text`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mailbox_message`
--

LOCK TABLES `mailbox_message` WRITE;
/*!40000 ALTER TABLE `mailbox_message` DISABLE KEYS */;
/*!40000 ALTER TABLE `mailbox_message` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu` (
  `id` tinyint(3) unsigned NOT NULL AUTO_INCREMENT,
  `parent_id` tinyint(3) unsigned NOT NULL DEFAULT '0',
  `title` varchar(255) NOT NULL DEFAULT '',
  `url` varchar(255) NOT NULL DEFAULT '',
  `class` varchar(255) NOT NULL DEFAULT '',
  `position` tinyint(3) unsigned NOT NULL DEFAULT '0',
  `group_id` tinyint(3) unsigned NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=42 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (1,0,'Home','/','',1,1),(2,0,'About','/about.html','',2,1),(3,2,'Company Profile','/company-profile.html','',1,1),(19,0,'Affiliate','/affiliate.html','',3,2),(18,0,'Forum','/forum','',2,2),(17,0,'Make Money','/make-money.html','',1,2),(7,0,'Contact Us','/contact-us.html','',5,1),(8,0,'Blog','/blog','',4,1),(9,0,'Products','/products','',3,1),(10,9,'Handicraft','/products/handicraft','',1,1),(11,9,'Furniture','/products/furniture','',2,1),(12,10,'Tissue Box','/products/handicraft/tissue','',1,1),(13,10,'Frame','/products/handicraft/frame','',2,1),(14,11,'Cabinet','/products/furniture/cabinet','',1,1),(15,11,'Chair','/products/furniture/chair','',2,1),(16,11,'Table','/products/furniture/table','',3,1),(20,0,'Help','/help','',4,2),(21,20,'Support Center','/support-center.html','',1,2),(22,20,'Sitemap','/sitemap.html','',2,2),(23,0,'Author Dashboard','/author-dashboard','',1,3),(24,0,'My Profile','/member/profile','',2,3),(25,0,'Settings','/member/settings','',3,3),(26,0,'Downloads','/member/downloads','',4,3),(27,0,'Bookmarks','/member/bookmarks','',5,3),(28,0,'Logout','/logout.php','',6,3),(29,25,'Profile','/member/settings/profile','',1,3),(30,25,'Change Password','/member/settings/password','',2,3),(31,0,'Menu 1','','',1,4),(32,31,'Menu 1.1','','',1,4),(33,31,'Menu 1.2','','',2,4),(34,0,'Menu 2','','',2,4),(35,34,'Menu 2.1','','',1,4),(36,35,'Menu 2.1.1','','',1,4),(37,35,'Menu 2.1.2','','',2,4),(38,34,'Menu 2.2','','',2,4),(39,21,'Popular Files','/popular','',1,2),(40,21,'Top Authors','/top','',2,2),(41,21,'Wordpress','/wp','',3,2);
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu_group`
--

DROP TABLE IF EXISTS `menu_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu_group` (
  `id` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu_group`
--

LOCK TABLES `menu_group` WRITE;
/*!40000 ALTER TABLE `menu_group` DISABLE KEYS */;
INSERT INTO `menu_group` VALUES (1,'Main Menu'),(2,'Footer Menu'),(3,'Member Menu'),(4,'Admin Menu');
/*!40000 ALTER TABLE `menu_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mess_fee`
--

DROP TABLE IF EXISTS `mess_fee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mess_fee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` varchar(120) DEFAULT NULL,
  `allotment_id` varchar(120) DEFAULT NULL,
  `is_paid` varchar(120) NOT NULL DEFAULT '0',
  `created` date DEFAULT NULL,
  `status` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mess_fee`
--

LOCK TABLES `mess_fee` WRITE;
/*!40000 ALTER TABLE `mess_fee` DISABLE KEYS */;
/*!40000 ALTER TABLE `mess_fee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mess_manage`
--

DROP TABLE IF EXISTS `mess_manage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mess_manage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` varchar(120) DEFAULT NULL,
  `food_preference` varchar(120) DEFAULT NULL,
  `amount` varchar(120) DEFAULT NULL,
  `status` varchar(120) DEFAULT NULL,
  `created` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mess_manage`
--

LOCK TABLES `mess_manage` WRITE;
/*!40000 ALTER TABLE `mess_manage` DISABLE KEYS */;
/*!40000 ALTER TABLE `mess_manage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `message`
--

DROP TABLE IF EXISTS `message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `message` (
  `msg_id` int(11) NOT NULL AUTO_INCREMENT,
  `subject` varchar(120) NOT NULL,
  `msg_content` text NOT NULL,
  `msg_uploads` varchar(120) NOT NULL,
  `user_id` int(11) NOT NULL,
  `msg_time` time NOT NULL,
  `msg_date` date NOT NULL,
  `is_read` int(11) NOT NULL,
  `sender_id` int(11) NOT NULL,
  `is_deleted` int(11) NOT NULL,
  `is_task` int(11) DEFAULT NULL,
  PRIMARY KEY (`msg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message`
--

LOCK TABLES `message` WRITE;
/*!40000 ALTER TABLE `message` DISABLE KEYS */;
/*!40000 ALTER TABLE `message` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `message_user`
--

DROP TABLE IF EXISTS `message_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `message_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `message_id` int(11) NOT NULL,
  `user_id` varchar(120) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message_user`
--

LOCK TABLES `message_user` WRITE;
/*!40000 ALTER TABLE `message_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `message_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `messages`
--

DROP TABLE IF EXISTS `messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `messages` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sender_id` int(11) NOT NULL,
  `receiver_id` int(11) NOT NULL,
  `subject` varchar(256) NOT NULL DEFAULT '',
  `body` text,
  `is_read` enum('0','1') NOT NULL DEFAULT '0',
  `deleted_by` enum('sender','receiver') DEFAULT NULL,
  `created_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `sender` (`sender_id`),
  KEY `reciever` (`receiver_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messages`
--

LOCK TABLES `messages` WRITE;
/*!40000 ALTER TABLE `messages` DISABLE KEYS */;
/*!40000 ALTER TABLE `messages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monthly_payslips`
--

DROP TABLE IF EXISTS `monthly_payslips`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `monthly_payslips` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `salary_date` date DEFAULT NULL,
  `employee_id` int(11) DEFAULT NULL,
  `payroll_category_id` int(11) DEFAULT NULL,
  `amount` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_approved` tinyint(1) NOT NULL DEFAULT '0',
  `approver_id` int(11) DEFAULT NULL,
  `is_rejected` tinyint(1) NOT NULL DEFAULT '0',
  `rejector_id` int(11) DEFAULT NULL,
  `reason` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monthly_payslips`
--

LOCK TABLES `monthly_payslips` WRITE;
/*!40000 ALTER TABLE `monthly_payslips` DISABLE KEYS */;
/*!40000 ALTER TABLE `monthly_payslips` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `content` text COLLATE utf8_unicode_ci,
  `author_id` int(11) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news_comments`
--

DROP TABLE IF EXISTS `news_comments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news_comments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` text COLLATE utf8_unicode_ci,
  `news_id` int(11) DEFAULT NULL,
  `author_id` int(11) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news_comments`
--

LOCK TABLES `news_comments` WRITE;
/*!40000 ALTER TABLE `news_comments` DISABLE KEYS */;
/*!40000 ALTER TABLE `news_comments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `os_translated`
--

DROP TABLE IF EXISTS `os_translated`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `os_translated` (
  `id` int(11) NOT NULL DEFAULT '0',
  `language` varchar(16) NOT NULL DEFAULT '',
  `translation` text,
  PRIMARY KEY (`id`,`language`),
  CONSTRAINT `FK_os_translated_SourceMessage` FOREIGN KEY (`id`) REFERENCES `sourcemessage` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `os_translated`
--

LOCK TABLES `os_translated` WRITE;
/*!40000 ALTER TABLE `os_translated` DISABLE KEYS */;
/*!40000 ALTER TABLE `os_translated` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payroll_categories`
--

DROP TABLE IF EXISTS `payroll_categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payroll_categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `percentage` float DEFAULT NULL,
  `payroll_category_id` int(11) DEFAULT NULL,
  `is_deduction` tinyint(1) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payroll_categories`
--

LOCK TABLES `payroll_categories` WRITE;
/*!40000 ALTER TABLE `payroll_categories` DISABLE KEYS */;
/*!40000 ALTER TABLE `payroll_categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `period_entries`
--

DROP TABLE IF EXISTS `period_entries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `period_entries` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `month_date` date DEFAULT NULL,
  `batch_id` int(11) DEFAULT NULL,
  `subject_id` int(11) DEFAULT NULL,
  `class_timing_id` int(11) DEFAULT NULL,
  `employee_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index_period_entries_on_month_date_and_batch_id` (`month_date`,`batch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `period_entries`
--

LOCK TABLES `period_entries` WRITE;
/*!40000 ALTER TABLE `period_entries` DISABLE KEYS */;
/*!40000 ALTER TABLE `period_entries` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `privileges`
--

DROP TABLE IF EXISTS `privileges`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `privileges` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `description` text COLLATE utf8_unicode_ci,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `privileges`
--

LOCK TABLES `privileges` WRITE;
/*!40000 ALTER TABLE `privileges` DISABLE KEYS */;
INSERT INTO `privileges` VALUES (1,'ExaminationControl','2012-02-20 13:41:16','2012-02-20 13:41:16','examination_control_privilege'),(2,'EnterResults','2012-02-20 13:41:16','2012-02-20 13:41:16','enter_results_privilege'),(3,'ViewResults','2012-02-20 13:41:16','2012-02-20 13:41:16','view_results_privilege'),(4,'Admission','2012-02-20 13:41:16','2012-02-20 13:41:16','admission_privilege'),(5,'StudentsControl','2012-02-20 13:41:16','2012-02-20 13:41:16','students_control_privilege'),(6,'ManageNews','2012-02-20 13:41:16','2012-02-20 13:41:16','manage_news_privilege'),(7,'ManageTimetable','2012-02-20 13:41:16','2012-02-20 13:41:16','manage_timetable_privilege'),(8,'StudentAttendanceView','2012-02-20 13:41:16','2012-02-20 13:41:16','student_attendance_view_privilege'),(9,'HrBasics','2012-02-20 13:41:16','2012-02-20 13:41:16','hr_basics_privilege'),(10,'AddNewBatch','2012-02-20 13:41:16','2012-02-20 13:41:16','add_new_batch_privilege'),(11,'SubjectMaster','2012-02-20 13:41:16','2012-02-20 13:41:16','subject_master_privilege'),(12,'EventManagement','2012-02-20 13:41:16','2012-02-20 13:41:16','event_management_privilege'),(13,'GeneralSettings','2012-02-20 13:41:17','2012-02-20 13:41:17','general_settings_privilege'),(14,'FinanceControl','2012-02-20 13:41:17','2012-02-20 13:41:17','finance_control_privilege'),(15,'TimetableView','2012-02-20 13:41:17','2012-02-20 13:41:17','timetable_view_privilege'),(16,'StudentAttendanceRegister','2012-02-20 13:41:17','2012-02-20 13:41:17','student_attendance_register_privilege'),(17,'EmployeeAttendance','2012-02-20 13:41:17','2012-02-20 13:41:17','employee_attendance_privilege'),(18,'PayslipPowers','2012-02-20 13:41:17','2012-02-20 13:41:17','payslip_powers_privilege'),(19,'EmployeeSearch','2012-02-20 13:41:17','2012-02-20 13:41:17','employee_search_privilege'),(20,'SMSManagement','2012-02-20 13:41:17','2012-02-20 13:41:17','sms_management_privilege');
/*!40000 ALTER TABLE `privileges` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `privileges_users`
--

DROP TABLE IF EXISTS `privileges_users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `privileges_users` (
  `user_id` int(11) DEFAULT NULL,
  `privilege_id` int(11) DEFAULT NULL,
  KEY `index_privileges_users_on_user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `privileges_users`
--

LOCK TABLES `privileges_users` WRITE;
/*!40000 ALTER TABLE `privileges_users` DISABLE KEYS */;
/*!40000 ALTER TABLE `privileges_users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profiles`
--

DROP TABLE IF EXISTS `profiles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profiles` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `lastname` varchar(50) NOT NULL DEFAULT '',
  `firstname` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`user_id`),
  CONSTRAINT `user_profile_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profiles`
--

LOCK TABLES `profiles` WRITE;
/*!40000 ALTER TABLE `profiles` DISABLE KEYS */;
INSERT INTO `profiles` VALUES (1,'Admin','Administrator'),(2,'News','News');
/*!40000 ALTER TABLE `profiles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profiles_fields`
--

DROP TABLE IF EXISTS `profiles_fields`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profiles_fields` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `varname` varchar(50) NOT NULL,
  `title` varchar(255) NOT NULL,
  `field_type` varchar(50) NOT NULL,
  `field_size` varchar(15) NOT NULL DEFAULT '0',
  `field_size_min` varchar(15) NOT NULL DEFAULT '0',
  `required` int(1) NOT NULL DEFAULT '0',
  `match` varchar(255) NOT NULL DEFAULT '',
  `range` varchar(255) NOT NULL DEFAULT '',
  `error_message` varchar(255) NOT NULL DEFAULT '',
  `other_validator` varchar(5000) NOT NULL DEFAULT '',
  `default` varchar(255) NOT NULL DEFAULT '',
  `widget` varchar(255) NOT NULL DEFAULT '',
  `widgetparams` varchar(5000) NOT NULL DEFAULT '',
  `position` int(3) NOT NULL DEFAULT '0',
  `visible` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `varname` (`varname`,`widget`,`visible`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profiles_fields`
--

LOCK TABLES `profiles_fields` WRITE;
/*!40000 ALTER TABLE `profiles_fields` DISABLE KEYS */;
INSERT INTO `profiles_fields` VALUES (1,'lastname','Last Name','VARCHAR','50','3',1,'','','Incorrect Last Name (length between 3 and 50 characters).','','','','',1,3),(2,'firstname','First Name','VARCHAR','50','3',1,'','','Incorrect First Name (length between 3 and 50 characters).','','','','',0,3);
/*!40000 ALTER TABLE `profiles_fields` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publication`
--

DROP TABLE IF EXISTS `publication`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `publication` (
  `publication_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(120) DEFAULT NULL,
  `location` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`publication_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publication`
--

LOCK TABLES `publication` WRITE;
/*!40000 ALTER TABLE `publication` DISABLE KEYS */;
/*!40000 ALTER TABLE `publication` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `read`
--

DROP TABLE IF EXISTS `read`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `read` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `uid` int(50) NOT NULL,
  `mid` int(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `read`
--

LOCK TABLES `read` WRITE;
/*!40000 ALTER TABLE `read` DISABLE KEYS */;
/*!40000 ALTER TABLE `read` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registration`
--

DROP TABLE IF EXISTS `registration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registration` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` varchar(120) DEFAULT NULL,
  `food_preference` varchar(120) DEFAULT NULL,
  `desc` varchar(120) DEFAULT NULL,
  `status` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registration`
--

LOCK TABLES `registration` WRITE;
/*!40000 ALTER TABLE `registration` DISABLE KEYS */;
/*!40000 ALTER TABLE `registration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reminders`
--

DROP TABLE IF EXISTS `reminders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reminders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sender` int(11) DEFAULT NULL,
  `recipient` int(11) DEFAULT NULL,
  `subject` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `body` text COLLATE utf8_unicode_ci,
  `is_read` tinyint(1) DEFAULT '0',
  `is_deleted_by_sender` tinyint(1) DEFAULT '0',
  `is_deleted_by_recipient` tinyint(1) DEFAULT '0',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index_reminders_on_recipient` (`recipient`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reminders`
--

LOCK TABLES `reminders` WRITE;
/*!40000 ALTER TABLE `reminders` DISABLE KEYS */;
/*!40000 ALTER TABLE `reminders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reply`
--

DROP TABLE IF EXISTS `reply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reply` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `sid` int(11) NOT NULL,
  `mid` int(11) NOT NULL,
  `rid` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reply`
--

LOCK TABLES `reply` WRITE;
/*!40000 ALTER TABLE `reply` DISABLE KEYS */;
/*!40000 ALTER TABLE `reply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `return_book`
--

DROP TABLE IF EXISTS `return_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `return_book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` varchar(120) DEFAULT NULL,
  `book_id` varchar(120) DEFAULT NULL,
  `borrow_book_id` varchar(120) DEFAULT NULL,
  `issue_date` date DEFAULT NULL,
  `return_date` date DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `status` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `return_book`
--

LOCK TABLES `return_book` WRITE;
/*!40000 ALTER TABLE `return_book` DISABLE KEYS */;
/*!40000 ALTER TABLE `return_book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rights`
--

DROP TABLE IF EXISTS `rights`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rights` (
  `itemname` varchar(64) NOT NULL,
  `type` int(11) NOT NULL,
  `weight` int(11) NOT NULL,
  PRIMARY KEY (`itemname`),
  CONSTRAINT `rights_ibfk_1` FOREIGN KEY (`itemname`) REFERENCES `authitem` (`name`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rights`
--

LOCK TABLES `rights` WRITE;
/*!40000 ALTER TABLE `rights` DISABLE KEYS */;
/*!40000 ALTER TABLE `rights` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `room_no` varchar(120) DEFAULT NULL,
  `floor` varchar(120) DEFAULT NULL,
  `is_full` varchar(120) DEFAULT NULL,
  `no_of_bed` varchar(120) DEFAULT NULL,
  `created` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room_details`
--

DROP TABLE IF EXISTS `room_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `room_no` varchar(120) DEFAULT NULL,
  `bed_no` varchar(120) DEFAULT NULL,
  `no_of_floors` varchar(120) DEFAULT NULL,
  `mode_of_allotment` varchar(120) DEFAULT NULL,
  `created` date DEFAULT NULL,
  `status` varchar(120) DEFAULT NULL,
  `student_id` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room_details`
--

LOCK TABLES `room_details` WRITE;
/*!40000 ALTER TABLE `room_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `room_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roomrequest`
--

DROP TABLE IF EXISTS `roomrequest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roomrequest` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` varchar(120) DEFAULT NULL,
  `allot_id` varchar(120) DEFAULT NULL,
  `status` varchar(120) DEFAULT NULL,
  `created_at` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roomrequest`
--

LOCK TABLES `roomrequest` WRITE;
/*!40000 ALTER TABLE `roomrequest` DISABLE KEYS */;
/*!40000 ALTER TABLE `roomrequest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `route_details`
--

DROP TABLE IF EXISTS `route_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `route_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `route_name` varchar(120) DEFAULT NULL,
  `no_of_stops` varchar(120) DEFAULT NULL,
  `vehicle_id` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `route_details`
--

LOCK TABLES `route_details` WRITE;
/*!40000 ALTER TABLE `route_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `route_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `savedsearches`
--

DROP TABLE IF EXISTS `savedsearches`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `savedsearches` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `url` varchar(20000) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `name` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `savedsearches`
--

LOCK TABLES `savedsearches` WRITE;
/*!40000 ALTER TABLE `savedsearches` DISABLE KEYS */;
/*!40000 ALTER TABLE `savedsearches` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schema_migrations`
--

DROP TABLE IF EXISTS `schema_migrations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `schema_migrations` (
  `version` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  UNIQUE KEY `unique_schema_migrations` (`version`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schema_migrations`
--

LOCK TABLES `schema_migrations` WRITE;
/*!40000 ALTER TABLE `schema_migrations` DISABLE KEYS */;
INSERT INTO `schema_migrations` VALUES ('20090622100004'),('20090622102004'),('20090622104053'),('20090622104054'),('20090622114927'),('20090622115927'),('20090703074822'),('20090706170408'),('20090715234257'),('20090715234258'),('20090717124241'),('20090717126241'),('20090718050113'),('20090718050453'),('20090718050921'),('20090718052749'),('20090731092833'),('20090818045411'),('20090818050018'),('20090904071048'),('20090904071548'),('20090904071642'),('20090904071905'),('20090904071906'),('20090904071907'),('20090904071908'),('20090904071909'),('20090910062751'),('20090914095002'),('20090914114212'),('20090916052300'),('20090917052349'),('20090917065256'),('20090924081520'),('20090926071527'),('20091009093746'),('20091026065251'),('20091202050910'),('20091202053600'),('20091202104818'),('20091207084711'),('20091207085849'),('20091207090412'),('20091217191652'),('20091217201118'),('20091224063502'),('20100403073735'),('20100403092229'),('20100403093355'),('20100412105036'),('20100412105116'),('20100422110336'),('20100426094532'),('20100429093616'),('20100505075459'),('20100515063157'),('20100515063814'),('20100520073311'),('20100524093457'),('20100525055716'),('20100602115152'),('20100604103435'),('20100604103916'),('20100604104308'),('20100604104759'),('20100609073016'),('20100609074544'),('20100730092747'),('20100731053458'),('20100731054033'),('20100731055437'),('20101209063633'),('20110221051223'),('20110419101802'),('20110510121550'),('20110511053223'),('20110516110336'),('20110706114907'),('20110711100500'),('20110721122326'),('20110728115723'),('20110729055539'),('20110730100503'),('20110805072425'),('20110810052138'),('20110912062640'),('20110928054502'),('20111015111840'),('20111020074717'),('20111105052819');
/*!40000 ALTER TABLE `schema_migrations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `settings`
--

DROP TABLE IF EXISTS `settings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `settings` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(120) DEFAULT NULL,
  `value` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `settings`
--

LOCK TABLES `settings` WRITE;
/*!40000 ALTER TABLE `settings` DISABLE KEYS */;
/*!40000 ALTER TABLE `settings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sms_settings`
--

DROP TABLE IF EXISTS `sms_settings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sms_settings` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `settings_key` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_enabled` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sms_settings`
--

LOCK TABLES `sms_settings` WRITE;
/*!40000 ALTER TABLE `sms_settings` DISABLE KEYS */;
INSERT INTO `sms_settings` VALUES (1,'ApplicationEnabled',0),(2,'NewsEventsEnabled',0),(3,'StudentAdmissionEnabled',0),(4,'StudentAttendanceEnabled',0),(5,'EmployeeAppointmentEnabled',0),(6,'ExamScheduleEnabled',0),(7,'ExamResultEnabled',0),(8,'FeesEnabled',0),(9,'LibraryEnabled',0);
/*!40000 ALTER TABLE `sms_settings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sourcemessage`
--

DROP TABLE IF EXISTS `sourcemessage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sourcemessage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(32) DEFAULT NULL,
  `message` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=637 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sourcemessage`
--

LOCK TABLES `sourcemessage` WRITE;
/*!40000 ALTER TABLE `sourcemessage` DISABLE KEYS */;
INSERT INTO `sourcemessage` VALUES (1,'app','Home'),(2,'job','<span>Save Filter</span>'),(3,'cms','<h1>Manage Fees</h1>'),(4,'cms','Fees<span>Create and Manage Fee collections</span>'),(5,'cms','Collect Fees <span>Fees collection</span>'),(6,'cms','Fee Categories<span>Create and Manage Fee Categories</span>'),(7,'cms','Fees<span>Lorem ipsum dolor sit amet,</span>'),(8,'cms','Set grading levels<span>Grading Levels for the batch</span>'),(9,'cms','<h1>Exam Management</h1>'),(10,'cms','New Exam<span>create exam</span>'),(11,'app','Students'),(12,'app','Employees'),(13,'app','Courses'),(14,'app','Library'),(15,'app','Fees'),(16,'app','Examination'),(17,'app','Hostel'),(18,'app','Settings'),(19,'app','Website'),(20,'app','Attendance'),(21,'app','Reports'),(22,'app','Timetable'),(23,'app','Transport'),(24,'app','Translate'),(25,'app','User'),(26,'app','Rights'),(27,'app','<span>Create New Category</span>'),(28,'app','No.'),(29,'app','Category Name'),(30,'app','Status'),(31,'app','No. of Students'),(32,'app','Actions'),(33,'admin_student-categories','Are you sure you want to delete this student-categories?'),(34,'admin_student-categories','Delete Confirmation'),(35,'admin_student-categories','Delete'),(36,'admin_student-categories','Cancel'),(37,'admin_student-categories','Update'),(38,'admin_student-categories','View'),(39,'admin_student-categories','View Students'),(40,'app','Admissions Dashboard'),(41,'app','<strong>Total Students</strong>'),(42,'app','<strong>New Admissions</strong>'),(43,'app','<strong>Pending Leads</strong>'),(44,'app','<strong>Recent Admissions</strong>'),(45,'app','Date'),(46,'app','Student Name'),(47,'app','Admission No.'),(48,'app','Course/Batch'),(49,'app','Gender'),(50,'UserModule','Login'),(51,'UserModule.user','Login'),(52,'UserModule','Please fill out the following form with your login credentials:'),(53,'UserModule.user','Please fill out the following form with your login credentials:'),(54,'UserModule','Fields with <span class=\"required\">*</span> are required.'),(55,'UserModule.user','Fields with <span class=\"required\">*</span> are required.'),(56,'UserModule','Remember me next time'),(57,'UserModule.user','Remember me next time'),(58,'UserModule','username or email'),(59,'UserModule.user','username or email'),(60,'UserModule','password'),(61,'UserModule.user','password'),(62,'UserModule','Register'),(63,'UserModule.user','Register'),(64,'UserModule','Lost Password?'),(65,'UserModule.user','Lost Password?'),(66,'courses','General Settings<span>Lorem ipsum dolor sit amet,</span>'),(67,'courses','<h1>Courses & Batches</h1>'),(68,'courses','List Courses & Batches<span>Lorem ipsum dolor sit amet,</span>'),(69,'courses','Create Courses<span>Lorem ipsum dolor sit amet,</span>'),(70,'courses','Manage Courses & Batches'),(71,'courses','Edit'),(72,'courses','Delete'),(73,'courses','Add Batch'),(74,'courses','Batch Name'),(75,'courses','Start Date'),(76,'courses','End Date'),(77,'courses','Actions'),(78,'courses','Add Student'),(79,'batch','<strong>Batch: </strong> '),(80,'batch','Students'),(81,'batch','Subjects'),(82,'batch','Employees'),(83,'batch','<strong>Class Teacher :</strong> '),(84,'batch','Actions'),(85,'batch','Add Student'),(86,'batch','New Subject'),(87,'batch','Mark Attendance'),(88,'batch','Promote Batch'),(89,'batch','Deactivate Batch'),(90,'batch',' <strong>Batch: </strong>'),(91,'batch','Timetable'),(92,'batch','Attendences'),(93,'batch','Assessments'),(94,'batch','Settings'),(95,'batch','<span>Add Student</span>'),(96,'batch','Sl no.'),(97,'batch','Student Name'),(98,'batch','Admission Number'),(99,'batch','Gender'),(100,'batch','Add Leave<span>for add leave</span>'),(101,'batch','Make Inactive<span>for add leave</span>'),(102,'batch','Inactive Students'),(103,'batch','<i>No InActive Students In This Batch</i>'),(104,'weekdays','<span>Set Week Days</span>'),(105,'weekdays','<span>Set Class Timings</span>'),(106,'weekdays','Publish Time Table'),(107,'weekdays','Generate PDF'),(108,'weekdays','SUN'),(109,'job','Assign'),(110,'weekdays','MON'),(111,'weekdays','TUE'),(112,'weekdays','WED'),(113,'weekdays','THU'),(114,'weekdays','FRI'),(115,'weekdays','SAT'),(116,'weekdays','<span>Time Table</span>'),(117,'weekdays','Sunday'),(118,'weekdays','Monday'),(119,'weekdays','Tuesday'),(120,'weekdays','Wednesday'),(121,'weekdays','Thursday'),(122,'weekdays','Friday'),(123,'weekdays','Saturday'),(124,'admin_subjects','Are you sure you want to delete this subject?'),(125,'admin_subjects','Delete Confirmation'),(126,'admin_subjects','Delete'),(127,'admin_subjects','Cancel'),(128,'admin_subjects','Update'),(129,'admin_subjects','View'),(130,'admin_exam-groups','Are you sure you want to delete this exam-groups?'),(131,'admin_exam-groups','Delete Confirmation'),(132,'admin_exam-groups','Delete'),(133,'admin_exam-groups','Cancel'),(134,'admin_exam-groups','Update'),(135,'admin_exam-groups','View'),(136,'admin_grading-levels','Are you sure you want to delete this grading-levels?'),(137,'admin_grading-levels','Delete Confirmation'),(138,'admin_grading-levels','Delete'),(139,'admin_grading-levels','Cancel'),(140,'admin_grading-levels','Update'),(141,'admin_grading-levels','View'),(142,'exams','Create Exams'),(143,'exams',' Enter exam related details here:'),(144,'exams','<i>Exams Created For All Subjects</i>'),(145,'exams','Scheduled Subjects'),(146,'exam','<span>Create Exam</span>'),(147,'exam','<span>Grading Levels</span>'),(148,'exams','Exams'),(149,'exams','Manage Exams'),(150,'exams','max_mark'),(151,'exams','min_mark'),(152,'exams','Subject name'),(153,'exams','Max Marks'),(154,'exams','Min Marks'),(155,'exams','Start Time'),(156,'exams','End Time'),(157,'exams','Do not create'),(158,'exams','<i>Nothing Scheduled</i>'),(159,'job','ll'),(160,'message','Select All'),(161,'message','Compose Mail'),(162,'employees','Create Employee<span>Lorem ipsum dolor sit amet,</span>'),(163,'employees','<h1>Employee Leave Management</h1>'),(164,'employees','Add Leave Type<span>Lorem ipsum dolor sit amet,</span>'),(165,'employees','Attendance Register<span>Lorem ipsum dolor sit amet,</span>'),(166,'employees','Subject Association<span>Lorem ipsum dolor sit amet,</span>'),(167,'employees','Manage Category<span>Lorem ipsum dolor sit amet,</span>'),(168,'employees','Manage Department<span>Lorem ipsum dolor sit amet,</span>'),(169,'employees','Manage Positions<span>Lorem ipsum dolor sit amet,</span>'),(170,'employees','Manage Grades<span>Lorem ipsum dolor sit amet,</span>'),(171,'employees','Employees Dashboard'),(172,'employees','<strong>Total Employees</strong>'),(173,'employees','<strong>New Admissions</strong>'),(174,'employees','<strong>Inactive Users</strong>'),(175,'employees','<strong>Recent Employee Admissions</strong>'),(176,'employees','Date'),(177,'employees','Employee Name'),(178,'employees','Employee No:'),(179,'employees','Department'),(180,'employees','Position'),(181,'students','Admissions Dashboard'),(182,'students','<strong>Total Students</strong>'),(183,'students','<strong>New Admissions</strong>'),(184,'students','<strong>Inactive Students</strong>'),(185,'students','<strong>Recent Admissions</strong>'),(186,'students','Date'),(187,'students','Student Name'),(188,'students','Admission No.'),(189,'students','Course/Batch'),(190,'students','Gender'),(191,'students','<span>Create New Category</span>'),(192,'students','Category Name'),(193,'students','Status'),(194,'students','No. of Students'),(195,'students','Actions'),(196,'admin_student-categories','Are you sure you want to delete this student category?'),(197,'students','Manage Students'),(198,'students','Save Filter'),(199,'students','Load Filter'),(200,'students','Clear All'),(201,'students','Import Contact'),(202,'students','Add Student'),(203,'students','Filter Your Students:'),(204,'students','Name'),(205,'students','Admission number'),(206,'students','Batch'),(207,'students','Course'),(208,'students','Blood Group'),(209,'students','Country'),(210,'students','Date Of Birth'),(211,'students','Admission Date'),(212,'students','<strong>Active Filters:</strong>'),(213,'students','<i>No Active Filters</i>'),(214,'students','All'),(215,'students','A'),(216,'students','B'),(217,'students','C'),(218,'students','D'),(219,'students','E'),(220,'students','F'),(221,'students','G'),(222,'students','H'),(223,'students','I'),(224,'students','J'),(225,'students','K'),(226,'students','L'),(227,'students','M'),(228,'students','N'),(229,'students','O'),(230,'students','P'),(231,'students','Q'),(232,'students','R'),(233,'students','S'),(234,'students','T'),(235,'students','U'),(236,'students','V'),(237,'students','W'),(238,'students','X'),(239,'students','Y'),(240,'students','Z'),(241,'students','Sl. No.'),(242,'students','New Admission'),(243,'students','admission_no'),(244,'students','admission_date'),(245,'students','first_name'),(246,'students','middle_name'),(247,'students','last_name'),(248,'students','batch_id'),(249,'students','date_of_birth'),(250,'students','blood_group'),(251,'students','birth_place'),(252,'students','nationality_id'),(253,'students','language'),(254,'students','religion'),(255,'students','student_category_id'),(256,'students','address_line1'),(257,'students','address_line2'),(258,'students','city'),(259,'students','state'),(260,'students','pin_code'),(261,'students','country_id'),(262,'students','phone1'),(263,'students','phone2'),(264,'students','email'),(265,'students','<strong style=\"color:#000\">Upload Photo</strong>'),(266,'hostel','List Room Details<span>List all rooms here</span>'),(267,'hostel','Search Room<span>List all rooms here</span>'),(268,'hostel','Add new hostel<span>List all rooms here</span>'),(269,'hostel','Add Room Details<span>List all rooms here</span>'),(270,'hostel','Add Mess Details<span>List all rooms here</span>'),(271,'hostel','Allot Room<span>List all rooms here</span>'),(272,'hostel','Change Room<span>List all rooms here</span>'),(273,'hostel','Vacate<span>List all rooms here</span>'),(274,'hostel','View Student Details<span>List all rooms here</span>'),(275,'hostel','Mess Manage<span>List all rooms here</span>'),(276,'hostel','View Mess Dues<span>List all rooms here</span>'),(277,'hostel','Create Floor'),(278,'hostel','Hostel Name'),(279,'hostel','floor_no'),(280,'hostel','No Of Rooms'),(281,'hostel','Student Details'),(282,'hostel','Student ID'),(283,'hostel','Create Hosteldetails'),(284,'hostel','hostel_name'),(285,'hostel','Address'),(286,'hostel','Create FoodInfo'),(287,'hostel','food_preference'),(288,'hostel','amount'),(289,'hostel','Mess Manage'),(290,'hostel','Student Name'),(291,'hostel','Room No'),(292,'hostel','Bed No'),(293,'hostel','Food Habit'),(294,'hostel','Action'),(295,'hostel',' Paid'),(296,'transport','Mange Route'),(297,'transport','List All Routes<span>Route Details</span>'),(298,'transport','Assign Route<span>Route Details</span>'),(299,'transport','Search Students<span>Route Details</span>'),(300,'transport','Allotment<span>Route Details</span>'),(301,'transport','Vehicle Details<span>Route Details</span>'),(302,'transport','Route Details<span>Route Details</span>'),(303,'transport','Driver Details<span>Route Details</span>'),(304,'transport','Bus Log<span>Route Details</span>'),(305,'transport','Transportation'),(306,'transport','student_id'),(307,'transport','Route'),(308,'transport','stop_id'),(309,'settings','General Settings<span>Lorem ipsum dolor sit amet,</span>'),(310,'settings','<h1>User Settings</h1>'),(311,'settings','Create New User<span>Lorem ipsum dolor sit amet,</span>'),(312,'settings','Manage Users<span>Lorem ipsum dolor sit amet,</span>'),(313,'settings','<h1>Courses & Batches</h1>'),(314,'settings','List Courses & Batches<span>Lorem ipsum dolor sit amet,</span>'),(315,'settings','Create Courses<span>Lorem ipsum dolor sit amet,</span>'),(316,'settings','School / College Name'),(317,'settings','School/College Address'),(318,'settings','School/College Phone'),(319,'settings','Finance year start date'),(320,'settings','Finance year end date'),(321,'settings','Language'),(322,'settings','Currency Type'),(323,'settings','Network State'),(324,'settings','Date Format'),(325,'settings','Time Format'),(326,'settings','Time Zone'),(327,'settings','Select Language'),(328,'settings','Upload Logo'),(329,'settings','Enable Auto increment Student admission no.'),(330,'settings','Enable Auto increment Employee no.'),(331,'job','<h2>Save Search</h2>'),(332,'job','Save'),(333,'students','<strong>Course&nbsp;:</strong>'),(334,'students','<strong>Batch&nbsp;:</strong>'),(335,'students','<strong>Adm No&nbsp;:</strong>'),(336,'students','Student Profile :'),(337,'students','<span>Edit</span>'),(338,'students','<span>Students</span>'),(339,'students','Profile'),(340,'students','Assessments'),(341,'students','Attendance'),(342,'students','Fees'),(343,'students','General'),(344,'students','Class Roll No'),(345,'students','Birth Place'),(346,'students','Nationality'),(347,'students','Pin Code'),(348,'students','Address Line1'),(349,'students','Address Line 2'),(350,'students','Phone 1'),(351,'students','Phone 2'),(352,'students','Category'),(353,'students','Emergeny Contact'),(354,'students','In case of emergencies,'),(355,'students',' contact : '),(356,'students','Edit'),(357,'students','Student Previous Datas'),(358,'students','Add another Previous Data'),(359,'students','Exam Group Name'),(360,'students','Subject'),(361,'students','Marks'),(362,'students','Result'),(363,'students','Pending Fees'),(364,'students','<i>No Pending Fees</i>'),(365,'students','Paid Fees'),(366,'library','Mange Books'),(367,'library','Search Books<span>Search all books here</span>'),(368,'library','List Books<span>Search all books here</span>'),(369,'library','Add Book<span>Search all books here</span>'),(370,'library','Borrow Book<span>Search all books here</span>'),(371,'library','Return Book<span>Search all books here</span>'),(372,'library','View Book Details<span>Search all books here</span>'),(373,'library','Due Dates<span>Search all books here</span>'),(374,'library','Add Book Category<span>Search all books here</span>'),(375,'library','View Student Details<span>Search all books here</span>'),(376,'library','View Authors <span>Search all books here</span>'),(377,'settings','General Settings'),(378,'settings','School Setup<span>School Name,Logo..</span>'),(379,'settings','News &amp; Events<span>Create/View Events</span>'),(380,'settings','Enrollment Settings'),(381,'settings','Manage Category<span>Admins &amp; Class Teachers</span>'),(382,'settings','Course/Batch Settings'),(383,'settings','Manage Courses<span>Create,Manage &amp; Reorder</span>'),(384,'settings','Default Subjects<span>Site Wide Default Subjects</span>'),(385,'settings','Subject-Batch Association<span>Associate Cources to Subjects</span>'),(386,'settings','Default Weekdays<span>Default School Weekdays</span>'),(387,'settings','Employee Settings'),(388,'settings','Subject Association<span>Associate Cources to Subjects</span>'),(389,'settings','Manage Categories<span>Employee Categories</span>'),(390,'settings','Manage Department<span>Employee Departments</span>'),(391,'settings','Manage Positions<span>Employee Positions</span>'),(392,'settings','Financial Settings'),(393,'settings','Manage Categories<span>Fee Categories</span>'),(394,'UserModule','Users'),(395,'UserModule.user','Users'),(396,'UserModule','Create'),(397,'UserModule.user','Create'),(398,'UserModule','Manage Users'),(399,'UserModule.user','Manage Users'),(400,'UserModule','Manage Profile Field'),(401,'UserModule.user','Manage Profile Field'),(402,'UserModule','List User'),(403,'UserModule.user','List User'),(404,'UserModule','Create User'),(405,'UserModule.user','Create User'),(406,'user','username'),(407,'UserModule','Incorrect username (length between 3 and 20 characters).'),(408,'UserModule.user','Incorrect username (length between 3 and 20 characters).'),(409,'UserModule','Incorrect password (minimal length 4 symbols).'),(410,'UserModule.user','Incorrect password (minimal length 4 symbols).'),(411,'UserModule','This user\'s name already exists.'),(412,'UserModule.user','This user\'s name already exists.'),(413,'UserModule','This user\'s email address already exists.'),(414,'UserModule.user','This user\'s email address already exists.'),(415,'UserModule','Incorrect symbols (A-z0-9).'),(416,'UserModule.user','Incorrect symbols (A-z0-9).'),(417,'UserModule','Id'),(418,'UserModule.user','Id'),(419,'UserModule','username'),(420,'UserModule.user','username'),(421,'UserModule','Retype Password'),(422,'UserModule.user','Retype Password'),(423,'UserModule','E-mail'),(424,'UserModule.user','E-mail'),(425,'UserModule','Verification Code'),(426,'UserModule.user','Verification Code'),(427,'UserModule','activation key'),(428,'UserModule.user','activation key'),(429,'UserModule','Registration date'),(430,'UserModule.user','Registration date'),(431,'UserModule','Last visit'),(432,'UserModule.user','Last visit'),(433,'UserModule','Superuser'),(434,'UserModule.user','Superuser'),(435,'UserModule','Status'),(436,'UserModule.user','Status'),(437,'user','password'),(438,'user','email'),(439,'user','superuser'),(440,'UserModule','Not active'),(441,'UserModule.user','Not active'),(442,'UserModule','Active'),(443,'UserModule.user','Active'),(444,'UserModule','Banned'),(445,'UserModule.user','Banned'),(446,'UserModule','No'),(447,'UserModule.user','No'),(448,'UserModule','Yes'),(449,'UserModule.user','Yes'),(450,'user','status'),(451,'UserModule','Incorrect First Name (length between 3 and 50 characters).'),(452,'UserModule.user','Incorrect First Name (length between 3 and 50 characters).'),(453,'UserModule','Incorrect Last Name (length between 3 and 50 characters).'),(454,'UserModule.user','Incorrect Last Name (length between 3 and 50 characters).'),(455,'UserModule','User ID'),(456,'UserModule.user','User ID'),(457,'UserModule','First Name'),(458,'UserModule.user','First Name'),(459,'UserModule','Last Name'),(460,'UserModule.user','Last Name'),(461,'UserModule','Profile Fields'),(462,'UserModule.user','Profile Fields'),(463,'UserModule','Manage'),(464,'UserModule.user','Manage'),(465,'UserModule','Create Profile Field'),(466,'UserModule.user','Create Profile Field'),(467,'UserModule','Manage Profile Fields'),(468,'UserModule.user','Manage Profile Fields'),(469,'UserModule','You may optionally enter a comparison operator (<b>&lt;</b>, <b>&lt;=</b>, <b>&gt;</b>, <b>&gt;=</b>, <b>&lt;&gt;</b> or <b>=</b>) at the beginning of each of your search values to specify how the comparison should be done.'),(470,'UserModule.user','You may optionally enter a comparison operator (<b>&lt;</b>, <b>&lt;=</b>, <b>&gt;</b>, <b>&gt;=</b>, <b>&lt;&gt;</b> or <b>=</b>) at the beginning of each of your search values to specify how the comparison should be done.'),(471,'UserModule','Advanced Search'),(472,'UserModule.user','Advanced Search'),(473,'UserModule','Variable name'),(474,'UserModule.user','Variable name'),(475,'UserModule','Title'),(476,'UserModule.user','Title'),(477,'UserModule','Field Type'),(478,'UserModule.user','Field Type'),(479,'UserModule','Field Size'),(480,'UserModule.user','Field Size'),(481,'UserModule','Field Size min'),(482,'UserModule.user','Field Size min'),(483,'UserModule','Required'),(484,'UserModule.user','Required'),(485,'UserModule','Match'),(486,'UserModule.user','Match'),(487,'UserModule','Range'),(488,'UserModule.user','Range'),(489,'UserModule','Error Message'),(490,'UserModule.user','Error Message'),(491,'UserModule','Other Validator'),(492,'UserModule.user','Other Validator'),(493,'UserModule','Default'),(494,'UserModule.user','Default'),(495,'UserModule','Widget'),(496,'UserModule.user','Widget'),(497,'UserModule','Widget parametrs'),(498,'UserModule.user','Widget parametrs'),(499,'UserModule','Position'),(500,'UserModule.user','Position'),(501,'UserModule','Visible'),(502,'UserModule.user','Visible'),(503,'UserModule','Variable name may consist of A-z, 0-9, underscores, begin with a letter.'),(504,'UserModule.user','Variable name may consist of A-z, 0-9, underscores, begin with a letter.'),(505,'UserModule','This field already exists.'),(506,'UserModule.user','This field already exists.'),(507,'UserModule','INTEGER'),(508,'UserModule.user','INTEGER'),(509,'UserModule','VARCHAR'),(510,'UserModule.user','VARCHAR'),(511,'UserModule','TEXT'),(512,'UserModule.user','TEXT'),(513,'UserModule','DATE'),(514,'UserModule.user','DATE'),(515,'UserModule','FLOAT'),(516,'UserModule.user','FLOAT'),(517,'UserModule','DECIMAL'),(518,'UserModule.user','DECIMAL'),(519,'UserModule','BOOL'),(520,'UserModule.user','BOOL'),(521,'UserModule','BLOB'),(522,'UserModule.user','BLOB'),(523,'UserModule','BINARY'),(524,'UserModule.user','BINARY'),(525,'UserModule','No, but show on registration form'),(526,'UserModule.user','No, but show on registration form'),(527,'UserModule','Yes and show on registration form'),(528,'UserModule.user','Yes and show on registration form'),(529,'UserModule','For all'),(530,'UserModule.user','For all'),(531,'UserModule','Registered users'),(532,'UserModule.user','Registered users'),(533,'UserModule','Only owner'),(534,'UserModule.user','Only owner'),(535,'UserModule','Hidden'),(536,'UserModule.user','Hidden'),(537,'UserModule','Search'),(538,'UserModule.user','Search'),(539,'UserModule','File field'),(540,'UserModule.user','File field'),(541,'UserModule','Upload path'),(542,'UserModule.user','Upload path'),(543,'UserModule','jQueryUI autocomplete'),(544,'UserModule.UWjuiAutoComplete','jQueryUI autocomplete'),(545,'UserModule','Model Name'),(546,'UserModule.UWjuiAutoComplete','Model Name'),(547,'UserModule','Lable field name'),(548,'UserModule.UWjuiAutoComplete','Lable field name'),(549,'UserModule','Empty item name'),(550,'UserModule.UWjuiAutoComplete','Empty item name'),(551,'UserModule','Empty item value'),(552,'UserModule.UWjuiAutoComplete','Empty item value'),(553,'UserModule','Profile model relation name'),(554,'UserModule.UWjuiAutoComplete','Profile model relation name'),(555,'UserModule','minimal start research length'),(556,'UserModule.UWjuiAutoComplete','minimal start research length'),(557,'UserModule','jQueryUI datepicker'),(558,'UserModule.user','jQueryUI datepicker'),(559,'UserModule','Date format'),(560,'UserModule.user','Date format'),(561,'UserModule','Relation Belongs To'),(562,'UserModule.UWrelBelongsTo','Relation Belongs To'),(563,'UserModule.UWrelBelongsTo','Model Name'),(564,'UserModule.UWrelBelongsTo','Lable field name'),(565,'UserModule.UWrelBelongsTo','Empty item name'),(566,'UserModule.UWrelBelongsTo','Profile model relation name'),(567,'UserModule','Save'),(568,'UserModule.user','Save'),(569,'UserModule','Cancel'),(570,'UserModule.user','Cancel'),(571,'UserModule','Show all'),(572,'UserModule.user','Show all'),(573,'user','varname'),(574,'UserModule','Allowed lowercase letters and digits.'),(575,'UserModule.user','Allowed lowercase letters and digits.'),(576,'user','title'),(577,'UserModule','Field name on the language of \"sourceLanguage\".'),(578,'UserModule.user','Field name on the language of \"sourceLanguage\".'),(579,'user','field_type'),(580,'UserModule','Field type column in the database.'),(581,'UserModule.user','Field type column in the database.'),(582,'user','field_size'),(583,'UserModule','Field size column in the database.'),(584,'UserModule.user','Field size column in the database.'),(585,'user','field_size_min'),(586,'UserModule','The minimum value of the field (form validator).'),(587,'UserModule.user','The minimum value of the field (form validator).'),(588,'user','required'),(589,'UserModule','Required field (form validator).'),(590,'UserModule.user','Required field (form validator).'),(591,'user','match'),(592,'UserModule','Regular expression (example: \'/^[A-Za-z0-9\\s,]+$/u\').'),(593,'UserModule.user','Regular expression (example: \'/^[A-Za-z0-9\\s,]+$/u\').'),(594,'user','range'),(595,'UserModule','Predefined values (example: 1;2;3;4;5 or 1==One;2==Two;3==Three;4==Four;5==Five).'),(596,'UserModule.user','Predefined values (example: 1;2;3;4;5 or 1==One;2==Two;3==Three;4==Four;5==Five).'),(597,'user','error_message'),(598,'UserModule','Error message when you validate the form.'),(599,'UserModule.user','Error message when you validate the form.'),(600,'user','other_validator'),(601,'UserModule','JSON string (example: {example}).'),(602,'UserModule.user','JSON string (example: {example}).'),(603,'user','default'),(604,'UserModule','The value of the default field (database).'),(605,'UserModule.user','The value of the default field (database).'),(606,'user','widget'),(607,'UserModule','Widget name.'),(608,'UserModule.user','Widget name.'),(609,'user','widgetparams'),(610,'user','position'),(611,'UserModule','Display order of fields.'),(612,'UserModule.user','Display order of fields.'),(613,'user','visible'),(614,'students','Add new'),(615,'message','View Message'),(616,'MessageModule.message','Reply'),(617,'message','subject'),(618,'message','Message'),(619,'students','Students List'),(620,'students','All Students Details'),(621,'students','Create New Student'),(622,'students','Manage Student Category'),(623,'students','Manage Students Category</span>'),(624,'students','List Guardians'),(625,'students','All Guardians Details'),(626,'students','Manage Student Categories'),(627,'students','Create New Category'),(628,'students','Are you sure you want to delete this student category?'),(629,'students','Delete Confirmation'),(630,'students','Delete'),(631,'students','Cancel'),(632,'user','rememberMe'),(633,'UserModule','Password is incorrect.'),(634,'UserModule.user','Password is incorrect.'),(635,'UserModule','Username is incorrect.'),(636,'UserModule.user','Username is incorrect.');
/*!40000 ALTER TABLE `sourcemessage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `star`
--

DROP TABLE IF EXISTS `star`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `star` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(50) NOT NULL,
  `mid` int(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `star`
--

LOCK TABLES `star` WRITE;
/*!40000 ALTER TABLE `star` DISABLE KEYS */;
/*!40000 ALTER TABLE `star` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stop_details`
--

DROP TABLE IF EXISTS `stop_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stop_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `route_id` int(11) DEFAULT NULL,
  `stop_name` varchar(120) DEFAULT NULL,
  `fare` varchar(120) DEFAULT NULL,
  `arrival_mrng` time DEFAULT NULL,
  `departure_mrng` time DEFAULT NULL,
  `arrival_evng` time DEFAULT NULL,
  `departure_evng` time DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stop_details`
--

LOCK TABLES `stop_details` WRITE;
/*!40000 ALTER TABLE `stop_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `stop_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `store_category`
--

DROP TABLE IF EXISTS `store_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `store_category` (
  `ca_id` int(11) NOT NULL AUTO_INCREMENT,
  `ca_name` varchar(200) NOT NULL,
  `status` int(11) DEFAULT '0',
  PRIMARY KEY (`ca_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `store_category`
--

LOCK TABLES `store_category` WRITE;
/*!40000 ALTER TABLE `store_category` DISABLE KEYS */;
/*!40000 ALTER TABLE `store_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `store_product`
--

DROP TABLE IF EXISTS `store_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `store_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(200) NOT NULL,
  `product_brand` varchar(200) NOT NULL,
  `product_quantity` int(11) NOT NULL,
  `c_id` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `store_product`
--

LOCK TABLES `store_product` WRITE;
/*!40000 ALTER TABLE `store_product` DISABLE KEYS */;
/*!40000 ALTER TABLE `store_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_additional_details`
--

DROP TABLE IF EXISTS `student_additional_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_additional_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `additional_field_id` int(11) DEFAULT NULL,
  `additional_info` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_additional_details`
--

LOCK TABLES `student_additional_details` WRITE;
/*!40000 ALTER TABLE `student_additional_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `student_additional_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_additional_fields`
--

DROP TABLE IF EXISTS `student_additional_fields`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_additional_fields` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_additional_fields`
--

LOCK TABLES `student_additional_fields` WRITE;
/*!40000 ALTER TABLE `student_additional_fields` DISABLE KEYS */;
/*!40000 ALTER TABLE `student_additional_fields` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_attentance`
--

DROP TABLE IF EXISTS `student_attentance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_attentance` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) NOT NULL,
  `date` date NOT NULL,
  `reason` varchar(120) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_attentance`
--

LOCK TABLES `student_attentance` WRITE;
/*!40000 ALTER TABLE `student_attentance` DISABLE KEYS */;
/*!40000 ALTER TABLE `student_attentance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_categories`
--

DROP TABLE IF EXISTS `student_categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_categories`
--

LOCK TABLES `student_categories` WRITE;
/*!40000 ALTER TABLE `student_categories` DISABLE KEYS */;
/*!40000 ALTER TABLE `student_categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_extra`
--

DROP TABLE IF EXISTS `student_extra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_extra` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) NOT NULL,
  `extra` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_extra`
--

LOCK TABLES `student_extra` WRITE;
/*!40000 ALTER TABLE `student_extra` DISABLE KEYS */;
/*!40000 ALTER TABLE `student_extra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_guardian`
--

DROP TABLE IF EXISTS `student_guardian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_guardian` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gid` int(11) NOT NULL,
  `sid` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_guardian`
--

LOCK TABLES `student_guardian` WRITE;
/*!40000 ALTER TABLE `student_guardian` DISABLE KEYS */;
/*!40000 ALTER TABLE `student_guardian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_previous_datas`
--

DROP TABLE IF EXISTS `student_previous_datas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_previous_datas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `institution` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `year` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `course` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `total_mark` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_previous_datas`
--

LOCK TABLES `student_previous_datas` WRITE;
/*!40000 ALTER TABLE `student_previous_datas` DISABLE KEYS */;
/*!40000 ALTER TABLE `student_previous_datas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_previous_subject_marks`
--

DROP TABLE IF EXISTS `student_previous_subject_marks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_previous_subject_marks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `subject` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `mark` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_previous_subject_marks`
--

LOCK TABLES `student_previous_subject_marks` WRITE;
/*!40000 ALTER TABLE `student_previous_subject_marks` DISABLE KEYS */;
/*!40000 ALTER TABLE `student_previous_subject_marks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `students` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(120) NOT NULL,
  `parent_id` int(11) NOT NULL,
  `admission_no` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `class_roll_no` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `admission_date` date DEFAULT NULL,
  `first_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `middle_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `batch_id` int(11) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `gender` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `blood_group` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `birth_place` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nationality_id` int(11) DEFAULT NULL,
  `language` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `religion` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `student_category_id` int(11) DEFAULT NULL,
  `address_line1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address_line2` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `city` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `state` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pin_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `country_id` int(11) DEFAULT NULL,
  `phone1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `phone2` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `immediate_contact_id` int(11) DEFAULT NULL,
  `is_sms_enabled` tinyint(1) DEFAULT '1',
  `photo_file_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `photo_content_type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `photo_data` longblob,
  `status_description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_active` tinyint(1) DEFAULT '1',
  `is_deleted` tinyint(1) DEFAULT '0',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `has_paid_fees` tinyint(1) DEFAULT '0',
  `photo_file_size` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index_students_on_admission_no` (`admission_no`(10)),
  KEY `index_students_on_first_name_and_middle_name_and_last_name` (`first_name`(10),`middle_name`(10),`last_name`(10))
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students_subjects`
--

DROP TABLE IF EXISTS `students_subjects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `students_subjects` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `subject_id` int(11) DEFAULT NULL,
  `batch_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index_students_subjects_on_student_id_and_subject_id` (`student_id`,`subject_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students_subjects`
--

LOCK TABLES `students_subjects` WRITE;
/*!40000 ALTER TABLE `students_subjects` DISABLE KEYS */;
/*!40000 ALTER TABLE `students_subjects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject_name`
--

DROP TABLE IF EXISTS `subject_name`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subject_name` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(120) DEFAULT NULL,
  `code` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject_name`
--

LOCK TABLES `subject_name` WRITE;
/*!40000 ALTER TABLE `subject_name` DISABLE KEYS */;
/*!40000 ALTER TABLE `subject_name` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subjects`
--

DROP TABLE IF EXISTS `subjects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subjects` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `batch_id` int(11) DEFAULT NULL,
  `no_exams` tinyint(1) DEFAULT '0',
  `max_weekly_classes` int(11) DEFAULT NULL,
  `elective_group_id` int(11) DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index_subjects_on_batch_id_and_elective_group_id_and_is_deleted` (`batch_id`,`elective_group_id`,`is_deleted`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subjects`
--

LOCK TABLES `subjects` WRITE;
/*!40000 ALTER TABLE `subjects` DISABLE KEYS */;
/*!40000 ALTER TABLE `subjects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_timezone`
--

DROP TABLE IF EXISTS `tbl_timezone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_timezone` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=462 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_timezone`
--

LOCK TABLES `tbl_timezone` WRITE;
/*!40000 ALTER TABLE `tbl_timezone` DISABLE KEYS */;
INSERT INTO `tbl_timezone` VALUES (2,'Africa/Abidjan'),(3,'Africa/Accra'),(4,'Africa/Addis_Ababa'),(5,'Africa/Algiers'),(6,'Africa/Asmara'),(7,'Africa/Asmera'),(8,'Africa/Bamako'),(9,'Africa/Bangui'),(10,'Africa/Banjul'),(11,'Africa/Bissau'),(12,'Africa/Blantyre'),(13,'Africa/Brazzaville'),(14,'Africa/Bujumbura'),(15,'Africa/Cairo'),(16,'Africa/Casablanca'),(17,'Africa/Ceuta'),(18,'Africa/Conakry'),(19,'Africa/Dakar'),(20,'Africa/Dar_es_Salaam'),(21,'Africa/Djibouti'),(22,'Africa/Douala'),(23,'Africa/El_Aaiun'),(24,'Africa/Freetown'),(25,'Africa/Gaborone'),(26,'Africa/Harare'),(27,'Africa/Johannesburg'),(28,'Africa/Kampala'),(29,'Africa/Khartoum'),(30,'Africa/Kigali'),(31,'Africa/Kinshasa'),(32,'Africa/Lagos'),(33,'Africa/Libreville'),(34,'Africa/Lome'),(35,'Africa/Luanda'),(36,'Africa/Lubumbashi'),(37,'Africa/Lusaka'),(38,'Africa/Malabo'),(39,'Africa/Maputo'),(40,'Africa/Maseru'),(41,'Africa/Mbabane'),(42,'Africa/Mogadishu'),(43,'Africa/Monrovia'),(44,'Africa/Nairobi'),(45,'Africa/Ndjamena'),(46,'Africa/Niamey'),(47,'Africa/Nouakchott'),(48,'Africa/Ouagadougou'),(49,'Africa/Porto-Novo'),(50,'Africa/Sao_Tome'),(51,'Africa/Timbuktu'),(52,'Africa/Tripoli'),(53,'Africa/Tunis'),(54,'Africa/Windhoek'),(55,'America/Adak'),(56,'America/Anchorage'),(57,'America/Anguilla'),(58,'America/Antigua'),(59,'America/Araguaina'),(60,'America/Argentina/Buenos_Aires'),(61,'America/Argentina/Catamarca'),(62,'America/Argentina/ComodRivadavia'),(63,'America/Argentina/Cordoba'),(64,'America/Argentina/Jujuy'),(65,'America/Argentina/La_Rioja'),(66,'America/Argentina/Mendoza'),(67,'America/Argentina/Rio_Gallegos'),(68,'America/Argentina/Salta'),(69,'America/Argentina/San_Juan'),(70,'America/Argentina/San_Luis'),(71,'America/Argentina/Tucuman'),(72,'America/Argentina/Ushuaia'),(73,'America/Aruba'),(74,'America/Asuncion'),(75,'America/Atikokan'),(76,'America/Atka'),(77,'America/Bahia'),(78,'America/Bahia_Banderas'),(79,'America/Barbados'),(80,'America/Belem'),(81,'America/Belize'),(82,'America/Blanc-Sablon'),(83,'America/Boa_Vista'),(84,'America/Bogota'),(85,'America/Boise'),(86,'America/Buenos_Aires'),(87,'America/Cambridge_Bay'),(88,'America/Campo_Grande'),(89,'America/Cancun'),(90,'America/Caracas'),(91,'America/Catamarca'),(92,'America/Cayenne'),(93,'America/Cayman'),(94,'America/Chicago'),(95,'America/Chihuahua'),(96,'America/Coral_Harbour'),(97,'America/Cordoba'),(98,'America/Costa_Rica'),(99,'America/Cuiaba'),(100,'America/Curacao'),(101,'America/Danmarkshavn'),(102,'America/Dawson'),(103,'America/Dawson_Creek'),(104,'America/Denver'),(105,'America/Detroit'),(106,'America/Dominica'),(107,'America/Edmonton'),(108,'America/Eirunepe'),(109,'America/El_Salvador'),(110,'America/Ensenada'),(111,'America/Fortaleza'),(112,'America/Fort_Wayne'),(113,'America/Glace_Bay'),(114,'America/Godthab'),(115,'America/Goose_Bay'),(116,'America/Grand_Turk'),(117,'America/Grenada'),(118,'America/Guadeloupe'),(119,'America/Guatemala'),(120,'America/Guayaquil'),(121,'America/Guyana'),(122,'America/Halifax'),(123,'America/Havana'),(124,'America/Hermosillo'),(125,'America/Indiana/Indianapolis'),(126,'America/Indiana/Knox'),(127,'America/Indiana/Marengo'),(128,'America/Indiana/Petersburg'),(129,'America/Indianapolis'),(130,'America/Indiana/Tell_City'),(131,'America/Indiana/Vevay'),(132,'America/Indiana/Vincennes'),(133,'America/Indiana/Winamac'),(134,'America/Inuvik'),(135,'America/Iqaluit'),(136,'America/Jamaica'),(137,'America/Jujuy'),(138,'America/Juneau'),(139,'America/Kentucky/Louisville'),(140,'America/Kentucky/Monticello'),(141,'America/Knox_IN'),(142,'America/La_Paz'),(143,'America/Lima'),(144,'America/Los_Angeles'),(145,'America/Louisville'),(146,'America/Maceio'),(147,'America/Managua'),(148,'America/Manaus'),(149,'America/Marigot'),(150,'America/Martinique'),(151,'America/Matamoros'),(152,'America/Mazatlan'),(153,'America/Mendoza'),(154,'America/Menominee'),(155,'America/Merida'),(156,'America/Metlakatla'),(157,'America/Mexico_City'),(158,'America/Miquelon'),(159,'America/Moncton'),(160,'America/Monterrey'),(161,'America/Montevideo'),(162,'America/Montreal'),(163,'America/Montserrat'),(164,'America/Nassau'),(165,'America/New_York'),(166,'America/Nipigon'),(167,'America/Nome'),(168,'America/Noronha'),(169,'America/North_Dakota/Beulah'),(170,'America/North_Dakota/Center'),(171,'America/North_Dakota/New_Salem'),(172,'America/Ojinaga'),(173,'America/Panama'),(174,'America/Pangnirtung'),(175,'America/Paramaribo'),(176,'America/Phoenix'),(177,'America/Port-au-Prince'),(178,'America/Porto_Acre'),(179,'America/Port_of_Spain'),(180,'America/Porto_Velho'),(181,'America/Puerto_Rico'),(182,'America/Rainy_River'),(183,'America/Rankin_Inlet'),(184,'America/Recife'),(185,'America/Regina'),(186,'America/Resolute'),(187,'America/Rio_Branco'),(188,'America/Rosario'),(189,'America/Santa_Isabel'),(190,'America/Santarem'),(191,'America/Santiago'),(192,'America/Santo_Domingo'),(193,'America/Sao_Paulo'),(194,'America/Scoresbysund'),(195,'America/Shiprock'),(196,'America/Sitka'),(197,'America/St_Barthelemy'),(198,'America/St_Johns'),(199,'America/St_Kitts'),(200,'America/St_Lucia'),(201,'America/St_Thomas'),(202,'America/St_Vincent'),(203,'America/Swift_Current'),(204,'America/Tegucigalpa'),(205,'America/Thule'),(206,'America/Thunder_Bay'),(207,'America/Tijuana'),(208,'America/Toronto'),(209,'America/Tortola'),(210,'America/Vancouver'),(211,'America/Virgin'),(212,'America/Whitehorse'),(213,'America/Winnipeg'),(214,'America/Yakutat'),(215,'America/Yellowknife'),(216,'Antarctica/Casey'),(217,'Antarctica/Davis'),(218,'Antarctica/DumontDUrville'),(219,'Antarctica/Macquarie'),(220,'Antarctica/Mawson'),(221,'Antarctica/McMurdo'),(222,'Antarctica/Palmer'),(223,'Antarctica/Rothera'),(224,'Antarctica/South_Pole'),(225,'Antarctica/Syowa'),(226,'Antarctica/Vostok'),(227,'Arctic/Longyearbyen'),(228,'Asia/Aden'),(229,'Asia/Almaty'),(230,'Asia/Amman'),(231,'Asia/Anadyr'),(232,'Asia/Aqtau'),(233,'Asia/Aqtobe'),(234,'Asia/Ashgabat'),(235,'Asia/Ashkhabad'),(236,'Asia/Baghdad'),(237,'Asia/Bahrain'),(238,'Asia/Baku'),(239,'Asia/Bangkok'),(240,'Asia/Beirut'),(241,'Asia/Bishkek'),(242,'Asia/Brunei'),(243,'Asia/Calcutta'),(244,'Asia/Choibalsan'),(245,'Asia/Chongqing'),(246,'Asia/Chungking'),(247,'Asia/Colombo'),(248,'Asia/Dacca'),(249,'Asia/Damascus'),(250,'Asia/Dhaka'),(251,'Asia/Dili'),(252,'Asia/Dubai'),(253,'Asia/Dushanbe'),(254,'Asia/Gaza'),(255,'Asia/Harbin'),(256,'Asia/Ho_Chi_Minh'),(257,'Asia/Hong_Kong'),(258,'Asia/Hovd'),(259,'Asia/Irkutsk'),(260,'Asia/Istanbul'),(261,'Asia/Jakarta'),(262,'Asia/Jayapura'),(263,'Asia/Jerusalem'),(264,'Asia/Kabul'),(265,'Asia/Kamchatka'),(266,'Asia/Karachi'),(267,'Asia/Kashgar'),(268,'Asia/Kathmandu'),(269,'Asia/Katmandu'),(270,'Asia/Kolkata'),(271,'Asia/Krasnoyarsk'),(272,'Asia/Kuala_Lumpur'),(273,'Asia/Kuching'),(274,'Asia/Kuwait'),(275,'Asia/Macao'),(276,'Asia/Macau'),(277,'Asia/Magadan'),(278,'Asia/Makassar'),(279,'Asia/Manila'),(280,'Asia/Muscat'),(281,'Asia/Nicosia'),(282,'Asia/Novokuznetsk'),(283,'Asia/Novosibirsk'),(284,'Asia/Omsk'),(285,'Asia/Oral'),(286,'Asia/Phnom_Penh'),(287,'Asia/Pontianak'),(288,'Asia/Pyongyang'),(289,'Asia/Qatar'),(290,'Asia/Qyzylorda'),(291,'Asia/Rangoon'),(292,'Asia/Riyadh'),(293,'Asia/Saigon'),(294,'Asia/Sakhalin'),(295,'Asia/Samarkand'),(296,'Asia/Seoul'),(297,'Asia/Shanghai'),(298,'Asia/Singapore'),(299,'Asia/Taipei'),(300,'Asia/Tashkent'),(301,'Asia/Tbilisi'),(302,'Asia/Tehran'),(303,'Asia/Tel_Aviv'),(304,'Asia/Thimbu'),(305,'Asia/Thimphu'),(306,'Asia/Tokyo'),(307,'Asia/Ujung_Pandang'),(308,'Asia/Ulaanbaatar'),(309,'Asia/Ulan_Bator'),(310,'Asia/Urumqi'),(311,'Asia/Vientiane'),(312,'Asia/Vladivostok'),(313,'Asia/Yakutsk'),(314,'Asia/Yekaterinburg'),(315,'Asia/Yerevan'),(316,'Atlantic/Azores'),(317,'Atlantic/Bermuda'),(318,'Atlantic/Canary'),(319,'Atlantic/Cape_Verde'),(320,'Atlantic/Faeroe'),(321,'Atlantic/Faroe'),(322,'Atlantic/Jan_Mayen'),(323,'Atlantic/Madeira'),(324,'Atlantic/Reykjavik'),(325,'Atlantic/South_Georgia'),(326,'Atlantic/Stanley'),(327,'Atlantic/St_Helena'),(328,'Australia/ACT'),(329,'Australia/Adelaide'),(330,'Australia/Brisbane'),(331,'Australia/Broken_Hill'),(332,'Australia/Canberra'),(333,'Australia/Currie'),(334,'Australia/Darwin'),(335,'Australia/Eucla'),(336,'Australia/Hobart'),(337,'Australia/LHI'),(338,'Australia/Lindeman'),(339,'Australia/Lord_Howe'),(340,'Australia/Melbourne'),(341,'Australia/North'),(342,'Australia/NSW'),(343,'Australia/Perth'),(344,'Australia/Queensland'),(345,'Australia/South'),(346,'Australia/Sydney'),(347,'Australia/Tasmania'),(348,'Australia/Victoria'),(349,'Australia/West'),(350,'Australia/Yancowinna'),(351,'Europe/Amsterdam'),(352,'Europe/Andorra'),(353,'Europe/Athens'),(354,'Europe/Belfast'),(355,'Europe/Belgrade'),(356,'Europe/Berlin'),(357,'Europe/Bratislava'),(358,'Europe/Brussels'),(359,'Europe/Bucharest'),(360,'Europe/Budapest'),(361,'Europe/Chisinau'),(362,'Europe/Copenhagen'),(363,'Europe/Dublin'),(364,'Europe/Gibraltar'),(365,'Europe/Guernsey'),(366,'Europe/Helsinki'),(367,'Europe/Isle_of_Man'),(368,'Europe/Istanbul'),(369,'Europe/Jersey'),(370,'Europe/Kaliningrad'),(371,'Europe/Kiev'),(372,'Europe/Lisbon'),(373,'Europe/Ljubljana'),(374,'Europe/London'),(375,'Europe/Luxembourg'),(376,'Europe/Madrid'),(377,'Europe/Malta'),(378,'Europe/Mariehamn'),(379,'Europe/Minsk'),(380,'Europe/Monaco'),(381,'Europe/Moscow'),(382,'Europe/Nicosia'),(383,'Europe/Oslo'),(384,'Europe/Paris'),(385,'Europe/Podgorica'),(386,'Europe/Prague'),(387,'Europe/Riga'),(388,'Europe/Rome'),(389,'Europe/Samara'),(390,'Europe/San_Marino'),(391,'Europe/Sarajevo'),(392,'Europe/Simferopol'),(393,'Europe/Skopje'),(394,'Europe/Sofia'),(395,'Europe/Stockholm'),(396,'Europe/Tallinn'),(397,'Europe/Tirane'),(398,'Europe/Tiraspol'),(399,'Europe/Uzhgorod'),(400,'Europe/Vaduz'),(401,'Europe/Vatican'),(402,'Europe/Vienna'),(403,'Europe/Vilnius'),(404,'Europe/Volgograd'),(405,'Europe/Warsaw'),(406,'Europe/Zagreb'),(407,'Europe/Zaporozhye'),(408,'Europe/Zurich'),(409,'Indian/Antananarivo'),(410,'Indian/Chagos'),(411,'Indian/Christmas'),(412,'Indian/Cocos'),(413,'Indian/Comoro'),(414,'Indian/Kerguelen'),(415,'Indian/Mahe'),(416,'Indian/Maldives'),(417,'Indian/Mauritius'),(418,'Indian/Mayotte'),(419,'Indian/Reunion'),(420,'Pacific/Apia'),(421,'Pacific/Auckland'),(422,'Pacific/Chatham'),(423,'Pacific/Chuuk'),(424,'Pacific/Easter'),(425,'Pacific/Efate'),(426,'Pacific/Enderbury'),(427,'Pacific/Fakaofo'),(428,'Pacific/Fiji'),(429,'Pacific/Funafuti'),(430,'Pacific/Galapagos'),(431,'Pacific/Gambier'),(432,'Pacific/Guadalcanal'),(433,'Pacific/Guam'),(434,'Pacific/Honolulu'),(435,'Pacific/Johnston'),(436,'Pacific/Kiritimati'),(437,'Pacific/Kosrae'),(438,'Pacific/Kwajalein'),(439,'Pacific/Majuro'),(440,'Pacific/Marquesas'),(441,'Pacific/Midway'),(442,'Pacific/Nauru'),(443,'Pacific/Niue'),(444,'Pacific/Norfolk'),(445,'Pacific/Noumea'),(446,'Pacific/Pago_Pago'),(447,'Pacific/Palau'),(448,'Pacific/Pitcairn'),(449,'Pacific/Pohnpei'),(450,'Pacific/Ponape'),(451,'Pacific/Port_Moresby'),(452,'Pacific/Rarotonga'),(453,'Pacific/Saipan'),(454,'Pacific/Samoa'),(455,'Pacific/Tahiti'),(456,'Pacific/Tarawa'),(457,'Pacific/Tongatapu'),(458,'Pacific/Truk'),(459,'Pacific/Wake'),(460,'Pacific/Wallis'),(461,'Pacific/Yap');
/*!40000 ALTER TABLE `tbl_timezone` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `timetable_entries`
--

DROP TABLE IF EXISTS `timetable_entries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `timetable_entries` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `batch_id` int(11) DEFAULT NULL,
  `weekday_id` int(11) DEFAULT NULL,
  `class_timing_id` int(11) DEFAULT NULL,
  `subject_id` int(11) DEFAULT NULL,
  `employee_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `by_timetable` (`weekday_id`,`batch_id`,`class_timing_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `timetable_entries`
--

LOCK TABLES `timetable_entries` WRITE;
/*!40000 ALTER TABLE `timetable_entries` DISABLE KEYS */;
/*!40000 ALTER TABLE `timetable_entries` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `timezone`
--

DROP TABLE IF EXISTS `timezone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `timezone` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `timezone` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=462 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `timezone`
--

LOCK TABLES `timezone` WRITE;
/*!40000 ALTER TABLE `timezone` DISABLE KEYS */;
INSERT INTO `timezone` VALUES (2,'Africa/Abidjan'),(3,'Africa/Accra'),(4,'Africa/Addis_Ababa'),(5,'Africa/Algiers'),(6,'Africa/Asmara'),(7,'Africa/Asmera'),(8,'Africa/Bamako'),(9,'Africa/Bangui'),(10,'Africa/Banjul'),(11,'Africa/Bissau'),(12,'Africa/Blantyre'),(13,'Africa/Brazzaville'),(14,'Africa/Bujumbura'),(15,'Africa/Cairo'),(16,'Africa/Casablanca'),(17,'Africa/Ceuta'),(18,'Africa/Conakry'),(19,'Africa/Dakar'),(20,'Africa/Dar_es_Salaam'),(21,'Africa/Djibouti'),(22,'Africa/Douala'),(23,'Africa/El_Aaiun'),(24,'Africa/Freetown'),(25,'Africa/Gaborone'),(26,'Africa/Harare'),(27,'Africa/Johannesburg'),(28,'Africa/Kampala'),(29,'Africa/Khartoum'),(30,'Africa/Kigali'),(31,'Africa/Kinshasa'),(32,'Africa/Lagos'),(33,'Africa/Libreville'),(34,'Africa/Lome'),(35,'Africa/Luanda'),(36,'Africa/Lubumbashi'),(37,'Africa/Lusaka'),(38,'Africa/Malabo'),(39,'Africa/Maputo'),(40,'Africa/Maseru'),(41,'Africa/Mbabane'),(42,'Africa/Mogadishu'),(43,'Africa/Monrovia'),(44,'Africa/Nairobi'),(45,'Africa/Ndjamena'),(46,'Africa/Niamey'),(47,'Africa/Nouakchott'),(48,'Africa/Ouagadougou'),(49,'Africa/Porto-Novo'),(50,'Africa/Sao_Tome'),(51,'Africa/Timbuktu'),(52,'Africa/Tripoli'),(53,'Africa/Tunis'),(54,'Africa/Windhoek'),(55,'America/Adak'),(56,'America/Anchorage'),(57,'America/Anguilla'),(58,'America/Antigua'),(59,'America/Araguaina'),(60,'America/Argentina/Buenos_Aires'),(61,'America/Argentina/Catamarca'),(62,'America/Argentina/ComodRivadavia'),(63,'America/Argentina/Cordoba'),(64,'America/Argentina/Jujuy'),(65,'America/Argentina/La_Rioja'),(66,'America/Argentina/Mendoza'),(67,'America/Argentina/Rio_Gallegos'),(68,'America/Argentina/Salta'),(69,'America/Argentina/San_Juan'),(70,'America/Argentina/San_Luis'),(71,'America/Argentina/Tucuman'),(72,'America/Argentina/Ushuaia'),(73,'America/Aruba'),(74,'America/Asuncion'),(75,'America/Atikokan'),(76,'America/Atka'),(77,'America/Bahia'),(78,'America/Bahia_Banderas'),(79,'America/Barbados'),(80,'America/Belem'),(81,'America/Belize'),(82,'America/Blanc-Sablon'),(83,'America/Boa_Vista'),(84,'America/Bogota'),(85,'America/Boise'),(86,'America/Buenos_Aires'),(87,'America/Cambridge_Bay'),(88,'America/Campo_Grande'),(89,'America/Cancun'),(90,'America/Caracas'),(91,'America/Catamarca'),(92,'America/Cayenne'),(93,'America/Cayman'),(94,'America/Chicago'),(95,'America/Chihuahua'),(96,'America/Coral_Harbour'),(97,'America/Cordoba'),(98,'America/Costa_Rica'),(99,'America/Cuiaba'),(100,'America/Curacao'),(101,'America/Danmarkshavn'),(102,'America/Dawson'),(103,'America/Dawson_Creek'),(104,'America/Denver'),(105,'America/Detroit'),(106,'America/Dominica'),(107,'America/Edmonton'),(108,'America/Eirunepe'),(109,'America/El_Salvador'),(110,'America/Ensenada'),(111,'America/Fortaleza'),(112,'America/Fort_Wayne'),(113,'America/Glace_Bay'),(114,'America/Godthab'),(115,'America/Goose_Bay'),(116,'America/Grand_Turk'),(117,'America/Grenada'),(118,'America/Guadeloupe'),(119,'America/Guatemala'),(120,'America/Guayaquil'),(121,'America/Guyana'),(122,'America/Halifax'),(123,'America/Havana'),(124,'America/Hermosillo'),(125,'America/Indiana/Indianapolis'),(126,'America/Indiana/Knox'),(127,'America/Indiana/Marengo'),(128,'America/Indiana/Petersburg'),(129,'America/Indianapolis'),(130,'America/Indiana/Tell_City'),(131,'America/Indiana/Vevay'),(132,'America/Indiana/Vincennes'),(133,'America/Indiana/Winamac'),(134,'America/Inuvik'),(135,'America/Iqaluit'),(136,'America/Jamaica'),(137,'America/Jujuy'),(138,'America/Juneau'),(139,'America/Kentucky/Louisville'),(140,'America/Kentucky/Monticello'),(141,'America/Knox_IN'),(142,'America/La_Paz'),(143,'America/Lima'),(144,'America/Los_Angeles'),(145,'America/Louisville'),(146,'America/Maceio'),(147,'America/Managua'),(148,'America/Manaus'),(149,'America/Marigot'),(150,'America/Martinique'),(151,'America/Matamoros'),(152,'America/Mazatlan'),(153,'America/Mendoza'),(154,'America/Menominee'),(155,'America/Merida'),(156,'America/Metlakatla'),(157,'America/Mexico_City'),(158,'America/Miquelon'),(159,'America/Moncton'),(160,'America/Monterrey'),(161,'America/Montevideo'),(162,'America/Montreal'),(163,'America/Montserrat'),(164,'America/Nassau'),(165,'America/New_York'),(166,'America/Nipigon'),(167,'America/Nome'),(168,'America/Noronha'),(169,'America/North_Dakota/Beulah'),(170,'America/North_Dakota/Center'),(171,'America/North_Dakota/New_Salem'),(172,'America/Ojinaga'),(173,'America/Panama'),(174,'America/Pangnirtung'),(175,'America/Paramaribo'),(176,'America/Phoenix'),(177,'America/Port-au-Prince'),(178,'America/Porto_Acre'),(179,'America/Port_of_Spain'),(180,'America/Porto_Velho'),(181,'America/Puerto_Rico'),(182,'America/Rainy_River'),(183,'America/Rankin_Inlet'),(184,'America/Recife'),(185,'America/Regina'),(186,'America/Resolute'),(187,'America/Rio_Branco'),(188,'America/Rosario'),(189,'America/Santa_Isabel'),(190,'America/Santarem'),(191,'America/Santiago'),(192,'America/Santo_Domingo'),(193,'America/Sao_Paulo'),(194,'America/Scoresbysund'),(195,'America/Shiprock'),(196,'America/Sitka'),(197,'America/St_Barthelemy'),(198,'America/St_Johns'),(199,'America/St_Kitts'),(200,'America/St_Lucia'),(201,'America/St_Thomas'),(202,'America/St_Vincent'),(203,'America/Swift_Current'),(204,'America/Tegucigalpa'),(205,'America/Thule'),(206,'America/Thunder_Bay'),(207,'America/Tijuana'),(208,'America/Toronto'),(209,'America/Tortola'),(210,'America/Vancouver'),(211,'America/Virgin'),(212,'America/Whitehorse'),(213,'America/Winnipeg'),(214,'America/Yakutat'),(215,'America/Yellowknife'),(216,'Antarctica/Casey'),(217,'Antarctica/Davis'),(218,'Antarctica/DumontDUrville'),(219,'Antarctica/Macquarie'),(220,'Antarctica/Mawson'),(221,'Antarctica/McMurdo'),(222,'Antarctica/Palmer'),(223,'Antarctica/Rothera'),(224,'Antarctica/South_Pole'),(225,'Antarctica/Syowa'),(226,'Antarctica/Vostok'),(227,'Arctic/Longyearbyen'),(228,'Asia/Aden'),(229,'Asia/Almaty'),(230,'Asia/Amman'),(231,'Asia/Anadyr'),(232,'Asia/Aqtau'),(233,'Asia/Aqtobe'),(234,'Asia/Ashgabat'),(235,'Asia/Ashkhabad'),(236,'Asia/Baghdad'),(237,'Asia/Bahrain'),(238,'Asia/Baku'),(239,'Asia/Bangkok'),(240,'Asia/Beirut'),(241,'Asia/Bishkek'),(242,'Asia/Brunei'),(243,'Asia/Calcutta'),(244,'Asia/Choibalsan'),(245,'Asia/Chongqing'),(246,'Asia/Chungking'),(247,'Asia/Colombo'),(248,'Asia/Dacca'),(249,'Asia/Damascus'),(250,'Asia/Dhaka'),(251,'Asia/Dili'),(252,'Asia/Dubai'),(253,'Asia/Dushanbe'),(254,'Asia/Gaza'),(255,'Asia/Harbin'),(256,'Asia/Ho_Chi_Minh'),(257,'Asia/Hong_Kong'),(258,'Asia/Hovd'),(259,'Asia/Irkutsk'),(260,'Asia/Istanbul'),(261,'Asia/Jakarta'),(262,'Asia/Jayapura'),(263,'Asia/Jerusalem'),(264,'Asia/Kabul'),(265,'Asia/Kamchatka'),(266,'Asia/Karachi'),(267,'Asia/Kashgar'),(268,'Asia/Kathmandu'),(269,'Asia/Katmandu'),(270,'Asia/Kolkata'),(271,'Asia/Krasnoyarsk'),(272,'Asia/Kuala_Lumpur'),(273,'Asia/Kuching'),(274,'Asia/Kuwait'),(275,'Asia/Macao'),(276,'Asia/Macau'),(277,'Asia/Magadan'),(278,'Asia/Makassar'),(279,'Asia/Manila'),(280,'Asia/Muscat'),(281,'Asia/Nicosia'),(282,'Asia/Novokuznetsk'),(283,'Asia/Novosibirsk'),(284,'Asia/Omsk'),(285,'Asia/Oral'),(286,'Asia/Phnom_Penh'),(287,'Asia/Pontianak'),(288,'Asia/Pyongyang'),(289,'Asia/Qatar'),(290,'Asia/Qyzylorda'),(291,'Asia/Rangoon'),(292,'Asia/Riyadh'),(293,'Asia/Saigon'),(294,'Asia/Sakhalin'),(295,'Asia/Samarkand'),(296,'Asia/Seoul'),(297,'Asia/Shanghai'),(298,'Asia/Singapore'),(299,'Asia/Taipei'),(300,'Asia/Tashkent'),(301,'Asia/Tbilisi'),(302,'Asia/Tehran'),(303,'Asia/Tel_Aviv'),(304,'Asia/Thimbu'),(305,'Asia/Thimphu'),(306,'Asia/Tokyo'),(307,'Asia/Ujung_Pandang'),(308,'Asia/Ulaanbaatar'),(309,'Asia/Ulan_Bator'),(310,'Asia/Urumqi'),(311,'Asia/Vientiane'),(312,'Asia/Vladivostok'),(313,'Asia/Yakutsk'),(314,'Asia/Yekaterinburg'),(315,'Asia/Yerevan'),(316,'Atlantic/Azores'),(317,'Atlantic/Bermuda'),(318,'Atlantic/Canary'),(319,'Atlantic/Cape_Verde'),(320,'Atlantic/Faeroe'),(321,'Atlantic/Faroe'),(322,'Atlantic/Jan_Mayen'),(323,'Atlantic/Madeira'),(324,'Atlantic/Reykjavik'),(325,'Atlantic/South_Georgia'),(326,'Atlantic/Stanley'),(327,'Atlantic/St_Helena'),(328,'Australia/ACT'),(329,'Australia/Adelaide'),(330,'Australia/Brisbane'),(331,'Australia/Broken_Hill'),(332,'Australia/Canberra'),(333,'Australia/Currie'),(334,'Australia/Darwin'),(335,'Australia/Eucla'),(336,'Australia/Hobart'),(337,'Australia/LHI'),(338,'Australia/Lindeman'),(339,'Australia/Lord_Howe'),(340,'Australia/Melbourne'),(341,'Australia/North'),(342,'Australia/NSW'),(343,'Australia/Perth'),(344,'Australia/Queensland'),(345,'Australia/South'),(346,'Australia/Sydney'),(347,'Australia/Tasmania'),(348,'Australia/Victoria'),(349,'Australia/West'),(350,'Australia/Yancowinna'),(351,'Europe/Amsterdam'),(352,'Europe/Andorra'),(353,'Europe/Athens'),(354,'Europe/Belfast'),(355,'Europe/Belgrade'),(356,'Europe/Berlin'),(357,'Europe/Bratislava'),(358,'Europe/Brussels'),(359,'Europe/Bucharest'),(360,'Europe/Budapest'),(361,'Europe/Chisinau'),(362,'Europe/Copenhagen'),(363,'Europe/Dublin'),(364,'Europe/Gibraltar'),(365,'Europe/Guernsey'),(366,'Europe/Helsinki'),(367,'Europe/Isle_of_Man'),(368,'Europe/Istanbul'),(369,'Europe/Jersey'),(370,'Europe/Kaliningrad'),(371,'Europe/Kiev'),(372,'Europe/Lisbon'),(373,'Europe/Ljubljana'),(374,'Europe/London'),(375,'Europe/Luxembourg'),(376,'Europe/Madrid'),(377,'Europe/Malta'),(378,'Europe/Mariehamn'),(379,'Europe/Minsk'),(380,'Europe/Monaco'),(381,'Europe/Moscow'),(382,'Europe/Nicosia'),(383,'Europe/Oslo'),(384,'Europe/Paris'),(385,'Europe/Podgorica'),(386,'Europe/Prague'),(387,'Europe/Riga'),(388,'Europe/Rome'),(389,'Europe/Samara'),(390,'Europe/San_Marino'),(391,'Europe/Sarajevo'),(392,'Europe/Simferopol'),(393,'Europe/Skopje'),(394,'Europe/Sofia'),(395,'Europe/Stockholm'),(396,'Europe/Tallinn'),(397,'Europe/Tirane'),(398,'Europe/Tiraspol'),(399,'Europe/Uzhgorod'),(400,'Europe/Vaduz'),(401,'Europe/Vatican'),(402,'Europe/Vienna'),(403,'Europe/Vilnius'),(404,'Europe/Volgograd'),(405,'Europe/Warsaw'),(406,'Europe/Zagreb'),(407,'Europe/Zaporozhye'),(408,'Europe/Zurich'),(409,'Indian/Antananarivo'),(410,'Indian/Chagos'),(411,'Indian/Christmas'),(412,'Indian/Cocos'),(413,'Indian/Comoro'),(414,'Indian/Kerguelen'),(415,'Indian/Mahe'),(416,'Indian/Maldives'),(417,'Indian/Mauritius'),(418,'Indian/Mayotte'),(419,'Indian/Reunion'),(420,'Pacific/Apia'),(421,'Pacific/Auckland'),(422,'Pacific/Chatham'),(423,'Pacific/Chuuk'),(424,'Pacific/Easter'),(425,'Pacific/Efate'),(426,'Pacific/Enderbury'),(427,'Pacific/Fakaofo'),(428,'Pacific/Fiji'),(429,'Pacific/Funafuti'),(430,'Pacific/Galapagos'),(431,'Pacific/Gambier'),(432,'Pacific/Guadalcanal'),(433,'Pacific/Guam'),(434,'Pacific/Honolulu'),(435,'Pacific/Johnston'),(436,'Pacific/Kiritimati'),(437,'Pacific/Kosrae'),(438,'Pacific/Kwajalein'),(439,'Pacific/Majuro'),(440,'Pacific/Marquesas'),(441,'Pacific/Midway'),(442,'Pacific/Nauru'),(443,'Pacific/Niue'),(444,'Pacific/Norfolk'),(445,'Pacific/Noumea'),(446,'Pacific/Pago_Pago'),(447,'Pacific/Palau'),(448,'Pacific/Pitcairn'),(449,'Pacific/Pohnpei'),(450,'Pacific/Ponape'),(451,'Pacific/Port_Moresby'),(452,'Pacific/Rarotonga'),(453,'Pacific/Saipan'),(454,'Pacific/Samoa'),(455,'Pacific/Tahiti'),(456,'Pacific/Tarawa'),(457,'Pacific/Tongatapu'),(458,'Pacific/Truk'),(459,'Pacific/Wake'),(460,'Pacific/Wallis'),(461,'Pacific/Yap');
/*!40000 ALTER TABLE `timezone` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transportation`
--

DROP TABLE IF EXISTS `transportation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transportation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` varchar(120) DEFAULT NULL,
  `stop_id` varchar(120) DEFAULT NULL,
  `is_paid` int(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transportation`
--

LOCK TABLES `transportation` WRITE;
/*!40000 ALTER TABLE `transportation` DISABLE KEYS */;
/*!40000 ALTER TABLE `transportation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_details`
--

DROP TABLE IF EXISTS `user_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `agency_employee_id` int(11) DEFAULT NULL,
  `lastname` varchar(120) NOT NULL,
  `firstname` varchar(120) NOT NULL,
  `suffix` varchar(120) NOT NULL,
  `address1` varchar(120) DEFAULT NULL,
  `address2` varchar(120) DEFAULT NULL,
  `zip_code` int(11) DEFAULT NULL,
  `city` varchar(120) DEFAULT NULL,
  `state` varchar(120) DEFAULT NULL,
  `phone1` int(11) DEFAULT NULL,
  `phone2` int(11) DEFAULT NULL,
  `dob` datetime DEFAULT NULL,
  `ssn` int(11) DEFAULT NULL,
  `includepayroll` varchar(120) DEFAULT NULL,
  `employee_type` varchar(120) DEFAULT NULL,
  `weekend_access` varchar(120) DEFAULT NULL,
  `earliest_login_time` time DEFAULT NULL,
  `automatic_lodout_time` time DEFAULT NULL,
  `hire_date` datetime DEFAULT NULL,
  `termination_date` datetime DEFAULT NULL,
  `File` varchar(256) DEFAULT NULL,
  `attachment` varchar(256) DEFAULT NULL,
  `photo` varchar(256) DEFAULT NULL,
  `photo_thumb` varchar(255) DEFAULT NULL,
  `sign` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_details`
--

LOCK TABLES `user_details` WRITE;
/*!40000 ALTER TABLE `user_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_events`
--

DROP TABLE IF EXISTS `user_events`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_events` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `event_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_events`
--

LOCK TABLES `user_events` WRITE;
/*!40000 ALTER TABLE `user_events` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_events` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_settings`
--

DROP TABLE IF EXISTS `user_settings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_settings` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(120) DEFAULT NULL,
  `dateformat` varchar(120) DEFAULT NULL,
  `displaydate` varchar(120) DEFAULT NULL,
  `timezone` varchar(120) DEFAULT NULL,
  `timeformat` varchar(120) DEFAULT NULL,
  `name_format` varchar(120) DEFAULT NULL,
  `language` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_settings`
--

LOCK TABLES `user_settings` WRITE;
/*!40000 ALTER TABLE `user_settings` DISABLE KEYS */;
INSERT INTO `user_settings` VALUES (1,'1','M d.yy','M d.Y','243','h:i A','Firstname,middlename, Lastname','en_us');
/*!40000 ALTER TABLE `user_settings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userfolder`
--

DROP TABLE IF EXISTS `userfolder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userfolder` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `uid` int(50) NOT NULL,
  `foldername` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userfolder`
--

LOCK TABLES `userfolder` WRITE;
/*!40000 ALTER TABLE `userfolder` DISABLE KEYS */;
/*!40000 ALTER TABLE `userfolder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(128) NOT NULL,
  `email` varchar(128) NOT NULL,
  `activkey` varchar(128) NOT NULL DEFAULT '',
  `create_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `lastvisit_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `superuser` int(1) NOT NULL DEFAULT '0',
  `status` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`),
  UNIQUE KEY `email` (`email`),
  KEY `status` (`status`),
  KEY `superuser` (`superuser`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','c4c92db59714e1672480748b1f0804e6','webmaster@example.com','e7871af5d72d5a4ec0e2e398133579dc','2012-10-04 02:29:24','2015-04-12 18:10:31',1,1),(2,'news','21232f297a57a5a743894a0e4a801fc4','news@example.com','e7871af5d72d5a4ec0e2e398133579dd','2012-10-04 02:29:25','2013-01-03 04:57:53',1,1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vacate`
--

DROP TABLE IF EXISTS `vacate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vacate` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `room_no` varchar(120) DEFAULT NULL,
  `allot_id` varchar(120) DEFAULT NULL,
  `status` varchar(120) DEFAULT NULL,
  `admit_date` date DEFAULT NULL,
  `vacate_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vacate`
--

LOCK TABLES `vacate` WRITE;
/*!40000 ALTER TABLE `vacate` DISABLE KEYS */;
/*!40000 ALTER TABLE `vacate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle_details`
--

DROP TABLE IF EXISTS `vehicle_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehicle_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vehicle_no` varchar(120) DEFAULT NULL,
  `vehicle_code` varchar(120) DEFAULT NULL,
  `no_of_seats` varchar(120) DEFAULT NULL,
  `maximum_capacity` varchar(120) DEFAULT NULL,
  `vehicle_type` varchar(120) DEFAULT NULL,
  `address` varchar(120) DEFAULT NULL,
  `city` varchar(120) DEFAULT NULL,
  `state` varchar(120) DEFAULT NULL,
  `phone` varchar(120) DEFAULT NULL,
  `insurance` varchar(120) DEFAULT NULL,
  `tax_remitted` varchar(120) DEFAULT NULL,
  `permit` varchar(120) DEFAULT NULL,
  `status` varchar(120) DEFAULT NULL,
  `is_deleted` int(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle_details`
--

LOCK TABLES `vehicle_details` WRITE;
/*!40000 ALTER TABLE `vehicle_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `vehicle_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `weekdays`
--

DROP TABLE IF EXISTS `weekdays`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `weekdays` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `batch_id` int(11) DEFAULT NULL,
  `weekday` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index_weekdays_on_batch_id` (`batch_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `weekdays`
--

LOCK TABLES `weekdays` WRITE;
/*!40000 ALTER TABLE `weekdays` DISABLE KEYS */;
INSERT INTO `weekdays` VALUES (1,NULL,'1'),(2,NULL,'2'),(3,NULL,'3'),(4,NULL,'4'),(5,NULL,'5'),(6,NULL,'6'),(7,NULL,'7');
/*!40000 ALTER TABLE `weekdays` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-04-13  3:12:13
