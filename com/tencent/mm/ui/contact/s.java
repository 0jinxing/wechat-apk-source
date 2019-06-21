package com.tencent.mm.ui.contact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.e;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;

public final class s
{
  public static final int znD;
  public static final int znE;
  public static int znF;
  public static int znG;
  public static final int znH;
  public static final int znI;
  public static final int znJ;
  public static final int znK;
  public static final int znL;
  public static final int znM;
  public static final int znN;

  static
  {
    AppMethodBeat.i(114745);
    znD = C(new int[] { 256, 16, 1, 2, 4 });
    znE = C(new int[] { 16, 1, 2, 4, 64, 16384 });
    znF = C(new int[] { 16, 1, 2, 4, 64, 16384, 16777216 });
    znG = C(new int[] { 16, 1, 2, 4, 64, 4096, 16777216 });
    znH = C(new int[] { znD, 64, 16384, 4096, 16777216 });
    znI = C(new int[] { 16, 2, 16384, 4 });
    znJ = C(new int[] { znD, 16384, 64, 4096, 16777216 });
    znK = C(new int[] { znD, 16384, 64, 131072, 8192, 16777216 });
    znL = C(new int[] { 16, 32, 1, 4, 2, 64 });
    znM = C(new int[] { 1, 2, 4, 64, 256, 16384 });
    znN = C(new int[] { znF, 131072 });
    AppMethodBeat.o(114745);
  }

  public static int C(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m | k)
    {
      m = paramArrayOfInt[j];
      j++;
    }
    return k;
  }

  public static HashSet<String> dIf()
  {
    AppMethodBeat.i(114740);
    HashSet localHashSet = new HashSet();
    localHashSet.add("weixin");
    AppMethodBeat.o(114740);
    return localHashSet;
  }

  public static HashSet<String> dIg()
  {
    AppMethodBeat.i(114742);
    HashSet localHashSet = new HashSet();
    localHashSet.add("officialaccounts");
    localHashSet.add("newsapp");
    String[] arrayOfString = t.fkY;
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
      localHashSet.add(arrayOfString[j]);
    localHashSet.add("weibo");
    localHashSet.add("qqmail");
    localHashSet.add("fmessage");
    localHashSet.add("tmessage");
    localHashSet.add("floatbottle");
    localHashSet.add("lbsapp");
    localHashSet.add("shakeapp");
    localHashSet.add("medianote");
    localHashSet.add("qqfriend");
    localHashSet.add("readerapp");
    localHashSet.add("newsapp");
    localHashSet.add("blogapp");
    localHashSet.add("facebookapp");
    localHashSet.add("masssendapp");
    localHashSet.add("meishiapp");
    localHashSet.add("feedsapp");
    localHashSet.add("voipapp");
    localHashSet.add("filehelper");
    localHashSet.add("officialaccounts");
    localHashSet.add("helper_entry");
    localHashSet.add("pc_share");
    localHashSet.add("cardpackage");
    localHashSet.add("voicevoipapp");
    localHashSet.add("voiceinputapp");
    localHashSet.add("linkedinplugin");
    localHashSet.add("appbrandcustomerservicemsg");
    AppMethodBeat.o(114742);
    return localHashSet;
  }

  public static boolean dIh()
  {
    AppMethodBeat.i(114744);
    int i = ((a)g.K(a.class)).Nu().getInt("ShowOpenImInGroup", 0);
    ab.i("MMSelectContactLogic", "config_val %s ", new Object[] { Integer.valueOf(i) });
    if (i == 0)
      AppMethodBeat.o(114744);
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      AppMethodBeat.o(114744);
    }
  }

  public static void h(HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(114741);
    paramHashSet.remove("filehelper");
    AppMethodBeat.o(114741);
  }

  public static boolean hr(int paramInt1, int paramInt2)
  {
    if ((paramInt1 & paramInt2) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static int hs(int paramInt1, int paramInt2)
  {
    return (paramInt2 ^ 0xFFFFFFFF) & paramInt1;
  }

  public static void init()
  {
    AppMethodBeat.i(114743);
    if (!dIh())
    {
      if (hr(znF, 16777216))
        znF &= -16777217;
      if (!hr(znG, 16777216))
        break label119;
      znG &= -16777217;
      AppMethodBeat.o(114743);
    }
    while (true)
    {
      return;
      if (!hr(znF, 16777216))
        znF = C(new int[] { znF, 16777216 });
      if (!hr(znG, 16777216))
        znG = C(new int[] { znG, 16777216 });
      label119: AppMethodBeat.o(114743);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.s
 * JD-Core Version:    0.6.2
 */