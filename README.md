# immutant-web-issue

This tests the fix for an issue with org.immutant/web's LazyMap-backed Request throwing an exception during .hashCode()

## Usage

Shows the issue:

`lein with-profiles +broken run`

Demonstrates the fix:

`lein with-profiles +fixed? run`
