/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUIZ_IF2_10116414_FAELANTONIWIJAYA;

/**
 *
 * @author sweenutt
 */
public interface ServiceItem {
        public void displayService();
        public boolean checkMemberStatus(String statusMember);
        public float getPrice(int serviceItem);
        public float getSale(boolean isMember, float parServicePrice);
}
