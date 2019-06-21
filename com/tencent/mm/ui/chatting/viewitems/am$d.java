package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.g;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.t.a.a;
import com.tencent.mm.modelvideo.t.a.b;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.model.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class am$d extends c.a
{
  private static Map<String, WeakReference<d>> zdR;
  private static SparseArray<String> zht;
  TextView pxy;
  ImageView raP;
  ImageView zbR;
  ImageView zbS;
  TextView zbU;
  ImageView zci;
  ImageView zdN;
  ImageView zeh;
  TextView zho;
  MMPinProgressBtn zhp;
  View zhq;
  ProgressBar zhr;
  View zhs;

  static
  {
    AppMethodBeat.i(33354);
    zht = new SparseArray();
    zdR = new HashMap();
    AppMethodBeat.o(33354);
  }

  public static void a(d paramd, bi parambi, boolean paramBoolean, int paramInt, com.tencent.mm.ui.chatting.d.a parama, View.OnClickListener paramOnClickListener, View.OnLongClickListener paramOnLongClickListener)
  {
    AppMethodBeat.i(33353);
    Object localObject1 = (String)zht.get(paramd.hashCode());
    if (localObject1 != null)
      zdR.remove(localObject1);
    zht.put(paramd.hashCode(), parambi.field_imgPath);
    zdR.put(parambi.field_imgPath, new WeakReference(paramd));
    Object localObject2 = u.ut(parambi.field_imgPath);
    localObject1 = localObject2;
    if (localObject2 == null)
      localObject1 = new s();
    com.tencent.mm.modelvideo.o.all();
    localObject2 = t.ui(parambi.field_imgPath);
    localObject2 = com.tencent.mm.at.o.ahl().a((String)localObject2, com.tencent.mm.bz.a.getDensity(parama.yTx.getContext()), parama.yTx.getContext(), 2130838182);
    paramd.zeh.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
    int i;
    int j;
    if (localObject2 == null)
    {
      i = com.tencent.mm.bz.a.fromDPToPix(parama.yTx.getContext(), 85);
      j = com.tencent.mm.bz.a.al(parama.yTx.getContext(), 2131427524);
      localObject2 = d.a(d.au(parama.yTx.getContext().getResources().getColor(2131690151), i, j), 2130838182, i, j);
      aw.ZK();
      if (!com.tencent.mm.model.c.isSDCardAvailable())
      {
        paramd.zdN.setImageDrawable(com.tencent.mm.bz.a.g(parama.yTx.getContext(), 2131232096));
        paramd.zdN.setBackground(new BitmapDrawable((Bitmap)localObject2));
        localObject2 = new FrameLayout.LayoutParams(i, j);
        paramd.zeh.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        if (paramd.zhs != null)
          paramd.zhs.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        label311: if (!paramBoolean)
          break label904;
        paramd.pxy.setText(ah.ga(((s)localObject1).frO));
        paramd.zho.setText(ah.mK(((s)localObject1).fXd));
        j = ((s)localObject1).status;
        ab.i("MicroMsg.VideoItemHoder", "parseVideo from video status : " + j + " info : " + ((s)localObject1).getFileName());
        if (j != 199)
          break label755;
        paramd.raP.setImageDrawable(com.tencent.mm.bz.a.g(parama.yTx.getContext(), 2131231923));
        label420: if ((j != 112) && (j != 122) && (j != 120))
          break label788;
        paramd.zbR.setVisibility(8);
        paramd.raP.setVisibility(8);
        paramd.zhp.setVisibility(0);
        paramd.zhp.setProgress(u.g((s)localObject1));
        ab.v("MicroMsg.VideoItemHoder", "status begin");
        paramd.zhp.invalidate();
      }
    }
    label904: 
    while (true)
    {
      localObject2 = paramd.zbS;
      localObject1 = new am.e(parambi, parama.dFx(), paramInt, parambi.field_talker);
      ((am.e)localObject1).klY = 4;
      ((ImageView)localObject2).setTag(localObject1);
      paramd.zbS.setOnClickListener(paramOnClickListener);
      localObject1 = paramd.zbR;
      localObject2 = new am.e(parambi, parama.dFx(), paramInt, parambi.field_talker);
      ((am.e)localObject2).klY = 3;
      ((ImageView)localObject1).setTag(localObject2);
      paramd.zbR.setOnClickListener(paramOnClickListener);
      localObject1 = paramd.jPL;
      parambi = new am.e(parambi, parama.dFx(), paramInt, parambi.field_talker);
      parambi.klY = 2;
      ((View)localObject1).setTag(parambi);
      paramd.jPL.setOnClickListener(paramOnClickListener);
      paramd.jPL.setOnLongClickListener(paramOnLongClickListener);
      paramd.jPL.setOnTouchListener(((h)parama.aF(h.class)).dCZ());
      AppMethodBeat.o(33353);
      return;
      localObject2 = d.a((Bitmap)localObject2, 2130838182, i, j);
      paramd.zdN.setImageBitmap((Bitmap)localObject2);
      break;
      paramd.zdN.setImageBitmap((Bitmap)localObject2);
      localObject2 = new FrameLayout.LayoutParams(((Bitmap)localObject2).getWidth(), ((Bitmap)localObject2).getHeight());
      paramd.zeh.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      if (paramd.zhs == null)
        break label311;
      paramd.zhs.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      break label311;
      label755: paramd.raP.setImageDrawable(com.tencent.mm.bz.a.g(parama.yTx.getContext(), 2131231923));
      paramd.pxy.setVisibility(8);
      break label420;
      label788: if ((j == 113) || (j == 198) || (((s)localObject1).alx()))
      {
        paramd.zbR.setVisibility(0);
        paramd.zbS.setVisibility(8);
        paramd.zhp.setVisibility(8);
        paramd.raP.setVisibility(0);
        ab.v("MicroMsg.VideoItemHoder", "status pause");
      }
      else
      {
        paramd.zbS.setVisibility(8);
        paramd.zbR.setVisibility(8);
        paramd.zhp.setVisibility(8);
        paramd.raP.setVisibility(0);
        ab.v("MicroMsg.VideoItemHoder", "status gone");
        continue;
        paramd.pxy.setText(ah.ga(((s)localObject1).frO));
        paramd.zho.setText(ah.mK(((s)localObject1).fXd));
        j = ((s)localObject1).status;
        paramd.raP.setImageDrawable(com.tencent.mm.bz.a.g(parama.yTx.getContext(), 2131231923));
        if (paramd.zhr != null)
          paramd.zhr.setVisibility(8);
        if (paramd.zhs != null)
          paramd.zhs.setVisibility(8);
        ab.v("MicroMsg.VideoItemHoder", "video status %d", new Object[] { Integer.valueOf(j) });
        if ((j == 104) || (j == 103))
        {
          if (com.tencent.mm.plugin.mmsight.c.yM(((s)localObject1).fXe))
          {
            if (paramd.zhr != null)
              paramd.zhr.setVisibility(0);
            if (paramd.zhs != null)
              paramd.zhs.setVisibility(0);
            paramd.zho.setText(null);
            paramd.pxy.setText(null);
            paramd.raP.setImageDrawable(null);
            paramd.zbS.setVisibility(8);
            paramd.zbR.setVisibility(8);
            paramd.zhp.setVisibility(8);
          }
          while (true)
          {
            ab.v("MicroMsg.VideoItemHoder", "status begin");
            break;
            if (paramd.zhr != null)
              paramd.zhr.setVisibility(8);
            if (paramd.zhs != null)
              paramd.zhs.setVisibility(8);
            paramd.zbR.setVisibility(8);
            paramd.raP.setVisibility(8);
            paramd.zhp.setVisibility(0);
            paramd.zhp.setProgress(u.h((s)localObject1));
          }
        }
        if ((j == 105) || (j == 198) || (((s)localObject1).alx()))
        {
          paramd.zbR.setVisibility(0);
          paramd.zbS.setVisibility(8);
          paramd.zhp.setVisibility(8);
          paramd.raP.setVisibility(0);
          ab.v("MicroMsg.VideoItemHoder", "status pause");
        }
        else if (j == 106)
        {
          if (!j.aiB(parambi.field_imgPath))
          {
            u.um(parambi.field_imgPath);
          }
          else
          {
            if (paramd.zhr != null)
              paramd.zhr.setVisibility(0);
            if (paramd.zhs != null)
              paramd.zhs.setVisibility(0);
            paramd.zho.setText(null);
            paramd.pxy.setText(null);
            paramd.raP.setImageDrawable(null);
            paramd.zbS.setVisibility(8);
            paramd.zbR.setVisibility(8);
            paramd.zhp.setVisibility(8);
          }
        }
        else
        {
          paramd.zbS.setVisibility(8);
          paramd.zbR.setVisibility(8);
          paramd.zhp.setVisibility(8);
          paramd.raP.setVisibility(0);
          ab.v("MicroMsg.VideoItemHoder", "status gone");
        }
      }
    }
  }

  public static boolean b(t.a.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(33351);
    if (parama.fXt != t.a.b.fXx)
      AppMethodBeat.o(33351);
    while (true)
    {
      return bool;
      s locals = u.ut(parama.fileName);
      if (locals == null)
      {
        ab.w("MicroMsg.VideoItemHoder", "update status, filename %s, videoInfo not found", new Object[] { parama.fileName });
        AppMethodBeat.o(33351);
      }
      else if ((locals.status != 112) && (locals.status != 104) && (locals.status != 103))
      {
        AppMethodBeat.o(33351);
      }
      else
      {
        al.d(new am.d.1(locals));
        AppMethodBeat.o(33351);
        bool = true;
      }
    }
  }

  public final c.a z(View paramView, boolean paramBoolean)
  {
    Object localObject1 = null;
    AppMethodBeat.i(33352);
    super.eP(paramView);
    this.enf = ((TextView)paramView.findViewById(2131820587));
    this.zdN = ((ImageView)paramView.findViewById(2131822578));
    this.qkY = ((TextView)paramView.findViewById(2131821102));
    this.pxy = ((TextView)paramView.findViewById(2131822580));
    this.zho = ((TextView)paramView.findViewById(2131822622));
    this.raP = ((ImageView)paramView.findViewById(2131822581));
    this.zbR = ((ImageView)paramView.findViewById(2131822556));
    this.zbS = ((ImageView)paramView.findViewById(2131822555));
    this.zhp = ((MMPinProgressBtn)paramView.findViewById(2131822579));
    this.zhq = paramView.findViewById(2131822621);
    this.jPL = paramView.findViewById(2131822515);
    this.zbU = ((TextView)paramView.findViewById(2131822454));
    this.moo = ((CheckBox)paramView.findViewById(2131820580));
    this.iVh = paramView.findViewById(2131820586);
    this.zeh = ((ImageView)paramView.findViewById(2131822553));
    if (!paramBoolean)
    {
      localObject2 = (ImageView)paramView.findViewById(2131822661);
      this.zci = ((ImageView)localObject2);
      if (paramBoolean)
        break label294;
    }
    label294: for (Object localObject2 = (ProgressBar)paramView.findViewById(2131822669); ; localObject2 = null)
    {
      this.zhr = ((ProgressBar)localObject2);
      localObject2 = localObject1;
      if (!paramBoolean)
        localObject2 = paramView.findViewById(2131822616);
      this.zhs = ((View)localObject2);
      AppMethodBeat.o(33352);
      return this;
      localObject2 = null;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.am.d
 * JD-Core Version:    0.6.2
 */