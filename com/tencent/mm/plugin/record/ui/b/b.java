package com.tencent.mm.plugin.record.ui.b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.e;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ad.a;
import com.tencent.mm.model.ad.b;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.record.ui.h.a;
import com.tencent.mm.plugin.record.ui.h.a.a;
import com.tencent.mm.plugin.record.ui.h.a.c;
import com.tencent.mm.plugin.record.ui.h.b;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aat;
import com.tencent.mm.protocal.protobuf.aay;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abo;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.ui.MMImageView;

public final class b
  implements h.b
{
  private com.tencent.mm.sdk.b.c hAA;
  ak handler;
  private int moM;
  private View.OnClickListener moP;
  private h.a pKt;
  boolean pLc;
  View.OnClickListener pLd;

  public b(h.a parama, ak paramak)
  {
    AppMethodBeat.i(24354);
    this.moM = 0;
    this.pLc = false;
    this.pLd = new b.1(this);
    this.moP = new b.2(this);
    this.hAA = new b.3(this);
    this.pKt = parama;
    this.handler = paramak;
    AppMethodBeat.o(24354);
  }

  static void A(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(24361);
    if ((paramContext instanceof Activity))
    {
      paramContext = ((Activity)paramContext).getIntent();
      if (paramContext != null)
      {
        paramIntent.putExtra("prePublishId", paramContext.getStringExtra("prePublishId"));
        paramIntent.putExtra("preUsername", paramContext.getStringExtra("preUsername"));
        paramIntent.putExtra("preChatName", paramContext.getStringExtra("preChatName"));
        paramIntent.putExtra("preChatTYPE", paramContext.getIntExtra("preChatTYPE", 0));
      }
    }
    AppMethodBeat.o(24361);
  }

  static void a(Intent paramIntent, com.tencent.mm.plugin.record.ui.a.b paramb, Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(24360);
    paramIntent.putExtra("key_detail_fav_path", paramString1);
    paramIntent.putExtra("key_detail_fav_thumb_path", paramString2);
    paramIntent.putExtra("key_detail_fav_video_duration", paramb.cAv.duration);
    paramIntent.putExtra("key_detail_statExtStr", paramb.cAv.cMn);
    com.tencent.mm.plugin.fav.a.b.a(paramContext, ".ui.detail.FavoriteVideoPlayUI", paramIntent, 1);
    AppMethodBeat.o(24360);
  }

  public static boolean e(aar paramaar)
  {
    AppMethodBeat.i(24357);
    e locale = com.tencent.mm.aw.a.aih();
    boolean bool;
    if ((locale != null) && (locale.fJS == 6) && (bo.bc(paramaar.mnd, "").equals(locale.fJU)) && (com.tencent.mm.aw.a.aie()))
    {
      bool = true;
      AppMethodBeat.o(24357);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(24357);
    }
  }

  private static String getAppName(Context paramContext, String paramString)
  {
    AppMethodBeat.i(24356);
    ad.b localb = ad.a.fls;
    if (localb != null)
    {
      paramContext = localb.t(paramContext, paramString);
      AppMethodBeat.o(24356);
    }
    while (true)
    {
      return paramContext;
      paramContext = "";
      AppMethodBeat.o(24356);
    }
  }

  @SuppressLint({"ResourceType"})
  public final void a(View paramView, int paramInt, com.tencent.mm.plugin.record.ui.a.b paramb)
  {
    AppMethodBeat.i(24358);
    TextView localTextView1 = (TextView)paramView.findViewById(2131820678);
    Object localObject1 = (TextView)paramView.findViewById(2131821095);
    TextView localTextView2 = (TextView)paramView.findViewById(2131826911);
    Object localObject2 = (MMImageView)paramView.findViewById(2131820915);
    ((MMImageView)localObject2).setVisibility(0);
    Object localObject3 = (ImageView)paramView.findViewById(2131826910);
    ((ImageView)localObject3).setVisibility(8);
    View localView = paramView.findViewById(2131826907);
    localView.setVisibility(0);
    localView.setTag(paramb);
    localView.setOnClickListener(this.pLd);
    paramView = paramView.findViewById(2131826909);
    paramView.setVisibility(8);
    Object localObject4 = new h.a.a();
    if (paramb.dataType == 0)
      ((h.a.a)localObject4).pKv = paramb.cvx;
    while (true)
    {
      ((h.a.a)localObject4).cAw = ((ImageView)localObject2);
      ((h.a.a)localObject4).cAv = paramb.cAv;
      ((h.a.a)localObject4).height = this.moM;
      ((h.a.a)localObject4).width = this.moM;
      switch (paramb.cAv.dataType)
      {
      case 9:
      case 12:
      case 13:
      case 18:
      default:
        localView.setVisibility(8);
        paramView.setVisibility(0);
        AppMethodBeat.o(24358);
        return;
        if (paramb.dataType == 1)
          ((h.a.a)localObject4).pKv = paramb.mnW.field_localId;
        break;
      case 5:
      case 4:
      case 15:
      case 6:
      case 7:
      case 8:
      case 10:
      case 11:
      case 14:
      case 16:
      case 17:
      case 19:
      }
    }
    localObject3 = paramb.cAv;
    paramView = "";
    localObject2 = null;
    paramb = (com.tencent.mm.plugin.record.ui.a.b)localObject2;
    if (localObject3 != null)
    {
      paramb = (com.tencent.mm.plugin.record.ui.a.b)localObject2;
      if (((aar)localObject3).wgT != null)
        paramb = ((aar)localObject3).wgT.whA;
    }
    if (paramb != null)
      paramView = paramb.title;
    localObject2 = paramView;
    if (bo.isNullOrNil(paramView))
    {
      localObject2 = paramView;
      if (localObject3 != null)
        localObject2 = ((aar)localObject3).title;
    }
    if (bo.isNullOrNil((String)localObject2))
    {
      localTextView1.setVisibility(8);
      label391: ((TextView)localObject1).setVisibility(8);
      paramView = "";
      if (paramb != null)
        paramView = bo.anh(paramb.wiY);
      paramb = null;
      localObject1 = paramb;
      if (localObject3 != null)
      {
        localObject1 = paramb;
        if (((aar)localObject3).wgT != null)
          localObject1 = ((aar)localObject3).wgT.whw;
      }
      localObject2 = paramView;
      if (localObject1 != null)
      {
        if (bo.isNullOrNil(((aat)localObject1).appId))
          break label580;
        paramb = bo.bc(getAppName(localTextView2.getContext(), ((aat)localObject1).appId), "");
        label482: if (!bo.isNullOrNil(paramb))
        {
          localObject2 = paramb;
          if (!paramb.equals(((aat)localObject1).csl));
        }
        else
        {
          localObject2 = bo.anh(((aat)localObject1).link);
        }
      }
      if (!bo.isNullOrNil((String)localObject2))
        break label659;
      localTextView2.setVisibility(8);
      label529: ((h.a.a)localObject4).cAx = 2130837705;
      this.pKt.a((h.a.a)localObject4);
    }
    while (true)
    {
      localTextView2.setVisibility(8);
      AppMethodBeat.o(24358);
      break;
      localTextView1.setText((CharSequence)localObject2);
      localTextView1.setVisibility(0);
      break label391;
      label580: paramb = paramView;
      if (bo.isNullOrNil(((aat)localObject1).csl))
        break label482;
      aw.ZK();
      paramb = com.tencent.mm.model.c.XM().aoO(((aat)localObject1).csl);
      if ((paramb == null) || (!paramb.field_username.equals(((aat)localObject1).csl)))
      {
        ao.a.flu.a(((aat)localObject1).csl, "", null);
        paramb = paramView;
        break label482;
      }
      paramb = paramb.Oj();
      break label482;
      label659: localTextView2.setText((CharSequence)localObject2);
      localTextView2.setVisibility(0);
      break label529;
      paramb = paramb.cAv;
      if (bo.isNullOrNil(paramb.title))
      {
        localTextView1.setText(2131299761);
        label698: if (paramb.duration > 0)
          break label794;
        ((TextView)localObject1).setVisibility(8);
        if (paramb.wgT != null)
          break label915;
        ab.w("MicroMsg.OtherViewWrapper", "video, get data proto item null, dataid[%s]", new Object[] { paramb.mnd });
        localTextView2.setVisibility(8);
      }
      while (true)
      {
        ((ImageView)localObject3).setVisibility(0);
        ((ImageView)localObject3).setImageResource(2130840532);
        ((h.a.a)localObject4).cAx = 2131230817;
        this.pKt.a((h.a.a)localObject4);
        break;
        localTextView1.setText(paramb.title);
        break label698;
        label794: ((TextView)localObject1).setVisibility(0);
        paramView = ((TextView)localObject1).getContext();
        int i = paramb.duration;
        if (i <= 0)
          paramView = paramView.getString(2131299763, new Object[] { Integer.valueOf(0) });
        while (true)
        {
          ((TextView)localObject1).setText(paramView);
          break;
          paramInt = i / 60;
          i %= 60;
          if (paramInt == 0)
            paramView = paramView.getString(2131299763, new Object[] { Integer.valueOf(i) });
          else
            paramView = paramView.getString(2131299762, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
        }
        label915: paramView = paramb.wgT.whw;
        if (!bo.isNullOrNil(paramView.appId))
        {
          paramView = getAppName(localTextView2.getContext(), paramView.appId);
          if (bo.isNullOrNil(paramView))
          {
            localTextView2.setVisibility(8);
          }
          else
          {
            localTextView2.setVisibility(0);
            localTextView2.setText(paramView);
          }
        }
      }
      paramView = paramb.cAv;
      if (paramView.wgT == null)
      {
        ab.w("MicroMsg.OtherViewWrapper", "location, get data proto item null, dataid[%s]", new Object[] { paramView.mnd });
        localTextView1.setText(2131299661);
        ((TextView)localObject1).setText("");
        localTextView2.setText("");
      }
      while (true)
      {
        ((MMImageView)localObject2).setImageResource(2131230798);
        break;
        paramView = paramView.wgT.why;
        if (bo.isNullOrNil(paramView.cIK))
        {
          localTextView1.setText(paramView.label);
          ((TextView)localObject1).setText(2131299661);
          localTextView2.setText("");
        }
        else
        {
          localTextView1.setText(paramView.cIK);
          ((TextView)localObject1).setText(paramView.label);
          localTextView2.setText(2131299661);
        }
      }
      localTextView1.setText(paramb.cAv.title);
      ((TextView)localObject1).setText(paramb.cAv.desc);
      ((ImageView)localObject3).setTag(paramb);
      ((ImageView)localObject3).setOnClickListener(this.moP);
      ((ImageView)localObject3).setImageResource(2130839639);
      ((ImageView)localObject3).setVisibility(0);
      if (e(paramb.cAv))
        ((ImageView)localObject3).setImageResource(2130839637);
      localTextView2.setVisibility(8);
      ((h.a.a)localObject4).cAx = 2131230800;
      this.pKt.a((h.a.a)localObject4);
      continue;
      paramView = paramb.cAv;
      localTextView1.setText(paramView.title);
      ((TextView)localObject1).setVisibility(0);
      ((TextView)localObject1).setText(bo.aC((float)paramView.wgu));
      localTextView2.setVisibility(8);
      if (paramView.whh == 2)
        ((TextView)localObject1).setText(">25MB");
      ((MMImageView)localObject2).setImageResource(d.ail(paramb.cAv.wgo));
      continue;
      paramb = paramb.cAv;
      if (paramb.wgT == null)
      {
        ab.w("MicroMsg.OtherViewWrapper", "product, get data proto item null, dataid[%s]", new Object[] { paramb.mnd });
        localTextView1.setText("");
        ((TextView)localObject1).setText("");
        localTextView2.setText("");
      }
      while (true)
      {
        ((h.a.a)localObject4).cAx = 2131230813;
        this.pKt.a((h.a.a)localObject4);
        break;
        paramView = paramb.wgT.whC;
        localTextView1.setText(paramView.title);
        ((TextView)localObject1).setText(paramView.desc);
        paramView = paramb.wgT.whw;
        localTextView2.setText(bo.bc(getAppName(localTextView2.getContext(), paramView.appId), localTextView2.getContext().getString(2131299691)));
      }
      paramView = paramb.cAv;
      if (paramView.wgT == null)
      {
        ab.w("MicroMsg.OtherViewWrapper", "mall product, get data proto item null, dataid[%s]", new Object[] { paramView.mnd });
        localTextView1.setText("");
        ((TextView)localObject1).setText("");
        localTextView2.setText("");
      }
      while (true)
      {
        ((h.a.a)localObject4).cAx = 2131230813;
        ((h.a.a)localObject4).cAv = null;
        this.pKt.a((h.a.a)localObject4);
        break;
        paramView = paramView.wgT.whC;
        localTextView1.setText(paramView.title);
        ((TextView)localObject1).setText(paramView.desc);
        localTextView1.setSingleLine(false);
        localTextView1.setMaxLines(2);
        localTextView2.setVisibility(8);
      }
      paramb = paramb.cAv;
      if ((paramb.wgT == null) || (paramb.wgT.whE == null))
      {
        ab.w("MicroMsg.OtherViewWrapper", "tv, get data proto item null, dataid[%s]", new Object[] { paramb.mnd });
        localTextView1.setText("");
        ((TextView)localObject1).setText("");
        localTextView2.setText("");
      }
      while (true)
      {
        ((h.a.a)localObject4).cAx = 2131230813;
        ((h.a.a)localObject4).cAv = null;
        this.pKt.a((h.a.a)localObject4);
        break;
        paramView = paramb.wgT.whE;
        localTextView1.setText(paramView.title);
        ((TextView)localObject1).setText(paramView.desc);
        paramView = paramb.wgT.whw;
        localTextView2.setText(bo.bc(getAppName(localTextView2.getContext(), paramView.appId), localTextView2.getContext().getString(2131299757)));
      }
      paramView = paramb.cAv;
      aw.ZK();
      localObject4 = com.tencent.mm.model.c.XO().Rn(paramView.desc);
      if (localObject4 == null)
        ab.e("MicroMsg.OtherViewWrapper", "parse possible friend msg failed");
      paramb = localTextView1.getContext();
      if (localObject4 != null);
      for (paramView = ((bi.a)localObject4).nickname; ; paramView = "")
      {
        localTextView1.setText(j.b(paramb, paramView, localTextView1.getTextSize()));
        ((TextView)localObject1).setVisibility(8);
        localTextView2.setText(2131299644);
        localTextView2.setVisibility(0);
        paramView = ((bi.a)localObject4).svN;
        if (!bo.isNullOrNil(paramView))
          break label1842;
        ((ImageView)localObject2).setImageResource(2130838444);
        break;
      }
      label1842: a.b.b((ImageView)localObject2, paramView);
      continue;
      paramView = paramb.cAv;
      localTextView1.setText(paramView.title);
      ((TextView)localObject1).setVisibility(0);
      ((TextView)localObject1).setText(paramView.desc);
      ((MMImageView)localObject2).setVisibility(8);
      continue;
      localObject3 = paramb.cAv;
      paramInt = paramb.cAv.dataType;
      paramView = "";
      if (localObject3 != null)
        paramView = ((aar)localObject3).title;
      if (bo.isNullOrNil(paramView))
      {
        localTextView1.setVisibility(8);
        label1932: paramView = "";
        if (19 == paramInt)
          paramView = ((TextView)localObject1).getContext().getString(2131296613);
        if (!bo.isNullOrNil(paramView))
          break label2045;
        ((TextView)localObject1).setVisibility(8);
        label1967: paramView = new h.a.c();
        paramView.cAv = paramb.cAv;
        if (paramb.dataType != 0)
          break label2060;
        paramView.pKv = paramb.cvx;
      }
      while (true)
      {
        ((h.a.a)localObject4).cAx = 2130837705;
        paramView = this.pKt.a(paramView);
        if (paramView == null)
          break label2082;
        ((MMImageView)localObject2).setImageBitmap(paramView);
        break;
        localTextView1.setText(paramView);
        localTextView1.setVisibility(0);
        break label1932;
        label2045: ((TextView)localObject1).setText(paramView);
        ((TextView)localObject1).setVisibility(0);
        break label1967;
        label2060: if (paramb.dataType == 1)
          paramView.pKv = paramb.mnW.field_localId;
      }
      label2082: this.pKt.a((h.a.a)localObject4);
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(24359);
    ab.d("MicroMsg.OtherViewWrapper", "do destroy");
    this.pKt = null;
    this.handler = null;
    com.tencent.mm.sdk.b.a.xxA.d(this.hAA);
    this.pLc = false;
    AppMethodBeat.o(24359);
  }

  public final View eK(Context paramContext)
  {
    AppMethodBeat.i(24355);
    View localView = View.inflate(paramContext, 2130970482, null);
    this.moM = com.tencent.mm.bz.a.fromDPToPix(paramContext, 75);
    com.tencent.mm.sdk.b.a.xxA.c(this.hAA);
    AppMethodBeat.o(24355);
    return localView;
  }

  public final void pause()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.b.b
 * JD-Core Version:    0.6.2
 */