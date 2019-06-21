package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Process;
import android.os.SystemClock;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.ClipboardManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.bz;
import com.tencent.mm.g.a.tn;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.kiss.WxPresenterActivity;
import com.tencent.mm.model.ar;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.sns.a.b.i.5;
import com.tencent.mm.plugin.sns.b.h.a;
import com.tencent.mm.plugin.sns.i.a.a;
import com.tencent.mm.plugin.sns.i.b.2;
import com.tencent.mm.plugin.sns.k.c.b;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.model.at;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.plugin.sns.model.u;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.azu;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.QFadeImageView;
import com.tencent.mm.vending.a.b.a;
import com.tencent.mm.vending.app.a.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

@com.tencent.mm.kernel.i
public class SnsTimeLineUI extends WxPresenterActivity
  implements com.tencent.mm.ai.f, ar, h.a, t
{
  private static Handler h;
  public static final Boolean rza;
  private static HandlerThread rzk;
  private static final Set<Activity> sUILeaksRoutineEnsuranceRef;
  private long eEO;
  private int ehv;
  private long fAq;
  private String hcl;
  private String igi;
  private ActionBar mActionBar;
  private int mScreenHeight;
  private int mScreenWidth;
  private SnsUIAction mUIAction;
  private com.tencent.matrix.trace.e.b mnM;
  private int oOX;
  private long oes;
  private View plv;
  private com.tencent.mm.ui.statusbar.c.a plx;
  private com.tencent.mm.sdk.b.c qMM;
  private boolean qQu;
  private boolean rhv;
  private boolean rjn;
  protected com.tencent.mm.plugin.sns.a.b.g rqn;
  private av ryA;
  private at ryB;
  private String ryC;
  private boolean ryD;
  private int ryE;
  private String ryF;
  private String ryG;
  private SnsTimeLineUI.c ryH;
  private Runnable ryI;
  private com.tencent.mm.sdk.b.c ryJ;
  private com.tencent.mm.sdk.b.c ryK;
  private boolean ryL;
  private com.tencent.mm.sdk.b.c ryM;
  private com.tencent.mm.sdk.b.c ryN;
  private com.tencent.mm.sdk.b.c ryO;
  private com.tencent.mm.sdk.b.c ryP;
  private com.tencent.mm.sdk.b.c ryQ;
  private com.tencent.mm.sdk.b.c ryR;
  private com.tencent.mm.sdk.b.c ryS;
  private com.tencent.mm.sdk.b.c ryT;
  private com.tencent.mm.sdk.b.c ryU;
  private com.tencent.mm.sdk.b.c ryV;
  private com.tencent.mm.sdk.b.c ryW;
  private com.tencent.mm.sdk.b.c ryX;
  private com.tencent.mm.sdk.b.c ryY;
  private com.tencent.mm.sdk.b.c ryZ;
  private final long ryi;
  private long ryj;
  private com.tencent.mm.plugin.sns.k.b ryk;
  private com.tencent.mm.plugin.sns.k.a ryl;
  private com.tencent.mm.plugin.sns.ui.a.a.b rym;
  private com.tencent.mm.plugin.sns.ui.a.a ryn;
  private LinearLayout ryo;
  private LinearLayout ryp;
  private QFadeImageView ryq;
  private boolean ryr;
  private boolean rys;
  private i ryt;
  private SnsTimeLineUI.a ryu;
  private TestTimeForSns ryv;
  private int ryw;
  private boolean ryx;
  private String ryy;
  private com.tencent.mm.plugin.sns.i.a ryz;
  private long rzb;
  boolean rzc;
  Runnable rzd;
  Runnable rze;
  private Handler rzf;
  private Runnable rzg;
  private SnsUIAction.a rzh;
  private a.b rzi;
  boolean rzj;
  int rzl;
  private MenuItem.OnMenuItemClickListener rzm;
  private ImageView rzn;
  private View rzo;
  private ax rzp;
  private View.OnClickListener rzq;
  private boolean rzr;

  static
  {
    AppMethodBeat.i(39602);
    rza = Boolean.FALSE;
    sUILeaksRoutineEnsuranceRef = new HashSet();
    HandlerThread localHandlerThread = new HandlerThread("sns");
    rzk = localHandlerThread;
    localHandlerThread.start();
    h = new Handler(rzk.getLooper());
    AppMethodBeat.o(39602);
  }

  public SnsTimeLineUI()
  {
    AppMethodBeat.i(39554);
    this.ryi = 300L;
    this.ryj = SystemClock.elapsedRealtime();
    this.ryk = ((com.tencent.mm.plugin.sns.k.b)V(com.tencent.mm.plugin.sns.k.b.class));
    if (this.ryk != null);
    for (com.tencent.mm.plugin.sns.k.a locala = this.ryk.cvE(); ; locala = null)
    {
      this.ryl = locala;
      this.rym = new com.tencent.mm.plugin.sns.ui.a.a.b();
      this.ryr = false;
      this.rys = false;
      this.rhv = false;
      this.ryw = 0;
      this.ryx = false;
      this.ryy = "";
      this.ryz = new com.tencent.mm.plugin.sns.i.a();
      this.rqn = new com.tencent.mm.plugin.sns.a.b.g(1);
      this.ryA = new av();
      this.ryB = new at();
      this.ryG = "";
      this.ryH = new SnsTimeLineUI.c(this, (byte)0);
      this.ryI = new SnsTimeLineUI.1(this);
      this.ryJ = new SnsTimeLineUI.12(this);
      this.ryK = new SnsTimeLineUI.23(this);
      this.ryL = false;
      this.qQu = false;
      this.ryM = new SnsTimeLineUI.34(this);
      this.ryN = new SnsTimeLineUI.45(this);
      this.ryO = new SnsTimeLineUI.56(this);
      this.ryP = new SnsTimeLineUI.60(this);
      this.ryQ = new SnsTimeLineUI.61(this);
      this.ryR = new SnsTimeLineUI.62(this);
      this.ryS = new SnsTimeLineUI.2(this);
      this.ryT = new SnsTimeLineUI.3(this);
      this.ryU = new SnsTimeLineUI.4(this);
      this.qMM = new SnsTimeLineUI.5(this);
      this.ryV = new SnsTimeLineUI.6(this);
      this.ryW = new SnsTimeLineUI.7(this);
      this.ryX = new SnsTimeLineUI.8(this);
      this.ryY = new SnsTimeLineUI.9(this);
      this.ryZ = new SnsTimeLineUI.10(this);
      this.rzb = 0L;
      this.rzc = false;
      this.oOX = 0;
      this.rzd = new SnsTimeLineUI.17(this);
      this.rze = new SnsTimeLineUI.18(this);
      this.rzf = ((com.tencent.mm.vending.h.b)com.tencent.mm.vending.h.d.zYq.zYv).a;
      this.rzg = new SnsTimeLineUI.19(this);
      this.rzh = new SnsUIAction.a()
      {
        private int rzB = 0;
        private int rzC = 0;

        public final void Eh(int paramAnonymousInt)
        {
          AppMethodBeat.i(39482);
          int i = SnsTimeLineUI.j(SnsTimeLineUI.this).nDp.getFirstVisiblePosition();
          int j = SnsTimeLineUI.j(SnsTimeLineUI.this).nDp.getLastVisiblePosition();
          if ((i == this.rzB) && (j == this.rzC))
            AppMethodBeat.o(39482);
          while (true)
          {
            return;
            this.rzB = i;
            this.rzC = j;
            ab.i("MicroMsg.SnsTimeLineUI", "onListViewScoll %s %s %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramAnonymousInt) });
            Object localObject1;
            boolean bool;
            int k;
            int m;
            int n;
            if (paramAnonymousInt == 2)
            {
              WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcSNSScrollEnable, SnsTimeLineUI.A(SnsTimeLineUI.this));
              localObject1 = SnsTimeLineUI.this;
              bool = WXHardCoderJNI.hcSNSScrollEnable;
              k = WXHardCoderJNI.hcSNSScrollDelay;
              m = WXHardCoderJNI.hcSNSScrollCPU;
              n = WXHardCoderJNI.hcSNSScrollIO;
              if (!WXHardCoderJNI.hcSNSScrollThr)
                break label385;
            }
            LinkedList localLinkedList;
            label385: for (int i1 = Process.myTid(); ; i1 = 0)
            {
              SnsTimeLineUI.d((SnsTimeLineUI)localObject1, WXHardCoderJNI.startPerformance(bool, k, m, n, i1, WXHardCoderJNI.hcSNSScrollTimeout, 701, WXHardCoderJNI.hcSNSScrollAction, "MicroMsg.SnsTimeLineUI"));
              ab.i("MicroMsg.SnsTimeLineUI", "summer hardcoder sns startPerformance [%s]", new Object[] { Integer.valueOf(SnsTimeLineUI.A(SnsTimeLineUI.this)) });
              if ((paramAnonymousInt != 0) || (SnsTimeLineUI.a(SnsTimeLineUI.this) == null))
                break label407;
              localObject1 = SnsTimeLineUI.a(SnsTimeLineUI.this);
              if (j < i)
                break label407;
              localLinkedList = new LinkedList();
              for (paramAnonymousInt = i; paramAnonymousInt <= j; paramAnonymousInt++)
              {
                Object localObject2 = ((com.tencent.mm.plugin.sns.ui.a.a)localObject1).DP(paramAnonymousInt);
                if (localObject2 != null)
                {
                  localObject2 = ((com.tencent.mm.plugin.sns.storage.n)localObject2).cqu();
                  if ((localObject2 != null) && (((TimeLineObject)localObject2).xfI.wbJ == 3))
                  {
                    i1 = -1;
                    if (((TimeLineObject)localObject2).xfI.wbN != null)
                      i1 = ((TimeLineObject)localObject2).xfI.wbN.vGc;
                    ArrayList localArrayList = new ArrayList();
                    localArrayList.add(((TimeLineObject)localObject2).Id);
                    localArrayList.add(bo.bc(((TimeLineObject)localObject2).xfI.Url, ""));
                    localArrayList.add(String.valueOf(i1));
                    localLinkedList.add(localArrayList);
                  }
                }
              }
            }
            ((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).i(localLinkedList, 2);
            label407: if (SnsTimeLineUI.a(SnsTimeLineUI.this) != null)
            {
              localObject1 = SnsTimeLineUI.f(SnsTimeLineUI.this).a(SnsTimeLineUI.a(SnsTimeLineUI.this).rEA);
              com.tencent.mm.vending.g.f.dMn().d(new SnsTimeLineUI.20.1(this, (a.a)localObject1));
            }
            AppMethodBeat.o(39482);
          }
        }

        public final void ad(int paramAnonymousInt, boolean paramAnonymousBoolean)
        {
          AppMethodBeat.i(39483);
          if (SnsTimeLineUI.a(SnsTimeLineUI.this) != null)
            SnsTimeLineUI.a(SnsTimeLineUI.this).rEB.notifyVendingDataChange();
          if (!paramAnonymousBoolean)
            SnsTimeLineUI.this.SK().aG(c.b.class);
          AppMethodBeat.o(39483);
        }

        public final void b(int paramAnonymousInt, List<Integer> paramAnonymousList1, List<Integer> paramAnonymousList2)
        {
          int i = 1;
          AppMethodBeat.i(39478);
          int j = i;
          if (paramAnonymousInt > 0)
          {
            paramAnonymousList1 = af.cnF().DK(paramAnonymousInt);
            j = i;
            if (paramAnonymousList1 != null)
            {
              if (paramAnonymousList1.field_pravited > 0)
                Toast.makeText(SnsTimeLineUI.this, 2131303651, 1).show();
              j = i;
              if (paramAnonymousList1.field_pravited == 1)
                j = 0;
            }
          }
          if (j != 0)
            BackwardSupportUtil.c.a(SnsTimeLineUI.j(SnsTimeLineUI.this).nDp);
          if (SnsTimeLineUI.a(SnsTimeLineUI.this) != null)
            SnsTimeLineUI.a(SnsTimeLineUI.this).rEB.notifyVendingDataChange();
          AppMethodBeat.o(39478);
        }

        public final void cuh()
        {
          AppMethodBeat.i(39473);
          com.tencent.mm.plugin.sns.ui.a.a.b localb = SnsTimeLineUI.o(SnsTimeLineUI.this);
          SnsTimeLineUI.k(SnsTimeLineUI.this);
          localb.e(SnsTimeLineUI.l(SnsTimeLineUI.this), SnsTimeLineUI.m(SnsTimeLineUI.this), false, SnsTimeLineUI.w(SnsTimeLineUI.this));
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xWq, Integer.valueOf(3));
          ab.d("MicroMsg.SnsTimeLineUI", "onLoadingMore here");
          if (SnsTimeLineUI.x(SnsTimeLineUI.this) == null)
          {
            ab.e("MicroMsg.SnsTimeLineUI", "mLogicHandler handler null");
            AppMethodBeat.o(39473);
          }
          while (true)
          {
            return;
            if (SnsTimeLineUI.g(SnsTimeLineUI.this) != null)
            {
              SnsTimeLineUI.x(SnsTimeLineUI.this).removeCallbacks(SnsTimeLineUI.y(SnsTimeLineUI.this));
              SnsTimeLineUI.x(SnsTimeLineUI.this).postDelayed(SnsTimeLineUI.y(SnsTimeLineUI.this), 3000L);
            }
            AppMethodBeat.o(39473);
          }
        }

        public final View cui()
        {
          AppMethodBeat.i(39475);
          if (SnsTimeLineUI.g(SnsTimeLineUI.this).qOM == null)
            SnsTimeLineUI.g(SnsTimeLineUI.this).qOM = ((FrameLayout)SnsTimeLineUI.this.findViewById(2131822759));
          FrameLayout localFrameLayout = SnsTimeLineUI.g(SnsTimeLineUI.this).qOM;
          AppMethodBeat.o(39475);
          return localFrameLayout;
        }

        public final MMPullDownView cuj()
        {
          AppMethodBeat.i(39477);
          MMPullDownView localMMPullDownView = (MMPullDownView)SnsTimeLineUI.this.findViewById(2131822761);
          AppMethodBeat.o(39477);
          return localMMPullDownView;
        }

        public final boolean cuk()
        {
          AppMethodBeat.i(39479);
          boolean bool = SnsTimeLineUI.z(SnsTimeLineUI.this);
          AppMethodBeat.o(39479);
          return bool;
        }

        public final void cul()
        {
          AppMethodBeat.i(39480);
          ab.d("MicroMsg.SnsTimeLineUI", "onLoadingTap");
          SnsTimeLineUI.this.crO();
          if (SnsTimeLineUI.r(SnsTimeLineUI.this) != null)
          {
            ab.d("MicroMsg.SnsTimeLineUI", "refreshIv onLoadingTap");
            SnsTimeLineUI.b(SnsTimeLineUI.this, 0);
          }
          com.tencent.mm.plugin.sns.ui.a.a.b localb = SnsTimeLineUI.o(SnsTimeLineUI.this);
          SnsTimeLineUI.k(SnsTimeLineUI.this);
          localb.d(SnsTimeLineUI.l(SnsTimeLineUI.this), SnsTimeLineUI.m(SnsTimeLineUI.this), SnsTimeLineUI.n(SnsTimeLineUI.this), SnsTimeLineUI.w(SnsTimeLineUI.this));
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xWq, Integer.valueOf(2));
          AppMethodBeat.o(39480);
        }

        public final void cum()
        {
          AppMethodBeat.i(39481);
          SnsTimeLineUI.this.crO();
          AppMethodBeat.o(39481);
        }

        public final void fA(int paramAnonymousInt1, int paramAnonymousInt2)
        {
        }

        public final View getMaskView()
        {
          AppMethodBeat.i(39476);
          View localView = SnsTimeLineUI.this.findViewById(2131827838);
          AppMethodBeat.o(39476);
          return localView;
        }

        public final ListView getSnsListView()
        {
          AppMethodBeat.i(39474);
          if (SnsTimeLineUI.g(SnsTimeLineUI.this).nDp == null)
            SnsTimeLineUI.g(SnsTimeLineUI.this).nDp = ((ListView)SnsTimeLineUI.this.findViewById(2131827740));
          ListView localListView = SnsTimeLineUI.g(SnsTimeLineUI.this).nDp;
          AppMethodBeat.o(39474);
          return localListView;
        }

        public final int getType()
        {
          int i = 1;
          if (SnsTimeLineUI.this.rzl == 1)
            i = 2;
          return i;
        }

        public final void ln(boolean paramAnonymousBoolean)
        {
          AppMethodBeat.i(39484);
          SnsTimeLineUI localSnsTimeLineUI = SnsTimeLineUI.this;
          localSnsTimeLineUI.rzc = paramAnonymousBoolean;
          ak localak = af.bCo();
          com.tencent.mm.plugin.sns.model.g localg = af.cnC();
          com.tencent.mm.plugin.sns.model.b localb = af.cnA();
          if (paramAnonymousBoolean)
          {
            if ((!localg.qHJ) && (!localb.qHJ))
              break label125;
            localak.removeCallbacks(localSnsTimeLineUI.rzd);
            localak.removeCallbacks(localSnsTimeLineUI.rze);
            localak.postDelayed(localSnsTimeLineUI.rzd, 0L);
            AppMethodBeat.o(39484);
          }
          while (true)
          {
            return;
            if ((!localg.qHJ) || (!localb.qHJ))
            {
              localak.removeCallbacks(localSnsTimeLineUI.rzd);
              localak.removeCallbacks(localSnsTimeLineUI.rze);
              localak.postDelayed(localSnsTimeLineUI.rze, 0L);
            }
            label125: AppMethodBeat.o(39484);
          }
        }
      };
      this.rzi = new a.b()
      {
      };
      this.mScreenWidth = 0;
      this.mScreenHeight = 0;
      this.rzj = true;
      this.oes = 0L;
      this.eEO = 0L;
      this.fAq = 0L;
      this.mnM = new com.tencent.matrix.trace.e.b()
      {
        public final void a(String paramAnonymousString, long paramAnonymousLong, int paramAnonymousInt)
        {
          AppMethodBeat.i(39497);
          super.a(paramAnonymousString, paramAnonymousLong, paramAnonymousInt);
          if ((paramAnonymousInt > 0) && (!bo.isNullOrNil(paramAnonymousString)) && (paramAnonymousString.endsWith(SnsTimeLineUI.this.getClass().getSimpleName())))
            SnsTimeLineUI.b(SnsTimeLineUI.this, SnsTimeLineUI.F(SnsTimeLineUI.this) + paramAnonymousInt);
          AppMethodBeat.o(39497);
        }
      };
      this.rzl = 0;
      this.rzm = new SnsTimeLineUI.43(this);
      this.rzp = null;
      this.rzq = new SnsTimeLineUI.52(this);
      this.rzr = false;
      AppMethodBeat.o(39554);
      return;
    }
  }

  private void Eg(int paramInt)
  {
    AppMethodBeat.i(39558);
    if (rza.booleanValue())
      if (paramInt != 0)
        break label65;
    label65: for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.SnsTimeLineUI", "setRefreshAnimVisible %s %s", new Object[] { Boolean.valueOf(bool), bo.dpG().toString() });
      this.ryq.setVisibility(paramInt);
      AppMethodBeat.o(39558);
      return;
    }
  }

  private static void a(SnsTimeLineUI.c paramc)
  {
    AppMethodBeat.i(39585);
    if (paramc.active)
    {
      ab.d("MicroMsg.SnsTimeLineUI", "report weishi: %s", new Object[] { paramc.toString() });
      com.tencent.mm.plugin.report.service.h.pYm.X(15827, paramc.toString());
    }
    AppMethodBeat.o(39585);
  }

  private void cue()
  {
    AppMethodBeat.i(39561);
    if (this.rzl == 1)
      if (!this.rjn)
      {
        enableOptionMenu(false);
        AppMethodBeat.o(39561);
      }
    while (true)
    {
      return;
      b(getString(2131303715), 2131230749, new SnsTimeLineUI.26(this));
      AppMethodBeat.o(39561);
      continue;
      addIconOptionMenu(0, 2131303560, 2131231403, new SnsTimeLineUI.27(this), new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          AppMethodBeat.i(39496);
          if ((SnsTimeLineUI.g(SnsTimeLineUI.this) != null) && (SnsTimeLineUI.g(SnsTimeLineUI.this).rhn != null))
            SnsTimeLineUI.g(SnsTimeLineUI.this).rhn.qMn.kO(true);
          com.tencent.mm.kernel.g.RQ();
          boolean bool = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(7490, Boolean.TRUE)).booleanValue();
          com.tencent.mm.kernel.g.RQ();
          paramAnonymousView = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xLh, null);
          Object localObject;
          if (!bo.isNullOrNil(paramAnonymousView))
          {
            paramAnonymousView = com.tencent.d.f.e.atV(paramAnonymousView);
            localObject = Parcel.obtain();
            ((Parcel)localObject).unmarshall(paramAnonymousView, 0, paramAnonymousView.length);
            ((Parcel)localObject).setDataPosition(0);
            try
            {
              paramAnonymousView = (Intent)Intent.CREATOR.createFromParcel((Parcel)localObject);
              SnsTimeLineUI.this.startActivityForResult(paramAnonymousView, 9);
              AppMethodBeat.o(39496);
              return true;
            }
            catch (Exception paramAnonymousView)
            {
              com.tencent.mm.kernel.g.RQ();
              com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xLh, "");
            }
          }
          if (!bool)
          {
            paramAnonymousView = new Intent();
            paramAnonymousView.setClass(SnsTimeLineUI.this, SnsUploadUI.class);
            paramAnonymousView.putExtra("KSnsPostManu", true);
            paramAnonymousView.putExtra("KTouchCameraTime", bo.anT());
            paramAnonymousView.putExtra("sns_comment_type", 1);
            paramAnonymousView.putExtra("Ksnsupload_type", 9);
            localObject = com.tencent.mm.modelsns.b.lY(705);
            ((com.tencent.mm.modelsns.b)localObject).mc(((com.tencent.mm.modelsns.b)localObject).fQh).ty(System.currentTimeMillis()).mc(((com.tencent.mm.modelsns.b)localObject).fQi).mc(1);
            localObject = com.tencent.mm.plugin.sns.i.g.qTp.b((com.tencent.mm.modelsns.b)localObject);
            ((com.tencent.mm.modelsns.b)localObject).ajK();
            ((com.tencent.mm.modelsns.b)localObject).b(paramAnonymousView, "intent_key_StatisticsOplog");
            SnsTimeLineUI.this.startActivityForResult(paramAnonymousView, 9);
          }
          while (true)
          {
            AppMethodBeat.o(39496);
            break;
            SnsTimeLineUI.this.startActivity(new Intent().setClass(SnsTimeLineUI.this, SnsLongMsgUI.class));
            com.tencent.mm.kernel.g.RQ();
            com.tencent.mm.kernel.g.RP().Ry().set(7490, Boolean.FALSE);
          }
        }
      });
      AppMethodBeat.o(39561);
    }
  }

  private void cuf()
  {
    AppMethodBeat.i(39571);
    b(new SnsTimeLineUI.44(this), new SnsTimeLineUI.46(this));
    setBackBtn(this.rzm, 2131230737);
    AppMethodBeat.o(39571);
  }

  private void cug()
  {
    AppMethodBeat.i(39572);
    if (com.tencent.mm.r.a.bH(this))
      AppMethodBeat.o(39572);
    while (true)
    {
      return;
      boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.CAMERA", 18, "", "");
      ab.i("MicroMsg.SnsTimeLineUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this });
      if (!bool)
      {
        AppMethodBeat.o(39572);
      }
      else
      {
        bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.RECORD_AUDIO", 18, "", "");
        ab.i("MicroMsg.SnsTimeLineUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this });
        if (!bool)
        {
          AppMethodBeat.o(39572);
        }
        else
        {
          String str = bo.anU() + "_" + bo.Mb(5);
          ab.i("MicroMsg.SnsTimeLineUI", "doCpatureMMSight sessionID:%s", new Object[] { str });
          com.tencent.mm.plugin.report.service.h.pYm.e(13822, new Object[] { Integer.valueOf(1), Integer.valueOf(2), str, Long.valueOf(bo.anT()) });
          Intent localIntent = new Intent();
          com.tencent.mm.pluginsdk.ui.tools.n.c(this.mController.ylL, localIntent, str);
          AppMethodBeat.o(39572);
        }
      }
    }
  }

  public final void ZA()
  {
    AppMethodBeat.i(39579);
    SK().aG(c.b.class);
    AppMethodBeat.o(39579);
  }

  public final void Zx()
  {
    AppMethodBeat.i(39575);
    SK().aG(c.b.class);
    AppMethodBeat.o(39575);
  }

  public final void Zy()
  {
  }

  public final void Zz()
  {
    AppMethodBeat.i(39576);
    if (this.rzr)
      AppMethodBeat.o(39576);
    while (true)
    {
      return;
      ab.v("MicroMsg.SnsTimeLineUI", "notifyHbReward imp");
      this.rzr = true;
      af.bCo().postDelayed(new SnsTimeLineUI.54(this), 1000L);
      AppMethodBeat.o(39576);
    }
  }

  public final void a(boolean paramBoolean1, String paramString1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, long paramLong, String paramString2)
  {
    AppMethodBeat.i(39556);
    this.rzf.removeCallbacks(this.ryI);
    com.tencent.mm.vending.g.f.dMn().d(new SnsTimeLineUI.15(this, paramString1)).f(new SnsTimeLineUI.14(this, paramBoolean1, paramBoolean3, paramInt, paramString2, paramLong, paramBoolean2));
    AppMethodBeat.o(39556);
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, boolean paramBoolean3, boolean paramBoolean4, int paramInt, long paramLong, String paramString2)
  {
    AppMethodBeat.i(39555);
    this.rzf.removeCallbacks(this.ryI);
    com.tencent.mm.vending.g.f.dMn().d(new SnsTimeLineUI.13(this, paramString1)).f(new SnsTimeLineUI.11(this, paramBoolean2, paramInt, paramString2, paramBoolean1));
    AppMethodBeat.o(39555);
  }

  public final boolean crO()
  {
    AppMethodBeat.i(39574);
    boolean bool;
    if ((this.ryt == null) || (this.ryt.rhx == null))
    {
      bool = false;
      AppMethodBeat.o(39574);
      return bool;
    }
    if ((this.ryt == null) || (this.ryt.rhy == null));
    while (true)
    {
      com.tencent.mm.plugin.sns.abtest.a.clW();
      bool = this.ryt.rhx.crO();
      AppMethodBeat.o(39574);
      break;
      this.ryt.rhy.cox();
    }
  }

  public final boolean dM(View paramView)
  {
    AppMethodBeat.i(39573);
    this.ryt.rhy.cox();
    bd localbd = this.ryt.rhx;
    boolean bool;
    if (!(paramView.getTag() instanceof BaseTimeLineItem.BaseViewHolder))
    {
      ab.e("MicroMsg.TimeLineCommentHelper", "showCommentBtn err2");
      bool = false;
      AppMethodBeat.o(39573);
    }
    while (true)
    {
      return bool;
      BaseTimeLineItem.BaseViewHolder localBaseViewHolder = (BaseTimeLineItem.BaseViewHolder)paramView.getTag();
      Object localObject1 = localBaseViewHolder.cwT;
      Object localObject2;
      if (localbd.rDJ != null)
      {
        if ((localbd.rDJ.getTag() instanceof bd.a))
        {
          localObject2 = (bd.a)localbd.rDJ.getTag();
          if (((bd.a)localObject2).qPg.equals(localObject1))
          {
            localbd.dP(((bd.a)localObject2).qCZ);
            bool = true;
            AppMethodBeat.o(39573);
          }
          else
          {
            localbd.crO();
          }
        }
        else
        {
          localbd.rDJ = null;
        }
      }
      else
      {
        localbd.rDJ = new SnsCommentShowAbLayout(localbd.mContext);
        com.tencent.mm.sdk.platformtools.n.ci(localbd.rDJ);
        localbd.rDJ.setId(2131820733);
        new FrameLayout.LayoutParams(-1, -1);
        localbd.qOM.addView(localbd.rDJ);
        int i = BackwardSupportUtil.b.b(localbd.mContext, 192.0F);
        int j = BackwardSupportUtil.b.b(localbd.mContext, 76.0F);
        BackwardSupportUtil.b.b(localbd.mContext, 20.0F);
        int k = BackwardSupportUtil.b.b(localbd.mContext, 12.0F);
        int m = BackwardSupportUtil.b.b(localbd.mContext, 40.0F);
        localObject2 = v.hu(localbd.mContext).inflate(2130970750, null);
        new Rect();
        Object localObject3 = new int[2];
        com.tencent.mm.pluginsdk.f.fD(localbd.mContext);
        int n = com.tencent.mm.bz.a.fromDPToPix(localbd.mContext, 6);
        paramView.getLocationInWindow((int[])localObject3);
        localbd.qDY = ae.hA(localbd.mContext);
        ab.d("MicroMsg.TimeLineCommentHelper", "addCommentView getLocationInWindow " + localObject3[0] + "  " + localObject3[1] + " height: " + n + " height_hardcode:" + j + " statusBarHeight: " + localbd.qDY);
        localObject3 = new AbsoluteLayout.LayoutParams(-2, -2, localObject3[0] - i + k, localObject3[1] - n - (m / 2 - paramView.getMeasuredHeight() / 2));
        localObject1 = new bd.a(localbd, (String)localObject1, (View)localObject2);
        localbd.rDJ.setTag(localObject1);
        localbd.rDJ.addView((View)localObject2, (ViewGroup.LayoutParams)localObject3);
        if (localBaseViewHolder.klY == 10)
          ((View)localObject2).findViewById(2131821027).setBackgroundResource(2130838858);
        ((View)localObject2).setVisibility(8);
        new ak().post(new bd.1(localbd, paramView, (View)localObject2));
        bool = true;
        AppMethodBeat.o(39573);
      }
    }
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    int i = 0;
    boolean bool = true;
    AppMethodBeat.i(39559);
    ab.i("MicroMsg.SnsTimeLineUI", "dispatchKeyEvent %s", new Object[] { paramKeyEvent.toString() });
    int j = this.mController.ymc;
    i locali = this.ryt;
    int k = i;
    if (paramKeyEvent.getKeyCode() == 4)
    {
      k = i;
      if (locali.rhq.getVisibility() == 0)
      {
        locali.rhq.setVisibility(8);
        k = 1;
      }
    }
    if ((k != 0) && (j == 2))
      AppMethodBeat.o(39559);
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(39559);
    }
  }

  protected void finalize()
  {
    AppMethodBeat.i(39578);
    ab.d("MicroMsg.SnsTimeLineUI", "finalize");
    super.finalize();
    AppMethodBeat.o(39578);
  }

  public final int getLayoutId()
  {
    return 2130970823;
  }

  public final void initView()
  {
    AppMethodBeat.i(39568);
    this.mUIAction.qQt.setDrawingCacheEnabled(false);
    this.ryt.qOM = ((FrameLayout)findViewById(2131822759));
    int i = af.cnM().position;
    Object localObject = (AdListView)this.mUIAction.getSnsListView();
    ((AdListView)localObject).rfN = this.rqn;
    ((AdListView)localObject).setTimelineStat(this.ryA);
    ((AdListView)localObject).setTimelineEvent(this.ryB);
    this.ryB.a(af.cnw());
    ab.i("MicroMsg.SnsTimeLineUI", "oncreate firstPosition %d isToResume: " + this.rhv, new Object[] { Integer.valueOf(i) });
    this.ryq = ((QFadeImageView)findViewById(2131827926));
    this.ryq.setImageResource(2131231331);
    this.ryu = new SnsTimeLineUI.a(this, this.mUIAction.getSnsListView());
    this.ryu.setInterpolator(new LinearInterpolator());
    this.ryu.setAnimationListener(new SnsTimeLineUI.31(this));
    localObject = null;
    if (this.rzl == 1)
    {
      this.rys = true;
      localObject = new com.tencent.mm.plugin.sns.ui.a.b.d(this.igi, this.rjn);
    }
    this.ryn = new com.tencent.mm.plugin.sns.ui.a.a(this, this.mUIAction.getSnsListView(), this.ryt.rhA, this.ryt, this.ryC, (com.tencent.mm.plugin.sns.ui.a.b.b)localObject);
    this.ryt.rhA.rKo = new au.a()
    {
      public final boolean cud()
      {
        AppMethodBeat.i(39502);
        SnsTimeLineUI.this.SK().aG(c.b.class);
        AppMethodBeat.o(39502);
        return false;
      }
    };
    this.ryt.qPr = this.ryn.rEA;
    this.ryn.rEB.zXa = new b.a()
    {
      public final void cuo()
      {
        AppMethodBeat.i(39503);
        com.tencent.mm.plugin.report.service.g.BN(14);
        AppMethodBeat.o(39503);
      }

      public final void cup()
      {
        AppMethodBeat.i(39504);
        com.tencent.mm.plugin.report.service.g.BO(14);
        AppMethodBeat.o(39504);
      }
    };
    this.ryv = ((TestTimeForSns)this.ryt.qOM);
    this.ryv.setListener(new SnsTimeLineUI.35(this));
    this.mUIAction.nDp.setOnTouchListener(new SnsTimeLineUI.36(this));
    this.mUIAction.nDp.post(new SnsTimeLineUI.37(this));
    this.mUIAction.ooW.setOnSrcollDistance(new SnsTimeLineUI.38(this));
    this.ryt.rhq = ((SnsCommentFooter)findViewById(2131822763));
    this.ryt.rhq.post(new SnsTimeLineUI.39(this));
    this.ryt.rhr = new be(this.mUIAction.nDp, this.ryt.rhq);
    this.ryo = ((LinearLayout)this.mUIAction.qQt.findViewById(2131827775));
    this.ryo.findViewById(2131827778).setOnClickListener(new SnsTimeLineUI.40(this));
    this.ryp = ((LinearLayout)this.mUIAction.qQt.findViewById(2131827777));
    this.ryt.rhs = new an(this);
    cue();
    cuf();
    if (this.rzl == 0)
    {
      setMMTitle(2131303831);
      AppMethodBeat.o(39568);
    }
    while (true)
    {
      return;
      if (!this.rjn)
        break;
      setMMTitle(2131303740);
      Eg(8);
      AppMethodBeat.o(39568);
    }
    ab.d("MicroMsg.SnsTimeLineUI", "SnsUserUI, userName:%s, title:%s", new Object[] { this.igi, this.mUIAction.title });
    localObject = af.cnt().aoO(this.igi);
    if (localObject != null)
      ab.d("MicroMsg.SnsTimeLineUI", "SnsUserUI, contact is not null");
    for (localObject = ((com.tencent.mm.n.a)localObject).Oj(); ; localObject = this.mUIAction.title)
    {
      setMMTitle(com.tencent.mm.plugin.sns.data.i.K((CharSequence)localObject));
      break;
      ab.d("MicroMsg.SnsTimeLineUI", "SnsUserUI, contact is null, title:%s", new Object[] { this.mUIAction.title });
    }
  }

  public final void lm(boolean paramBoolean)
  {
    AppMethodBeat.i(39584);
    if (this.ryn != null)
    {
      ab.i("MicroMsg.SnsTimeLineUI", "set play animation %s", new Object[] { Boolean.valueOf(paramBoolean) });
      com.tencent.mm.plugin.sns.ui.a.a locala = this.ryn;
      locala.rEC = paramBoolean;
      if (!paramBoolean)
        locala.notifyDataSetChanged();
    }
    AppMethodBeat.o(39584);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(39581);
    ab.v("MicroMsg.SnsTimeLineUI", "on ActivityResult, requestCode %d, resultCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 15)
    {
      if ((this.ryt != null) && (this.ryt.rhA != null) && (this.ryt.rhA.rJH != null))
      {
        this.ryt.rhA.rJH.onActivityResult(paramInt1, paramInt2, paramIntent);
        al.n(new SnsTimeLineUI.57(this), 300L);
      }
      AppMethodBeat.o(39581);
    }
    while (true)
    {
      return;
      if (paramInt1 == 16)
      {
        ab.i("MicroMsg.SnsTimeLineUI", "REQUEST_CODE_FOR_FULLSCREEN");
        AppMethodBeat.o(39581);
      }
      else
      {
        if ((paramInt1 == 2333) && (paramIntent != null))
        {
          String str = paramIntent.getStringExtra("Select_Contact");
          if (!bo.isNullOrNil(str))
          {
            String[] arrayOfString = str.split(",");
            if (arrayOfString.length > 0)
            {
              this.ryt.rhq.crP.showVKB();
              str = ((com.tencent.mm.plugin.messenger.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.b.class)).mJ(arrayOfString[0]);
              if (!bo.isNullOrNil(str))
              {
                this.ryt.rhq.ctg();
                this.ryt.rhq.setText("@" + str + " ");
                this.ryt.rhq.setCommentAtPrefix("@" + str + " ");
                this.ryt.rhq.setCommentInfo(new cat());
                this.ryt.rhq.getCommentInfo().vHl = arrayOfString[0];
                this.ryt.rhq.setCommentFlag(8);
              }
            }
          }
        }
        super.onActivityResult(paramInt1, paramInt2, paramIntent);
        this.mUIAction.onActivityResult(paramInt1, paramInt2, paramIntent);
        if (paramInt1 == 11)
        {
          this.rym.d(this.igi, this.ryD, this.rjn, this.ryE);
          AppMethodBeat.o(39581);
        }
        else
        {
          AppMethodBeat.o(39581);
        }
      }
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(39580);
    finish();
    AppMethodBeat.o(39580);
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(39562);
    super.onConfigurationChanged(paramConfiguration);
    ab.i("MicroMsg.SnsTimeLineUI", "onConfigurationChanged");
    com.tencent.mm.sdk.b.a.xxA.m(new bz());
    com.tencent.mm.plugin.sns.ui.widget.e.cvB().rMP = 0;
    com.tencent.mm.plugin.sns.ui.widget.c.cvy().rMP = 0;
    com.tencent.mm.kiss.widget.textview.c.eNj.SN();
    this.ryn.rEA.ctW();
    this.ryn.rEB.resolvedClear();
    AppMethodBeat.o(39562);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(39560);
    if (this.mController != null)
      this.mController.aC(2, true);
    getIntent().setExtrasClassLoader(getClass().getClassLoader());
    com.tencent.mm.pluginsdk.f.m(this);
    this.ylm = true;
    super.onCreate(paramBundle);
    if (!com.tencent.mm.kernel.g.RN().QY())
    {
      finish();
      AppMethodBeat.o(39560);
      return;
    }
    this.plv = findViewById(2131820940);
    Object localObject1;
    Object localObject2;
    Object localObject3;
    label369: Iterator localIterator;
    if ((this.plv == null) || (!com.tencent.mm.ui.statusbar.c.zzP))
    {
      getWindow().getDecorView().setSystemUiVisibility(1280);
      com.tencent.mm.ui.b.c(this, false);
      xE(this.mController.ylL.getResources().getColor(2131690597));
      dyb();
      this.rzl = getIntent().getIntExtra("sns_adapter_type", 0);
      this.rys = getIntent().getBooleanExtra("sns_timeline_NeedFirstLoadint", false);
      this.mActionBar = getSupportActionBar();
      i = com.tencent.mm.model.c.c.abj().en("Sns_Private_Recent_Setting_Guide", 0);
      ab.i("MicroMsg.SnsTimeLineUI", "Sns_Private_Recent_Setting_Guide abtestvalue = ".concat(String.valueOf(i)));
      if (i == 1)
      {
        com.tencent.mm.kernel.g.RQ();
        if (!com.tencent.mm.kernel.g.RP().Ry().getBoolean(ac.a.xQp, false))
        {
          paramBundle = getIntent();
          paramBundle.setClass(this.mController.ylL, SnsSettingIntroduceUI.class);
          startActivity(paramBundle);
          overridePendingTransition(0, 0);
          finish();
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xQp, Boolean.TRUE);
        }
      }
      com.tencent.mm.sdk.g.d.xDG.execute(new SnsTimeLineUI.22(this));
      this.ryl.a(c.b.class, this.rzi);
      localObject1 = this.rym;
      i = this.rzl;
      paramBundle = getIntent();
      localObject2 = this.ryk;
      ((com.tencent.mm.plugin.sns.ui.a.a.b)localObject1).rzl = i;
      ((com.tencent.mm.plugin.sns.ui.a.a.b)localObject1).hasInit = true;
      if (i != 0)
        break label844;
      localObject3 = ((com.tencent.mm.plugin.sns.ui.a.a.b)localObject1).rEQ;
      ((com.tencent.mm.plugin.sns.ui.a.a.a)localObject3).ryk = ((com.tencent.mm.plugin.sns.k.b)localObject2);
      if (localObject2 == null)
        break label839;
      paramBundle = ((com.tencent.mm.plugin.sns.k.b)localObject2).cvE();
      ((com.tencent.mm.plugin.sns.ui.a.a.a)localObject3).ryl = paramBundle;
      ((com.tencent.mm.plugin.sns.ui.a.a.b)localObject1).rEQ.ryl.a(this);
      label386: paramBundle = this.rym;
      if (paramBundle.rzl != 0)
        break label1000;
      paramBundle = (com.tencent.mm.plugin.sns.k.c.a)paramBundle.rEQ.ryl.x(com.tencent.mm.plugin.sns.k.c.a.class);
      label415: this.igi = paramBundle.igi;
      this.ryC = paramBundle.ryC;
      this.ryD = paramBundle.ryD;
      this.rjn = paramBundle.rjn;
      this.ryE = paramBundle.ryE;
      localObject1 = paramBundle.gHT;
      paramBundle = paramBundle.mSignature;
      this.hcl = com.tencent.mm.ui.e.aqC("123");
      this.ryF = String.valueOf(System.currentTimeMillis());
      this.mUIAction = new SnsUIAction(this);
      this.mUIAction.setSessionId(this.hcl);
      this.mUIAction.qSf = this.ryF;
      this.mUIAction.rBP = this.rzh;
      this.mUIAction.rBQ = this.mActionBar.getCustomView();
      ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().il(2);
      com.tencent.mm.plugin.sns.ui.widget.e.cvB().rMP = 0;
      com.tencent.mm.plugin.sns.ui.widget.c.cvy().rMP = 0;
      localObject3 = com.tencent.mm.modelsns.c.fQs;
      com.tencent.mm.modelsns.c.ajL();
      if (!getIntent().getBooleanExtra("is_sns_notify_open", true))
        break label1008;
      i = 1;
      label602: this.ryt = new i(this, i, bo.bc(getIntent().getStringExtra("new_feed_id"), ""), getIntent().getIntExtra("sns_unread_count", 0), this.ryF);
      this.rhv = getIntent().getBooleanExtra("sns_resume_state", true);
      if (!af.cnn())
        break label1013;
      this.rhv = false;
      label671: this.ryr = this.rhv;
      this.mUIAction.a(this.ryC, this.igi, (String)localObject1, paramBundle, this.ryD, this.rjn, this.ryE);
      this.mUIAction.onCreate();
      paramBundle = af.cnw();
      localObject2 = new ArrayList();
      localIterator = com.tencent.mm.model.c.c.abi().aof("10001").values().iterator();
    }
    label1195: 
    while (true)
    {
      if (!localIterator.hasNext())
        break label1197;
      localObject1 = (com.tencent.mm.storage.c)localIterator.next();
      com.tencent.mm.plugin.sns.g.d locald = new com.tencent.mm.plugin.sns.g.d();
      if (localObject1 == null)
      {
        ab.i("MicroMsg.SnsABTestStrategy", "abtest is null");
        continue;
        localObject1 = com.tencent.mm.ui.statusbar.c.az(this);
        paramBundle = new SnsTimeLineUI.16(this);
        this.plx = paramBundle;
        ((com.tencent.mm.ui.statusbar.c)localObject1).a(paramBundle);
        getWindow().getDecorView().requestApplyInsets();
        com.tencent.mm.ui.statusbar.d.a(getWindow());
        break;
        label839: paramBundle = null;
        break label369;
        label844: ((com.tencent.mm.plugin.sns.ui.a.a.b)localObject1).rER = new com.tencent.mm.plugin.sns.k.c.a();
        ((com.tencent.mm.plugin.sns.ui.a.a.b)localObject1).rER.igi = paramBundle.getStringExtra("sns_userName");
        ((com.tencent.mm.plugin.sns.ui.a.a.b)localObject1).rER.ryC = com.tencent.mm.model.r.Yz();
        localObject3 = ((com.tencent.mm.plugin.sns.ui.a.a.b)localObject1).rER;
        com.tencent.mm.kernel.g.RQ();
        ((com.tencent.mm.plugin.sns.k.c.a)localObject3).ryD = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoJ(((com.tencent.mm.plugin.sns.ui.a.a.b)localObject1).rER.igi);
        localObject3 = com.tencent.mm.model.r.Yz();
        ((com.tencent.mm.plugin.sns.ui.a.a.b)localObject1).rER.rjn = ((String)localObject3).equals(((com.tencent.mm.plugin.sns.ui.a.a.b)localObject1).rER.igi);
        ((com.tencent.mm.plugin.sns.ui.a.a.b)localObject1).rER.ryE = paramBundle.getIntExtra("sns_source", 0);
        ((com.tencent.mm.plugin.sns.ui.a.a.b)localObject1).rER.gHT = bo.bc(paramBundle.getStringExtra("sns_nickName"), "");
        ((com.tencent.mm.plugin.sns.ui.a.a.b)localObject1).rER.mSignature = bo.bc(paramBundle.getStringExtra("sns_signature"), "");
        break label386;
        label1000: paramBundle = paramBundle.rER;
        break label415;
        label1008: i = 0;
        break label602;
        label1013: if (!this.rhv)
          break label671;
        this.rhv = af.cnM().csu();
        break label671;
      }
      if (!((com.tencent.mm.storage.c)localObject1).isValid())
      {
        ab.i("MicroMsg.SnsABTestStrategy", "abtest is invalid");
      }
      else
      {
        localObject3 = ((com.tencent.mm.storage.c)localObject1).dru();
        if (localObject3 != null)
        {
          ab.i("MicroMsg.SnsABTestStrategy", "snsabtest feed " + ((com.tencent.mm.storage.c)localObject1).field_expId + " " + ((com.tencent.mm.storage.c)localObject1).field_layerId + " " + ((com.tencent.mm.storage.c)localObject1).field_startTime + " " + ((com.tencent.mm.storage.c)localObject1).field_endTime);
          locald.h(((com.tencent.mm.storage.c)localObject1).field_layerId, ((com.tencent.mm.storage.c)localObject1).field_expId, (Map)localObject3);
          if ((locald.cwB) && (locald.qPP != null) && (locald.qPP.size() > 0));
          for (i = 1; ; i = 0)
          {
            if (i == 0)
              break label1195;
            ((List)localObject2).add(locald);
            break;
          }
        }
      }
    }
    label1197: paramBundle.qPp = ((List)localObject2);
    paramBundle.qPs.clear();
    paramBundle.qPt.clear();
    paramBundle.qPv.clear();
    paramBundle.qJD = null;
    if ((paramBundle.qPp == null) || (paramBundle.qPp.size() == 0))
    {
      label1250: com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(213, this);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(682, this);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(218, this);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(211, this);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(683, this);
      initView();
      localObject1 = af.cnw();
      localObject3 = this.mUIAction.nDp;
      paramBundle = this.ryn.rEA;
      ((com.tencent.mm.plugin.sns.g.c)localObject1).qPq = ((ListView)localObject3);
      ((com.tencent.mm.plugin.sns.g.c)localObject1).qPr = paramBundle;
      paramBundle = af.cnw();
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(291, paramBundle);
      this.ryt.mmO = ((ClipboardManager)ah.getContext().getSystemService("clipboard"));
      if (!af.cnn())
        break label2656;
      this.rhv = false;
      label1422: paramBundle = this.ryl;
      paramBundle.rEB = this.ryn.rEB;
      localObject1 = paramBundle.rEB;
      paramBundle.zWY.keep((com.tencent.mm.vending.e.a)localObject1);
      if ((!this.rhv) || (this.rzl != 0))
        break label2676;
      this.rys = false;
      int j = af.cnM().position;
      this.ryn.rEB.ZL(af.cnM().lQD);
      this.ryn.rEB.ZK(af.cnM().rmL);
      this.ryn.rEB.cuQ();
      this.ryn.sg();
      i = j;
      if (j >= this.ryn.getCount())
      {
        i = this.ryn.getCount() - 1;
        ab.e("MicroMsg.SnsTimeLineUI", "error position %s", new Object[] { Integer.valueOf(this.ryn.getCount()) });
      }
      this.mUIAction.nDp.setAdapter(this.ryn);
      ab.d("MicroMsg.SnsTimeLineUI", "resume position %s", new Object[] { Integer.valueOf(af.cnM().rmM) });
      this.mUIAction.nDp.setSelectionFromTop(i, af.cnM().rmM);
      Eg(4);
      label1639: i = this.ryn.getCount();
      j = this.mUIAction.nDp.getFirstVisiblePosition();
      if (j < i)
        this.ryy = com.tencent.mm.plugin.sns.data.i.j(this.ryn.DP(j));
      com.tencent.mm.kernel.g.RQ();
      this.ryw = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(327776, Integer.valueOf(0))).intValue();
      this.ryt.rhx = new bd(this, this.ryn.rEA, this.ryt.qOM);
      this.ryt.rhz = new com.tencent.mm.plugin.sns.g.b(this, this.ryn.rEA.qOL, this.ryt.qOM);
      this.ryt.rhy = new b(this, this.ryn.rEA.qOL, this.ryt.qOM, this.ryt.rhz);
      if (this.ryB != null)
        this.ryB.a(this.ryt.rhz);
      if (i > 0)
      {
        paramBundle = this.ryn.DP(0);
        if ((this.ryt.rhn != null) && (this.ryt.rhn.qMn != null))
          this.ryt.rhn.qMn.qQP = paramBundle.field_snsId;
        paramBundle = com.tencent.mm.plugin.sns.i.e.qTd;
        if (paramBundle.eFs != 0)
        {
          if (paramBundle.qTe.isEmpty())
          {
            paramBundle.ecO.setLong(2, bo.anT());
            paramBundle.qTf.clear();
          }
          ab.i("MicroMsg.SnsReportHelper", "enterTimeLine exposureFeedSize %d", new Object[] { Integer.valueOf(paramBundle.qTe.size()) });
        }
      }
      com.tencent.mm.plugin.report.service.h.pYm.X(13312, "1," + bo.anU());
      com.tencent.mm.sdk.b.a.xxA.c(this.ryJ);
      if (getIntent().getBooleanExtra("is_need_resend_sns", false))
      {
        al.n(new SnsTimeLineUI.24(this), 500L);
        getIntent().putExtra("is_need_resend_sns", false);
      }
      com.tencent.mm.kernel.g.RQ();
      if (com.tencent.mm.kernel.g.RN().QY())
      {
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RP().Ry().set(589825, Boolean.FALSE);
      }
      this.ryt.rhm = this.rqn;
      this.rqn.a(this.mUIAction.qDc, this.mActionBar.getCustomView(), this);
      com.tencent.mm.sdk.b.a.xxA.c(this.ryO);
      com.tencent.mm.sdk.b.a.xxA.c(this.ryP);
      com.tencent.mm.sdk.b.a.xxA.c(this.ryQ);
      com.tencent.mm.sdk.b.a.xxA.c(this.ryR);
      com.tencent.mm.sdk.b.a.xxA.c(this.ryS);
      com.tencent.mm.sdk.b.a.xxA.c(this.ryU);
      com.tencent.mm.sdk.b.a.xxA.c(this.ryT);
      com.tencent.mm.sdk.b.a.xxA.c(this.qMM);
      com.tencent.mm.sdk.b.a.xxA.c(this.ryV);
      com.tencent.mm.sdk.b.a.xxA.c(this.ryW);
      com.tencent.mm.sdk.b.a.xxA.c(this.ryY);
      com.tencent.mm.sdk.b.a.xxA.c(this.ryX);
      com.tencent.mm.sdk.b.a.xxA.c(this.ryZ);
      com.tencent.mm.plugin.sns.abtest.c.cmb();
      com.tencent.mm.plugin.sns.abtest.a.c(this, this.ryt.qOM);
      if (this.ryz != null)
      {
        paramBundle = this.ryz;
        localObject1 = this.mUIAction.nDp;
        localObject3 = this.mUIAction.qQt;
        paramBundle.gKd = ((ListView)localObject1);
        paramBundle.qQt = ((SnsHeader)localObject3);
      }
      if ((this.ryt != null) && (this.ryt.rhn != null))
      {
        paramBundle = this.ryt.rhn.qMn;
        ab.i("MicroMsg.SnsBrowseInfoHelper", "onTimelineCreate");
        paramBundle.qQO = true;
        paramBundle.qSM = System.currentTimeMillis();
      }
      boolean bool = getIntent().getBooleanExtra("enter_by_red", false);
      if ((this.ryt != null) && (this.ryt.rhn != null))
      {
        paramBundle = this.ryt.rhn.qMn;
        if (!bool)
          break label2705;
      }
    }
    label2705: for (int i = 1; ; i = 0)
    {
      while (true)
      {
        paramBundle.qRb = i;
        af.cnC().qIc.clear();
        if ((this.mUIAction != null) && (this.mUIAction.qQt != null))
          this.mUIAction.qQt.setStoryAction(new SnsTimeLineUI.25(this));
        com.tencent.mm.sdk.b.a.xxA.c(this.ryK);
        AppMethodBeat.o(39560);
        break;
        long l = System.currentTimeMillis();
        localObject1 = new StringBuilder();
        com.tencent.mm.kernel.g.RQ();
        localObject1 = com.tencent.mm.kernel.g.RP().cachePath + "ws_1100004";
        ab.i("MicroMsg.SnSABTestMgr", "filepath to list  ".concat(String.valueOf(localObject1)));
        localObject2 = com.tencent.mm.vfs.e.e((String)localObject1, 0, -1);
        if (localObject2 == null)
          break label1250;
        try
        {
          localObject3 = new com/tencent/mm/plugin/sns/h/c;
          ((com.tencent.mm.plugin.sns.h.c)localObject3).<init>();
          paramBundle.qJD = ((com.tencent.mm.plugin.sns.h.c)((com.tencent.mm.plugin.sns.h.c)localObject3).parseFrom((byte[])localObject2));
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("fileToList ");
          ab.i("MicroMsg.SnSABTestMgr", System.currentTimeMillis() - l);
          if (paramBundle.qJD != null)
            break label2621;
          ab.i("MicroMsg.SnSABTestMgr", "igNoreAbTestId parser error");
        }
        catch (IOException paramBundle)
        {
          ab.printErrStackTrace("MicroMsg.SnSABTestMgr", paramBundle, "", new Object[0]);
          com.tencent.mm.vfs.e.deleteFile((String)localObject1);
        }
      }
      break label1250;
      label2621: ab.i("MicroMsg.SnSABTestMgr", "igNoreAbTestId size " + paramBundle.qJD.qQf.size());
      break label1250;
      label2656: if (!this.rhv)
        break label1422;
      this.rhv = af.cnM().csu();
      break label1422;
      label2676: this.mUIAction.nDp.setAdapter(this.ryn);
      Eg(0);
      this.ryn.sg();
      break label1639;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(39563);
    this.ryx = true;
    ab.i("MicroMsg.SnsTimeLineUI", "timeline on destroy");
    com.tencent.mm.sdk.b.a.xxA.d(this.ryO);
    com.tencent.mm.sdk.b.a.xxA.d(this.ryP);
    com.tencent.mm.sdk.b.a.xxA.d(this.ryQ);
    com.tencent.mm.sdk.b.a.xxA.d(this.ryR);
    com.tencent.mm.sdk.b.a.xxA.d(this.ryS);
    com.tencent.mm.sdk.b.a.xxA.d(this.ryU);
    com.tencent.mm.sdk.b.a.xxA.d(this.ryT);
    com.tencent.mm.sdk.b.a.xxA.d(this.qMM);
    com.tencent.mm.sdk.b.a.xxA.d(this.ryV);
    com.tencent.mm.sdk.b.a.xxA.d(this.ryW);
    com.tencent.mm.sdk.b.a.xxA.d(this.ryX);
    com.tencent.mm.sdk.b.a.xxA.d(this.ryY);
    com.tencent.mm.sdk.b.a.xxA.d(this.ryZ);
    com.tencent.mm.sdk.b.a.xxA.d(this.ryK);
    com.tencent.mm.plugin.sns.ui.e.a.cvo();
    long l;
    label346: Object localObject4;
    if ((this.ryt != null) && (this.ryt.rhn != null))
    {
      localObject1 = this.ryt.rhn.qMn;
      if (this.ryL)
      {
        i = 1;
        ((com.tencent.mm.plugin.sns.i.b)localObject1).qRc = i;
      }
    }
    else
    {
      localObject2 = com.tencent.mm.plugin.sns.i.e.qTd;
      if (((com.tencent.mm.plugin.sns.i.e)localObject2).eFs == 0)
        break label653;
      ab.i("MicroMsg.SnsReportHelper", "exitTimeline exposureFeedSize %d, exposureAppIdSize %d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.sns.i.e)localObject2).qTe.size()), Integer.valueOf(((com.tencent.mm.plugin.sns.i.e)localObject2).qTf.size()) });
      l = ((com.tencent.mm.plugin.sns.i.e)localObject2).ecO.getLong(2, 0L);
      if ((((com.tencent.mm.plugin.sns.i.e)localObject2).qTe.isEmpty()) || ((((com.tencent.mm.plugin.sns.i.e)localObject2).qTe.size() <= ((com.tencent.mm.plugin.sns.i.e)localObject2).qTj) && (bo.fp(l) <= ((com.tencent.mm.plugin.sns.i.e)localObject2).qTk)))
        break label1417;
      localObject3 = new StringBuffer();
      Iterator localIterator = ((com.tencent.mm.plugin.sns.i.e)localObject2).qTe.keySet().iterator();
      i = 0;
      j = 0;
      if (!localIterator.hasNext())
        break label495;
      localObject4 = (String)localIterator.next();
      localObject1 = (String)((com.tencent.mm.plugin.sns.i.e)localObject2).qTf.get(localObject4);
      if (bo.isNullOrNil((String)localObject1))
        break label483;
      j = 1;
      label391: if (!((com.tencent.mm.plugin.sns.i.e)localObject2).qTg.contains(localObject4))
        break label489;
    }
    label483: label489: for (int k = 1; ; k = 0)
    {
      ((StringBuffer)localObject3).append((String)localObject4 + "#" + ((com.tencent.mm.plugin.sns.i.e)localObject2).qTe.get(localObject4) + "#" + (String)localObject1 + "#" + k + "|");
      i++;
      break label346;
      i = 0;
      break;
      localObject1 = "";
      break label391;
    }
    label495: ((StringBuffer)localObject3).append("," + l + "," + bo.anT() + ",1," + j + "," + i + ",1");
    ab.v("MicroMsg.SnsReportHelper", "report(13226) %d: %s", new Object[] { Integer.valueOf(13226), localObject3 });
    com.tencent.mm.plugin.report.service.h.pYm.X(13226, ((StringBuffer)localObject3).toString());
    ((com.tencent.mm.plugin.sns.i.e)localObject2).ecO.set(3, null);
    ((com.tencent.mm.plugin.sns.i.e)localObject2).ecO.set(4, null);
    ((com.tencent.mm.plugin.sns.i.e)localObject2).qTe.clear();
    ((com.tencent.mm.plugin.sns.i.e)localObject2).qTf.clear();
    ((com.tencent.mm.plugin.sns.i.e)localObject2).qTg.clear();
    ((com.tencent.mm.plugin.sns.i.e)localObject2).ecO.setLong(2, bo.anT());
    ((com.tencent.mm.plugin.sns.i.e)localObject2).coG();
    label653: com.tencent.mm.kernel.g.RQ();
    Object localObject2 = (String)com.tencent.mm.kernel.g.RP().Ry().get(68377, null);
    int i = this.ryn.getCount();
    Object localObject1 = "";
    Object localObject3 = null;
    if (i > 0)
    {
      localObject3 = this.ryn.DP(i - 1);
      localObject1 = com.tencent.mm.plugin.sns.data.i.j((com.tencent.mm.plugin.sns.storage.n)localObject3);
    }
    if ((this.ryt != null) && (this.ryt.rhn != null))
    {
      localObject4 = this.ryt.rhn.qMn;
      if (localObject3 == null)
      {
        i = -1;
        label746: ab.i("MicroMsg.SnsBrowseInfoHelper", "onTimelineDestroy");
        l = System.currentTimeMillis() - ((com.tencent.mm.plugin.sns.i.b)localObject4).qSM;
        ((com.tencent.mm.plugin.sns.i.b)localObject4).qQQ += l;
        ab.i("MicroMsg.SnsBrowseInfoHelper", "onTimelineEns passedtime: " + l + " BrowseTime: " + ((com.tencent.mm.plugin.sns.i.b)localObject4).qQQ + "BackgroundTime: " + ((com.tencent.mm.plugin.sns.i.b)localObject4).qRz);
        localObject3 = af.cns();
        if (localObject3 != null)
          ((com.tencent.mm.sdk.g.b.a)localObject3).execute(new b.2((com.tencent.mm.plugin.sns.i.b)localObject4, i));
        ((com.tencent.mm.plugin.sns.i.b)localObject4).qQO = false;
      }
    }
    else
    {
      localObject3 = com.tencent.mm.modelsns.b.lY(704);
      if (((com.tencent.mm.modelsns.b)localObject3).ajG())
      {
        ((com.tencent.mm.modelsns.b)localObject3).cS(this.ryL);
        if (bo.isNullOrNil((String)localObject2))
          break label1465;
      }
    }
    int m;
    label1417: label1465: for (boolean bool = true; ; bool = false)
    {
      ((com.tencent.mm.modelsns.b)localObject3).cS(bool);
      ((com.tencent.mm.modelsns.b)localObject3).tx(this.ryy);
      ((com.tencent.mm.modelsns.b)localObject3).tx((String)localObject1);
      ((com.tencent.mm.modelsns.b)localObject3).tx((String)localObject1);
      ((com.tencent.mm.modelsns.b)localObject3).mb(this.mUIAction.rBO);
      ((com.tencent.mm.modelsns.b)localObject3).tx("");
      com.tencent.mm.modelsns.b.ajJ();
      ((com.tencent.mm.modelsns.b)localObject3).ajK();
      localObject3 = (AdListView)this.mUIAction.getSnsListView();
      this.ryB.qNf.clear();
      af.cnw().clean();
      localObject1 = af.cnz();
      af.cns().execute(new i.5((com.tencent.mm.plugin.sns.a.b.i)localObject1));
      ((AdListView)localObject3).rfN.clear();
      ((AdListView)localObject3).rfN = null;
      ((AdListView)localObject3).rfO.cmU();
      ((AdListView)localObject3).rfO = null;
      u.cmZ();
      if (!af.cnn())
        this.rzf.removeCallbacks(this.ryI);
      com.tencent.mm.kernel.g.RQ();
      if (com.tencent.mm.kernel.g.RN().QY())
      {
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.b(213, this);
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.b(682, this);
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.b(218, this);
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.b(211, this);
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.b(683, this);
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RP().Ry().set(327776, Integer.valueOf(this.ryw));
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RP().Ry().set(589825, Boolean.FALSE);
      }
      if (this.ryt != null)
      {
        localObject1 = this.ryt;
        ((i)localObject1).rhA.removeListener();
        if (((i)localObject1).rhq != null)
          ((i)localObject1).rhq.bMO();
        com.tencent.mm.sdk.b.a.xxA.d(((i)localObject1).rhC);
        com.tencent.mm.sdk.b.a.xxA.d(((i)localObject1).rhD);
      }
      af.bCo().removeCallbacks(this.rzg);
      if (this.ryn == null)
        break label1752;
      m = this.mUIAction.nDp.getFirstVisiblePosition();
      i = 0;
      k = 0;
      while (k < this.mUIAction.nDp.getCount())
      {
        localObject3 = this.mUIAction.nDp.getChildAt(k);
        j = i;
        if (localObject3 != null)
        {
          int n = this.mUIAction.nDp.getPositionForView((View)localObject3);
          j = i;
          if (n == m)
          {
            localObject1 = new int[2];
            ((View)localObject3).getLocationInWindow((int[])localObject1);
            ab.d("MicroMsg.SnsTimeLineUI", "this is the pos for view %d x %d y %d", new Object[] { Integer.valueOf(n), Integer.valueOf(localObject1[0]), Integer.valueOf(localObject1[1]) });
            j = localObject1[1];
          }
        }
        k++;
        i = j;
      }
      ((com.tencent.mm.plugin.sns.i.e)localObject2).ecO.set(3, ((com.tencent.mm.plugin.sns.i.e)localObject2).qTe);
      ((com.tencent.mm.plugin.sns.i.e)localObject2).ecO.set(4, ((com.tencent.mm.plugin.sns.i.e)localObject2).qTf);
      ((com.tencent.mm.plugin.sns.i.e)localObject2).ecO.set(5, ((com.tencent.mm.plugin.sns.i.e)localObject2).qTg);
      break;
      i = ((com.tencent.mm.plugin.sns.storage.n)localObject3).field_createTime;
      break label746;
    }
    int j = getResources().getDimensionPixelSize(2131428677);
    if ((!af.cnn()) && (this.ryl.cnv() != null) && (this.rzl == 0))
    {
      localObject1 = af.cnM();
      localObject3 = this.ryn.rEB.cuO();
      localObject2 = this.ryn.rEB.cuP();
      l = this.ryl.cnv().qMB;
      ((ai)localObject1).rmK = bo.yz();
      ((ai)localObject1).lQD = ((String)localObject3);
      ((ai)localObject1).rmL = ((String)localObject2);
      ((ai)localObject1).qMB = l;
      ((ai)localObject1).position = m;
      ((ai)localObject1).rmM = (i - j);
      ab.i("MicroMsg.ResumeSnsControl", "lastSnsTime %s limitSeq %s respMinSeq %s timeLastId %s position %s topy %s", new Object[] { Long.valueOf(((ai)localObject1).rmK), localObject3, localObject2, Long.valueOf(l), Integer.valueOf(m), Integer.valueOf(((ai)localObject1).rmM) });
    }
    ab.d("MicroMsg.SnsTimeLineUI", "top h %d", new Object[] { Integer.valueOf(i - j) });
    localObject1 = this.ryn.rEA;
    com.tencent.mm.sdk.b.a.xxA.d(((au)localObject1).hAA);
    if (af.cnn())
      ab.e("MicroMsg.SnsTimeLineBaseAdapter", "is invalid to getSnsInfoStorage");
    while (true)
    {
      localObject1 = this.ryn.rEA;
      if (((au)localObject1).rqd != null)
        ((au)localObject1).rqd.activity = null;
      localObject1 = this.ryn.rEA;
      com.tencent.mm.sdk.b.a.xxA.d(((au)localObject1).hAA);
      this.ryn.rEA.ctZ();
      label1752: aw.clean();
      com.tencent.mm.sdk.b.a.xxA.d(this.ryJ);
      com.tencent.mm.kernel.g.RQ();
      if (com.tencent.mm.kernel.g.RN().QY())
        af.cnC().qIc.clear();
      localObject1 = this.ryn;
      ((com.tencent.mm.plugin.sns.ui.a.a)localObject1).rEB.removeVendingDataChangedCallback(((com.tencent.mm.plugin.sns.ui.a.a)localObject1).rED);
      ((com.tencent.mm.plugin.sns.ui.a.a)localObject1).rED = null;
      this.ryn = null;
      this.ryt = null;
      com.tencent.mm.plugin.sns.ui.a.a.cuM();
      com.tencent.mm.plugin.sns.abtest.c.cmc();
      localObject1 = af.cnw();
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.b(291, (t)localObject1);
      com.tencent.mm.plugin.sns.abtest.a.clean();
      this.mUIAction.onDestroy();
      super.onDestroy();
      com.tencent.mm.kiss.widget.textview.c.eNj.SN();
      localObject1 = this.rym;
      ((com.tencent.mm.plugin.sns.ui.a.a.b)localObject1).rER = null;
      ((com.tencent.mm.plugin.sns.ui.a.a.b)localObject1).hasInit = false;
      localObject1 = af.cnA();
      if (!((com.tencent.mm.plugin.sns.model.b)localObject1).qHN.isEmpty())
        ((com.tencent.mm.plugin.sns.model.b)localObject1).qHN.clear();
      localObject1 = af.cnA();
      if (!((com.tencent.mm.plugin.sns.model.b)localObject1).qHO.isEmpty())
        ((com.tencent.mm.plugin.sns.model.b)localObject1).qHO.clear();
      AppMethodBeat.o(39563);
      return;
      af.cnC();
    }
  }

  public void onDrag()
  {
    AppMethodBeat.i(39583);
    super.onDrag();
    AppMethodBeat.o(39583);
  }

  public final void onKeyboardStateChanged()
  {
    AppMethodBeat.i(39569);
    super.onKeyboardStateChanged();
    al.d(new SnsTimeLineUI.41(this));
    if (this.mController.ymc == 2)
    {
      if ((this.ryt == null) || (this.ryt.rhq == null) || (this.ryt.rhq.cte()))
        break label120;
      ab.i("MicroMsg.SnsTimeLineUI", "onKeyBoardStateChange find");
      AppMethodBeat.o(39569);
    }
    while (true)
    {
      return;
      if ((this.mController.ymc == 1) && (this.ryt != null))
      {
        i locali = this.ryt;
        if (locali.rho)
        {
          locali.rho = false;
          locali.rhr.cuK();
        }
      }
      label120: AppMethodBeat.o(39569);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(39567);
    this.ryq.clearAnimation();
    WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcSNSScrollEnable, this.ehv);
    this.ehv = 0;
    u.b(this);
    af.cnC().qIe = null;
    Object localObject = new tn();
    ((tn)localObject).cPI.type = 1;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    if (this.ryn != null)
    {
      localObject = this.ryn.rEA;
      com.tencent.mm.sdk.b.a.xxA.d(((au)localObject).rqz);
      com.tencent.mm.sdk.b.a.xxA.d(((au)localObject).rqy);
      com.tencent.mm.sdk.b.a.xxA.d(((au)localObject).rqA);
    }
    if ((this.ryt != null) && (this.ryt.rhm != null))
      this.ryt.rhm.onPause();
    if ((this.ryt != null) && (this.ryt.rhn != null))
      this.ryt.rhn.qMn.kK(false);
    com.tencent.mm.modelstat.d.h("SnsTimeLineUI", this.oes, bo.anT());
    this.mUIAction.onPause();
    super.onPause();
    com.tencent.mm.sdk.b.a.xxA.d(this.ryN);
    com.tencent.mm.sdk.b.a.xxA.d(this.ryM);
    if ((com.tencent.matrix.a.isInstalled()) && (com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class) != null))
    {
      localObject = ((com.tencent.matrix.trace.a)com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class)).bYx;
      if (localObject != null)
        ((com.tencent.matrix.trace.f.c)localObject).b(this.mnM);
    }
    if (bo.anT() > this.fAq);
    for (long l = bo.anT() - this.fAq; ; l = 1L)
    {
      this.fAq = l;
      WXHardCoderJNI.reportFPS(701, WXHardCoderJNI.hcSNSScrollAction, 1, this.eEO, this.fAq);
      this.eEO = 0L;
      this.fAq = 0L;
      AppMethodBeat.o(39567);
      return;
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(39582);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.SnsTimeLineUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(39582);
      return;
    }
    ab.i("MicroMsg.SnsTimeLineUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 18:
    }
    label222: 
    while (true)
    {
      AppMethodBeat.o(39582);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        cug();
        AppMethodBeat.o(39582);
        break;
      }
      if ("android.permission.CAMERA".equals(paramArrayOfString[0]));
      for (paramInt = 2131301920; ; paramInt = 2131301928)
      {
        if (paramArrayOfInt[0] == 0)
          break label222;
        com.tencent.mm.ui.base.h.a(this, getString(paramInt), getString(2131301936), getString(2131300878), getString(2131296868), false, new SnsTimeLineUI.58(this), new SnsTimeLineUI.59(this));
        break;
      }
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(39564);
    this.fAq = bo.anT();
    Object localObject1;
    if ((com.tencent.matrix.a.isInstalled()) && (com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class) != null))
    {
      localObject1 = ((com.tencent.matrix.trace.a)com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class)).bYx;
      if (localObject1 != null)
        ((com.tencent.matrix.trace.f.c)localObject1).a(this.mnM);
    }
    if ((com.tencent.mm.sdk.a.b.dnO()) && (com.tencent.mm.sdk.a.b.dnM()))
      sUILeaksRoutineEnsuranceRef.add(this);
    this.mUIAction.onResume();
    super.onResume();
    this.oes = bo.anT();
    int i;
    Object localObject2;
    com.tencent.mm.plugin.sns.storage.n localn;
    if (this.rzj)
    {
      this.rzj = false;
      i = this.ryn.getCount();
      if (getIntent().getBooleanExtra("is_from_find_more", false))
      {
        localObject2 = com.tencent.mm.modelsns.b.c(getIntent(), "enter_log");
        if (localObject2 != null)
        {
          if (i <= 0)
            break label717;
          localn = this.ryn.DP(0);
          if (localn != null)
            break label683;
          localObject1 = "0";
          ((com.tencent.mm.modelsns.b)localObject2).tx((String)localObject1);
          if (localn != null)
            break label695;
          localObject1 = "0";
          label186: ((com.tencent.mm.modelsns.b)localObject2).tx((String)localObject1);
          ((com.tencent.mm.modelsns.b)localObject2).tx(String.valueOf(i));
          label201: ((com.tencent.mm.modelsns.b)localObject2).ajK();
        }
      }
    }
    if (this.mScreenWidth == 0)
    {
      localObject1 = new DisplayMetrics();
      getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject1);
      this.mScreenWidth = ((DisplayMetrics)localObject1).widthPixels;
      this.mScreenHeight = ((DisplayMetrics)localObject1).heightPixels;
      localObject1 = this.ryz;
      int j = this.mScreenWidth;
      i = this.mScreenHeight;
      ((com.tencent.mm.plugin.sns.i.a)localObject1).mScreenWidth = j;
      ((com.tencent.mm.plugin.sns.i.a)localObject1).mScreenHeight = i;
    }
    if (af.cnn())
      finish();
    af.cnC().qIe = this.ryn.rEA;
    SK().aG(c.b.class);
    u.a(this);
    if (this.rys)
      this.ryq.post(new SnsTimeLineUI.30(this));
    while (true)
    {
      localObject1 = new tn();
      ((tn)localObject1).cPI.cPJ = this.mUIAction.nDp.getFirstVisiblePosition();
      ((tn)localObject1).cPI.cPK = this.mUIAction.nDp.getLastVisiblePosition();
      ((tn)localObject1).cPI.cPL = this.mUIAction.nDp.getHeaderViewsCount();
      ((tn)localObject1).cPI.type = 0;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      if ((this.ryt != null) && (this.ryt.rhm != null))
        this.ryt.rhm.onResume();
      if (this.ryn != null)
      {
        localObject1 = this.ryn.rEA;
        com.tencent.mm.sdk.b.a.xxA.c(((au)localObject1).rqz);
        com.tencent.mm.sdk.b.a.xxA.c(((au)localObject1).rqy);
        com.tencent.mm.sdk.b.a.xxA.c(((au)localObject1).rqA);
      }
      if ((this.ryt != null) && (this.ryt.rhn != null))
      {
        this.ryt.rhn.qMn.kK(true);
        this.ryt.rhn.qMn.kL(false);
        this.ryt.rhn.qMn.kM(false);
        this.ryt.rhn.qMn.kN(false);
        this.ryt.rhn.qMn.kX(false);
        localObject1 = this.ryt.rhn.qMn;
        ((com.tencent.mm.plugin.sns.i.b)localObject1).kV(false);
        ((com.tencent.mm.plugin.sns.i.b)localObject1).kW(false);
        ((com.tencent.mm.plugin.sns.i.b)localObject1).kP(false);
        ((com.tencent.mm.plugin.sns.i.b)localObject1).kU(false);
        ((com.tencent.mm.plugin.sns.i.b)localObject1).kS(false);
        ((com.tencent.mm.plugin.sns.i.b)localObject1).kU(false);
        ((com.tencent.mm.plugin.sns.i.b)localObject1).kY(false);
        ((com.tencent.mm.plugin.sns.i.b)localObject1).kT(false);
        ((com.tencent.mm.plugin.sns.i.b)localObject1).kU(false);
        ((com.tencent.mm.plugin.sns.i.b)localObject1).kQ(false);
        ((com.tencent.mm.plugin.sns.i.b)localObject1).kR(false);
      }
      localObject1 = af.cnC();
      ((com.tencent.mm.plugin.sns.model.g)localObject1).qIf = 0L;
      ((com.tencent.mm.plugin.sns.model.g)localObject1).qIg = 0L;
      com.tencent.mm.sdk.b.a.xxA.c(this.ryN);
      com.tencent.mm.sdk.b.a.xxA.c(this.ryM);
      AppMethodBeat.o(39564);
      return;
      label683: localObject1 = com.tencent.mm.plugin.sns.data.i.jV(localn.field_snsId);
      break;
      label695: localObject1 = localn.field_createTime;
      break label186;
      label717: ((com.tencent.mm.modelsns.b)localObject2).tx("");
      ((com.tencent.mm.modelsns.b)localObject2).tx("");
      ((com.tencent.mm.modelsns.b)localObject2).tx("0");
      break label201;
      localObject1 = this.ryu;
      if (((SnsTimeLineUI.a)localObject1).rzs.ryq.getVisibility() == 0)
      {
        ((SnsTimeLineUI.a)localObject1).init();
        localObject2 = (AbsoluteLayout.LayoutParams)((SnsTimeLineUI.a)localObject1).rzs.ryq.getLayoutParams();
        ((AbsoluteLayout.LayoutParams)localObject2).y = ((int)((SnsTimeLineUI.a)localObject1).rzP);
        ((SnsTimeLineUI.a)localObject1).rzs.ryq.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        ((SnsTimeLineUI.a)localObject1).rzs.ryq.invalidate();
      }
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(39577);
    ab.i("MicroMsg.SnsTimeLineUI", "uionSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramm.getType());
    if (paramm.getType() == 218)
    {
      paramString = (com.tencent.mm.plugin.sns.model.r)paramm;
      if (((paramString.type == 1) || (paramString.type == 6) || (paramString.type == 4)) && (this.ryt.rhB != null))
        this.ryt.rhB.dismiss();
      if (paramString.type == 11)
      {
        if (this.mUIAction.tipDialog != null)
          this.mUIAction.tipDialog.dismiss();
        if (this.rzn != null)
          this.rzn.setImageResource(2131231445);
      }
    }
    if (this.ryn != null)
      this.ryn.rEB.notifyVendingDataChange();
    if (paramm.getType() == 211)
    {
      paramString = (com.tencent.mm.plugin.sns.model.y)paramm;
      if (!paramString.qIW)
        break label272;
      paramm = com.tencent.mm.modelsns.b.lY(727);
      paramm.mb(this.ryn.getCount()).mb(paramString.afg);
      paramm.ajK();
    }
    while (true)
    {
      if (this.ryu != null)
      {
        this.rys = false;
        this.ryu.cus();
      }
      AppMethodBeat.o(39577);
      return;
      label272: paramm = com.tencent.mm.modelsns.b.lY(728);
      paramm.mb(this.ryn.getCount()).mb(paramString.afg).mb(0);
      paramm.ajK();
    }
  }

  public void onStart()
  {
    AppMethodBeat.i(39565);
    super.onStart();
    AppMethodBeat.o(39565);
  }

  public void onStop()
  {
    AppMethodBeat.i(39566);
    super.onStop();
    AppMethodBeat.o(39566);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public boolean supportNavigationSwipeBack()
  {
    AppMethodBeat.i(39570);
    boolean bool = super.supportNavigationSwipeBack();
    AppMethodBeat.o(39570);
    return bool;
  }

  public final void xE(int paramInt)
  {
    AppMethodBeat.i(39557);
    super.xE(paramInt);
    if ((Build.VERSION.SDK_INT >= 21) && (this.plv != null))
    {
      this.plv.setBackgroundColor(getWindow().getStatusBarColor());
      com.tencent.mm.ui.statusbar.d.a(getWindow());
    }
    AppMethodBeat.o(39557);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI
 * JD-Core Version:    0.6.2
 */