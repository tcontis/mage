/*
* Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without modification, are
* permitted provided that the following conditions are met:
*
*    1. Redistributions of source code must retain the above copyright notice, this list of
*       conditions and the following disclaimer.
*
*    2. Redistributions in binary form must reproduce the above copyright notice, this list
*       of conditions and the following disclaimer in the documentation and/or other materials
*       provided with the distribution.
*
* THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
* FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
* CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
* ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
* NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
* ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*
* The views and conclusions contained in the software and documentation are those of the
* authors and should not be interpreted as representing official policies, either expressed
* or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import mage.cards.CardGraphicInfo;
import mage.cards.ExpansionSet;
import mage.cards.FrameStyle;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author fireshoes
 */
public class Unstable extends ExpansionSet {

    private static final Unstable instance = new Unstable();

    public static Unstable getInstance() {
        return instance;
    }

    private Unstable() {
        super("Unstable", "UST", ExpansionSet.buildDate(2017, 12, 8), SetType.JOKESET);

        cards.add(new SetCardInfo("Amateur Auteur", 3, Rarity.COMMON, mage.cards.a.AmateurAuteur.class));
        cards.add(new SetCardInfo("As Luck Would Have It", 102, Rarity.RARE, mage.cards.a.AsLuckWouldHaveIt.class));
        cards.add(new SetCardInfo("Baron Von Count", 127, Rarity.MYTHIC, mage.cards.b.BaronVonCount.class));
        cards.add(new SetCardInfo("Box of Free-Range Goblins", 77, Rarity.COMMON, mage.cards.b.BoxOfFreerangeGoblins.class));
        cards.add(new SetCardInfo("Buzzing Whack-a-Doodle", 141, Rarity.UNCOMMON, mage.cards.b.BuzzingWhackADoodle.class));
        cards.add(new SetCardInfo("Chittering Doom", 104, Rarity.UNCOMMON, mage.cards.c.ChitteringDoom.class));
        cards.add(new SetCardInfo("Crow Storm", 31, Rarity.UNCOMMON, mage.cards.c.CrowStorm.class));
        cards.add(new SetCardInfo("Curious Killbot", 145, Rarity.COMMON, mage.cards.c.CuriousKillbot.class));
        cards.add(new SetCardInfo("Dr. Julius Jumblemorph", 130, Rarity.MYTHIC, mage.cards.d.DrJuliusJumblemorph.class));
        cards.add(new SetCardInfo("Earl of Squirrel", 108, Rarity.RARE, mage.cards.e.EarlOfSquirrel.class));
        cards.add(new SetCardInfo("Forest", 216, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(FrameStyle.UST_FULL_ART_BASIC, false)));
        cards.add(new SetCardInfo("GO TO JAIL", 8, Rarity.COMMON, mage.cards.g.GOTOJAIL.class));
        cards.add(new SetCardInfo("Garbage Elemental", "82c", Rarity.UNCOMMON, mage.cards.g.GarbageElementalC.class));
        cards.add(new SetCardInfo("Ground Pounder", 110, Rarity.COMMON, mage.cards.g.GroundPounder.class));
        cards.add(new SetCardInfo("Hammer Helper", 85, Rarity.COMMON, mage.cards.h.HammerHelper.class));
        cards.add(new SetCardInfo("Hydradoodle", 112, Rarity.RARE, mage.cards.h.Hydradoodle.class));
        cards.add(new SetCardInfo("Inhumaniac", 59, Rarity.UNCOMMON, mage.cards.i.Inhumaniac.class));
        cards.add(new SetCardInfo("Island", 213, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(FrameStyle.UST_FULL_ART_BASIC, false)));
        cards.add(new SetCardInfo("Krark's Other Thumb", 151, Rarity.UNCOMMON, mage.cards.k.KrarksOtherThumb.class));
        cards.add(new SetCardInfo("Lobe Lobber", 153, Rarity.UNCOMMON, mage.cards.l.LobeLobber.class));
        cards.add(new SetCardInfo("Mad Science Fair Project", 154, Rarity.COMMON, mage.cards.m.MadScienceFairProject.class));
        cards.add(new SetCardInfo("Mountain", 215, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(FrameStyle.UST_FULL_ART_BASIC, false)));
        cards.add(new SetCardInfo("Oddly Uneven", 15, Rarity.RARE, mage.cards.o.OddlyUneven.class));
        cards.add(new SetCardInfo("Painiac", 91, Rarity.COMMON, mage.cards.p.Painiac.class));
        cards.add(new SetCardInfo("Plains", 212, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(FrameStyle.UST_FULL_ART_BASIC, false)));
        cards.add(new SetCardInfo("Snickering Squirrel", 68, Rarity.COMMON, mage.cards.s.SnickeringSquirrel.class));
        cards.add(new SetCardInfo("Squirrel-Powered Scheme", 70, Rarity.UNCOMMON, mage.cards.s.SquirrelPoweredScheme.class));
        cards.add(new SetCardInfo("Steamflogger Boss", 93, Rarity.RARE, mage.cards.s.SteamfloggerBoss.class));
        cards.add(new SetCardInfo("Steel Squirrel", 162, Rarity.UNCOMMON, mage.cards.s.SteelSquirrel.class));
        cards.add(new SetCardInfo("Summon the Pack", 74, Rarity.MYTHIC, mage.cards.s.SummonThePack.class));
        cards.add(new SetCardInfo("Swamp", 214, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(FrameStyle.UST_FULL_ART_BASIC, false)));
        cards.add(new SetCardInfo("Sword of Dungeons & Dragons", 1, Rarity.MYTHIC, mage.cards.s.SwordOfDungeonsAndDragons.class));
        cards.add(new SetCardInfo("Target Minotaur", 98, Rarity.COMMON, mage.cards.t.TargetMinotaur.class));
        cards.add(new SetCardInfo("The Big Idea", "76", Rarity.RARE, mage.cards.t.TheBigIdea.class));
        cards.add(new SetCardInfo("Time Out", 48, Rarity.COMMON, mage.cards.t.TimeOut.class));
        cards.add(new SetCardInfo("Very Cryptic Command", "49d", Rarity.RARE, mage.cards.v.VeryCrypticCommandD.class));
        cards.add(new SetCardInfo("Willing Test Subject", 126, Rarity.COMMON, mage.cards.w.WillingTestSubject.class));
        cards.add(new SetCardInfo("capital offense", 52, Rarity.COMMON, mage.cards.c.CapitalOffense.class));
    }
}
