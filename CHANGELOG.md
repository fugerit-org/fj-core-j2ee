# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [8.3.1-sa.1] - 2023-09-16

### Added

- ServletUtils helper class
- [workflow deploy on branch deploy](.github/workflows/deploy_maven_package.yml)

### Changed

- fj-version set to 8.3.1
- better test coverage

### Security

- [updated guava dependency](https://github.com/fugerit-org/fj-core-j2ee/security/dependabot/1)
- [fixed servlet exception handling](https://github.com/fugerit-org/fj-core-j2ee/security/code-scanning/7)

## [8.2.6-sa.1] - 2023-09-06

### Fixed

- bug in NavFilter.nav()

## [8.2.0-sa.1] - 2023-09-06

### Added

- CHANGELOG.md (#1)
- [Sonar cloud workflow](.github/workflows/sonarcloud-maven.yml)
- [Maven build workflow](.github/workflows/build_maven_package.yml)
- License, sonar cloud quality gate and mave repo version badges (#1)

### Changed

- Update fj-lib parent version to 8.2.6
- Minimum java required version for compiling : 11

