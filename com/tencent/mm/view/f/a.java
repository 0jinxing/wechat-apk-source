package com.tencent.mm.view.f;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.by.a.b;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.h.b;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.protocal.protobuf.cab;
import com.tencent.mm.protocal.protobuf.cac;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class a
{
  private int Aav;
  public int AdY;
  public int AdZ;
  public boolean AeA;
  public int[] AeB;
  public boolean AeC;
  public boolean AeD;
  public ArrayList<com.tencent.mm.view.c.a> AeE;
  private HashMap<String, Integer> AeF;
  public List<com.tencent.mm.storage.emotion.t> AeG;
  public com.tencent.mm.sdk.b.c AeH;
  public volatile boolean AeI;
  private int Aea;
  public int Aeb;
  public int Aec;
  public int Aed;
  public int Aee;
  public int Aef;
  private int Aeg;
  private int Aeh;
  public int Aei;
  private int Aej;
  private int Aek;
  public int Ael;
  private int Aem;
  private int Aen;
  private int Aeo;
  private int Aep;
  public String Aeq;
  public int Aer;
  public boolean Aes;
  public boolean Aet;
  public boolean Aeu;
  public boolean Aev;
  public boolean Aew;
  public boolean Aex;
  public boolean Aey;
  public boolean Aez;
  public Context Gn;
  private final String TAG;
  public int gOW;
  public int jiL;
  public int jiM;
  public int lfN;
  private int mOrientation;
  private int moz;
  public String vmL;
  public boolean zRn;
  public int zyD;

  public a()
  {
    AppMethodBeat.i(63078);
    this.TAG = "MicroMsg.emoji.SmileyPanel.SmileyPanelStg";
    this.zyD = 0;
    this.Aeh = 0;
    this.mOrientation = 0;
    this.moz = 0;
    this.Aeq = "";
    this.Aer = 0;
    this.Aeu = true;
    this.Aez = false;
    this.AeA = false;
    this.AeE = new ArrayList();
    this.AeF = new HashMap();
    this.AeG = new ArrayList();
    this.AeI = false;
    this.Gn = ah.getContext();
    this.AdY = this.Gn.getResources().getDimensionPixelSize(2131428368);
    this.lfN = this.Gn.getResources().getDimensionPixelSize(2131428372);
    this.AdZ = this.Gn.getResources().getDimensionPixelSize(2131428371);
    this.Aee = com.tencent.mm.bz.a.fromDPToPix(this.Gn, 48);
    this.Aef = com.tencent.mm.bz.a.fromDPToPix(this.Gn, 43);
    this.Aeb = com.tencent.mm.bz.a.fromDPToPix(this.Gn, 86);
    this.Aec = com.tencent.mm.bz.a.fromDPToPix(this.Gn, 90);
    this.Aed = com.tencent.mm.bz.a.fromDPToPix(this.Gn, 65);
    this.Aea = com.tencent.mm.bz.a.al(this.Gn, 2131427500);
    this.Aej = com.tencent.mm.bz.a.fromDPToPix(this.Gn, 6);
    this.Aeq = "TAG_DEFAULT_TAB";
    this.Aer = 0;
    this.Aav = com.tencent.mm.bz.a.al(this.Gn, 2131428649);
    this.Aeg = com.tencent.mm.bz.a.al(this.Gn, 2131427500);
    this.Aek = com.tencent.mm.bz.a.al(this.Gn, 2131428650);
    this.Ael = com.tencent.mm.bz.a.al(this.Gn, 2131428651);
    this.Aem = com.tencent.mm.bz.a.fromDPToPix(this.Gn, 12);
    this.Aen = this.Aek;
    this.Aeo = com.tencent.mm.bz.a.fromDPToPix(this.Gn, 8);
    this.Aep = com.tencent.mm.bz.a.fromDPToPix(this.Gn, 16);
    dNv();
    dNm();
    dNy();
    AppMethodBeat.o(63078);
  }

  public static int QK(int paramInt)
  {
    int i = 2;
    if (paramInt == ChatFooterPanel.vhi);
    while (true)
    {
      return i;
      if (paramInt == ChatFooterPanel.vhn)
        i = 3;
      else if (paramInt == ChatFooterPanel.vho)
        i = 4;
      else if (paramInt == ChatFooterPanel.vhp)
        i = 5;
    }
  }

  public static boolean QL(int paramInt)
  {
    AppMethodBeat.i(63114);
    boolean bool;
    if ((((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().OT()) && ((paramInt == ChatFooterPanel.vhi) || (paramInt == ChatFooterPanel.vhn) || (paramInt == ChatFooterPanel.vho) || (paramInt == ChatFooterPanel.vhp)))
    {
      bool = true;
      AppMethodBeat.o(63114);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(63114);
    }
  }

  public static boolean QM(int paramInt)
  {
    if (paramInt == ChatFooterPanel.vhi);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private com.tencent.mm.view.c.a a(EmojiGroupInfo paramEmojiGroupInfo, com.tencent.mm.view.e.a parama, boolean paramBoolean, com.tencent.mm.view.c.a parama1, int paramInt)
  {
    AppMethodBeat.i(63101);
    if (parama1 == null);
    for (int i = 0; ; i = parama1.jis + parama1.dMX())
    {
      paramEmojiGroupInfo = new com.tencent.mm.view.c.a(paramEmojiGroupInfo, i, paramInt, this, parama, paramBoolean);
      AppMethodBeat.o(63101);
      return paramEmojiGroupInfo;
    }
  }

  private int[] aMw()
  {
    AppMethodBeat.i(63106);
    int[] arrayOfInt = new int[2];
    Object localObject;
    if ((this.Gn instanceof Activity))
    {
      localObject = new DisplayMetrics();
      ((Activity)this.Gn).getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
      arrayOfInt[0] = ((DisplayMetrics)localObject).widthPixels;
      arrayOfInt[1] = ((DisplayMetrics)localObject).heightPixels;
    }
    while (true)
    {
      AppMethodBeat.o(63106);
      return arrayOfInt;
      localObject = ((WindowManager)this.Gn.getSystemService("window")).getDefaultDisplay();
      arrayOfInt[0] = ((Display)localObject).getWidth();
      arrayOfInt[1] = ((Display)localObject).getHeight();
    }
  }

  public static int ati(String paramString)
  {
    AppMethodBeat.i(63080);
    int i;
    if (paramString.equals("TAG_DEFAULT_TAB"))
    {
      i = 20;
      AppMethodBeat.o(63080);
    }
    while (true)
    {
      return i;
      if (paramString.equals(String.valueOf(EmojiGroupInfo.yad)))
      {
        i = 25;
        AppMethodBeat.o(63080);
      }
      else if (paramString.equals("capture"))
      {
        i = 26;
        AppMethodBeat.o(63080);
      }
      else
      {
        i = 23;
        AppMethodBeat.o(63080);
      }
    }
  }

  private com.tencent.mm.view.c.a b(EmojiGroupInfo paramEmojiGroupInfo, com.tencent.mm.view.e.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(63100);
    int i = this.AeE.size();
    if (i <= 0);
    for (com.tencent.mm.view.c.a locala = null; ; locala = (com.tencent.mm.view.c.a)this.AeE.get(i - 1))
    {
      paramEmojiGroupInfo = a(paramEmojiGroupInfo, parama, paramBoolean, locala, bo.a((Integer)this.AeF.get(paramEmojiGroupInfo.field_productID), 0));
      AppMethodBeat.o(63100);
      return paramEmojiGroupInfo;
    }
  }

  public static boolean dNi()
  {
    boolean bool1 = false;
    AppMethodBeat.i(63081);
    try
    {
      if (((h)g.RM().Rn()).SG())
      {
        com.tencent.mm.by.a.dmE();
        localb = com.tencent.mm.by.a.xum;
        bool2 = a.b.LR(208913);
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        try
        {
          com.tencent.mm.by.a.dmE();
          a.b localb = com.tencent.mm.by.a.xum;
          bool3 = a.b.LR(208899);
          if ((bool3) || (bool2))
          {
            AppMethodBeat.o(63081);
            bool2 = true;
            return bool2;
            localException1 = localException1;
            bool2 = false;
            ab.e("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "[cpan] get new emoji flag faild.%s", new Object[] { localException1.toString() });
            bool3 = false;
            continue;
          }
          AppMethodBeat.o(63081);
          bool2 = bool1;
          continue;
        }
        catch (Exception localException2)
        {
          continue;
        }
        boolean bool2 = false;
        boolean bool3 = false;
      }
    }
  }

  public static boolean dNj()
  {
    boolean bool1 = false;
    AppMethodBeat.i(63082);
    try
    {
      if (((h)g.RM().Rn()).SG())
        bool2 = com.tencent.mm.x.c.PK().bX(262147, 266244);
    }
    catch (Exception localException1)
    {
      while (true)
      {
        try
        {
          bool3 = com.tencent.mm.x.c.PK().bX(262149, 266244);
          if ((bool2) || (bool3))
          {
            AppMethodBeat.o(63082);
            bool3 = true;
            return bool3;
            localException1 = localException1;
            bool2 = false;
            ab.e("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "[cpan] get new emoji flag faild.%s", new Object[] { localException1.toString() });
            bool3 = false;
            continue;
          }
          AppMethodBeat.o(63082);
          bool3 = bool1;
          continue;
        }
        catch (Exception localException2)
        {
          continue;
        }
        boolean bool3 = false;
        boolean bool2 = false;
      }
    }
  }

  public static EmojiGroupInfo dNo()
  {
    AppMethodBeat.i(63092);
    EmojiGroupInfo localEmojiGroupInfo = new EmojiGroupInfo();
    localEmojiGroupInfo.field_productID = "TAG_DEFAULT_TAB";
    AppMethodBeat.o(63092);
    return localEmojiGroupInfo;
  }

  public static EmojiGroupInfo dNp()
  {
    AppMethodBeat.i(63093);
    EmojiGroupInfo localEmojiGroupInfo = new EmojiGroupInfo();
    localEmojiGroupInfo.field_productID = String.valueOf(EmojiGroupInfo.yad);
    AppMethodBeat.o(63093);
    return localEmojiGroupInfo;
  }

  public static boolean e(EmojiGroupInfo paramEmojiGroupInfo)
  {
    boolean bool = true;
    AppMethodBeat.i(63094);
    if ((paramEmojiGroupInfo != null) && ((!b.JX(paramEmojiGroupInfo.field_productID)) || (paramEmojiGroupInfo.field_packStatus == 1)))
      AppMethodBeat.o(63094);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(63094);
    }
  }

  public static boolean isSDCardAvailable()
  {
    AppMethodBeat.i(63105);
    boolean bool;
    if (((h)g.RM().Rn()).SG())
    {
      g.RQ();
      bool = g.RP().isSDCardAvailable();
      AppMethodBeat.o(63105);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(63105);
    }
  }

  public final void QH(int paramInt)
  {
    AppMethodBeat.i(63084);
    this.jiL = paramInt;
    ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "set viewpager height px: %d mViewPagerHeightPx:%d ", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.jiL) });
    AppMethodBeat.o(63084);
  }

  public final com.tencent.mm.view.c.a QI(int paramInt)
  {
    AppMethodBeat.i(63097);
    com.tencent.mm.view.c.a locala;
    if (this.AeE == null)
    {
      locala = null;
      AppMethodBeat.o(63097);
    }
    while (true)
    {
      return locala;
      locala = (com.tencent.mm.view.c.a)this.AeE.get(QJ(paramInt));
      AppMethodBeat.o(63097);
    }
  }

  public final int QJ(int paramInt)
  {
    if ((this.AeB == null) || (paramInt >= this.AeB.length) || (paramInt <= 0));
    for (paramInt = 0; ; paramInt = this.AeB[paramInt])
      return paramInt;
  }

  public final void a(EmojiGroupInfo paramEmojiGroupInfo, com.tencent.mm.view.e.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(63099);
    if (this.AeE == null)
      this.AeE = new ArrayList();
    paramEmojiGroupInfo = b(paramEmojiGroupInfo, parama, paramBoolean);
    this.AeE.add(paramEmojiGroupInfo);
    AppMethodBeat.o(63099);
  }

  public final void a(com.tencent.mm.view.c.a parama)
  {
    AppMethodBeat.i(63104);
    String str = parama.kWz;
    int i;
    int j;
    int k;
    int m;
    if (str.equals("TAG_DEFAULT_TAB"))
    {
      i = this.Aek;
      j = this.Ael;
      k = parama.tVA;
      m = this.jiL - i * 2 - atj(str) * k;
      if (m < this.Aep)
        break label134;
      j = (m - this.Aep) / (k + 1);
      parama.Adl = (i + j);
      if (k != 1)
        break label119;
      parama.Adk = 0;
      AppMethodBeat.o(63104);
    }
    while (true)
    {
      return;
      i = this.Aem;
      j = this.Aem;
      break;
      label119: parama.Adk = j;
      AppMethodBeat.o(63104);
      continue;
      label134: if (m < this.Aeo)
        break label162;
      parama.Adl = i;
      parama.Adk = 0;
      AppMethodBeat.o(63104);
    }
    label162: if (x.gu(this.Gn))
    {
      k = (m - this.Aeo) / (k + 1);
      label186: i += k;
      if (i >= j)
        break label230;
    }
    label230: for (parama.Adl = j; ; parama.Adl = i)
    {
      parama.Adk = k;
      AppMethodBeat.o(63104);
      break;
      k = m / (k + 1);
      break label186;
    }
  }

  public final int aRB()
  {
    AppMethodBeat.i(63085);
    if (this.jiM <= 1)
      this.jiM = aMw()[0];
    int i = this.jiM;
    AppMethodBeat.o(63085);
    return i;
  }

  public final int atj(String paramString)
  {
    AppMethodBeat.i(63083);
    int i;
    if ("TAG_DEFAULT_TAB".equals(paramString))
    {
      i = this.Aee;
      AppMethodBeat.o(63083);
    }
    while (true)
    {
      return i;
      i = this.Aeb;
      AppMethodBeat.o(63083);
    }
  }

  public final boolean atk(String paramString)
  {
    AppMethodBeat.i(63088);
    boolean bool;
    if (this.Aeq.equals(paramString))
    {
      bool = true;
      AppMethodBeat.o(63088);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(63088);
    }
  }

  public final com.tencent.mm.view.c.a atl(String paramString)
  {
    AppMethodBeat.i(63096);
    if ((this.AeE == null) || (paramString == null))
    {
      ab.w("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "getTab failed.");
      AppMethodBeat.o(63096);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Iterator localIterator = this.AeE.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          com.tencent.mm.view.c.a locala = (com.tencent.mm.view.c.a)localIterator.next();
          if (locala == null)
          {
            ab.e("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "get null tab");
          }
          else if (locala.kWz == null)
          {
            ab.e("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "get null tab productId");
          }
          else if (locala.kWz.equals(paramString))
          {
            AppMethodBeat.o(63096);
            paramString = locala;
            break;
          }
        }
      AppMethodBeat.o(63096);
      paramString = null;
    }
  }

  public final int dNk()
  {
    return this.Aeb;
  }

  public final void dNl()
  {
    AppMethodBeat.i(63089);
    if (bo.isNullOrNil(this.Aeq))
      AppMethodBeat.o(63089);
    while (true)
    {
      return;
      if (this.Aes)
      {
        AppMethodBeat.o(63089);
      }
      else
      {
        ab.i("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "save product Id:%s selected index:%d", new Object[] { this.Aeq, Integer.valueOf(this.Aer) });
        com.tencent.mm.by.a.dmE();
        a.b localb = com.tencent.mm.by.a.xum;
        a.b.alW(this.Aeq);
        AppMethodBeat.o(63089);
      }
    }
  }

  public final void dNm()
  {
    AppMethodBeat.i(63090);
    if (this.Aes)
    {
      if (!this.Aeq.equals("TAG_DEFAULT_TAB"))
      {
        this.Aeq = "TAG_DEFAULT_TAB";
        this.Aer = bo.a((Integer)this.AeF.get(this.Aeq), 0);
      }
      AppMethodBeat.o(63090);
    }
    while (true)
    {
      return;
      com.tencent.mm.by.a.dmE();
      a.b localb = com.tencent.mm.by.a.xum;
      this.Aeq = a.b.bJ(-29414086, "TAG_DEFAULT_TAB");
      this.Aer = bo.a((Integer)this.AeF.get(this.Aeq), 0);
      ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "restoreShowProductId product id: %s selected index:%d", new Object[] { this.Aeq, Integer.valueOf(this.Aer) });
      AppMethodBeat.o(63090);
    }
  }

  public final int dNn()
  {
    int i = 0;
    AppMethodBeat.i(63091);
    if (ChatFooterPanel.vhl == this.gOW);
    for (boolean bool = true; ; bool = false)
    {
      Object localObject = com.tencent.mm.emoji.a.a.OB().bY(bool);
      if ((!bo.isNullOrNil(this.vmL)) && ((ad.aox(this.vmL)) || (com.tencent.mm.model.t.mP(this.vmL))))
      {
        localObject = ((ArrayList)localObject).iterator();
        while (true)
        {
          j = i;
          if (!((Iterator)localObject).hasNext())
            break;
          EmojiInfo localEmojiInfo = (EmojiInfo)((Iterator)localObject).next();
          if ((localEmojiInfo != null) && (localEmojiInfo.field_catalog == EmojiGroupInfo.yae))
            i++;
        }
      }
      int j = ((ArrayList)localObject).size();
      i = j;
      if (QM(this.gOW))
        i = j + 1;
      AppMethodBeat.o(63091);
      return i;
    }
  }

  public final boolean dNq()
  {
    AppMethodBeat.i(63095);
    com.tencent.mm.by.a.dmE();
    a.b localb = com.tencent.mm.by.a.xum;
    boolean bool;
    if ((a.b.LR(66832)) && (!this.Aey))
    {
      bool = true;
      AppMethodBeat.o(63095);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(63095);
    }
  }

  public final com.tencent.mm.view.c.a dNr()
  {
    AppMethodBeat.i(63098);
    com.tencent.mm.view.c.a locala = atl(this.Aeq);
    AppMethodBeat.o(63098);
    return locala;
  }

  public final int dNs()
  {
    AppMethodBeat.i(63102);
    int i;
    if (this.Aes)
    {
      i = atl("TAG_DEFAULT_TAB").dMX();
      AppMethodBeat.o(63102);
    }
    while (true)
    {
      return i;
      i = this.moz;
      AppMethodBeat.o(63102);
    }
  }

  public final void dNt()
  {
    AppMethodBeat.i(63103);
    this.moz = 0;
    if (this.AeE == null)
      AppMethodBeat.o(63103);
    while (true)
    {
      return;
      Object localObject = this.AeE.iterator();
      int i;
      while (((Iterator)localObject).hasNext())
      {
        com.tencent.mm.view.c.a locala = (com.tencent.mm.view.c.a)((Iterator)localObject).next();
        i = this.moz;
        this.moz = (locala.dMX() + i);
      }
      if (this.AeE != null);
      try
      {
        this.AeB = new int[this.moz];
        i = 0;
        int j = 0;
        while (true)
        {
          int k;
          if (i < this.AeE.size())
          {
            localObject = (com.tencent.mm.view.c.a)this.AeE.get(i);
            k = 0;
          }
          while (true)
          {
            if (k >= ((com.tencent.mm.view.c.a)localObject).dMX())
              break label188;
            int m = this.moz;
            if (j >= m)
            {
              ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "refreshAllCount count: %d", new Object[] { Integer.valueOf(this.moz) });
              AppMethodBeat.o(63103);
              break;
            }
            this.AeB[j] = i;
            k++;
            j++;
          }
          label188: i++;
        }
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", localException, "", new Object[0]);
      }
    }
  }

  public final void dNu()
  {
    AppMethodBeat.i(63107);
    if (this.AeH != null)
    {
      ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "remove succeed send listener");
      com.tencent.mm.sdk.b.a.xxA.d(this.AeH);
      this.AeH = null;
    }
    AppMethodBeat.o(63107);
  }

  public final void dNv()
  {
    AppMethodBeat.i(63109);
    long l = System.currentTimeMillis();
    if (this.AeF == null)
      this.AeF = new HashMap();
    this.AeF.clear();
    Object localObject = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().bjU();
    if ((localObject != null) && (((cab)localObject).wZl != null) && (!((cab)localObject).wZl.isEmpty()))
    {
      localObject = ((cab)localObject).wZl.iterator();
      while (((Iterator)localObject).hasNext())
      {
        cac localcac = (cac)((Iterator)localObject).next();
        this.AeF.put(localcac.ProductID, Integer.valueOf(localcac.vKj));
      }
    }
    ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "restore smiley tab map use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    AppMethodBeat.o(63109);
  }

  public final void dNw()
  {
    AppMethodBeat.i(63110);
    long l = System.currentTimeMillis();
    cab localcab = new cab();
    if ((this.AeF != null) && (!this.AeF.isEmpty()))
    {
      Iterator localIterator = this.AeF.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        cac localcac = new cac();
        localcac.ProductID = str;
        localcac.vKj = ((Integer)this.AeF.get(str)).intValue();
        localcab.wZl.add(localcac);
      }
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().a(localcab);
    }
    ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "save Smiley TabMap use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    AppMethodBeat.o(63110);
  }

  public final boolean dNx()
  {
    AppMethodBeat.i(63111);
    boolean bool;
    if ((this.AeG != null) && (this.AeG.size() >= 3))
    {
      bool = true;
      AppMethodBeat.o(63111);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(63111);
    }
  }

  public final void dNy()
  {
    AppMethodBeat.i(63112);
    this.AeG = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().bjY();
    AppMethodBeat.o(63112);
  }

  public final boolean dNz()
  {
    AppMethodBeat.i(138411);
    boolean bool = QL(this.gOW);
    AppMethodBeat.o(138411);
    return bool;
  }

  public final void eI(String paramString, int paramInt)
  {
    AppMethodBeat.i(63087);
    this.AeF.put(paramString, Integer.valueOf(paramInt));
    AppMethodBeat.o(63087);
  }

  public final int getColumnWidth()
  {
    int i = 4;
    AppMethodBeat.i(63108);
    int j;
    if (this.zyD == 0)
    {
      j = aRB() / this.Aec;
      if (!x.gu(this.Gn))
        break label76;
      if (j <= 4)
        break label73;
      j = i;
    }
    label73: label76: 
    while (true)
    {
      i = j;
      if (j <= 0)
        i = 1;
      this.zyD = (aRB() / i);
      j = this.zyD;
      AppMethodBeat.o(63108);
      return j;
    }
  }

  public final void onPause()
  {
    AppMethodBeat.i(63079);
    this.zRn = false;
    dNl();
    dNw();
    dNu();
    ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().bjZ();
    AppMethodBeat.o(63079);
  }

  public final void setShowProductId(String paramString)
  {
    AppMethodBeat.i(63086);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(63086);
    while (true)
    {
      return;
      this.Aeq = paramString;
      AppMethodBeat.o(63086);
    }
  }

  public static enum a
  {
    static
    {
      AppMethodBeat.i(63077);
      AeK = new a("RECOMMEND", 0);
      AeL = new a("DEFAULT", 1);
      AeM = new a("CUSTOM", 2);
      AeN = new a("CAPTURE", 3);
      AeO = new a("STORE", 4);
      AeP = new a[] { AeK, AeL, AeM, AeN, AeO };
      AppMethodBeat.o(63077);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.f.a
 * JD-Core Version:    0.6.2
 */