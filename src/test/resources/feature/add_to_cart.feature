#
#  @Featuretag @featuretag1
#    Feature: Add to cart
#
#      @ruletag
#      Rule: Add from store
#
#        @scenario1
#        Scenario Outline: Add one quqntity to the cart
#          Given I'm on the Store Page
#          When I add a "<product_name>" to the Cart
#          Then I see 1 "<product_name>" in the Cart
#
#          @stage
#          Examples:
#          | product_name |
#          | Blue Shoes   |
#
#          @prod
#          Examples:
#          | product_name |
#          | Blue Shoes   |

