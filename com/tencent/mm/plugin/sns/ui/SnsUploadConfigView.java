package com.tencent.mm.plugin.sns.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.au.b;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.gc;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.protocal.protobuf.ayt;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.i.a.a;
import com.tencent.mm.ui.i.a.b;
import com.tencent.mm.ui.i.a.c;
import com.tencent.mm.ui.v;
import org.b.d.i;

public class SnsUploadConfigView extends LinearLayout
  implements f, a.a, a.b
{
  private static String ceO = "com.tencent.mm";
  private Context context;
  private ProgressDialog nEK;
  ImageView rCk;
  ImageView rCl;
  ImageView rCm;
  ImageView rCn;
  private boolean rCo;
  boolean rCp;
  boolean rCq;
  private boolean rCr;
  private boolean rCs;
  private boolean rCt;
  private boolean rCu;
  boolean rCv;
  ayt rCw;
  com.tencent.mm.ui.i.a rCx;
  boolean rwo;

  public SnsUploadConfigView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(39701);
    this.rwo = false;
    this.rCo = false;
    this.rCp = false;
    this.rCq = false;
    this.rCr = false;
    this.rCs = false;
    this.rCt = true;
    this.rCu = false;
    this.rCv = false;
    this.rCw = new ayt();
    this.rCx = new com.tencent.mm.ui.i.a();
    this.nEK = null;
    this.context = paramContext;
    this.context = paramContext;
    paramAttributeSet = v.hu(paramContext).inflate(2130970825, this, true);
    this.rCk = ((ImageView)paramAttributeSet.findViewById(2131827929));
    this.rCl = ((ImageView)paramAttributeSet.findViewById(2131827930));
    this.rCm = ((ImageView)paramAttributeSet.findViewById(2131827927));
    this.rCn = ((ImageView)paramAttributeSet.findViewById(2131827928));
    if (!b.ahM())
      this.rCm.setVisibility(8);
    g.RQ();
    if (!g.RP().Ry().getBoolean(ac.a.xLj, false))
      this.rCn.setVisibility(8);
    if (!b.ahP())
      this.rCl.setVisibility(8);
    if (!r.YX())
      this.rCk.setVisibility(8);
    this.rCm.setOnClickListener(new SnsUploadConfigView.1(this, paramContext));
    this.rCn.setOnClickListener(new SnsUploadConfigView.8(this, paramContext));
    this.rCk.setOnClickListener(new SnsUploadConfigView.9(this));
    this.rCl.setOnClickListener(new SnsUploadConfigView.10(this));
    AppMethodBeat.o(39701);
  }

  private void xv(int paramInt)
  {
    AppMethodBeat.i(39708);
    h.a(getContext(), paramInt, 2131297061, new SnsUploadConfigView.5(this), new SnsUploadConfigView.6(this));
    AppMethodBeat.o(39708);
  }

  public final void a(a.c paramc)
  {
    AppMethodBeat.i(39710);
    if (this.nEK != null)
      this.nEK.cancel();
    switch (SnsUploadConfigView.7.nFi[paramc.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      cuA();
      AppMethodBeat.o(39710);
      return;
      this.rCq = true;
      xv(2131304134);
      continue;
      this.rCq = false;
      continue;
      this.rCq = false;
      xv(2131304133);
    }
  }

  public final void b(a.c paramc)
  {
    AppMethodBeat.i(39711);
    switch (SnsUploadConfigView.7.nFi[paramc.ordinal()])
    {
    default:
    case 3:
    }
    while (true)
    {
      cuA();
      AppMethodBeat.o(39711);
      return;
      this.rCq = false;
    }
  }

  final void cuA()
  {
    AppMethodBeat.i(39706);
    int i;
    if (this.rCq)
      if (!this.rCx.dKv())
      {
        h.a(getContext(), 2131303322, 2131297061, new SnsUploadConfigView.15(this), new SnsUploadConfigView.2(this));
        i = 0;
        if (i != 0)
          break label75;
        this.rCq = false;
        AppMethodBeat.o(39706);
      }
    while (true)
    {
      return;
      i = 1;
      break;
      label75: this.rCl.setImageResource(2131230788);
      AppMethodBeat.o(39706);
      continue;
      this.rCl.setImageResource(2131230787);
      AppMethodBeat.o(39706);
    }
  }

  public final void cux()
  {
    AppMethodBeat.i(39702);
    this.rCo = false;
    this.rCp = false;
    this.rCq = false;
    this.rCr = false;
    this.rCs = false;
    this.rCm.setImageResource(2131230781);
    this.rCn.setImageResource(2131230789);
    this.rCk.setImageResource(2131230771);
    this.rCl.setImageResource(2131230787);
    AppMethodBeat.o(39702);
  }

  final void cuy()
  {
    AppMethodBeat.i(39703);
    int i;
    if (this.rCr)
    {
      g.RQ();
      i = bo.h((Integer)g.RP().Ry().get(9, null));
      if (i == 0)
        h.a(getContext(), 2131303355, 2131297061, new SnsUploadConfigView.11(this), new SnsUploadConfigView.12(this));
    }
    label132: 
    while (true)
    {
      i = 0;
      if (i == 0)
      {
        this.rCr = false;
        AppMethodBeat.o(39703);
      }
      while (true)
      {
        return;
        if (i == 0)
          break label132;
        i = 1;
        break;
        this.rCm.setImageResource(2131230782);
        AppMethodBeat.o(39703);
        continue;
        this.rCm.setImageResource(2131230781);
        AppMethodBeat.o(39703);
      }
    }
  }

  final void cuz()
  {
    AppMethodBeat.i(39704);
    if (this.rCn == null)
      AppMethodBeat.o(39704);
    while (true)
    {
      return;
      if (this.rCv)
      {
        g.RQ();
        if (g.RP().Ry().getBoolean(ac.a.xLj, false));
      }
      else
      {
        this.rCs = false;
        this.rCn.setVisibility(8);
        AppMethodBeat.o(39704);
        continue;
      }
      this.rCn.setVisibility(0);
      if (this.rCs)
      {
        this.rCn.setImageResource(2131230790);
        AppMethodBeat.o(39704);
      }
      else
      {
        this.rCn.setImageResource(2131230789);
        AppMethodBeat.o(39704);
      }
    }
  }

  public int getPrivated()
  {
    int i = 0;
    if (this.rwo)
      i = 1;
    return i;
  }

  public int getSyncFlag()
  {
    int i = 0;
    if (this.rCo)
      i = 1;
    int j = i;
    if (this.rCp)
      j = i | 0x2;
    i = j;
    if (this.rCq)
      i = j | 0x8;
    j = i;
    if (this.rCr)
      j = i | 0x4;
    i = j;
    if (this.rCs)
      i = j | 0x10;
    return i;
  }

  public i getTwitterAccessToken()
  {
    return this.rCx.zKU;
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(39709);
    if ((paramInt1 != 0) || (paramInt2 != 0) || (paramm == null))
      AppMethodBeat.o(39709);
    while (true)
    {
      return;
      cuz();
      AppMethodBeat.o(39709);
    }
  }

  public void setPrivated(boolean paramBoolean)
  {
    AppMethodBeat.i(39707);
    this.rwo = paramBoolean;
    if (paramBoolean)
      cux();
    AppMethodBeat.o(39707);
  }

  void setSyncFacebook(boolean paramBoolean)
  {
    AppMethodBeat.i(39705);
    int i;
    if (this.rCp)
      if (!r.Za())
      {
        h.a(getContext(), 2131303084, 2131297061, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(39699);
            d.b(SnsUploadConfigView.this.getContext(), "account", ".ui.FacebookAuthUI", new Intent().putExtra("shake_music", true));
            AppMethodBeat.o(39699);
          }
        }
        , new SnsUploadConfigView.14(this));
        i = 0;
        if (i != 0)
          break label71;
        this.rCp = false;
        AppMethodBeat.o(39705);
      }
    while (true)
    {
      return;
      i = 1;
      break;
      label71: if ((!paramBoolean) && (!this.rCu) && (r.Za()))
      {
        gc localgc = new gc();
        localgc.callback = new SnsUploadConfigView.3(this, localgc);
        com.tencent.mm.sdk.b.a.xxA.a(localgc, Looper.myLooper());
      }
      this.rCk.setImageResource(2131230772);
      AppMethodBeat.o(39705);
      continue;
      this.rCk.setImageResource(2131230771);
      AppMethodBeat.o(39705);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadConfigView
 * JD-Core Version:    0.6.2
 */