package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.m;
import android.support.v7.widget.av;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.g.a.nt;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI;
import com.tencent.mm.plugin.wenote.model.a.i;
import com.tencent.mm.plugin.wenote.model.a.l;
import com.tencent.mm.plugin.wenote.model.a.m;
import com.tencent.mm.plugin.wenote.model.a.w;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e.10;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e.11;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e.12;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e.13;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e.2;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e.3;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e.4;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e.5;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.g.a;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.snackbar.a.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class NoteEditorUI extends BaseFavDetailReportUI
  implements com.tencent.mm.ai.f, com.tencent.mm.plugin.wenote.model.nativenote.b.a, g.a, a
{
  private static final long mky;
  private View WL;
  private int aaF;
  ViewTreeObserver.OnGlobalLayoutListener aeL;
  private RecyclerView aiB;
  private long cvx;
  private ProgressDialog ehJ;
  long fDy;
  private ak fbD;
  private float hkg;
  private float hkh;
  private String lZg;
  private String lsy;
  private com.tencent.mm.ui.base.p lzK;
  protected a.b mUw;
  boolean uMY;
  boolean uNq;
  private int uQI;
  private com.tencent.mm.plugin.wenote.model.nativenote.manager.k uSJ;
  private com.tencent.mm.plugin.wenote.ui.nativenote.a.c uSK;
  private LinearLayout uSL;
  private c uSM;
  private RelativeLayout uSN;
  private com.tencent.mm.plugin.wenote.model.nativenote.manager.g uSO;
  private boolean uSP;
  boolean uSQ;
  private boolean uSR;
  private String uSS;
  private com.tencent.mm.plugin.wenote.ui.nativenote.a.a uST;
  private boolean uSU;
  private boolean uSV;
  private NoteEditorUI.a uSW;
  private aar uSX;
  private boolean uSY;
  private final Object uSZ;
  private LinearLayout uTa;
  private String uTb;
  private int uTc;
  private int uTd;
  private int uTe;
  private String[] uTf;
  private boolean uTg;
  private long uTh;
  private boolean uTi;
  private String uTj;
  boolean uTk;
  private boolean uTl;
  private boolean uTm;
  private boolean uTn;
  private int uTo;
  private RecyclerView.m uTp;
  View.OnTouchListener uTq;
  private boolean uTr;
  private int uTs;
  private boolean uTt;

  static
  {
    AppMethodBeat.i(27111);
    mky = com.tencent.mm.m.b.Nc();
    AppMethodBeat.o(27111);
  }

  public NoteEditorUI()
  {
    AppMethodBeat.i(27053);
    this.uSM = null;
    this.uSN = null;
    this.uSO = null;
    this.WL = null;
    this.uSP = false;
    this.cvx = -1L;
    this.fDy = -1L;
    this.lsy = "";
    this.uMY = false;
    this.uSQ = false;
    this.uNq = false;
    this.uSR = false;
    this.uSS = "";
    this.uSU = false;
    this.ehJ = null;
    this.uSV = false;
    this.uSY = false;
    this.uSZ = new Object();
    this.uTa = null;
    this.uTb = "";
    this.aaF = 0;
    this.uTc = 0;
    this.uTd = 0;
    this.uTe = 0;
    this.uTf = null;
    this.uTg = true;
    this.uTh = 0L;
    this.uTi = false;
    this.uTk = false;
    this.uTl = false;
    this.uTm = false;
    this.uTn = true;
    this.uTo = 0;
    this.uTp = null;
    this.aeL = new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public final void onGlobalLayout()
      {
        AppMethodBeat.i(27041);
        long l = System.currentTimeMillis();
        ab.i("MicroMsg.Note.NoteEditorUI", "startnoteeditorui, onGlobalLayout, current time is %d,from oncreate to dataloading, cost %d", new Object[] { Long.valueOf(l), Long.valueOf(l - NoteEditorUI.M(NoteEditorUI.this)) });
        al localal = aw.RS();
        NoteEditorUI.32.1 local1 = new NoteEditorUI.32.1(this);
        if (NoteEditorUI.d(NoteEditorUI.this) == 1);
        for (l = 100L; ; l = 0L)
        {
          localal.m(local1, l);
          NoteEditorUI.N(NoteEditorUI.this).getViewTreeObserver().removeGlobalOnLayoutListener(NoteEditorUI.this.aeL);
          AppMethodBeat.o(27041);
          return;
        }
      }
    };
    this.hkg = 0.0F;
    this.hkh = 0.0F;
    this.uTq = new NoteEditorUI.36(this);
    this.lzK = null;
    this.uTr = false;
    this.uTs = -1;
    this.uTt = false;
    this.mUw = new NoteEditorUI.16(this);
    AppMethodBeat.o(27053);
  }

  private void ahp(final String paramString)
  {
    AppMethodBeat.i(27060);
    aw.RS().aa(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(27044);
        NoteEditorUI.this.i(paramString, true, false);
        AppMethodBeat.o(27044);
      }
    });
    AppMethodBeat.o(27060);
  }

  private void ahq(String paramString)
  {
    AppMethodBeat.i(27061);
    aw.RS().aa(new NoteEditorUI.35(this, paramString));
    AppMethodBeat.o(27061);
  }

  static boolean ahr(String paramString)
  {
    AppMethodBeat.i(27074);
    boolean bool;
    if (bo.isNullOrNil(com.tencent.mm.plugin.wenote.b.b.ahj(paramString)))
    {
      bool = true;
      AppMethodBeat.o(27074);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(27074);
    }
  }

  private void bpD()
  {
    AppMethodBeat.i(27104);
    if (this.lzK != null)
    {
      this.lzK.dismiss();
      this.lzK = null;
    }
    AppMethodBeat.o(27104);
  }

  private boolean c(com.tencent.mm.plugin.wenote.model.a.q paramq)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    boolean bool3;
    if (paramq != null)
    {
      bool3 = paramq.uOr;
      if (this.uQI != 1)
        break label82;
    }
    label82: for (boolean bool4 = true; ; bool4 = false)
    {
      bool2 = bool1;
      if (bool3 == bool4)
        if ((this.uQI != 1) || (paramq.uOt != this.cvx))
        {
          bool2 = bool1;
          if (this.uQI == 2)
          {
            bool2 = bool1;
            if (paramq.uOs != this.fDy);
          }
        }
        else
        {
          bool2 = true;
        }
      return bool2;
    }
  }

  private boolean dfK()
  {
    AppMethodBeat.i(27057);
    boolean bool;
    if ((this.uSM != null) && (this.uSM.uTV))
    {
      ddY();
      bool = false;
      AppMethodBeat.o(27057);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(27057);
    }
  }

  private boolean dfQ()
  {
    AppMethodBeat.i(27102);
    gh localgh = new gh();
    localgh.cAH.type = 19;
    localgh.cAH.cvv = this.fDy;
    localgh.cAH.cAO = -1;
    com.tencent.mm.sdk.b.a.xxA.m(localgh);
    boolean bool;
    if (!localgh.cAI.cAY)
    {
      bool = true;
      AppMethodBeat.o(27102);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(27102);
    }
  }

  private void goBack()
  {
    AppMethodBeat.i(27058);
    if ((this.uQI != 2) || (!this.uSJ.uQJ))
      AppMethodBeat.o(27058);
    while (true)
    {
      return;
      if ((!this.uSQ) && (!this.uMY))
      {
        if (dfQ())
        {
          AppMethodBeat.o(27058);
        }
        else
        {
          this.uSQ = true;
          this.uSR = true;
        }
      }
      else
      {
        dfL();
        finish();
        AppMethodBeat.o(27058);
      }
    }
  }

  public final void JX(int paramInt)
  {
    AppMethodBeat.i(27064);
    Handler localHandler = getWindow().getDecorView().getHandler();
    if (localHandler == null)
      AppMethodBeat.o(27064);
    while (true)
    {
      return;
      localHandler.postDelayed(new NoteEditorUI.2(this, paramInt), 0L);
      AppMethodBeat.o(27064);
    }
  }

  public final void JY(int paramInt)
  {
    AppMethodBeat.i(27066);
    try
    {
      this.uSK.ch(paramInt);
      AppMethodBeat.o(27066);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Note.NoteEditorUI", localException, "", new Object[0]);
        ab.e("MicroMsg.Note.NoteEditorUI", "onNotifyItemInserted error,positionStart:%d", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(27066);
      }
    }
  }

  public final void JZ(int paramInt)
  {
    AppMethodBeat.i(27065);
    try
    {
      this.uSK.ci(paramInt);
      AppMethodBeat.o(27065);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.Note.NoteEditorUI", "onNotifyItemRemoved error,positionStart:%d", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(27065);
      }
    }
  }

  public final void Ka(int paramInt)
  {
    AppMethodBeat.i(27097);
    if ((paramInt < 0) || (paramInt >= com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().size()))
      AppMethodBeat.o(27097);
    while (true)
    {
      return;
      this.fbD.post(new NoteEditorUI.24(this, paramInt));
      AppMethodBeat.o(27097);
    }
  }

  public final void a(WXRTEditText paramWXRTEditText)
  {
    AppMethodBeat.i(27091);
    int i;
    if (paramWXRTEditText != null)
    {
      if ((com.tencent.mm.plugin.wenote.model.nativenote.manager.f.iLD != null) && (com.tencent.mm.plugin.wenote.model.nativenote.manager.f.iLD.size() > 0))
      {
        i = 1;
        if (i != 0)
          break label43;
      }
    }
    else
      AppMethodBeat.o(27091);
    while (true)
    {
      return;
      i = 0;
      break;
      label43: ArrayList localArrayList = com.tencent.mm.plugin.wenote.model.nativenote.manager.f.deA();
      if (com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().af(localArrayList))
      {
        ddW();
        AppMethodBeat.o(27091);
      }
      else
      {
        com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().a(localArrayList, paramWXRTEditText, true, true, false, false);
        int j = paramWXRTEditText.getRecyclerItemPosition();
        i = localArrayList.size();
        com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().gG(j, i + j + 1);
        deb();
        if (this.uTn)
          com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().dff();
        AppMethodBeat.o(27091);
      }
    }
  }

  public final void a(WXRTEditText paramWXRTEditText, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(27085);
    if ((this.uQI != 2) || (!this.uSJ.uQJ))
      AppMethodBeat.o(27085);
    while (true)
    {
      return;
      ((com.tencent.mm.plugin.wenote.ui.nativenote.a.a)this.aiB.getLayoutManager()).uUg = paramBoolean;
      if (this.uSU)
        ((com.tencent.mm.plugin.wenote.ui.nativenote.a.a)this.aiB.getLayoutManager()).uUg = false;
      if (paramBoolean)
      {
        if ((!this.uMY) && (!this.uSQ))
        {
          this.uSS = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().deu();
          this.uSQ = true;
        }
        if ((paramWXRTEditText != null) && (paramWXRTEditText.getEditTextType() == 1))
        {
          com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().aw(paramInt, true);
          AppMethodBeat.o(27085);
        }
        else
        {
          com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().aw(paramInt, false);
          AppMethodBeat.o(27085);
        }
      }
      else
      {
        com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().av(-1, false);
        AppMethodBeat.o(27085);
      }
    }
  }

  public final void af(int paramInt, long paramLong)
  {
    AppMethodBeat.i(27089);
    if ((this.uQI != 2) || (!this.uSJ.uQJ))
      AppMethodBeat.o(27089);
    while (true)
    {
      return;
      this.fbD.postDelayed(new NoteEditorUI.21(this, paramInt), paramLong);
      AppMethodBeat.o(27089);
    }
  }

  // ERROR //
  public final void c(Object arg1, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: sipush 27071
    //   5: invokestatic 116	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: ldc_w 575
    //   11: ldc_w 689
    //   14: iconst_1
    //   15: anewarray 171	java/lang/Object
    //   18: dup
    //   19: iconst_0
    //   20: iload_2
    //   21: invokestatic 694	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   24: aastore
    //   25: invokestatic 696	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   28: aload_0
    //   29: getfield 174	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uSZ	Ljava/lang/Object;
    //   32: astore_3
    //   33: aload_3
    //   34: monitorenter
    //   35: invokestatic 393	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:dem	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   38: invokevirtual 699	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:den	()V
    //   41: aload_1
    //   42: checkcast 620	java/util/ArrayList
    //   45: astore_1
    //   46: aload_1
    //   47: ifnonnull +14 -> 61
    //   50: aload_3
    //   51: monitorexit
    //   52: sipush 27071
    //   55: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   58: aload_0
    //   59: monitorexit
    //   60: return
    //   61: ldc_w 575
    //   64: ldc_w 701
    //   67: invokestatic 704	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   70: aload_0
    //   71: getfield 445	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uQI	I
    //   74: iconst_2
    //   75: if_icmpne +78 -> 153
    //   78: aload_0
    //   79: getfield 194	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uTi	Z
    //   82: ifne +71 -> 153
    //   85: invokestatic 710	com/tencent/mm/plugin/wenote/model/c:ddG	()Lcom/tencent/mm/plugin/wenote/model/c;
    //   88: getfield 714	com/tencent/mm/plugin/wenote/model/c:uMN	Lcom/tencent/mm/plugin/wenote/model/d;
    //   91: getfield 720	com/tencent/mm/plugin/wenote/model/d:uMP	Lcom/tencent/mm/plugin/wenote/model/a/m;
    //   94: astore 4
    //   96: aload 4
    //   98: ifnonnull +19 -> 117
    //   101: aload_3
    //   102: monitorexit
    //   103: sipush 27071
    //   106: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   109: goto -51 -> 58
    //   112: astore_1
    //   113: aload_0
    //   114: monitorexit
    //   115: aload_1
    //   116: athrow
    //   117: new 722	com/tencent/mm/plugin/wenote/model/a/e
    //   120: astore 5
    //   122: aload 5
    //   124: aload 4
    //   126: getfield 727	com/tencent/mm/plugin/wenote/model/a/m:uOm	J
    //   129: invokespecial 730	com/tencent/mm/plugin/wenote/model/a/e:<init>	(J)V
    //   132: aload 5
    //   134: iconst_0
    //   135: putfield 733	com/tencent/mm/plugin/wenote/model/a/e:uNT	Z
    //   138: aload 5
    //   140: iconst_0
    //   141: putfield 736	com/tencent/mm/plugin/wenote/model/a/e:uNZ	Z
    //   144: invokestatic 393	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:dem	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   147: aload 5
    //   149: invokevirtual 739	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Lcom/tencent/mm/plugin/wenote/model/a/c;)Z
    //   152: pop
    //   153: iload_2
    //   154: ifeq +143 -> 297
    //   157: iconst_0
    //   158: istore 6
    //   160: iload 6
    //   162: aload_1
    //   163: invokevirtual 621	java/util/ArrayList:size	()I
    //   166: if_icmpge +131 -> 297
    //   169: aload_1
    //   170: iload 6
    //   172: invokevirtual 743	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   175: checkcast 745	com/tencent/mm/plugin/wenote/model/a/o
    //   178: astore 5
    //   180: aload 5
    //   182: invokevirtual 748	com/tencent/mm/plugin/wenote/model/a/o:getType	()I
    //   185: bipush 20
    //   187: if_icmpne +104 -> 291
    //   190: aload 5
    //   192: checkcast 750	com/tencent/mm/plugin/wenote/model/a/b
    //   195: astore 5
    //   197: aload_0
    //   198: getfield 194	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uTi	Z
    //   201: ifeq +11 -> 212
    //   204: aload 5
    //   206: getfield 753	com/tencent/mm/plugin/wenote/model/a/b:qxI	Z
    //   209: ifne +82 -> 291
    //   212: new 755	com/tencent/mm/plugin/wenote/model/a/i
    //   215: astore 7
    //   217: aload 7
    //   219: invokespecial 756	com/tencent/mm/plugin/wenote/model/a/i:<init>	()V
    //   222: aload 7
    //   224: aload 5
    //   226: getfield 759	com/tencent/mm/plugin/wenote/model/a/b:uOo	Ljava/lang/String;
    //   229: putfield 762	com/tencent/mm/plugin/wenote/model/a/t:uOo	Ljava/lang/String;
    //   232: new 764	java/lang/StringBuilder
    //   235: astore 4
    //   237: aload 4
    //   239: invokespecial 765	java/lang/StringBuilder:<init>	()V
    //   242: aload 7
    //   244: aload 4
    //   246: aload_0
    //   247: ldc_w 766
    //   250: invokevirtual 322	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:getString	(I)Ljava/lang/String;
    //   253: invokevirtual 770	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: ldc_w 772
    //   259: invokevirtual 770	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   262: aload 5
    //   264: getfield 775	com/tencent/mm/plugin/wenote/model/a/b:uOC	Ljava/lang/String;
    //   267: invokevirtual 770	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: ldc_w 777
    //   273: invokevirtual 770	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   276: invokevirtual 780	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   279: putfield 783	com/tencent/mm/plugin/wenote/model/a/t:content	Ljava/lang/String;
    //   282: aload_1
    //   283: iload 6
    //   285: aload 7
    //   287: invokevirtual 787	java/util/ArrayList:set	(ILjava/lang/Object;)Ljava/lang/Object;
    //   290: pop
    //   291: iinc 6 1
    //   294: goto -134 -> 160
    //   297: aload_1
    //   298: invokevirtual 791	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   301: astore_1
    //   302: aload_1
    //   303: invokeinterface 796 1 0
    //   308: ifeq +521 -> 829
    //   311: aload_1
    //   312: invokeinterface 800 1 0
    //   317: checkcast 745	com/tencent/mm/plugin/wenote/model/a/o
    //   320: astore 5
    //   322: aload 5
    //   324: getfield 801	com/tencent/mm/plugin/wenote/model/a/o:type	I
    //   327: tableswitch	default:+109 -> 436, -3:+-25->302, -2:+-25->302, -1:+483->810, 0:+109->436, 1:+139->466, 2:+372->699, 3:+391->718, 4:+410->737, 5:+445->772, 6:+464->791, 7:+109->436, 8:+109->436, 9:+109->436, 10:+109->436, 11:+109->436, 12:+109->436, 13:+109->436, 14:+109->436, 15:+109->436, 16:+109->436, 17:+109->436, 18:+109->436, 19:+109->436, 20:+429->756
    //   437: iconst_2
    //   438: checkcast 803	com/tencent/mm/plugin/wenote/model/a/j
    //   441: astore 5
    //   443: invokestatic 393	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:dem	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   446: aload 5
    //   448: invokevirtual 739	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Lcom/tencent/mm/plugin/wenote/model/a/c;)Z
    //   451: pop
    //   452: goto -150 -> 302
    //   455: astore_1
    //   456: aload_3
    //   457: monitorexit
    //   458: sipush 27071
    //   461: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   464: aload_1
    //   465: athrow
    //   466: aload 5
    //   468: checkcast 755	com/tencent/mm/plugin/wenote/model/a/i
    //   471: astore 5
    //   473: aload 5
    //   475: getfield 804	com/tencent/mm/plugin/wenote/model/a/i:content	Ljava/lang/String;
    //   478: invokestatic 371	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   481: ifeq +10 -> 491
    //   484: aload 5
    //   486: ldc 149
    //   488: putfield 804	com/tencent/mm/plugin/wenote/model/a/i:content	Ljava/lang/String;
    //   491: aload 5
    //   493: aload 5
    //   495: getfield 804	com/tencent/mm/plugin/wenote/model/a/i:content	Ljava/lang/String;
    //   498: ldc_w 806
    //   501: ldc_w 808
    //   504: invokevirtual 814	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   507: ldc_w 816
    //   510: ldc_w 818
    //   513: invokevirtual 814	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   516: ldc_w 820
    //   519: ldc_w 822
    //   522: invokevirtual 814	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   525: ldc_w 824
    //   528: ldc_w 826
    //   531: invokevirtual 814	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   534: ldc_w 828
    //   537: ldc_w 830
    //   540: invokevirtual 814	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   543: ldc_w 832
    //   546: ldc_w 834
    //   549: invokevirtual 814	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   552: ldc_w 836
    //   555: ldc_w 838
    //   558: invokevirtual 814	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   561: ldc_w 840
    //   564: ldc_w 842
    //   567: invokevirtual 814	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   570: ldc_w 844
    //   573: ldc_w 846
    //   576: invokevirtual 814	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   579: ldc_w 848
    //   582: ldc_w 850
    //   585: invokevirtual 814	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   588: ldc_w 852
    //   591: ldc_w 854
    //   594: invokevirtual 814	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   597: ldc_w 856
    //   600: ldc_w 858
    //   603: invokevirtual 814	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   606: ldc_w 860
    //   609: ldc_w 862
    //   612: invokevirtual 814	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   615: ldc_w 864
    //   618: ldc_w 866
    //   621: invokevirtual 814	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   624: putfield 804	com/tencent/mm/plugin/wenote/model/a/i:content	Ljava/lang/String;
    //   627: aload 5
    //   629: getfield 804	com/tencent/mm/plugin/wenote/model/a/i:content	Ljava/lang/String;
    //   632: invokevirtual 869	java/lang/String:length	()I
    //   635: bipush 100
    //   637: if_icmple +24 -> 661
    //   640: aload 5
    //   642: getfield 804	com/tencent/mm/plugin/wenote/model/a/i:content	Ljava/lang/String;
    //   645: invokestatic 875	com/tencent/mm/plugin/wenote/model/nativenote/a/a:ahb	(Ljava/lang/String;)Landroid/text/Spanned;
    //   648: pop
    //   649: invokestatic 393	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:dem	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   652: aload 5
    //   654: invokevirtual 739	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Lcom/tencent/mm/plugin/wenote/model/a/c;)Z
    //   657: pop
    //   658: goto -356 -> 302
    //   661: aload 5
    //   663: getfield 804	com/tencent/mm/plugin/wenote/model/a/i:content	Ljava/lang/String;
    //   666: invokestatic 878	com/tencent/mm/plugin/wenote/b/b:ahi	(Ljava/lang/String;)Z
    //   669: ifeq -20 -> 649
    //   672: aload 5
    //   674: aload 5
    //   676: getfield 804	com/tencent/mm/plugin/wenote/model/a/i:content	Ljava/lang/String;
    //   679: iconst_0
    //   680: aload 5
    //   682: getfield 804	com/tencent/mm/plugin/wenote/model/a/i:content	Ljava/lang/String;
    //   685: invokevirtual 869	java/lang/String:length	()I
    //   688: iconst_5
    //   689: isub
    //   690: invokevirtual 882	java/lang/String:substring	(II)Ljava/lang/String;
    //   693: putfield 804	com/tencent/mm/plugin/wenote/model/a/i:content	Ljava/lang/String;
    //   696: goto -47 -> 649
    //   699: aload 5
    //   701: checkcast 884	com/tencent/mm/plugin/wenote/model/a/f
    //   704: astore 5
    //   706: invokestatic 393	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:dem	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   709: aload 5
    //   711: invokevirtual 739	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Lcom/tencent/mm/plugin/wenote/model/a/c;)Z
    //   714: pop
    //   715: goto -413 -> 302
    //   718: aload 5
    //   720: checkcast 886	com/tencent/mm/plugin/wenote/model/a/g
    //   723: astore 5
    //   725: invokestatic 393	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:dem	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   728: aload 5
    //   730: invokevirtual 739	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Lcom/tencent/mm/plugin/wenote/model/a/c;)Z
    //   733: pop
    //   734: goto -432 -> 302
    //   737: aload 5
    //   739: checkcast 888	com/tencent/mm/plugin/wenote/model/a/l
    //   742: astore 5
    //   744: invokestatic 393	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:dem	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   747: aload 5
    //   749: invokevirtual 739	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Lcom/tencent/mm/plugin/wenote/model/a/c;)Z
    //   752: pop
    //   753: goto -451 -> 302
    //   756: aload 5
    //   758: checkcast 750	com/tencent/mm/plugin/wenote/model/a/b
    //   761: astore 4
    //   763: invokestatic 393	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:dem	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   766: aload 4
    //   768: invokevirtual 739	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Lcom/tencent/mm/plugin/wenote/model/a/c;)Z
    //   771: pop
    //   772: aload 5
    //   774: checkcast 890	com/tencent/mm/plugin/wenote/model/a/d
    //   777: astore 5
    //   779: invokestatic 393	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:dem	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   782: aload 5
    //   784: invokevirtual 739	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Lcom/tencent/mm/plugin/wenote/model/a/c;)Z
    //   787: pop
    //   788: goto -486 -> 302
    //   791: aload 5
    //   793: checkcast 892	com/tencent/mm/plugin/wenote/model/a/k
    //   796: astore 5
    //   798: invokestatic 393	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:dem	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   801: aload 5
    //   803: invokevirtual 739	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Lcom/tencent/mm/plugin/wenote/model/a/c;)Z
    //   806: pop
    //   807: goto -505 -> 302
    //   810: aload 5
    //   812: checkcast 894	com/tencent/mm/plugin/wenote/model/a/h
    //   815: astore 5
    //   817: invokestatic 393	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:dem	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   820: aload 5
    //   822: invokevirtual 739	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:a	(Lcom/tencent/mm/plugin/wenote/model/a/c;)Z
    //   825: pop
    //   826: goto -524 -> 302
    //   829: aload_3
    //   830: monitorexit
    //   831: ldc_w 575
    //   834: ldc_w 896
    //   837: invokestatic 704	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   840: iload_2
    //   841: ifne +16 -> 857
    //   844: invokestatic 393	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:dem	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   847: astore_1
    //   848: aload_1
    //   849: monitorenter
    //   850: aload_1
    //   851: iconst_1
    //   852: putfield 899	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:uPf	Z
    //   855: aload_1
    //   856: monitorexit
    //   857: new 14	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$3
    //   860: astore_1
    //   861: aload_1
    //   862: aload_0
    //   863: iload_2
    //   864: invokespecial 902	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$3:<init>	(Lcom/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI;Z)V
    //   867: aload_1
    //   868: invokestatic 905	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   871: aload_0
    //   872: getfield 184	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uTd	I
    //   875: ifgt +10 -> 885
    //   878: aload_0
    //   879: getfield 186	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uTe	I
    //   882: ifeq +26 -> 908
    //   885: aload_0
    //   886: getfield 237	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:fbD	Lcom/tencent/mm/sdk/platformtools/ak;
    //   889: astore_3
    //   890: new 907	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$4
    //   893: astore_1
    //   894: aload_1
    //   895: aload_0
    //   896: invokespecial 908	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$4:<init>	(Lcom/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI;)V
    //   899: aload_3
    //   900: aload_1
    //   901: ldc2_w 909
    //   904: invokevirtual 686	com/tencent/mm/sdk/platformtools/ak:postDelayed	(Ljava/lang/Runnable;J)Z
    //   907: pop
    //   908: invokestatic 393	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:dem	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   911: invokevirtual 913	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:des	()Ljava/lang/String;
    //   914: pop
    //   915: sipush 27071
    //   918: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   921: goto -863 -> 58
    //   924: astore_3
    //   925: aload_1
    //   926: monitorexit
    //   927: sipush 27071
    //   930: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   933: aload_3
    //   934: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   2	35	112	finally
    //   52	58	112	finally
    //   103	109	112	finally
    //   458	466	112	finally
    //   831	840	112	finally
    //   844	850	112	finally
    //   857	885	112	finally
    //   885	908	112	finally
    //   908	921	112	finally
    //   927	935	112	finally
    //   35	46	455	finally
    //   50	52	455	finally
    //   61	96	455	finally
    //   101	103	455	finally
    //   117	153	455	finally
    //   160	212	455	finally
    //   212	291	455	finally
    //   297	302	455	finally
    //   302	436	455	finally
    //   436	452	455	finally
    //   456	458	455	finally
    //   466	491	455	finally
    //   491	649	455	finally
    //   649	658	455	finally
    //   661	696	455	finally
    //   699	715	455	finally
    //   718	734	455	finally
    //   737	753	455	finally
    //   756	772	455	finally
    //   772	788	455	finally
    //   791	807	455	finally
    //   810	826	455	finally
    //   829	831	455	finally
    //   850	857	924	finally
    //   925	927	924	finally
  }

  public final void ddU()
  {
    AppMethodBeat.i(27090);
    if (!this.uSM.uTV)
    {
      deb();
      AppCompatActivity localAppCompatActivity = this.mController.ylL;
      this.fbD.postDelayed(new NoteEditorUI.22(this, localAppCompatActivity), 400L);
    }
    AppMethodBeat.o(27090);
  }

  public final void ddV()
  {
    AppMethodBeat.i(27098);
    this.fbD.post(new NoteEditorUI.25(this));
    AppMethodBeat.o(27098);
  }

  public final void ddW()
  {
    AppMethodBeat.i(27099);
    if ((this.uMY) || (this.uSQ))
    {
      deb();
      if (this.uTn)
        com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().dff();
      this.fbD.postDelayed(new NoteEditorUI.26(this), 100L);
    }
    AppMethodBeat.o(27099);
  }

  public final void ddX()
  {
    AppMethodBeat.i(27101);
    com.tencent.mm.ui.base.h.a(this, getString(2131301928), getString(2131301936), getString(2131300878), getString(2131297773), false, new NoteEditorUI.28(this), new NoteEditorUI.29(this));
    AppMethodBeat.o(27101);
  }

  public final void ddY()
  {
    AppMethodBeat.i(27056);
    com.tencent.mm.ui.base.h.b(this.mController.ylL, getString(2131301751), null, true);
    AppMethodBeat.o(27056);
  }

  public final void ddZ()
  {
    AppMethodBeat.i(27079);
    com.tencent.mm.ui.base.h.d(this, getString(2131301745), "", getString(2131301744), getString(2131301743), new NoteEditorUI.17(this), null);
    AppMethodBeat.o(27079);
  }

  public final void deD()
  {
    AppMethodBeat.i(27093);
    i locali = new i();
    locali.content = "";
    locali.uNT = true;
    locali.uNZ = false;
    locali.uNV = 0;
    com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().den();
    com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().a(locali);
    dfM();
    g(true, 50L);
    af(1, 0L);
    AppMethodBeat.o(27093);
  }

  public final void deE()
  {
    AppMethodBeat.i(27094);
    com.tencent.mm.plugin.wenote.model.nativenote.manager.f.c(this.mController.ylL, com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().dev());
    AppMethodBeat.o(27094);
  }

  public final void deF()
  {
    AppMethodBeat.i(27095);
    com.tencent.mm.plugin.wenote.model.nativenote.manager.f.c(this.mController.ylL, com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().dev());
    deD();
    AppMethodBeat.o(27095);
  }

  public final void deG()
  {
    AppMethodBeat.i(27092);
    int i = com.tencent.mm.plugin.wenote.model.nativenote.manager.f.deC();
    if (i == 2)
      if (com.tencent.mm.plugin.wenote.model.nativenote.manager.f.deB())
      {
        ddW();
        AppMethodBeat.o(27092);
      }
    while (true)
    {
      return;
      com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().den();
      com.tencent.mm.plugin.wenote.model.nativenote.manager.f.clearData();
      Object localObject = new i();
      ((i)localObject).content = "";
      ((i)localObject).uNT = false;
      ((i)localObject).uNZ = false;
      ((i)localObject).uNV = 0;
      ((i)localObject).uOb = true;
      com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().a((com.tencent.mm.plugin.wenote.model.a.c)localObject);
      dfM();
      AppMethodBeat.o(27092);
      continue;
      if (i == 3)
      {
        localObject = com.tencent.mm.plugin.wenote.model.nativenote.manager.f.deA();
        if (com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().af((ArrayList)localObject))
        {
          ddW();
          AppMethodBeat.o(27092);
        }
        else
        {
          com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().den();
          com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().a((ArrayList)localObject, null, false, false, false, false);
          deb();
          AppMethodBeat.o(27092);
        }
      }
      else
      {
        AppMethodBeat.o(27092);
      }
    }
  }

  public final void dea()
  {
    AppMethodBeat.i(27080);
    Toast.makeText(this.mController.ylL, getString(2131301748), 0).show();
    AppMethodBeat.o(27080);
  }

  public final void deb()
  {
    AppMethodBeat.i(27084);
    if ((this.uQI != 2) || (!this.uSJ.uQJ))
      AppMethodBeat.o(27084);
    while (true)
    {
      return;
      int i = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().deo();
      com.tencent.mm.plugin.wenote.model.a.c localc = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(i);
      if (localc != null)
      {
        localc.uNT = false;
        localc.uNZ = false;
        JX(i);
      }
      this.fbD.post(new NoteEditorUI.18(this));
      g(false, 0L);
      af(0, 0L);
      AppMethodBeat.o(27084);
    }
  }

  public final int dec()
  {
    AppMethodBeat.i(27081);
    int i;
    if (this.uSV)
    {
      i = j.gp(this);
      AppMethodBeat.o(27081);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(27081);
    }
  }

  public final int ded()
  {
    AppMethodBeat.i(27082);
    int i = 0;
    int j = i;
    if (this.uSL != null)
    {
      j = i;
      if (this.uSL.getVisibility() == 0)
        j = this.uTo + 0;
    }
    i = j;
    if (this.uTa != null)
    {
      i = j;
      if (this.uTa.getVisibility() == 0)
        i = j + this.uTo;
    }
    AppMethodBeat.o(27082);
    return i;
  }

  public final boolean dee()
  {
    AppMethodBeat.i(27083);
    boolean bool;
    if ((this.uSJ != null) && (this.uSJ.deS() != null))
    {
      bool = true;
      AppMethodBeat.o(27083);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(27083);
    }
  }

  public final RecyclerView def()
  {
    return this.aiB;
  }

  public final void deg()
  {
    AppMethodBeat.i(27086);
    if ((!this.uMY) && (!this.uSQ))
    {
      this.uSS = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().deu();
      this.uSQ = true;
    }
    AppMethodBeat.o(27086);
  }

  public final void deh()
  {
    AppMethodBeat.i(27063);
    if (this.uSM != null)
      this.uSM.a(null);
    AppMethodBeat.o(27063);
  }

  public final void dfL()
  {
    AppMethodBeat.i(27059);
    this.uSM.a(this);
    Object localObject = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().deu();
    if (ahr((String)localObject))
    {
      localObject = new gh();
      ((gh)localObject).cAH.type = 12;
      ((gh)localObject).cAH.cvv = this.fDy;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      AppMethodBeat.o(27059);
    }
    while (true)
    {
      return;
      if ((this.uNq) || (this.uMY))
      {
        ab.i("MicroMsg.Note.NoteEditorUI", "leave noteeditorui, do savewnnotefavitem");
        ahp((String)localObject);
        AppMethodBeat.o(27059);
      }
      else
      {
        if (this.uSQ)
        {
          ab.i("MicroMsg.Note.NoteEditorUI", "leave noteeditorui, do updateWNNoteFavitem");
          ahq((String)localObject);
        }
        AppMethodBeat.o(27059);
      }
    }
  }

  public final void dfM()
  {
    AppMethodBeat.i(27069);
    try
    {
      this.uSK.aop.notifyChanged();
      AppMethodBeat.o(27069);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Note.NoteEditorUI", localException, "", new Object[0]);
        ab.i("MicroMsg.Note.NoteEditorUI", "onNotifyDataChanged error");
        AppMethodBeat.o(27069);
      }
    }
  }

  public final RecyclerView dfN()
  {
    return this.aiB;
  }

  public final Context dfO()
  {
    return this.mController.ylL;
  }

  public final com.tencent.mm.plugin.wenote.model.nativenote.b.a dfP()
  {
    return this;
  }

  public final void g(boolean paramBoolean, long paramLong)
  {
    AppMethodBeat.i(27088);
    if ((this.uQI != 2) || (!this.uSJ.uQJ))
      AppMethodBeat.o(27088);
    while (true)
    {
      return;
      this.fbD.postDelayed(new NoteEditorUI.20(this, paramBoolean), paramLong);
      AppMethodBeat.o(27088);
    }
  }

  public final void gC(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(27067);
    try
    {
      this.uSK.at(paramInt1, paramInt2);
      AppMethodBeat.o(27067);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Note.NoteEditorUI", localException, "", new Object[0]);
        ab.e("MicroMsg.Note.NoteEditorUI", "onNotifyitemRangeInsert error,positionStart:%d,count:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        AppMethodBeat.o(27067);
      }
    }
  }

  public final void gD(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(27068);
    try
    {
      this.uSK.ar(paramInt1, paramInt2);
      AppMethodBeat.o(27068);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.Note.NoteEditorUI", "onNotifyItemRangeChanged error,positionStart:%d,count:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        AppMethodBeat.o(27068);
      }
    }
  }

  public final void gE(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(27096);
    if (Math.abs(paramInt2 - paramInt1) > 0);
    for (boolean bool = true; ; bool = false)
    {
      this.uSU = bool;
      AppMethodBeat.o(27096);
      return;
    }
  }

  public final int getLayoutId()
  {
    return 2130970314;
  }

  // ERROR //
  public final void i(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: sipush 27073
    //   3: invokestatic 116	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc_w 575
    //   9: ldc_w 1118
    //   12: iconst_2
    //   13: anewarray 171	java/lang/Object
    //   16: dup
    //   17: iconst_0
    //   18: aload_1
    //   19: aastore
    //   20: dup
    //   21: iconst_1
    //   22: iload_2
    //   23: invokestatic 694	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   26: aastore
    //   27: invokestatic 696	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   30: iload_2
    //   31: ifne +174 -> 205
    //   34: aload_1
    //   35: aload_0
    //   36: getfield 161	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uSS	Ljava/lang/String;
    //   39: invokevirtual 1122	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   42: ifeq +163 -> 205
    //   45: aload_0
    //   46: getfield 196	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uTk	Z
    //   49: ifne +149 -> 198
    //   52: aload_0
    //   53: getfield 507	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uSJ	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/k;
    //   56: getfield 1125	com/tencent/mm/plugin/wenote/model/nativenote/manager/k:uQF	I
    //   59: ifle +139 -> 198
    //   62: aload_0
    //   63: getfield 507	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uSJ	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/k;
    //   66: getfield 1128	com/tencent/mm/plugin/wenote/model/nativenote/manager/k:uQG	Ljava/lang/String;
    //   69: invokestatic 371	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   72: ifne +126 -> 198
    //   75: aload_0
    //   76: getfield 507	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uSJ	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/k;
    //   79: getfield 1131	com/tencent/mm/plugin/wenote/model/nativenote/manager/k:uQH	J
    //   82: lconst_0
    //   83: lcmp
    //   84: ifle +114 -> 198
    //   87: new 463	com/tencent/mm/g/a/gh
    //   90: dup
    //   91: invokespecial 464	com/tencent/mm/g/a/gh:<init>	()V
    //   94: astore_1
    //   95: aload_1
    //   96: getfield 468	com/tencent/mm/g/a/gh:cAH	Lcom/tencent/mm/g/a/gh$a;
    //   99: bipush 19
    //   101: putfield 473	com/tencent/mm/g/a/gh$a:type	I
    //   104: aload_1
    //   105: getfield 468	com/tencent/mm/g/a/gh:cAH	Lcom/tencent/mm/g/a/gh$a;
    //   108: bipush 253
    //   110: putfield 479	com/tencent/mm/g/a/gh$a:cAO	I
    //   113: aload_1
    //   114: getfield 468	com/tencent/mm/g/a/gh:cAH	Lcom/tencent/mm/g/a/gh$a;
    //   117: aload_0
    //   118: getfield 147	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:fDy	J
    //   121: putfield 476	com/tencent/mm/g/a/gh$a:cvv	J
    //   124: new 375	android/content/Intent
    //   127: dup
    //   128: invokespecial 376	android/content/Intent:<init>	()V
    //   131: astore 4
    //   133: aload 4
    //   135: ldc_w 1133
    //   138: aload_0
    //   139: getfield 507	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uSJ	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/k;
    //   142: getfield 1125	com/tencent/mm/plugin/wenote/model/nativenote/manager/k:uQF	I
    //   145: invokevirtual 382	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   148: pop
    //   149: aload 4
    //   151: ldc_w 399
    //   154: aload_0
    //   155: getfield 507	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uSJ	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/k;
    //   158: getfield 1128	com/tencent/mm/plugin/wenote/model/nativenote/manager/k:uQG	Ljava/lang/String;
    //   161: invokevirtual 402	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   164: pop
    //   165: aload 4
    //   167: ldc_w 1135
    //   170: aload_0
    //   171: getfield 507	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uSJ	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/k;
    //   174: getfield 1131	com/tencent/mm/plugin/wenote/model/nativenote/manager/k:uQH	J
    //   177: invokevirtual 1138	android/content/Intent:putExtra	(Ljava/lang/String;J)Landroid/content/Intent;
    //   180: pop
    //   181: aload_1
    //   182: getfield 468	com/tencent/mm/g/a/gh:cAH	Lcom/tencent/mm/g/a/gh$a;
    //   185: aload 4
    //   187: putfield 1142	com/tencent/mm/g/a/gh$a:cAK	Landroid/content/Intent;
    //   190: getstatic 485	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   193: aload_1
    //   194: invokevirtual 489	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   197: pop
    //   198: sipush 27073
    //   201: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   204: return
    //   205: invokestatic 393	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:dem	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   208: aload_1
    //   209: invokevirtual 1146	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:ahe	(Ljava/lang/String;)Lcom/tencent/mm/protocal/protobuf/abf;
    //   212: astore 4
    //   214: aload 4
    //   216: ifnonnull +21 -> 237
    //   219: ldc_w 575
    //   222: ldc_w 1148
    //   225: invokestatic 1150	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   228: sipush 27073
    //   231: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   234: goto -30 -> 204
    //   237: iload_2
    //   238: ifeq +214 -> 452
    //   241: new 463	com/tencent/mm/g/a/gh
    //   244: dup
    //   245: invokespecial 464	com/tencent/mm/g/a/gh:<init>	()V
    //   248: astore 5
    //   250: aload 5
    //   252: getfield 468	com/tencent/mm/g/a/gh:cAH	Lcom/tencent/mm/g/a/gh$a;
    //   255: bipush 19
    //   257: putfield 473	com/tencent/mm/g/a/gh$a:type	I
    //   260: aload 5
    //   262: getfield 468	com/tencent/mm/g/a/gh:cAH	Lcom/tencent/mm/g/a/gh$a;
    //   265: aload 4
    //   267: putfield 1154	com/tencent/mm/g/a/gh$a:cvC	Lcom/tencent/mm/protocal/protobuf/abf;
    //   270: aload 5
    //   272: getfield 468	com/tencent/mm/g/a/gh:cAH	Lcom/tencent/mm/g/a/gh$a;
    //   275: aload_1
    //   276: putfield 1157	com/tencent/mm/g/a/gh$a:title	Ljava/lang/String;
    //   279: aload 5
    //   281: getfield 468	com/tencent/mm/g/a/gh:cAH	Lcom/tencent/mm/g/a/gh$a;
    //   284: aload_0
    //   285: getfield 147	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:fDy	J
    //   288: putfield 476	com/tencent/mm/g/a/gh$a:cvv	J
    //   291: aload 5
    //   293: getfield 468	com/tencent/mm/g/a/gh:cAH	Lcom/tencent/mm/g/a/gh$a;
    //   296: ldc_w 1159
    //   299: putfield 1162	com/tencent/mm/g/a/gh$a:desc	Ljava/lang/String;
    //   302: getstatic 485	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   305: aload 5
    //   307: invokevirtual 489	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   310: pop
    //   311: ldc_w 575
    //   314: ldc_w 1164
    //   317: invokestatic 704	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   320: bipush 20
    //   322: istore 6
    //   324: iload 6
    //   326: istore 7
    //   328: iload_2
    //   329: ifeq +239 -> 568
    //   332: iload 6
    //   334: istore 7
    //   336: new 463	com/tencent/mm/g/a/gh
    //   339: dup
    //   340: invokespecial 464	com/tencent/mm/g/a/gh:<init>	()V
    //   343: astore_1
    //   344: aload_1
    //   345: getfield 468	com/tencent/mm/g/a/gh:cAH	Lcom/tencent/mm/g/a/gh$a;
    //   348: bipush 30
    //   350: putfield 473	com/tencent/mm/g/a/gh$a:type	I
    //   353: aload_1
    //   354: getfield 468	com/tencent/mm/g/a/gh:cAH	Lcom/tencent/mm/g/a/gh$a;
    //   357: bipush 6
    //   359: putfield 479	com/tencent/mm/g/a/gh$a:cAO	I
    //   362: aload_1
    //   363: getfield 468	com/tencent/mm/g/a/gh:cAH	Lcom/tencent/mm/g/a/gh$a;
    //   366: aload_0
    //   367: getfield 147	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:fDy	J
    //   370: putfield 476	com/tencent/mm/g/a/gh$a:cvv	J
    //   373: getstatic 485	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   376: aload_1
    //   377: invokevirtual 489	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   380: pop
    //   381: aload_1
    //   382: getfield 493	com/tencent/mm/g/a/gh:cAI	Lcom/tencent/mm/g/a/gh$b;
    //   385: getfield 1167	com/tencent/mm/g/a/gh$b:ret	I
    //   388: iconst_1
    //   389: if_icmpne +152 -> 541
    //   392: iconst_1
    //   393: istore 6
    //   395: iload 6
    //   397: ifeq +150 -> 547
    //   400: aload_0
    //   401: iconst_0
    //   402: putfield 153	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uMY	Z
    //   405: aload_0
    //   406: iconst_0
    //   407: putfield 157	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uNq	Z
    //   410: aload_0
    //   411: iconst_1
    //   412: putfield 155	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uSQ	Z
    //   415: ldc_w 575
    //   418: ldc_w 1169
    //   421: invokestatic 704	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   424: aload_0
    //   425: invokestatic 393	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:dem	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   428: invokevirtual 671	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:deu	()Ljava/lang/String;
    //   431: putfield 161	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uSS	Ljava/lang/String;
    //   434: ldc_w 575
    //   437: ldc_w 1171
    //   440: invokestatic 704	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   443: sipush 27073
    //   446: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   449: goto -245 -> 204
    //   452: new 463	com/tencent/mm/g/a/gh
    //   455: dup
    //   456: invokespecial 464	com/tencent/mm/g/a/gh:<init>	()V
    //   459: astore 5
    //   461: aload 5
    //   463: getfield 468	com/tencent/mm/g/a/gh:cAH	Lcom/tencent/mm/g/a/gh$a;
    //   466: bipush 19
    //   468: putfield 473	com/tencent/mm/g/a/gh$a:type	I
    //   471: aload 5
    //   473: getfield 468	com/tencent/mm/g/a/gh:cAH	Lcom/tencent/mm/g/a/gh$a;
    //   476: aload 4
    //   478: putfield 1154	com/tencent/mm/g/a/gh$a:cvC	Lcom/tencent/mm/protocal/protobuf/abf;
    //   481: aload 5
    //   483: getfield 468	com/tencent/mm/g/a/gh:cAH	Lcom/tencent/mm/g/a/gh$a;
    //   486: aload_1
    //   487: putfield 1157	com/tencent/mm/g/a/gh$a:title	Ljava/lang/String;
    //   490: aload 5
    //   492: getfield 468	com/tencent/mm/g/a/gh:cAH	Lcom/tencent/mm/g/a/gh$a;
    //   495: aload_0
    //   496: getfield 147	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:fDy	J
    //   499: putfield 476	com/tencent/mm/g/a/gh$a:cvv	J
    //   502: aload 5
    //   504: getfield 468	com/tencent/mm/g/a/gh:cAH	Lcom/tencent/mm/g/a/gh$a;
    //   507: ldc 149
    //   509: putfield 1162	com/tencent/mm/g/a/gh$a:desc	Ljava/lang/String;
    //   512: aload_0
    //   513: getfield 159	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uSR	Z
    //   516: ifeq +13 -> 529
    //   519: aload 5
    //   521: getfield 468	com/tencent/mm/g/a/gh:cAH	Lcom/tencent/mm/g/a/gh$a;
    //   524: bipush 254
    //   526: putfield 479	com/tencent/mm/g/a/gh$a:cAO	I
    //   529: getstatic 485	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   532: aload 5
    //   534: invokevirtual 489	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   537: pop
    //   538: goto -227 -> 311
    //   541: iconst_0
    //   542: istore 6
    //   544: goto -149 -> 395
    //   547: ldc2_w 1172
    //   550: invokestatic 1178	java/lang/Thread:sleep	(J)V
    //   553: iload_3
    //   554: ifeq -130 -> 424
    //   557: iload 7
    //   559: ifle -135 -> 424
    //   562: iinc 7 255
    //   565: goto -229 -> 336
    //   568: iload 7
    //   570: istore 6
    //   572: ldc_w 1180
    //   575: invokestatic 1185	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   578: checkcast 1180	com/tencent/mm/plugin/fav/a/ae
    //   581: invokeinterface 1189 1 0
    //   586: aload_0
    //   587: getfield 147	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:fDy	J
    //   590: invokeinterface 1195 3 0
    //   595: astore_1
    //   596: aload_1
    //   597: invokestatic 1200	com/tencent/mm/plugin/fav/a/b:g	(Lcom/tencent/mm/plugin/fav/a/g;)Z
    //   600: ifeq +29 -> 629
    //   603: ldc_w 575
    //   606: ldc_w 1202
    //   609: iconst_1
    //   610: anewarray 171	java/lang/Object
    //   613: dup
    //   614: iconst_0
    //   615: aload_1
    //   616: getfield 1207	com/tencent/mm/plugin/fav/a/g:field_itemStatus	I
    //   619: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   622: aastore
    //   623: invokestatic 696	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   626: goto -202 -> 424
    //   629: ldc2_w 1172
    //   632: invokestatic 1178	java/lang/Thread:sleep	(J)V
    //   635: iload_3
    //   636: ifeq -212 -> 424
    //   639: iload 6
    //   641: iconst_1
    //   642: isub
    //   643: istore 7
    //   645: iload 6
    //   647: ifgt -79 -> 568
    //   650: goto -226 -> 424
    //   653: astore_1
    //   654: goto -230 -> 424
    //   657: astore_1
    //   658: goto -234 -> 424
    //
    // Exception table:
    //   from	to	target	type
    //   547	553	653	java/lang/InterruptedException
    //   629	635	657	java/lang/InterruptedException
  }

  public final void oj(boolean paramBoolean)
  {
    AppMethodBeat.i(27070);
    ab.i("MicroMsg.Note.NoteEditorUI", "notifyNoteDataListFresh,force:%B", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((this.uSP) || (com.tencent.mm.plugin.wenote.model.c.ddG().uMN == null))
    {
      boolean bool = this.uSP;
      if (com.tencent.mm.plugin.wenote.model.c.ddG().uMN == null)
      {
        paramBoolean = true;
        ab.e("MicroMsg.Note.NoteEditorUI", "notifyNoteDataListFresh,isInitDataList:%B,SubCoreWNNoteMsg.getCore().getWnNoteBase() == null :%B", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(paramBoolean) });
        AppMethodBeat.o(27070);
      }
    }
    while (true)
    {
      return;
      paramBoolean = false;
      break;
      w localw;
      if (this.uQI != 1)
      {
        ab.i("MicroMsg.Note.NoteEditorUI", "notifyNoteDataListFresh,open from fav");
        if (com.tencent.mm.plugin.wenote.model.c.ddG().uMN.uMQ == null)
        {
          ab.e("MicroMsg.Note.NoteEditorUI", "notifyNoteDataListFresh,SubCoreWNNoteMsg.getCore().getWnNoteBase().mClickedFavItemInfo == null ");
          AppMethodBeat.o(27070);
        }
        else
        {
          localw = (w)com.tencent.mm.plugin.wenote.model.c.ddG().uMN.uMR.get(Long.toString(com.tencent.mm.plugin.wenote.model.c.ddG().uMN.uMQ.field_localId));
        }
      }
      else
      {
        while (true)
          if ((localw != null) && (!this.uMY))
          {
            this.uSY = localw.uOG;
            if (!localw.uOG)
            {
              this.uSP = true;
              c(localw.uOF, true);
              AppMethodBeat.o(27070);
              break;
              ab.i("MicroMsg.Note.NoteEditorUI", "notifyNoteDataListFresh,open from Session");
              if (com.tencent.mm.plugin.wenote.model.c.ddG().uMN.uMP == null)
              {
                ab.e("MicroMsg.Note.NoteEditorUI", "notifyNoteDataListFresh,SubCoreWNNoteMsg.getCore().getWnNoteBase().mWNNoteData == null ");
                AppMethodBeat.o(27070);
                break;
              }
              localw = (w)com.tencent.mm.plugin.wenote.model.c.ddG().uMN.uMR.get(Long.toString(com.tencent.mm.plugin.wenote.model.c.ddG().uMN.uMP.cvx));
              continue;
            }
            c(localw.uOF, false);
          }
        AppMethodBeat.o(27070);
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    AppMethodBeat.i(27072);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.i("MicroMsg.Note.NoteEditorUI", "onActivityResult reqCode: %d, retCod: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.uTs = paramInt1;
    if (paramInt2 != -1)
    {
      this.uTr = false;
      AppMethodBeat.o(27072);
    }
    while (true)
    {
      return;
      this.uTr = true;
      switch (paramInt1)
      {
      default:
      case 4096:
      case 4101:
      case 4097:
      case 4098:
      case 4099:
      case 4354:
      case 4355:
      case 30764:
      }
      while (true)
      {
        paramInt1 = 2;
        while (true)
        {
          if (paramInt1 != 0)
            break label1882;
          AppMethodBeat.o(27072);
          break;
          if (paramIntent == null)
          {
            localObject1 = null;
            label166: if (paramIntent != null)
              break label210;
          }
          label210: for (paramIntent = null; ; paramIntent = paramIntent.getStringExtra("custom_send_text"))
          {
            if (!bo.isNullOrNil((String)localObject1))
              break label221;
            ab.w("MicroMsg.Note.NoteEditorUI", "want to send record msg, but toUser is null");
            AppMethodBeat.o(27072);
            break;
            localObject1 = paramIntent.getStringExtra("Select_Conv_User");
            break label166;
          }
          label221: aw.ZK();
          Object localObject2 = com.tencent.mm.model.c.XO().jf(this.cvx);
          if (((cy)localObject2).field_msgId != this.cvx)
          {
            ab.w("MicroMsg.Note.NoteEditorUI", "want to send record msg, but message info is null");
            AppMethodBeat.o(27072);
            break;
          }
          Object localObject3 = com.tencent.mm.ui.base.h.b(this.mController.ylL, getString(2131299643), false, null);
          aw.RS().aa(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(27000);
              nt localnt = new nt();
              localnt.cJY.type = 4;
              localnt.cJY.cKd = this.fkD;
              localnt.cJY.toUser = this.cgl;
              localnt.cJY.cAN = paramIntent;
              com.tencent.mm.sdk.b.a.xxA.m(localnt);
              al.d(new NoteEditorUI.6.1(this));
              AppMethodBeat.o(27000);
            }

            public final String toString()
            {
              AppMethodBeat.i(27001);
              String str = super.toString() + "|onActivityResult";
              AppMethodBeat.o(27001);
              return str;
            }
          });
          paramInt1 = 2;
          continue;
          if (paramIntent == null)
          {
            localObject1 = null;
            label325: if (paramIntent != null)
              break label369;
          }
          label369: for (paramIntent = null; ; paramIntent = paramIntent.getStringExtra("custom_send_text"))
          {
            if (!bo.isNullOrNil((String)localObject1))
              break label380;
            ab.w("MicroMsg.Note.NoteEditorUI", "want to send record msg, but toUser is null");
            AppMethodBeat.o(27072);
            break;
            localObject1 = paramIntent.getStringExtra("Select_Conv_User");
            break label325;
          }
          label380: localObject2 = com.tencent.mm.ui.base.h.b(this.mController.ylL, getString(2131299643), false, null);
          localObject3 = new gh();
          ((gh)localObject3).cAH.type = 13;
          ((gh)localObject3).cAH.context = this.mController.ylL;
          ((gh)localObject3).cAH.toUser = ((String)localObject1);
          ((gh)localObject3).cAH.cAN = paramIntent;
          ((gh)localObject3).cAH.cvv = this.fDy;
          ((gh)localObject3).cAH.cAM = new NoteEditorUI.7(this, (Dialog)localObject2);
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject3);
          paramInt1 = 2;
          continue;
          ab.i("MicroMsg.Note.NoteEditorUI", "onActivityResult back from gallery");
          if (paramIntent.getParcelableExtra("key_req_result") == null);
          for (paramInt1 = 2; ; paramInt1 = 1)
          {
            localObject2 = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
            if ((localObject2 == null) || (((ArrayList)localObject2).size() <= 0))
              break label755;
            com.tencent.mm.plugin.report.service.h.pYm.e(14547, new Object[] { Integer.valueOf(paramInt1) });
            if (!com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().gF(0, ((ArrayList)localObject2).size()))
              break label590;
            ddW();
            paramInt1 = 0;
            break;
          }
          label590: Object localObject1 = this.mController.ylL;
          getString(2131297061);
          this.ehJ = com.tencent.mm.ui.base.h.b((Context)localObject1, getString(2131297086), true, new NoteEditorUI.8(this));
          aw.RS().aa(new NoteEditorUI.9(this, (ArrayList)localObject2));
          while (true)
          {
            localObject1 = paramIntent.getStringArrayListExtra("key_select_video_list");
            localObject2 = paramIntent.getStringExtra("K_SEGMENTVIDEOPATH");
            paramIntent = (Intent)localObject1;
            if (!bo.isNullOrNil((String)localObject2))
            {
              paramIntent = (Intent)localObject1;
              if (localObject1 == null)
              {
                paramIntent = new ArrayList();
                paramIntent.add(localObject2);
              }
            }
            if ((paramIntent == null) || (paramIntent.size() <= 0))
              break label1076;
            com.tencent.mm.plugin.report.service.h.pYm.e(14547, new Object[] { Integer.valueOf(paramInt1) });
            if (!com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().gF(0, paramIntent.size()))
              break label767;
            ddW();
            paramInt1 = 0;
            break;
            label755: ab.i("MicroMsg.Note.NoteEditorUI", "no pic selected");
          }
          label767: localObject1 = (String)paramIntent.get(0);
          paramIntent = com.tencent.mm.plugin.sight.base.d.WR((String)localObject1);
          if (paramIntent == null)
          {
            ab.e("MicroMsg.Note.NoteEditorUI", "mediaInfo is null, videoPath is %s", new Object[] { bo.nullAsNil((String)localObject1) });
            paramInt1 = 0;
          }
          else
          {
            paramInt1 = paramIntent.ckU();
            paramIntent = new com.tencent.mm.plugin.wenote.model.a.k();
            paramIntent.uOp = true;
            paramIntent.thumbPath = "";
            paramIntent.cHg = "";
            paramIntent.duration = paramInt1;
            paramIntent.type = 6;
            paramIntent.uOo = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().des();
            paramIntent.uOf = com.tencent.mm.vfs.e.cv((String)localObject1);
            paramIntent.mnd = com.tencent.mm.plugin.wenote.model.f.agW(paramIntent.toString());
            this.uSX = new aar();
            this.uSX.akU(paramIntent.mnd);
            this.uSX.akR(paramIntent.uOf);
            String str = com.tencent.mm.plugin.wenote.model.f.c(this.uSX);
            localObject2 = com.tencent.mm.plugin.wenote.model.f.o(this.uSX);
            if (bo.isNullOrNil((String)localObject1))
            {
              ab.e("MicroMsg.Note.NoteEditorUI", "video is null");
              paramInt1 = 0;
            }
            else
            {
              ab.v("MicroMsg.Note.NoteEditorUI", "compressNoteVideo path: %s", new Object[] { localObject1 });
              localObject3 = new ArrayList();
              ((ArrayList)localObject3).add(localObject1);
              localObject1 = new com.tencent.mm.plugin.wenote.model.nativenote.manager.d((List)localObject3, str, (String)localObject2, paramIntent, new NoteEditorUI.14(this));
              localObject2 = this.mController.ylL;
              getString(2131297061);
              this.ehJ = com.tencent.mm.ui.base.h.b((Context)localObject2, getString(2131297086), true, new NoteEditorUI.15(this, (com.tencent.mm.plugin.wenote.model.nativenote.manager.d)localObject1, paramIntent));
              com.tencent.mm.sdk.g.d.post((Runnable)localObject1, "NoteEditor_importVideo");
              paramInt1 = 0;
              continue;
              label1076: ab.i("MicroMsg.Note.NoteEditorUI", "no video selected");
              paramInt1 = 0;
              continue;
              com.tencent.mm.plugin.report.service.h.pYm.e(14547, new Object[] { Integer.valueOf(4) });
              if (com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().gF(0, 1))
              {
                ddW();
                paramInt1 = 0;
              }
              else
              {
                localObject1 = new com.tencent.mm.plugin.wenote.model.a.g();
                ((com.tencent.mm.plugin.wenote.model.a.g)localObject1).lat = ((float)paramIntent.getDoubleExtra("kwebmap_slat", 0.0D));
                ((com.tencent.mm.plugin.wenote.model.a.g)localObject1).lng = ((float)paramIntent.getDoubleExtra("kwebmap_lng", 0.0D));
                ((com.tencent.mm.plugin.wenote.model.a.g)localObject1).scale = paramIntent.getIntExtra("kwebmap_scale", 0);
                ((com.tencent.mm.plugin.wenote.model.a.g)localObject1).fBg = bo.bc(paramIntent.getStringExtra("Kwebmap_locaion"), "");
                ((com.tencent.mm.plugin.wenote.model.a.g)localObject1).eUu = paramIntent.getStringExtra("kPoiName");
                ((com.tencent.mm.plugin.wenote.model.a.g)localObject1).uOo = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().des();
                ((com.tencent.mm.plugin.wenote.model.a.g)localObject1).type = 3;
                ((com.tencent.mm.plugin.wenote.model.a.g)localObject1).uOp = true;
                ((com.tencent.mm.plugin.wenote.model.a.g)localObject1).cHg = "";
                com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().a((com.tencent.mm.plugin.wenote.model.a.c)localObject1, this.uSJ.deW(), false, false, false);
                paramInt1 = 0;
                continue;
                com.tencent.mm.plugin.report.service.h.pYm.e(14547, new Object[] { Integer.valueOf(5) });
                localObject1 = paramIntent.getStringExtra("choosed_file_path");
                if (bo.isNullOrNil((String)localObject1))
                {
                  paramInt1 = 1;
                }
                else
                {
                  paramIntent = new com.tencent.mm.vfs.b((String)localObject1);
                  if (!paramIntent.exists())
                  {
                    paramInt1 = 1;
                  }
                  else if (paramIntent.length() >= mky)
                  {
                    paramInt1 = 3;
                  }
                  else if (com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().gF(0, 1))
                  {
                    ddW();
                    paramInt1 = 2;
                  }
                  else
                  {
                    if (this.ehJ != null)
                    {
                      this.ehJ.dismiss();
                      this.ehJ = null;
                    }
                    localObject2 = this.mController.ylL;
                    getString(2131297061);
                    this.ehJ = com.tencent.mm.ui.base.h.b((Context)localObject2, getString(2131297086), true, new NoteEditorUI.10(this));
                    localObject2 = new com.tencent.mm.plugin.wenote.model.a.d();
                    ((com.tencent.mm.plugin.wenote.model.a.d)localObject2).title = paramIntent.getName();
                    ((com.tencent.mm.plugin.wenote.model.a.d)localObject2).content = com.tencent.mm.plugin.wenote.model.f.aC((float)paramIntent.length());
                    ((com.tencent.mm.plugin.wenote.model.a.d)localObject2).hNN = com.tencent.mm.plugin.wenote.model.h.aha(com.tencent.mm.vfs.e.cv((String)localObject1));
                    ((com.tencent.mm.plugin.wenote.model.a.d)localObject2).uOo = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().des();
                    ((com.tencent.mm.plugin.wenote.model.a.d)localObject2).type = 5;
                    ((com.tencent.mm.plugin.wenote.model.a.d)localObject2).uOp = true;
                    ((com.tencent.mm.plugin.wenote.model.a.d)localObject2).uOf = com.tencent.mm.vfs.e.cv((String)localObject1);
                    ((com.tencent.mm.plugin.wenote.model.a.d)localObject2).mnd = com.tencent.mm.plugin.wenote.model.f.agW(localObject2.toString());
                    this.uSX = new aar();
                    this.uSX.akU(((com.tencent.mm.plugin.wenote.model.a.d)localObject2).mnd);
                    this.uSX.akR(((com.tencent.mm.plugin.wenote.model.a.d)localObject2).uOf);
                    ((com.tencent.mm.plugin.wenote.model.a.d)localObject2).cHg = com.tencent.mm.plugin.wenote.model.f.o(this.uSX);
                    com.tencent.mm.vfs.e.y((String)localObject1, ((com.tencent.mm.plugin.wenote.model.a.d)localObject2).cHg);
                    com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().a((com.tencent.mm.plugin.wenote.model.a.c)localObject2, this.uSJ.deW(), false, true, false);
                    paramInt1 = 2;
                    continue;
                    this.fbD.post(new NoteEditorUI.11(this));
                    paramInt1 = 2;
                    continue;
                    if (paramIntent == null)
                    {
                      localObject1 = null;
                      label1629: if (paramIntent != null)
                        break label1673;
                    }
                    label1673: for (paramIntent = null; ; paramIntent = paramIntent.getStringExtra("custom_send_text"))
                    {
                      if (!bo.isNullOrNil((String)localObject1))
                        break label1684;
                      ab.w("MicroMsg.Note.NoteEditorUI", "want to send note from sns, but toUser is null");
                      AppMethodBeat.o(27072);
                      break;
                      localObject1 = paramIntent.getStringExtra("Select_Conv_User");
                      break label1629;
                    }
                    label1684: localObject2 = com.tencent.mm.ui.base.h.b(this.mController.ylL, getString(2131299643), false, null);
                    localObject3 = new gh();
                    ((gh)localObject3).cAH.type = 13;
                    ((gh)localObject3).cAH.context = this.mController.ylL;
                    ((gh)localObject3).cAH.toUser = ((String)localObject1);
                    ((gh)localObject3).cAH.cAN = paramIntent;
                    ((gh)localObject3).cAH.cvv = this.fDy;
                    ((gh)localObject3).cAH.cvC = com.tencent.mm.plugin.wenote.model.c.ddG().uMN.uMZ;
                    ((gh)localObject3).cAH.cAM = new NoteEditorUI.13(this, (Dialog)localObject2);
                    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject3);
                    paramInt1 = 2;
                  }
                }
              }
            }
          }
        }
        paramIntent = paramIntent.getBundleExtra("result_data");
        if ((paramIntent != null) && (paramIntent.getString("go_next", "").equals("gdpr_auth_location")))
        {
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVP, Boolean.TRUE);
          com.tencent.mm.pluginsdk.permission.b.b(this.mController.ylL, "android.permission.ACCESS_COARSE_LOCATION", 64);
        }
      }
      label1882: if (1 == paramInt1)
      {
        com.tencent.mm.ui.base.h.bQ(this.mController.ylL, getString(2131299621));
        AppMethodBeat.o(27072);
      }
      else
      {
        if (3 == paramInt1)
          Toast.makeText(this.mController.ylL, getString(2131299756), 1).show();
        AppMethodBeat.o(27072);
      }
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(27055);
    if (!dfK())
      AppMethodBeat.o(27055);
    while (true)
    {
      return;
      goBack();
      super.onBackPressed();
      AppMethodBeat.o(27055);
    }
  }

  public void onCancel()
  {
    AppMethodBeat.i(27078);
    super.onCancel();
    if (this.uTn)
    {
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().oq(false);
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().op(false);
    }
    AppMethodBeat.o(27078);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(27054);
    this.ylm = true;
    this.uQI = getIntent().getIntExtra("note_open_from_scene", 2);
    this.cvx = getIntent().getLongExtra("note_msgid", -1L);
    this.uTl = getIntent().getBooleanExtra("record_show_share", false);
    this.fDy = getIntent().getLongExtra("note_fav_localid", -1L);
    this.lsy = getIntent().getStringExtra("note_link_sns_localid");
    this.uMY = getIntent().getBooleanExtra("edit_status", false);
    this.uNq = getIntent().getBooleanExtra("need_save", false);
    this.uSQ = this.uNq;
    this.uTb = getIntent().getStringExtra("fav_note_xml");
    this.uTd = getIntent().getIntExtra("fav_note_scroll_to_position", 0);
    this.uTe = getIntent().getIntExtra("fav_note_scroll_to_offset", 0);
    this.lZg = getIntent().getStringExtra("fav_note_thumbpath");
    this.uTg = getIntent().getBooleanExtra("show_share", true);
    this.uTj = getIntent().getStringExtra("fav_note_link_sns_xml");
    Object localObject1 = getIntent().getStringExtra("fav_note_link_source_info");
    this.uTm = getIntent().getBooleanExtra("fav_note_out_of_date", false);
    if (!bo.isNullOrNil((String)localObject1))
      this.uTf = ((String)localObject1).split(";");
    if (getIntent().getIntExtra("note_fav_post_scene", 0) == 6)
      this.uTi = true;
    com.tencent.mm.plugin.wenote.model.d.uNa = false;
    if ((this.uTf == null) && (this.fDy > 0L))
    {
      localObject1 = new gh();
      ((gh)localObject1).cAH.type = 30;
      ((gh)localObject1).cAH.cAO = 3;
      ((gh)localObject1).cAH.cvv = this.fDy;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      if (!bo.isNullOrNil(((gh)localObject1).cAI.path))
        break label386;
    }
    label386: for (localObject1 = null; ; localObject1 = ((gh)localObject1).cAI.path.split(";"))
    {
      this.uTf = ((String[])localObject1);
      if ((this.uTf == null) || (this.uTf.length >= 3))
        break;
      AppMethodBeat.o(27054);
      return;
    }
    this.fbD = new ak();
    localObject1 = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem();
    ((com.tencent.mm.plugin.wenote.model.nativenote.manager.c)localObject1).iPr = new ArrayList();
    ((com.tencent.mm.plugin.wenote.model.nativenote.manager.c)localObject1).uPa = this;
    ((com.tencent.mm.plugin.wenote.model.nativenote.manager.c)localObject1).uPb = new aar();
    ((com.tencent.mm.plugin.wenote.model.nativenote.manager.c)localObject1).uPc = 0;
    ((com.tencent.mm.plugin.wenote.model.nativenote.manager.c)localObject1).uPd = 0;
    ((com.tencent.mm.plugin.wenote.model.nativenote.manager.c)localObject1).uPe = 0;
    ab.i("MicroMsg.Note.NoteEditorUI", "OnCreate MainActivity, before setContentView");
    com.tencent.mm.pluginsdk.f.m(this);
    super.onCreate(paramBundle);
    iL(this.fDy);
    ab.i("MicroMsg.Note.NoteEditorUI", "OnCreate MainActivity, after setContentView");
    paramBundle = new i();
    paramBundle.content = "";
    paramBundle.uNT = true;
    paramBundle.uNZ = false;
    if (this.uMY)
    {
      com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().a(paramBundle);
      this.uTi = true;
    }
    this.WL = this.mController.contentView;
    this.WL.getRootView().setBackgroundColor(-1);
    this.aiB = ((RecyclerView)findViewById(2131826383));
    this.uSL = ((LinearLayout)this.WL.findViewById(2131826382));
    this.uSL.setVisibility(8);
    this.uTa = ((LinearLayout)this.uSL.findViewById(2131826424));
    this.uTa.setVisibility(8);
    this.uSN = ((RelativeLayout)findViewById(2131826384));
    this.uSN.setOnClickListener(new NoteEditorUI.1(this));
    this.uSO = new com.tencent.mm.plugin.wenote.model.nativenote.manager.g(this, this.uSN);
    this.uSO.uPC = this;
    this.uST = new com.tencent.mm.plugin.wenote.ui.nativenote.a.a();
    this.uST.uUf = j.db(this)[1];
    this.aiB.setLayoutManager(this.uST);
    this.aiB.setHasFixedSize(true);
    this.uSW = new NoteEditorUI.a(this);
    this.aiB.a(this.uSW);
    this.uSJ = new com.tencent.mm.plugin.wenote.model.nativenote.manager.k(this);
    this.uSJ.cvv = this.fDy;
    this.uSJ.uQI = this.uQI;
    this.uSJ.uQJ = this.uTi;
    if (this.uNq)
    {
      paramBundle = this.uSJ;
      if ((paramBundle.uQB < 0L) && (paramBundle.cvv > 0L))
      {
        paramBundle.uQL.ae(60000L, 60000L);
        paramBundle.uQB = bo.yz();
        paramBundle.uQC = "";
      }
    }
    this.uSK = new com.tencent.mm.plugin.wenote.ui.nativenote.a.c(this.uSJ);
    this.aiB.setAdapter(this.uSK);
    if (this.uQI == 2)
      this.aiB.setOnTouchListener(this.uTq);
    this.aiB.getItemAnimator().aot = 0L;
    this.aiB.getItemAnimator().aow = 0L;
    this.aiB.getItemAnimator().aov = 0L;
    this.aiB.getItemAnimator().aou = 120L;
    ((av)this.aiB.getItemAnimator()).arN = false;
    this.uTo = com.tencent.mm.bz.a.fromDPToPix(this, 48);
    boolean bool;
    if (this.uTn)
    {
      ab.i("MicroMsg.Note.NoteEditorUI", "use multiselect");
      if ((this.uQI == 2) && (this.uTi))
      {
        bool = true;
        label995: int i = getResources().getColor(2131690318);
        paramBundle = com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb();
        ab.i("NoteSelectManager", "onInit start");
        paramBundle.uRh = bool;
        paramBundle.uRk = 14;
        paramBundle.uRl = 32;
        paramBundle.uRm = (com.tencent.mm.bz.a.fromDPToPix(this, 21) - paramBundle.uRl);
        paramBundle.uRn = (com.tencent.mm.bz.a.fromDPToPix(this, 40) + paramBundle.uRl * 2);
        paramBundle.uRo = (com.tencent.mm.bz.a.fromDPToPix(this, 240) + paramBundle.uRl * 2);
        paramBundle.uRi = com.tencent.mm.bz.a.fromDPToPix(this, 22);
        paramBundle.uRj = com.tencent.mm.bz.a.fromDPToPix(this, 1);
        paramBundle.mScreenHeight = getResources().getDisplayMetrics().heightPixels;
        paramBundle.mScreenWidth = getResources().getDisplayMetrics().widthPixels;
        paramBundle.uRs = new int[] { -1, -1 };
        paramBundle.uRt = new int[] { -1, -1 };
        paramBundle.uRu = new int[] { -1, -1 };
        paramBundle.uRv = new int[] { -1, -1 };
        localObject1 = new com.tencent.mm.plugin.wenote.model.nativenote.c.a(this, 2, paramBundle.uRi, paramBundle.uRj, i, paramBundle);
        paramBundle.uRw = new PopupWindow((View)localObject1, ((com.tencent.mm.plugin.wenote.model.nativenote.c.a)localObject1).getViewWidth(), ((com.tencent.mm.plugin.wenote.model.nativenote.c.a)localObject1).getViewHeight(), false);
        paramBundle.uRw.setClippingEnabled(false);
        paramBundle.uRw.setAnimationStyle(2131493881);
        paramBundle.uRq = ((com.tencent.mm.plugin.wenote.model.nativenote.c.a)localObject1).getOffsetForCursorMid();
        paramBundle.uRr = com.tencent.mm.bz.a.fromDPToPix(this, 6);
        Object localObject2 = new com.tencent.mm.plugin.wenote.model.nativenote.c.a(this, 3, paramBundle.uRi, paramBundle.uRj, i, paramBundle);
        paramBundle.uRx = new PopupWindow((View)localObject2, ((com.tencent.mm.plugin.wenote.model.nativenote.c.a)localObject2).getViewWidth(), ((com.tencent.mm.plugin.wenote.model.nativenote.c.a)localObject1).getViewHeight(), false);
        paramBundle.uRx.setClippingEnabled(false);
        paramBundle.uRx.setAnimationStyle(2131493880);
        localObject2 = new com.tencent.mm.plugin.wenote.model.nativenote.c.a(this, 4, paramBundle.uRi, paramBundle.uRj, i, paramBundle);
        paramBundle.uRy = new PopupWindow((View)localObject2, ((com.tencent.mm.plugin.wenote.model.nativenote.c.a)localObject2).getViewWidth(), ((com.tencent.mm.plugin.wenote.model.nativenote.c.a)localObject1).getViewHeight(), false);
        paramBundle.uRy.setClippingEnabled(false);
        paramBundle.uRy.setAnimationStyle(2131493882);
        localObject2 = LayoutInflater.from(this).inflate(2130970317, null);
        ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        paramBundle.uRz = new PopupWindow((View)localObject2, -2, -2, false);
        paramBundle.uRz.setBackgroundDrawable(getResources().getDrawable(2130840364));
        paramBundle.uRz.setClippingEnabled(false);
        paramBundle.uRz.setAnimationStyle(2131493884);
        paramBundle.uRF = ((TextView)((View)localObject2).findViewById(2131826415));
        paramBundle.uRG = ((TextView)((View)localObject2).findViewById(2131826416));
        paramBundle.uRH = ((TextView)((View)localObject2).findViewById(2131826417));
        paramBundle.uRI = ((TextView)((View)localObject2).findViewById(2131826418));
        paramBundle.uRJ = ((TextView)((View)localObject2).findViewById(2131826422));
        paramBundle.uRK = ((TextView)((View)localObject2).findViewById(2131826419));
        paramBundle.uRL = ((TextView)((View)localObject2).findViewById(2131826420));
        paramBundle.uRM = ((TextView)((View)localObject2).findViewById(2131826421));
        com.tencent.mm.plugin.wenote.model.nativenote.c.e.g(paramBundle.uRF, paramBundle.uRk);
        com.tencent.mm.plugin.wenote.model.nativenote.c.e.g(paramBundle.uRG, paramBundle.uRk);
        com.tencent.mm.plugin.wenote.model.nativenote.c.e.g(paramBundle.uRH, paramBundle.uRk);
        com.tencent.mm.plugin.wenote.model.nativenote.c.e.g(paramBundle.uRI, paramBundle.uRk);
        com.tencent.mm.plugin.wenote.model.nativenote.c.e.g(paramBundle.uRJ, paramBundle.uRk);
        com.tencent.mm.plugin.wenote.model.nativenote.c.e.g(paramBundle.uRK, paramBundle.uRk);
        com.tencent.mm.plugin.wenote.model.nativenote.c.e.g(paramBundle.uRL, paramBundle.uRk);
        com.tencent.mm.plugin.wenote.model.nativenote.c.e.g(paramBundle.uRM, paramBundle.uRk);
        paramBundle.uRF.setOnClickListener(new e.10(paramBundle));
        paramBundle.uRG.setOnClickListener(new e.11(paramBundle));
        paramBundle.uRH.setOnClickListener(new e.12(paramBundle));
        paramBundle.uRI.setOnClickListener(new e.13(paramBundle));
        paramBundle.uRJ.setOnClickListener(new e.2(paramBundle));
        paramBundle.uRK.setOnClickListener(new e.3(paramBundle));
        paramBundle.uRL.setOnClickListener(new e.4(paramBundle));
        paramBundle.uRM.setOnClickListener(new e.5(paramBundle));
        paramBundle.uRp = ((com.tencent.mm.plugin.wenote.model.nativenote.c.a)localObject1).getViewPadding();
        paramBundle.uRA = this;
        paramBundle.uRB = new com.tencent.mm.plugin.wenote.model.nativenote.c.d();
        paramBundle.uRC = new com.tencent.mm.plugin.wenote.model.nativenote.c.b();
        paramBundle.mHandler = new ak();
        com.tencent.mm.plugin.wenote.model.nativenote.c.e.mHasInit = true;
        ab.i("NoteSelectManager", "onInit end");
        this.uTp = new RecyclerView.m()
        {
          public final void a(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt1, int paramAnonymousInt2)
          {
            AppMethodBeat.i(27043);
            super.a(paramAnonymousRecyclerView, paramAnonymousInt1, paramAnonymousInt2);
            if (paramAnonymousInt2 > 30)
            {
              com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().dfj();
              com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().dfh();
            }
            com.tencent.mm.plugin.wenote.model.nativenote.c.d locald = com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().dfd();
            if (((NoteEditorUI.O(NoteEditorUI.this)) || ((NoteEditorUI.P(NoteEditorUI.this) != null) && (NoteEditorUI.P(NoteEditorUI.this).getVisibility() == 0))) && (locald.dfa() == 2) && (com.tencent.mm.plugin.wenote.model.nativenote.c.f.f(paramAnonymousRecyclerView, locald.coc) == null))
              NoteEditorUI.this.deb();
            AppMethodBeat.o(27043);
          }

          public final void c(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt)
          {
            AppMethodBeat.i(27042);
            super.c(paramAnonymousRecyclerView, paramAnonymousInt);
            switch (paramAnonymousInt)
            {
            default:
            case 1:
            case 2:
            case 0:
            }
            while (true)
            {
              AppMethodBeat.o(27042);
              while (true)
              {
                return;
                com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().dfj();
                com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().dfh();
                AppMethodBeat.o(27042);
                continue;
                AppMethodBeat.o(27042);
              }
              boolean bool = com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().dfi();
              com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().oq(bool);
              bool = com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().dfg();
              com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().op(bool);
              com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().h(false, 50L);
            }
          }
        };
        this.aiB.a(this.uTp);
      }
    }
    else
    {
      if (this.lzK != null)
      {
        this.lzK.dismiss();
        this.lzK = null;
      }
      if ((!this.uMY) && (!this.uTm))
        this.lzK = com.tencent.mm.ui.base.h.b(this.mController.ylL, getString(2131305714), true, new NoteEditorUI.12(this));
      if (this.uTm)
      {
        ab.i("MicroMsg.Note.NoteEditorUI", "open msg note,  out of date");
        com.tencent.mm.ui.base.h.b(this.mController.ylL, this.mController.ylL.getString(2131301747), null, true);
      }
      if (this.uTg)
        addIconOptionMenu(1, 2131304081, 2131230740, new NoteEditorUI.23(this));
      if (!this.uTi)
        break label2538;
      setMMTitle(getString(2131299765));
      label2038: pP(true);
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          AppMethodBeat.i(27039);
          if (!NoteEditorUI.K(NoteEditorUI.this))
            AppMethodBeat.o(27039);
          while (true)
          {
            return true;
            NoteEditorUI.L(NoteEditorUI.this);
            NoteEditorUI.this.finish();
            AppMethodBeat.o(27039);
          }
        }
      }
      , 2131230737);
      com.tencent.mm.pluginsdk.f.n(this);
      if (this.uMY)
      {
        g(true, 300L);
        af(1, 0L);
      }
      if ((this.uQI != 2) || (!this.uTi))
        break label2552;
      this.uSM = new c();
      paramBundle = this.uSM;
      localObject1 = this.uSL;
      paramBundle.gLe = ((View)localObject1);
      com.tencent.mm.plugin.wenote.model.nativenote.manager.k.deT().uQD = paramBundle;
      paramBundle.uTL = ((LinearLayout)((View)localObject1).findViewById(2131826424));
      paramBundle.uTK = ((ImageButton)((View)localObject1).findViewById(2131826374));
      paramBundle.uTM = ((ImageButton)((View)localObject1).findViewById(2131826370));
      paramBundle.uTN = ((ImageButton)((View)localObject1).findViewById(2131826369));
      paramBundle.uTO = ((ImageButton)((View)localObject1).findViewById(2131826368));
      paramBundle.uTP = ((ImageButton)((View)localObject1).findViewById(2131826371));
      paramBundle.uTQ = ((LinearLayout)paramBundle.uTL.findViewById(2131826426));
      paramBundle.uTR = ((LinearLayout)paramBundle.uTL.findViewById(2131826425));
      paramBundle.uTS = ((LinearLayout)paramBundle.uTL.findViewById(2131826429));
      paramBundle.uTT = ((LinearLayout)paramBundle.uTL.findViewById(2131826430));
      paramBundle.uTU = ((LinearLayout)paramBundle.uTL.findViewById(2131826431));
      paramBundle.uTK.setOnClickListener(new c.1(paramBundle, this));
      paramBundle.uTO.setOnClickListener(new c.6(paramBundle, this));
      paramBundle.uTP.setOnClickListener(new c.7(paramBundle, this, this));
      paramBundle.uTM.setOnClickListener(new c.8(paramBundle, this));
      paramBundle.uTN.setOnClickListener(new c.9(paramBundle, this));
      paramBundle.uTU.setOnClickListener(new c.10(paramBundle, this));
      paramBundle.uTQ.setOnClickListener(new c.11(paramBundle, this));
      paramBundle.uTR.setOnClickListener(new c.12(paramBundle, this));
      paramBundle.uTS.setOnClickListener(new c.13(paramBundle, this));
      paramBundle.uTT.setOnClickListener(new c.2(paramBundle, this));
      getWindow().setSoftInputMode(18);
    }
    while (true)
    {
      this.aiB.getViewTreeObserver().addOnGlobalLayoutListener(this.aeL);
      this.uTh = System.currentTimeMillis();
      ab.i("MicroMsg.Note.NoteEditorUI", "startnoteeditorui, oncreate , currenttime is %d", new Object[] { Long.valueOf(this.uTh) });
      aw.Rg().a(921, this);
      AppMethodBeat.o(27054);
      break;
      bool = false;
      break label995;
      label2538: setMMTitle(getString(2131299766));
      break label2038;
      label2552: this.uSL.setVisibility(8);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(27062);
    super.onDestroy();
    if (this.uTn)
    {
      if (this.aiB != null)
        this.aiB.b(this.uTp);
      localObject = com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb();
      ab.i("NoteSelectManager", "onDestroy");
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.mHasInit = false;
      if (((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).uRD != null)
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).uRD.stopTimer();
      if (((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).uRE != null)
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).uRE.stopTimer();
      if (((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).uRw != null)
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).uRw.dismiss();
      if (((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).uRx != null)
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).uRx.dismiss();
      if (((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).uRy != null)
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).uRy.dismiss();
      if (((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).uRz != null)
        ((com.tencent.mm.plugin.wenote.model.nativenote.c.e)localObject).uRz.dismiss();
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.uRg = null;
    }
    aw.Rg().b(921, this);
    if (this.uSJ != null)
    {
      localObject = this.uSJ;
      ((com.tencent.mm.plugin.wenote.model.nativenote.manager.k)localObject).uQL.stopTimer();
      ((com.tencent.mm.plugin.wenote.model.nativenote.manager.k)localObject).uQB = -1L;
      if (com.tencent.mm.plugin.wenote.model.nativenote.manager.k.uQx == localObject)
        com.tencent.mm.plugin.wenote.model.nativenote.manager.k.uQx = null;
    }
    if (com.tencent.mm.plugin.wenote.model.c.ddG().uMN != null)
    {
      com.tencent.mm.plugin.wenote.model.c.ddG().uMN.uMT.clear();
      com.tencent.mm.plugin.wenote.model.c.ddG().uMN.uMS.clear();
      com.tencent.mm.plugin.wenote.model.c.ddG().uMN.uMR.clear();
    }
    Object localObject = com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a.dfY();
    ((com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a)localObject).stopPlay();
    ((com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a)localObject).mfW = null;
    ((com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a)localObject).mfS = null;
    ((com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a)localObject).callbacks.clear();
    com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a.uVh = null;
    if (com.tencent.mm.plugin.wenote.model.k.ddO() != null)
    {
      com.tencent.mm.plugin.wenote.model.k.ddO();
      com.tencent.mm.plugin.wenote.model.k.destroy();
    }
    localObject = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem();
    ((com.tencent.mm.plugin.wenote.model.nativenote.manager.c)localObject).uPa = null;
    if (((com.tencent.mm.plugin.wenote.model.nativenote.manager.c)localObject).iPr != null)
    {
      localObject = ((com.tencent.mm.plugin.wenote.model.nativenote.manager.c)localObject).iPr.iterator();
      while (((Iterator)localObject).hasNext())
      {
        com.tencent.mm.plugin.wenote.model.a.c localc = (com.tencent.mm.plugin.wenote.model.a.c)((Iterator)localObject).next();
        localc.uNY = null;
        localc.uNW = null;
        localc.uNX = null;
      }
    }
    AppMethodBeat.o(27062);
  }

  public void onDrag()
  {
    AppMethodBeat.i(27077);
    super.onDrag();
    if (this.uTn)
    {
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().dfj();
      com.tencent.mm.plugin.wenote.model.nativenote.c.e.dfb().dfh();
    }
    AppMethodBeat.o(27077);
  }

  public final void onKeyboardStateChanged()
  {
    AppMethodBeat.i(27087);
    super.onKeyboardStateChanged();
    if (this.mController.ymc == 1);
    for (boolean bool = true; ; bool = false)
    {
      this.uSV = bool;
      if (this.uSV)
        af(1, 0L);
      if (this.uTn)
        this.fbD.postDelayed(new NoteEditorUI.19(this), 200L);
      AppMethodBeat.o(27087);
      return;
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(27076);
    super.onPause();
    if (this.uSM != null)
      this.uSM.a(this);
    if (com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a.dfY().buH())
      com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a.dfY().stopPlay();
    this.uTt = this.uSV;
    g(false, 0L);
    com.tencent.mm.plugin.wenote.model.a.q localq = com.tencent.mm.plugin.wenote.model.nativenote.manager.h.deH().deI();
    if (c(localq))
    {
      localq.uOu = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().ahf(getString(2131305653));
      localq.uOw = this.aaF;
      localq.uOx = this.uTc;
      com.tencent.mm.plugin.wenote.model.nativenote.manager.h.deH().a(localq);
    }
    AppMethodBeat.o(27076);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(27100);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.Note.NoteEditorUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(27100);
      return;
    }
    ab.i("MicroMsg.Note.NoteEditorUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 80:
    case 64:
    }
    while (true)
    {
      AppMethodBeat.o(27100);
      break;
      if (paramArrayOfInt[0] != 0)
      {
        ddX();
        AppMethodBeat.o(27100);
        break;
        if ((com.tencent.mm.au.b.sO((String)com.tencent.mm.kernel.g.RP().Ry().get(274436, null))) && (paramArrayOfInt[0] != 0))
          com.tencent.mm.ui.base.h.a(this.mController.ylL, getString(2131301926), getString(2131301936), getString(2131300878), getString(2131297773), false, new NoteEditorUI.27(this), null);
      }
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(27075);
    super.onResume();
    if (this.uQI == 2)
      switch (this.uTs)
      {
      default:
      case -1:
      case 4098:
      case 4099:
      case 4097:
      }
    while (true)
    {
      this.uTs = -1;
      this.uTr = false;
      AppMethodBeat.o(27075);
      return;
      if (this.uTt)
      {
        g(true, 100L);
        af(1, 0L);
        continue;
        g(true, 100L);
        af(1, 0L);
        continue;
        if (!this.uTr)
        {
          g(true, 100L);
          af(1, 0L);
        }
      }
    }
  }

  // ERROR //
  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: sipush 27103
    //   5: invokestatic 116	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload 4
    //   10: invokevirtual 2411	com/tencent/mm/ai/m:getType	()I
    //   13: sipush 921
    //   16: if_icmpeq +12 -> 28
    //   19: sipush 27103
    //   22: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: aload_0
    //   26: monitorexit
    //   27: return
    //   28: aload 4
    //   30: instanceof 2413
    //   33: ifne +17 -> 50
    //   36: sipush 27103
    //   39: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   42: goto -17 -> 25
    //   45: astore_3
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_3
    //   49: athrow
    //   50: aload 4
    //   52: checkcast 2413	com/tencent/mm/plugin/wenote/model/b
    //   55: astore 4
    //   57: aload 4
    //   59: getfield 2416	com/tencent/mm/plugin/wenote/model/b:uMF	I
    //   62: iconst_1
    //   63: if_icmpeq +12 -> 75
    //   66: sipush 27103
    //   69: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   72: goto -47 -> 25
    //   75: iload_2
    //   76: ifne +1459 -> 1535
    //   79: ldc_w 575
    //   82: ldc_w 2418
    //   85: invokestatic 704	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   88: aload_0
    //   89: getfield 268	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:aiB	Landroid/support/v7/widget/RecyclerView;
    //   92: invokevirtual 2422	android/support/v7/widget/RecyclerView:getAdapter	()Landroid/support/v7/widget/RecyclerView$a;
    //   95: astore 5
    //   97: aload 5
    //   99: ifnull +1338 -> 1437
    //   102: aload 5
    //   104: invokevirtual 2425	android/support/v7/widget/RecyclerView$a:getItemCount	()I
    //   107: istore 6
    //   109: iload 6
    //   111: ifgt +107 -> 218
    //   114: aload_0
    //   115: invokespecial 505	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:bpD	()V
    //   118: aload_0
    //   119: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   122: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   125: aload_0
    //   126: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   129: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   132: ldc_w 2426
    //   135: invokevirtual 2100	android/support/v7/app/AppCompatActivity:getString	(I)Ljava/lang/String;
    //   138: iconst_1
    //   139: invokestatic 1017	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   142: invokevirtual 1020	android/widget/Toast:show	()V
    //   145: getstatic 1339	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   148: astore_3
    //   149: aload_0
    //   150: getfield 194	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uTi	Z
    //   153: ifeq +60 -> 213
    //   156: iconst_1
    //   157: istore_1
    //   158: aload_3
    //   159: sipush 14811
    //   162: iconst_5
    //   163: anewarray 171	java/lang/Object
    //   166: dup
    //   167: iconst_0
    //   168: iconst_0
    //   169: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   172: aastore
    //   173: dup
    //   174: iconst_1
    //   175: iconst_0
    //   176: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   179: aastore
    //   180: dup
    //   181: iconst_2
    //   182: iconst_0
    //   183: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   186: aastore
    //   187: dup
    //   188: iconst_3
    //   189: iconst_1
    //   190: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   193: aastore
    //   194: dup
    //   195: iconst_4
    //   196: iload_1
    //   197: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   200: aastore
    //   201: invokevirtual 1342	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   204: sipush 27103
    //   207: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   210: goto -185 -> 25
    //   213: iconst_0
    //   214: istore_1
    //   215: goto -57 -> 158
    //   218: iconst_0
    //   219: istore_2
    //   220: invokestatic 2432	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   223: invokevirtual 2435	java/lang/Runtime:maxMemory	()J
    //   226: ldc2_w 2436
    //   229: ldiv
    //   230: l2i
    //   231: bipush 8
    //   233: idiv
    //   234: istore_1
    //   235: new 2439	com/tencent/mm/memory/a/b
    //   238: astore 7
    //   240: aload 7
    //   242: iload_1
    //   243: aload_0
    //   244: invokevirtual 2443	java/lang/Object:getClass	()Ljava/lang/Class;
    //   247: invokespecial 2446	com/tencent/mm/memory/a/b:<init>	(ILjava/lang/Class;)V
    //   250: iconst_0
    //   251: istore_1
    //   252: iload_1
    //   253: iload 6
    //   255: if_icmpge +508 -> 763
    //   258: aload 5
    //   260: aload_0
    //   261: getfield 268	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:aiB	Landroid/support/v7/widget/RecyclerView;
    //   264: aload 5
    //   266: iload_1
    //   267: invokevirtual 2449	android/support/v7/widget/RecyclerView$a:getItemViewType	(I)I
    //   270: invokevirtual 2452	android/support/v7/widget/RecyclerView$a:c	(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$v;
    //   273: astore 8
    //   275: aload 5
    //   277: aload 8
    //   279: iload_1
    //   280: invokevirtual 2455	android/support/v7/widget/RecyclerView$a:a	(Landroid/support/v7/widget/RecyclerView$v;I)V
    //   283: aload 8
    //   285: getfield 2460	android/support/v7/widget/RecyclerView$v:apJ	Landroid/view/View;
    //   288: aload_0
    //   289: getfield 268	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:aiB	Landroid/support/v7/widget/RecyclerView;
    //   292: invokevirtual 2463	android/support/v7/widget/RecyclerView:getWidth	()I
    //   295: ldc_w 2464
    //   298: invokestatic 1977	android/view/View$MeasureSpec:makeMeasureSpec	(II)I
    //   301: iconst_0
    //   302: iconst_0
    //   303: invokestatic 1977	android/view/View$MeasureSpec:makeMeasureSpec	(II)I
    //   306: invokevirtual 1980	android/view/View:measure	(II)V
    //   309: aload 8
    //   311: getfield 2460	android/support/v7/widget/RecyclerView$v:apJ	Landroid/view/View;
    //   314: iconst_0
    //   315: iconst_0
    //   316: aload 8
    //   318: getfield 2460	android/support/v7/widget/RecyclerView$v:apJ	Landroid/view/View;
    //   321: invokevirtual 2467	android/view/View:getMeasuredWidth	()I
    //   324: aload 8
    //   326: getfield 2460	android/support/v7/widget/RecyclerView$v:apJ	Landroid/view/View;
    //   329: invokevirtual 2470	android/view/View:getMeasuredHeight	()I
    //   332: invokevirtual 2474	android/view/View:layout	(IIII)V
    //   335: aload 8
    //   337: getfield 2460	android/support/v7/widget/RecyclerView$v:apJ	Landroid/view/View;
    //   340: invokevirtual 2475	android/view/View:getWidth	()I
    //   343: istore 9
    //   345: aload 8
    //   347: getfield 2460	android/support/v7/widget/RecyclerView$v:apJ	Landroid/view/View;
    //   350: invokevirtual 2478	android/view/View:getHeight	()I
    //   353: istore 10
    //   355: iload_2
    //   356: istore 11
    //   358: iload 9
    //   360: ifle +68 -> 428
    //   363: iload_2
    //   364: istore 11
    //   366: iload 10
    //   368: ifle +60 -> 428
    //   371: iload 9
    //   373: iload 10
    //   375: getstatic 2484	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   378: invokestatic 2490	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   381: astore_3
    //   382: new 2492	android/graphics/Canvas
    //   385: astore 12
    //   387: aload 12
    //   389: aload_3
    //   390: invokespecial 2495	android/graphics/Canvas:<init>	(Landroid/graphics/Bitmap;)V
    //   393: aload 8
    //   395: getfield 2460	android/support/v7/widget/RecyclerView$v:apJ	Landroid/view/View;
    //   398: aload 12
    //   400: invokevirtual 2499	android/view/View:draw	(Landroid/graphics/Canvas;)V
    //   403: aload 7
    //   405: iload_1
    //   406: invokestatic 2501	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   409: aload_3
    //   410: invokeinterface 2507 3 0
    //   415: pop
    //   416: iload_2
    //   417: aload 8
    //   419: getfield 2460	android/support/v7/widget/RecyclerView$v:apJ	Landroid/view/View;
    //   422: invokevirtual 2470	android/view/View:getMeasuredHeight	()I
    //   425: iadd
    //   426: istore 11
    //   428: iinc 1 1
    //   431: iload 11
    //   433: istore_2
    //   434: goto -182 -> 252
    //   437: astore_3
    //   438: iconst_0
    //   439: istore_2
    //   440: iload_2
    //   441: iload_1
    //   442: if_icmpge +39 -> 481
    //   445: aload 7
    //   447: iload_2
    //   448: invokestatic 2501	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   451: invokeinterface 2508 2 0
    //   456: checkcast 2486	android/graphics/Bitmap
    //   459: astore_3
    //   460: aload_3
    //   461: ifnull +14 -> 475
    //   464: aload_3
    //   465: invokevirtual 2511	android/graphics/Bitmap:isRecycled	()Z
    //   468: ifne +7 -> 475
    //   471: aload_3
    //   472: invokevirtual 2514	android/graphics/Bitmap:recycle	()V
    //   475: iinc 2 1
    //   478: goto -38 -> 440
    //   481: aload_0
    //   482: invokespecial 505	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:bpD	()V
    //   485: aload_0
    //   486: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   489: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   492: aload_0
    //   493: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   496: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   499: ldc_w 2426
    //   502: invokevirtual 2100	android/support/v7/app/AppCompatActivity:getString	(I)Ljava/lang/String;
    //   505: iconst_1
    //   506: invokestatic 1017	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   509: invokevirtual 1020	android/widget/Toast:show	()V
    //   512: sipush 27103
    //   515: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   518: goto -493 -> 25
    //   521: astore 12
    //   523: aload_0
    //   524: invokespecial 505	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:bpD	()V
    //   527: aload_0
    //   528: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   531: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   534: aload_0
    //   535: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   538: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   541: ldc_w 2426
    //   544: invokevirtual 2100	android/support/v7/app/AppCompatActivity:getString	(I)Ljava/lang/String;
    //   547: iconst_1
    //   548: invokestatic 1017	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   551: invokevirtual 1020	android/widget/Toast:show	()V
    //   554: getstatic 1339	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   557: astore 12
    //   559: aload_0
    //   560: getfield 194	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uTi	Z
    //   563: ifeq +194 -> 757
    //   566: iconst_1
    //   567: istore 11
    //   569: aload 12
    //   571: sipush 14811
    //   574: iconst_5
    //   575: anewarray 171	java/lang/Object
    //   578: dup
    //   579: iconst_0
    //   580: iconst_0
    //   581: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   584: aastore
    //   585: dup
    //   586: iconst_1
    //   587: iconst_0
    //   588: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   591: aastore
    //   592: dup
    //   593: iconst_2
    //   594: iconst_0
    //   595: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   598: aastore
    //   599: dup
    //   600: iconst_3
    //   601: iconst_1
    //   602: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   605: aastore
    //   606: dup
    //   607: iconst_4
    //   608: iload 11
    //   610: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   613: aastore
    //   614: invokevirtual 1342	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   617: goto -214 -> 403
    //   620: astore_3
    //   621: ldc_w 575
    //   624: ldc_w 2516
    //   627: invokestatic 1150	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   630: aload_0
    //   631: invokespecial 505	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:bpD	()V
    //   634: aload_0
    //   635: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   638: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   641: aload_0
    //   642: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   645: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   648: ldc_w 2426
    //   651: invokevirtual 2100	android/support/v7/app/AppCompatActivity:getString	(I)Ljava/lang/String;
    //   654: iconst_1
    //   655: invokestatic 1017	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   658: invokevirtual 1020	android/widget/Toast:show	()V
    //   661: getstatic 1339	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   664: astore_3
    //   665: aload_0
    //   666: getfield 194	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uTi	Z
    //   669: ifeq +758 -> 1427
    //   672: iconst_1
    //   673: istore_1
    //   674: aload_3
    //   675: sipush 14811
    //   678: iconst_5
    //   679: anewarray 171	java/lang/Object
    //   682: dup
    //   683: iconst_0
    //   684: iconst_0
    //   685: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   688: aastore
    //   689: dup
    //   690: iconst_1
    //   691: iconst_0
    //   692: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   695: aastore
    //   696: dup
    //   697: iconst_2
    //   698: iconst_0
    //   699: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   702: aastore
    //   703: dup
    //   704: iconst_3
    //   705: iconst_2
    //   706: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   709: aastore
    //   710: dup
    //   711: iconst_4
    //   712: iload_1
    //   713: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   716: aastore
    //   717: invokevirtual 1342	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   720: aload_0
    //   721: getfield 507	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uSJ	Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/k;
    //   724: aload 4
    //   726: getfield 2519	com/tencent/mm/plugin/wenote/model/b:uMJ	I
    //   729: putfield 1780	com/tencent/mm/plugin/wenote/model/nativenote/manager/k:uQI	I
    //   732: invokestatic 393	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:dem	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   735: invokestatic 393	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:dem	()Lcom/tencent/mm/plugin/wenote/model/nativenote/manager/c;
    //   738: invokevirtual 602	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:size	()I
    //   741: iconst_1
    //   742: isub
    //   743: iconst_0
    //   744: invokevirtual 2523	com/tencent/mm/plugin/wenote/model/nativenote/manager/c:au	(IZ)Z
    //   747: pop
    //   748: sipush 27103
    //   751: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   754: goto -729 -> 25
    //   757: iconst_0
    //   758: istore 11
    //   760: goto -191 -> 569
    //   763: aload_0
    //   764: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   767: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   770: bipush 14
    //   772: invokestatic 1842	com/tencent/mm/bz/a:fromDPToPix	(Landroid/content/Context;I)I
    //   775: istore_1
    //   776: aload_0
    //   777: getfield 268	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:aiB	Landroid/support/v7/widget/RecyclerView;
    //   780: invokevirtual 2524	android/support/v7/widget/RecyclerView:getMeasuredWidth	()I
    //   783: iconst_0
    //   784: iadd
    //   785: iload_2
    //   786: iload_1
    //   787: iadd
    //   788: getstatic 2484	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   791: invokestatic 2490	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   794: astore_3
    //   795: new 2492	android/graphics/Canvas
    //   798: astore 5
    //   800: aload 5
    //   802: aload_3
    //   803: invokespecial 2495	android/graphics/Canvas:<init>	(Landroid/graphics/Bitmap;)V
    //   806: aload 5
    //   808: iconst_m1
    //   809: invokevirtual 2527	android/graphics/Canvas:drawColor	(I)V
    //   812: aload_0
    //   813: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   816: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   819: bipush 8
    //   821: invokestatic 1842	com/tencent/mm/bz/a:fromDPToPix	(Landroid/content/Context;I)I
    //   824: istore_2
    //   825: iconst_0
    //   826: istore 11
    //   828: iload 11
    //   830: iload 6
    //   832: if_icmpge +388 -> 1220
    //   835: aload 7
    //   837: iload 11
    //   839: invokestatic 2501	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   842: invokeinterface 2508 2 0
    //   847: checkcast 2486	android/graphics/Bitmap
    //   850: astore 8
    //   852: iload_2
    //   853: istore_1
    //   854: aload 8
    //   856: ifnull +39 -> 895
    //   859: aload 5
    //   861: aload 8
    //   863: fconst_0
    //   864: iload_2
    //   865: i2f
    //   866: aconst_null
    //   867: invokevirtual 2531	android/graphics/Canvas:drawBitmap	(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    //   870: iload_2
    //   871: aload 8
    //   873: invokevirtual 2532	android/graphics/Bitmap:getHeight	()I
    //   876: iadd
    //   877: istore_2
    //   878: iload_2
    //   879: istore_1
    //   880: aload 8
    //   882: invokevirtual 2511	android/graphics/Bitmap:isRecycled	()Z
    //   885: ifne +10 -> 895
    //   888: aload 8
    //   890: invokevirtual 2514	android/graphics/Bitmap:recycle	()V
    //   893: iload_2
    //   894: istore_1
    //   895: iinc 11 1
    //   898: iload_1
    //   899: istore_2
    //   900: goto -72 -> 828
    //   903: astore_3
    //   904: ldc_w 575
    //   907: ldc_w 2534
    //   910: invokestatic 1150	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   913: aload_0
    //   914: getfield 268	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:aiB	Landroid/support/v7/widget/RecyclerView;
    //   917: invokevirtual 2524	android/support/v7/widget/RecyclerView:getMeasuredWidth	()I
    //   920: iconst_0
    //   921: iadd
    //   922: iload_2
    //   923: iload_1
    //   924: iadd
    //   925: getstatic 2537	android/graphics/Bitmap$Config:RGB_565	Landroid/graphics/Bitmap$Config;
    //   928: invokestatic 2490	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   931: astore_3
    //   932: goto -137 -> 795
    //   935: astore_3
    //   936: getstatic 1339	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   939: astore_3
    //   940: aload_0
    //   941: getfield 194	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uTi	Z
    //   944: ifeq +135 -> 1079
    //   947: iconst_1
    //   948: istore_1
    //   949: aload_3
    //   950: sipush 14811
    //   953: iconst_5
    //   954: anewarray 171	java/lang/Object
    //   957: dup
    //   958: iconst_0
    //   959: iconst_0
    //   960: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   963: aastore
    //   964: dup
    //   965: iconst_1
    //   966: iconst_0
    //   967: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   970: aastore
    //   971: dup
    //   972: iconst_2
    //   973: iconst_0
    //   974: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   977: aastore
    //   978: dup
    //   979: iconst_3
    //   980: iconst_2
    //   981: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   984: aastore
    //   985: dup
    //   986: iconst_4
    //   987: iload_1
    //   988: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   991: aastore
    //   992: invokevirtual 1342	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   995: ldc_w 575
    //   998: ldc_w 2539
    //   1001: invokestatic 1150	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1004: aload_0
    //   1005: invokespecial 505	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:bpD	()V
    //   1008: aload_0
    //   1009: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   1012: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   1015: aload_0
    //   1016: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   1019: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   1022: ldc_w 2426
    //   1025: invokevirtual 2100	android/support/v7/app/AppCompatActivity:getString	(I)Ljava/lang/String;
    //   1028: iconst_1
    //   1029: invokestatic 1017	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   1032: invokevirtual 1020	android/widget/Toast:show	()V
    //   1035: iconst_0
    //   1036: istore_1
    //   1037: iload_1
    //   1038: iload 6
    //   1040: if_icmpge +44 -> 1084
    //   1043: aload 7
    //   1045: iload_1
    //   1046: invokestatic 2501	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1049: invokeinterface 2508 2 0
    //   1054: checkcast 2486	android/graphics/Bitmap
    //   1057: astore_3
    //   1058: aload_3
    //   1059: ifnull +14 -> 1073
    //   1062: aload_3
    //   1063: invokevirtual 2511	android/graphics/Bitmap:isRecycled	()Z
    //   1066: ifne +7 -> 1073
    //   1069: aload_3
    //   1070: invokevirtual 2514	android/graphics/Bitmap:recycle	()V
    //   1073: iinc 1 1
    //   1076: goto -39 -> 1037
    //   1079: iconst_0
    //   1080: istore_1
    //   1081: goto -132 -> 949
    //   1084: sipush 27103
    //   1087: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1090: goto -1065 -> 25
    //   1093: astore_3
    //   1094: ldc_w 575
    //   1097: ldc_w 2541
    //   1100: invokestatic 1150	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1103: ldc_w 575
    //   1106: aload_3
    //   1107: ldc 149
    //   1109: iconst_0
    //   1110: anewarray 171	java/lang/Object
    //   1113: invokestatic 581	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1116: aload_0
    //   1117: invokespecial 505	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:bpD	()V
    //   1120: aload_0
    //   1121: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   1124: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   1127: aload_0
    //   1128: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   1131: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   1134: ldc_w 2426
    //   1137: invokevirtual 2100	android/support/v7/app/AppCompatActivity:getString	(I)Ljava/lang/String;
    //   1140: iconst_1
    //   1141: invokestatic 1017	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   1144: invokevirtual 1020	android/widget/Toast:show	()V
    //   1147: getstatic 1339	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1150: astore_3
    //   1151: aload_0
    //   1152: getfield 194	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uTi	Z
    //   1155: ifeq +60 -> 1215
    //   1158: iconst_1
    //   1159: istore_1
    //   1160: aload_3
    //   1161: sipush 14811
    //   1164: iconst_5
    //   1165: anewarray 171	java/lang/Object
    //   1168: dup
    //   1169: iconst_0
    //   1170: iconst_0
    //   1171: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1174: aastore
    //   1175: dup
    //   1176: iconst_1
    //   1177: iconst_0
    //   1178: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1181: aastore
    //   1182: dup
    //   1183: iconst_2
    //   1184: iconst_0
    //   1185: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1188: aastore
    //   1189: dup
    //   1190: iconst_3
    //   1191: iconst_1
    //   1192: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1195: aastore
    //   1196: dup
    //   1197: iconst_4
    //   1198: iload_1
    //   1199: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1202: aastore
    //   1203: invokevirtual 1342	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   1206: sipush 27103
    //   1209: invokestatic 127	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1212: goto -1187 -> 25
    //   1215: iconst_0
    //   1216: istore_1
    //   1217: goto -57 -> 1160
    //   1220: aload_0
    //   1221: getfield 222	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:lzK	Lcom/tencent/mm/ui/base/p;
    //   1224: ifnull +185 -> 1409
    //   1227: aload_0
    //   1228: getfield 222	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:lzK	Lcom/tencent/mm/ui/base/p;
    //   1231: invokevirtual 2544	com/tencent/mm/ui/base/p:isShowing	()Z
    //   1234: ifeq +175 -> 1409
    //   1237: aload_0
    //   1238: invokespecial 505	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:bpD	()V
    //   1241: aload_0
    //   1242: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   1245: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   1248: aload_0
    //   1249: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   1252: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   1255: ldc_w 2545
    //   1258: iconst_1
    //   1259: anewarray 171	java/lang/Object
    //   1262: dup
    //   1263: iconst_0
    //   1264: invokestatic 2550	com/tencent/mm/sdk/f/a:dlz	()Ljava/lang/String;
    //   1267: aastore
    //   1268: invokevirtual 2553	android/support/v7/app/AppCompatActivity:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   1271: iconst_1
    //   1272: invokestatic 1017	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   1275: invokevirtual 1020	android/widget/Toast:show	()V
    //   1278: invokestatic 336	com/tencent/mm/model/aw:RS	()Lcom/tencent/mm/sdk/platformtools/al;
    //   1281: astore 7
    //   1283: new 2555	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$30
    //   1286: astore 8
    //   1288: aload 8
    //   1290: aload_0
    //   1291: aload_3
    //   1292: invokespecial 2558	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$30:<init>	(Lcom/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI;Landroid/graphics/Bitmap;)V
    //   1295: aload 7
    //   1297: aload 8
    //   1299: invokevirtual 342	com/tencent/mm/sdk/platformtools/al:aa	(Ljava/lang/Runnable;)I
    //   1302: pop
    //   1303: goto -583 -> 720
    //   1306: astore_3
    //   1307: ldc_w 575
    //   1310: ldc_w 2560
    //   1313: invokestatic 1150	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1316: aload_0
    //   1317: invokespecial 505	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:bpD	()V
    //   1320: aload_0
    //   1321: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   1324: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   1327: aload_0
    //   1328: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   1331: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   1334: ldc_w 2426
    //   1337: invokevirtual 2100	android/support/v7/app/AppCompatActivity:getString	(I)Ljava/lang/String;
    //   1340: iconst_1
    //   1341: invokestatic 1017	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   1344: invokevirtual 1020	android/widget/Toast:show	()V
    //   1347: getstatic 1339	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1350: astore_3
    //   1351: aload_0
    //   1352: getfield 194	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uTi	Z
    //   1355: ifeq +77 -> 1432
    //   1358: iconst_1
    //   1359: istore_1
    //   1360: aload_3
    //   1361: sipush 14811
    //   1364: iconst_5
    //   1365: anewarray 171	java/lang/Object
    //   1368: dup
    //   1369: iconst_0
    //   1370: iconst_0
    //   1371: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1374: aastore
    //   1375: dup
    //   1376: iconst_1
    //   1377: iconst_0
    //   1378: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1381: aastore
    //   1382: dup
    //   1383: iconst_2
    //   1384: iconst_0
    //   1385: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1388: aastore
    //   1389: dup
    //   1390: iconst_3
    //   1391: iconst_2
    //   1392: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1395: aastore
    //   1396: dup
    //   1397: iconst_4
    //   1398: iload_1
    //   1399: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1402: aastore
    //   1403: invokevirtual 1342	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   1406: goto -686 -> 720
    //   1409: aload_3
    //   1410: ifnull -690 -> 720
    //   1413: aload_3
    //   1414: invokevirtual 2511	android/graphics/Bitmap:isRecycled	()Z
    //   1417: ifne -697 -> 720
    //   1420: aload_3
    //   1421: invokevirtual 2514	android/graphics/Bitmap:recycle	()V
    //   1424: goto -704 -> 720
    //   1427: iconst_0
    //   1428: istore_1
    //   1429: goto -755 -> 674
    //   1432: iconst_0
    //   1433: istore_1
    //   1434: goto -74 -> 1360
    //   1437: getstatic 1339	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1440: astore_3
    //   1441: aload_0
    //   1442: getfield 194	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uTi	Z
    //   1445: ifeq +85 -> 1530
    //   1448: iconst_1
    //   1449: istore_1
    //   1450: aload_3
    //   1451: sipush 14811
    //   1454: iconst_5
    //   1455: anewarray 171	java/lang/Object
    //   1458: dup
    //   1459: iconst_0
    //   1460: iconst_0
    //   1461: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1464: aastore
    //   1465: dup
    //   1466: iconst_1
    //   1467: iconst_0
    //   1468: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1471: aastore
    //   1472: dup
    //   1473: iconst_2
    //   1474: iconst_0
    //   1475: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1478: aastore
    //   1479: dup
    //   1480: iconst_3
    //   1481: iconst_1
    //   1482: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1485: aastore
    //   1486: dup
    //   1487: iconst_4
    //   1488: iload_1
    //   1489: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1492: aastore
    //   1493: invokevirtual 1342	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   1496: aload_0
    //   1497: invokespecial 505	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:bpD	()V
    //   1500: aload_0
    //   1501: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   1504: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   1507: aload_0
    //   1508: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   1511: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   1514: ldc_w 2426
    //   1517: invokevirtual 2100	android/support/v7/app/AppCompatActivity:getString	(I)Ljava/lang/String;
    //   1520: iconst_1
    //   1521: invokestatic 1017	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   1524: invokevirtual 1020	android/widget/Toast:show	()V
    //   1527: goto -807 -> 720
    //   1530: iconst_0
    //   1531: istore_1
    //   1532: goto -82 -> 1450
    //   1535: getstatic 1339	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1538: astore_3
    //   1539: aload_0
    //   1540: getfield 194	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:uTi	Z
    //   1543: ifeq +94 -> 1637
    //   1546: iconst_1
    //   1547: istore_1
    //   1548: aload_3
    //   1549: sipush 14811
    //   1552: iconst_5
    //   1553: anewarray 171	java/lang/Object
    //   1556: dup
    //   1557: iconst_0
    //   1558: iconst_0
    //   1559: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1562: aastore
    //   1563: dup
    //   1564: iconst_1
    //   1565: iconst_0
    //   1566: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1569: aastore
    //   1570: dup
    //   1571: iconst_2
    //   1572: iconst_0
    //   1573: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1576: aastore
    //   1577: dup
    //   1578: iconst_3
    //   1579: iconst_4
    //   1580: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1583: aastore
    //   1584: dup
    //   1585: iconst_4
    //   1586: iload_1
    //   1587: invokestatic 589	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1590: aastore
    //   1591: invokevirtual 1342	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   1594: ldc_w 575
    //   1597: ldc_w 2562
    //   1600: invokestatic 1150	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1603: aload_0
    //   1604: invokespecial 505	com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI:bpD	()V
    //   1607: aload_0
    //   1608: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   1611: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   1614: aload_0
    //   1615: getfield 920	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   1618: getfield 926	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   1621: ldc_w 2426
    //   1624: invokevirtual 2100	android/support/v7/app/AppCompatActivity:getString	(I)Ljava/lang/String;
    //   1627: iconst_1
    //   1628: invokestatic 1017	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   1631: invokevirtual 1020	android/widget/Toast:show	()V
    //   1634: goto -914 -> 720
    //   1637: iconst_0
    //   1638: istore_1
    //   1639: goto -91 -> 1548
    //
    // Exception table:
    //   from	to	target	type
    //   2	25	45	finally
    //   28	42	45	finally
    //   50	72	45	finally
    //   79	97	45	finally
    //   102	109	45	finally
    //   114	156	45	finally
    //   158	210	45	finally
    //   220	250	45	finally
    //   258	355	45	finally
    //   371	382	45	finally
    //   382	393	45	finally
    //   393	403	45	finally
    //   403	428	45	finally
    //   445	460	45	finally
    //   464	475	45	finally
    //   481	512	45	finally
    //   512	518	45	finally
    //   523	566	45	finally
    //   569	617	45	finally
    //   621	672	45	finally
    //   674	720	45	finally
    //   720	754	45	finally
    //   763	776	45	finally
    //   776	795	45	finally
    //   795	825	45	finally
    //   835	852	45	finally
    //   859	878	45	finally
    //   880	893	45	finally
    //   904	913	45	finally
    //   913	932	45	finally
    //   936	947	45	finally
    //   949	1035	45	finally
    //   1043	1058	45	finally
    //   1062	1073	45	finally
    //   1084	1090	45	finally
    //   1094	1158	45	finally
    //   1160	1206	45	finally
    //   1206	1212	45	finally
    //   1220	1303	45	finally
    //   1307	1358	45	finally
    //   1360	1406	45	finally
    //   1413	1424	45	finally
    //   1437	1448	45	finally
    //   1450	1527	45	finally
    //   1535	1546	45	finally
    //   1548	1634	45	finally
    //   371	382	437	java/lang/Throwable
    //   393	403	521	java/lang/Exception
    //   220	250	620	java/lang/Exception
    //   258	355	620	java/lang/Exception
    //   371	382	620	java/lang/Exception
    //   382	393	620	java/lang/Exception
    //   403	428	620	java/lang/Exception
    //   445	460	620	java/lang/Exception
    //   464	475	620	java/lang/Exception
    //   481	512	620	java/lang/Exception
    //   523	566	620	java/lang/Exception
    //   569	617	620	java/lang/Exception
    //   1094	1158	620	java/lang/Exception
    //   1160	1206	620	java/lang/Exception
    //   1220	1303	620	java/lang/Exception
    //   1413	1424	620	java/lang/Exception
    //   776	795	903	java/lang/Throwable
    //   913	932	935	java/lang/Throwable
    //   763	776	1093	java/lang/Exception
    //   776	795	1093	java/lang/Exception
    //   795	825	1093	java/lang/Exception
    //   835	852	1093	java/lang/Exception
    //   859	878	1093	java/lang/Exception
    //   880	893	1093	java/lang/Exception
    //   904	913	1093	java/lang/Exception
    //   913	932	1093	java/lang/Exception
    //   936	947	1093	java/lang/Exception
    //   949	1035	1093	java/lang/Exception
    //   1043	1058	1093	java/lang/Exception
    //   1062	1073	1093	java/lang/Exception
    //   220	250	1306	java/lang/Throwable
    //   258	355	1306	java/lang/Throwable
    //   382	393	1306	java/lang/Throwable
    //   393	403	1306	java/lang/Throwable
    //   403	428	1306	java/lang/Throwable
    //   445	460	1306	java/lang/Throwable
    //   464	475	1306	java/lang/Throwable
    //   481	512	1306	java/lang/Throwable
    //   523	566	1306	java/lang/Throwable
    //   569	617	1306	java/lang/Throwable
    //   763	776	1306	java/lang/Throwable
    //   795	825	1306	java/lang/Throwable
    //   835	852	1306	java/lang/Throwable
    //   859	878	1306	java/lang/Throwable
    //   880	893	1306	java/lang/Throwable
    //   904	913	1306	java/lang/Throwable
    //   936	947	1306	java/lang/Throwable
    //   949	1035	1306	java/lang/Throwable
    //   1043	1058	1306	java/lang/Throwable
    //   1062	1073	1306	java/lang/Throwable
    //   1094	1158	1306	java/lang/Throwable
    //   1160	1206	1306	java/lang/Throwable
    //   1220	1303	1306	java/lang/Throwable
    //   1413	1424	1306	java/lang/Throwable
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI
 * JD-Core Version:    0.6.2
 */