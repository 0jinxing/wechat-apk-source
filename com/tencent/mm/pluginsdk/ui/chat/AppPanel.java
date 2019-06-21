package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.c;
import com.tencent.mm.plugin.card.c.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMDotView;
import com.tencent.mm.ui.base.MMFlipper;
import com.tencent.mm.ui.base.MMFlipper.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AppPanel extends LinearLayout
{
  private static int qgy = 215;
  private static int qgz = 158;
  private static boolean vmg = false;
  private boolean bZi;
  Context context;
  private SharedPreferences ehZ;
  private List<f> geU;
  private boolean qgL;
  private int qgM;
  private int qgN;
  public MMFlipper qgO;
  private MMDotView qgP;
  private int vlA;
  private final boolean[] vlJ;
  private AppPanel.a vlK;
  private AppPanel.b vlL;
  private List<AppGrid> vlM;
  private int vlN;
  private int vlO;
  public a vlP;
  private int vlQ;
  private int vlR;
  private int vlS;
  private boolean vlT;
  private boolean vlU;
  private boolean vlV;
  private boolean vlW;
  boolean vlX;
  boolean vlY;
  boolean vlZ;
  public boolean vma;
  private Map<String, f> vmb;
  private boolean vmc;
  private final int vmd;
  private int vme;
  private AppGrid.b vmf;
  private boolean vmh;
  private int vmi;

  public AppPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(27752);
    this.vlJ = new boolean[17];
    this.qgL = false;
    this.vlA = 17;
    this.vlN = this.vlA;
    this.bZi = false;
    this.vlQ = 0;
    this.vlR = 0;
    this.vlS = 0;
    this.vlT = false;
    this.vlU = false;
    this.vlV = false;
    this.vlW = false;
    this.vlX = false;
    this.vlY = false;
    this.vlZ = false;
    this.vma = false;
    this.vmb = null;
    this.vmc = true;
    this.geU = new LinkedList();
    this.vmd = 2;
    this.vme = -1;
    this.vmf = new AppPanel.4(this);
    this.vmh = true;
    this.vmi = -1;
    this.context = paramContext;
    AppMethodBeat.o(27752);
  }

  private void chK()
  {
    AppMethodBeat.i(27772);
    ab.i("MicroMsg.AppPanel", "init app grid: %s, %s", new Object[] { Integer.valueOf(this.qgM), Integer.valueOf(this.qgN) });
    if ((this.qgM == 0) || (this.qgN == 0))
    {
      AppMethodBeat.o(27772);
      return;
    }
    int i = BackwardSupportUtil.b.b(this.context, 82.0F);
    int j = BackwardSupportUtil.b.b(this.context, 90.0F);
    djQ();
    int k = 4;
    if (!this.vmc)
      k = this.qgM / i;
    int m = this.qgN / j;
    i = m;
    if (m > 2)
      i = 2;
    j = (this.qgN - j * i) / (i + 1);
    ab.d("MicroMsg.AppPanel", "jacks spacing2 = %d", new Object[] { Integer.valueOf(j) });
    ab.d("MicroMsg.AppPanel", "in initAppGrid, gridWidth = %d, gridHeight = %d", new Object[] { Integer.valueOf(this.qgM), Integer.valueOf(this.qgN) });
    if (k == 0)
      k = 1;
    while (true)
    {
      m = i;
      if (i == 0)
        m = 1;
      this.vlO = m;
      int n = k * m;
      label238: int i1;
      if (this.vlP.vmu.value)
      {
        this.vlN = (this.vlA + this.geU.size());
        i1 = (int)Math.ceil(this.vlN / n);
        ab.i("MicroMsg.AppPanel", "in initAppGrid, totalItemCount = %d, itemsPerPage = %d, pageCount = %d visibleLocalAppCount = %d infoList = %d", new Object[] { Integer.valueOf(this.vlN), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(this.vlA), Integer.valueOf(this.geU.size()) });
        if (this.vme != i1)
          break label843;
        ab.i("MicroMsg.AppPanel", "mLastPageCount == pageCount! [%s:%s]", new Object[] { Integer.valueOf(this.vme), Integer.valueOf(i1) });
      }
      label843: for (i = 0; ; i = 1)
      {
        if (i != 0)
        {
          this.vlM = new ArrayList();
          this.qgO.removeAllViews();
        }
        long l1 = System.currentTimeMillis();
        long l2 = 0L;
        if (i1 > 10)
        {
          h.pYm.e(16776, new Object[] { Integer.valueOf(0), Integer.valueOf(1) });
          h.pYm.k(999L, 1L, 1L);
        }
        AppPanel.3 local3 = new AppPanel.3(this);
        com.tencent.mm.sdk.g.d.xDG.p(local3, 5000L);
        m = 0;
        if (m < i1)
        {
          if (m >= i1)
          {
            ab.e("MicroMsg.AppPanel", "my god! you see a ghost! %s", new Object[] { Integer.valueOf(i1) });
            h.pYm.k(999L, 0L, 1L);
            h.pYm.e(16776, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
          }
        }
        else
        {
          com.tencent.mm.sdk.g.d.xDG.remove(local3);
          ab.i("MicroMsg.AppPanel", "[initAppGrid] cost:%sms inflateCost:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1), Long.valueOf(l2) });
          localObject = this.vlM.iterator();
          while (((Iterator)localObject).hasNext())
            ((AppGrid)((Iterator)localObject).next()).setOnAppSelectedListener(this.vmf);
          this.vlN = this.vlA;
          break label238;
        }
        long l3 = System.currentTimeMillis();
        if ((i == 0) && (this.vlM.size() > m) && (this.vlM.get(m) != null));
        for (Object localObject = (AppGrid)this.vlM.get(m); ; localObject = (AppGrid)inflate(this.context, 2130968751, null))
        {
          ab.i("MicroMsg.AppPanel", "[initAppGrid] i:%s cost:%sms", new Object[] { Integer.valueOf(m), Long.valueOf(System.currentTimeMillis() - l1) });
          l2 += System.currentTimeMillis() - l3;
          ((AppGrid)localObject).d(this.geU, this.vmb);
          ((AppGrid)localObject).b(m, this.vlN, n, i1, k, this.vlA);
          ((AppGrid)localObject).La(j);
          if (i != 0)
          {
            this.qgO.addView((View)localObject, new LinearLayout.LayoutParams(-1, -2));
            this.vlM.add(localObject);
          }
          m++;
          break;
        }
        chL();
        this.vme = i1;
        requestLayout();
        AppMethodBeat.o(27772);
        break;
      }
    }
  }

  private void chL()
  {
    AppMethodBeat.i(27773);
    if (this.vlM.size() <= 1)
    {
      this.qgP.setVisibility(4);
      AppMethodBeat.o(27773);
    }
    while (true)
    {
      return;
      this.qgP.setVisibility(0);
      this.qgP.setDotCount(this.vlM.size());
      int i = this.qgO.getCurScreen();
      this.qgO.setToScreen(i);
      this.qgP.setSelectedDot(i);
      AppMethodBeat.o(27773);
    }
  }

  private void djR()
  {
    AppMethodBeat.i(27770);
    ab.d("MicroMsg.AppPanel", "AppPanel initFlipper");
    this.vme = -1;
    this.qgO.removeAllViews();
    this.qgO.setOnMeasureListener(new MMFlipper.a()
    {
      public final void fe(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(27741);
        ab.i("MicroMsg.AppPanel", "onMeasure width:" + paramAnonymousInt1 + " height:" + paramAnonymousInt2 + " isMeasured:" + AppPanel.a(AppPanel.this));
        if ((AppPanel.a(AppPanel.this)) || (paramAnonymousInt2 == 0) || (paramAnonymousInt1 == 0))
        {
          if ((paramAnonymousInt2 == 0) || (paramAnonymousInt1 == 0))
            ab.d("MicroMsg.AppPanel", "onMeasure, width or height is 0");
          AppMethodBeat.o(27741);
          return;
        }
        if (AppPanel.b(AppPanel.this) == 2)
          ab.d("MicroMsg.AppPanel", "landspace");
        while (true)
        {
          AppPanel.c(AppPanel.this);
          AppPanel.a(AppPanel.this, paramAnonymousInt2);
          AppPanel.b(AppPanel.this, paramAnonymousInt1);
          AppPanel.d(AppPanel.this);
          AppMethodBeat.o(27741);
          break;
          ab.d("MicroMsg.AppPanel", "portrait");
        }
      }
    });
    this.qgO.setOnScreenChangedListener(new AppPanel.2(this));
    djT();
    AppMethodBeat.o(27770);
  }

  private boolean djU()
  {
    AppMethodBeat.i(27780);
    boolean bool;
    if (this.vma)
    {
      AppMethodBeat.o(27780);
      bool = false;
    }
    while (true)
    {
      return bool;
      b localb = (b)com.tencent.mm.kernel.g.K(b.class);
      if (localb != null)
      {
        if ((localb.bbn()) && (localb.bbq() > 0))
        {
          bool = true;
          AppMethodBeat.o(27780);
        }
        else
        {
          AppMethodBeat.o(27780);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(27780);
        bool = false;
      }
    }
  }

  private void eg(List<f> paramList)
  {
    AppMethodBeat.i(27755);
    boolean bool1 = this.vlT;
    this.vlT = false;
    boolean bool2 = this.vlU;
    boolean bool3 = this.vlV;
    boolean bool4 = this.vlW;
    this.vlU = false;
    this.vlV = false;
    this.vlW = false;
    int i = com.tencent.mm.pluginsdk.model.app.g.Kw(this.vlS);
    int j = this.vlS;
    if (paramList != null);
    for (int k = paramList.size(); ; k = -1)
    {
      ab.i("MicroMsg.AppPanel", "serviceCount, %d, %s, %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
      this.vmb = new HashMap();
      if (i <= 0)
        break label517;
      if ((paramList == null) || (paramList.size() <= 0))
        break;
      for (k = 0; k < paramList.size(); k = j + 1)
      {
        f localf = (f)paramList.get(k);
        j = k;
        if (localf != null)
        {
          j = k;
          if (localf.field_appId != null)
          {
            j = k;
            if (localf.dhx())
            {
              if (!localf.dhz())
                this.vlT = true;
              j = k;
              if (f.vbQ.equals(localf.field_appId))
              {
                this.vmb.put(f.vbQ, localf);
                ab.i("MicroMsg.AppPanel", "remittance: %s, %s", new Object[] { Boolean.valueOf(this.vlY), Boolean.valueOf(this.vlU) });
                if (!this.vlY)
                  this.vlU = true;
                paramList.remove(k);
                j = k - 1;
              }
              k = j;
              if (f.vbS.equals(localf.field_appId))
              {
                this.vmb.put(f.vbS, localf);
                ab.i("MicroMsg.AppPanel", "luckyMoney: %s, %s", new Object[] { Boolean.valueOf(this.vlX), Boolean.valueOf(this.vlV) });
                if (!this.vlX)
                  this.vlV = true;
                paramList.remove(j);
                k = j - 1;
              }
              j = k;
              if (f.vbT.equals(localf.field_appId))
              {
                this.vmb.put(f.vbT, localf);
                ab.i("MicroMsg.AppPanel", "aa: %s, %s", new Object[] { Boolean.valueOf(this.vlX), Boolean.valueOf(this.vlV) });
                if (!this.vlZ)
                  this.vlW = true;
                paramList.remove(k);
                j = k - 1;
              }
            }
          }
        }
      }
    }
    h.pYm.k(965L, 36L, 1L);
    label517: ab.i("MicroMsg.AppPanel", "hasService %b", new Object[] { Boolean.valueOf(this.vlT) });
    if ((bool1 != this.vlT) || (bool2 != this.vlU) || (bool3 != this.vlV) || (bool4 != this.vlW))
    {
      this.vlP.oJ(this.vlT);
      this.vlP.oK(this.vlU);
      this.vlP.oN(this.vlV);
      this.vlP.oO(this.vlW);
      djQ();
    }
    AppMethodBeat.o(27755);
  }

  private static void eh(List<f> paramList)
  {
    AppMethodBeat.i(27779);
    if ((paramList == null) || (paramList.isEmpty()))
      AppMethodBeat.o(27779);
    while (true)
    {
      return;
      for (int i = 0; ; i++)
      {
        if (i >= paramList.size())
          break label97;
        f localf = (f)paramList.get(i);
        if ((localf != null) && (f.vbR.equals(localf.field_appId)))
        {
          paramList.remove(localf);
          ab.i("MicroMsg.AppPanel", "do remove card");
          AppMethodBeat.o(27779);
          break;
        }
      }
      label97: AppMethodBeat.o(27779);
    }
  }

  private int getPortHeightPX()
  {
    AppMethodBeat.i(27778);
    int i;
    if (this.vmi > 0)
    {
      i = this.vmi;
      AppMethodBeat.o(27778);
    }
    while (true)
    {
      return i;
      i = BackwardSupportUtil.b.b(this.context, qgy);
      AppMethodBeat.o(27778);
    }
  }

  private int getScreenOrientation()
  {
    AppMethodBeat.i(27769);
    Display localDisplay = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
    if (localDisplay.getWidth() < localDisplay.getHeight());
    for (int i = 1; ; i = 2)
    {
      AppMethodBeat.o(27769);
      return i;
    }
  }

  public final void AG()
  {
    AppMethodBeat.i(27776);
    ab.i("MicroMsg.AppPanel", "[forceRefreshSize]");
    djT();
    djS();
    AppMethodBeat.o(27776);
  }

  public final void djI()
  {
    AppMethodBeat.i(27756);
    this.vlP.djX();
    this.vlX = false;
    this.vlY = false;
    this.vlZ = false;
    this.vma = false;
    djJ();
    this.vlP.oJ(this.vlT);
    this.vlP.oK(this.vlU);
    this.vlP.oN(this.vlV);
    this.vlP.oO(this.vlW);
    djQ();
    AppMethodBeat.o(27756);
  }

  public final void djJ()
  {
    AppMethodBeat.i(27757);
    com.tencent.mm.m.g.Nv();
    if (c.Ng() == 2);
    for (boolean bool = true; ; bool = false)
    {
      this.vlP.djY();
      this.vlP.oL(bool);
      bool = com.tencent.mm.bp.d.afj("location");
      this.vlP.oM(bool);
      this.vlP.djZ();
      AppMethodBeat.o(27757);
      return;
    }
  }

  public final void djK()
  {
    AppMethodBeat.i(27758);
    this.vlP.vmo.value = false;
    djQ();
    AppMethodBeat.o(27758);
  }

  public final void djL()
  {
    AppMethodBeat.i(27763);
    this.vlP.vmv.value = false;
    djQ();
    ab.d("MicroMsg.AppPanel", "disableTalkroom enable false");
    AppMethodBeat.o(27763);
  }

  public final void djM()
  {
    AppMethodBeat.i(27764);
    this.vlP.vmA.value = false;
    djQ();
    AppMethodBeat.o(27764);
  }

  public final void djN()
  {
    AppMethodBeat.i(27765);
    this.vlP.vmu.value = false;
    djQ();
    AppMethodBeat.o(27765);
  }

  public final void djO()
  {
    AppMethodBeat.i(27766);
    this.vlP.vmC.value = false;
    djQ();
    AppMethodBeat.o(27766);
  }

  public final void djP()
  {
    AppMethodBeat.i(27767);
    this.vlP.vmI.value = false;
    djQ();
    AppMethodBeat.o(27767);
  }

  public final void djQ()
  {
    AppMethodBeat.i(27768);
    int i = this.vlJ.length;
    for (int j = 0; j < i; j++)
      this.vlJ[j] = true;
    if (!this.vlP.vmn.value)
      this.vlJ[0] = false;
    for (j = 1; ; j = 0)
    {
      i = j;
      if (!this.vlP.vmm.value)
      {
        this.vlJ[1] = false;
        i = j + 1;
      }
      j = i;
      if (!this.vlP.vmI.value)
      {
        this.vlJ[16] = false;
        j = i + 1;
      }
      if (this.vlP.vmA.value)
      {
        k = j;
        if (this.vlP.vmB.value);
      }
      else
      {
        this.vlJ[6] = false;
        k = j + 1;
      }
      i = k;
      if (!this.vlP.vms.value)
      {
        this.vlJ[14] = false;
        i = k + 1;
      }
      j = i;
      if (!this.vlP.vmt.value)
      {
        ab.i("MicroMsg.AppPanel", "disable remittance");
        this.vlJ[8] = false;
        j = i + 1;
      }
      int k = j;
      if (!this.vlP.vmo.value)
      {
        this.vlJ[12] = false;
        k = j + 1;
      }
      i = k;
      if (!this.vlP.vmC.value)
      {
        this.vlJ[13] = false;
        i = k + 1;
      }
      j = i;
      if (!this.vlP.vmF.value)
      {
        this.vlJ[3] = false;
        j = i + 1;
      }
      i = j;
      if (!this.vlP.vmp.value)
      {
        this.vlJ[11] = false;
        i = j + 1;
      }
      k = i;
      if (!this.vlP.vmv.value)
      {
        this.vlJ[5] = false;
        k = i + 1;
      }
      if (this.vlP.vmx.value)
      {
        j = k;
        if (this.vlP.vmw.value);
      }
      else
      {
        this.vlJ[4] = false;
        j = k + 1;
      }
      if (this.vlP.vmr.value)
      {
        i = j;
        if (this.vlP.vmq.value);
      }
      else
      {
        this.vlJ[2] = false;
        i = j + 1;
      }
      if (this.vlP.vmz.value)
      {
        j = i;
        if (this.vlP.vmy.value);
      }
      else
      {
        this.vlJ[10] = false;
        j = i + 1;
      }
      i = j;
      if (!this.vlP.vmE.value)
      {
        ab.i("MicroMsg.AppPanel", "disable lucky money");
        this.vlJ[7] = false;
        i = j + 1;
      }
      j = i;
      if (!this.vlP.vmG.value)
      {
        this.vlJ[15] = false;
        j = i + 1;
      }
      this.vlJ[9] = false;
      this.vlA = (17 - (j + 1));
      AppMethodBeat.o(27768);
      return;
    }
  }

  public final void djS()
  {
    AppMethodBeat.i(27775);
    ab.i("MicroMsg.AppPanel", "[dealOrientationChange]");
    this.qgL = false;
    this.qgO.setToScreen(0);
    djR();
    requestLayout();
    AppMethodBeat.o(27775);
  }

  public final void djT()
  {
    AppMethodBeat.i(27777);
    Object localObject1;
    Object localObject2;
    if (this.vmh)
    {
      if (getScreenOrientation() != 2)
        break label79;
      ab.d("MicroMsg.AppPanel", "initFlipper, landscape");
      localObject1 = findViewById(2131821453);
      localObject2 = new LinearLayout.LayoutParams(-1, 0);
      ((LinearLayout.LayoutParams)localObject2).height = BackwardSupportUtil.b.b(this.context, qgz);
      ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
    }
    while (true)
    {
      this.vmh = false;
      AppMethodBeat.o(27777);
      return;
      label79: ab.d("MicroMsg.AppPanel", "initFlipper, portrait: %d", new Object[] { Integer.valueOf(qgy) });
      localObject2 = findViewById(2131821453);
      localObject1 = new LinearLayout.LayoutParams(-1, 0);
      ((LinearLayout.LayoutParams)localObject1).height = getPortHeightPX();
      ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
    }
  }

  public int getPageMaxRowCount()
  {
    int i = 2;
    int j;
    if (this.vlO == 0)
    {
      j = (this.vlN + 3) / 4;
      if (j <= 2);
    }
    while (true)
    {
      return i;
      i = j;
      continue;
      i = this.vlO;
    }
  }

  public final void init(int paramInt)
  {
    AppMethodBeat.i(27753);
    ab.i("MicroMsg.AppPanel", "init: %s", new Object[] { Integer.valueOf(paramInt) });
    this.vlP = new a();
    this.vlS = paramInt;
    Object localObject = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
    if (((Display)localObject).getWidth() < ((Display)localObject).getHeight())
    {
      this.vlQ = ((Display)localObject).getWidth();
      this.vlR = ((Display)localObject).getHeight();
    }
    while (true)
    {
      View.inflate(this.context, 2130968755, this);
      this.qgP = ((MMDotView)findViewById(2131821455));
      this.qgO = ((MMFlipper)findViewById(2131821454));
      try
      {
        localObject = com.tencent.mm.m.g.Nu().getValue("ShowAPPSuggestion");
        if ((bo.isNullOrNil((String)localObject)) || (Integer.valueOf((String)localObject).intValue() != 1));
        for (this.geU = com.tencent.mm.pluginsdk.model.app.g.a(this.context, false, this.vlS); ; this.geU = com.tencent.mm.pluginsdk.model.app.g.a(this.context, true, this.vlS))
        {
          if (!djU())
            eh(this.geU);
          eg(this.geU);
          djR();
          djI();
          AppMethodBeat.o(27753);
          return;
          this.vlQ = ((Display)localObject).getHeight();
          this.vlR = ((Display)localObject).getWidth();
          break;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.AppPanel", "exception in appPanel init, %s", new Object[] { localException.getMessage() });
          this.geU = com.tencent.mm.pluginsdk.model.app.g.a(this.context, false, this.vlS);
        }
      }
    }
  }

  public final void oF(boolean paramBoolean)
  {
    AppMethodBeat.i(27759);
    if (!paramBoolean);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      this.vlP.vmq.value = paramBoolean;
      djQ();
      ab.d("MicroMsg.AppPanel", "enable " + paramBoolean + " isVoipPluginEnable " + this.vlP.vmr.value);
      AppMethodBeat.o(27759);
      return;
    }
  }

  public final void oG(boolean paramBoolean)
  {
    AppMethodBeat.i(27760);
    if (!paramBoolean);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      this.vlP.vmw.value = paramBoolean;
      djQ();
      ab.d("MicroMsg.AppPanel", "enable " + this.vlP.vmx.value + " isVoipAudioEnable " + paramBoolean);
      AppMethodBeat.o(27760);
      return;
    }
  }

  public final void oH(boolean paramBoolean)
  {
    AppMethodBeat.i(27761);
    if (!paramBoolean);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      this.vlP.vmF.value = paramBoolean;
      djQ();
      ab.d("MicroMsg.AppPanel", "enable " + this.vlP.vmF.value + " isMultiTalkEnable " + paramBoolean);
      AppMethodBeat.o(27761);
      return;
    }
  }

  public final void oI(boolean paramBoolean)
  {
    AppMethodBeat.i(27762);
    if (!paramBoolean);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      this.vlP.vmy.value = paramBoolean;
      djQ();
      AppMethodBeat.o(27762);
      return;
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(27774);
    if ((paramConfiguration.orientation == 1) || (paramConfiguration.orientation == 2))
    {
      ab.d("MicroMsg.AppPanel", "onConfigChanged:" + paramConfiguration.orientation);
      if (paramConfiguration.orientation != 1)
        break label76;
    }
    label76: for (this.vmc = true; ; this.vmc = false)
    {
      setNeedRefreshHeight(true);
      djS();
      AppMethodBeat.o(27774);
      return;
    }
  }

  public final void refresh()
  {
    AppMethodBeat.i(27771);
    ab.i("MicroMsg.AppPanel", "app panel refleshed: %s", new Object[] { Integer.valueOf(this.vlS) });
    try
    {
      String str = com.tencent.mm.m.g.Nu().getValue("ShowAPPSuggestion");
      if ((bo.isNullOrNil(str)) || (Integer.valueOf(str).intValue() != 1))
      {
        this.geU = com.tencent.mm.pluginsdk.model.app.g.a(this.context, false, this.vlS);
        ab.i("MicroMsg.AppPanel", "jacks not show App Suggestion");
      }
      while (true)
      {
        if (!djU())
          eh(this.geU);
        eg(this.geU);
        if (this.vlP != null)
        {
          this.vlP.oJ(this.vlT);
          this.vlP.oK(this.vlU);
          this.vlP.oN(this.vlV);
          this.vlP.oO(this.vlW);
        }
        int i = this.qgO.getCurScreen();
        chK();
        this.qgO.setToScreen(i);
        this.qgP.setSelectedDot(i);
        AppMethodBeat.o(27771);
        return;
        ab.i("MicroMsg.AppPanel", "jacks show App Suggestion");
        this.geU = com.tencent.mm.pluginsdk.model.app.g.a(this.context, true, this.vlS);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppPanel", "exception in appPanel init, %s", new Object[] { localException.getMessage() });
        this.geU = com.tencent.mm.pluginsdk.model.app.g.a(this.context, false, this.vlS);
      }
    }
  }

  public void setAppPanelListener(AppPanel.a parama)
  {
    this.vlK = parama;
  }

  public void setNeedRefreshHeight(boolean paramBoolean)
  {
    this.vmh = paramBoolean;
  }

  public void setOnSwitchPanelListener(AppPanel.b paramb)
  {
    this.vlL = paramb;
  }

  public void setPortHeighDP(int paramInt)
  {
    if (qgy != paramInt)
    {
      qgy = paramInt;
      this.vmh = true;
    }
  }

  public void setPortHeighPx(int paramInt)
  {
    if (this.vmi != paramInt)
    {
      this.vmi = paramInt;
      this.vmh = true;
    }
  }

  public void setServiceShowFlag(int paramInt)
  {
    AppMethodBeat.i(27754);
    ab.i("MicroMsg.AppPanel", "setServiceShowFlag: %s", new Object[] { Integer.valueOf(paramInt) });
    this.vlS = paramInt;
    AppMethodBeat.o(27754);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.AppPanel
 * JD-Core Version:    0.6.2
 */