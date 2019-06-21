package com.tencent.mm.ui.chatting.gallery;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.aj.f;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.g;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.p;
import com.tencent.mm.vfs.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d extends p<bi>
  implements View.OnClickListener
{
  private static Map<String, Integer> mid;
  private static Map<String, Integer> yUu;
  protected com.tencent.mm.at.a.a.c elH;
  String emo;
  private boolean kuU;
  Context mContext;
  private LayoutInflater mInflater;
  boolean mgP;
  public boolean pZZ;
  long yNB;
  private final ImageGalleryGridUI yUs;
  boolean yUt;

  static
  {
    AppMethodBeat.i(32033);
    HashMap localHashMap = new HashMap();
    mid = localHashMap;
    localHashMap.put("avi", Integer.valueOf(2131230818));
    mid.put("m4v", Integer.valueOf(2131230818));
    mid.put("vob", Integer.valueOf(2131230818));
    mid.put("mpeg", Integer.valueOf(2131230818));
    mid.put("mpe", Integer.valueOf(2131230818));
    mid.put("asx", Integer.valueOf(2131230818));
    mid.put("asf", Integer.valueOf(2131230818));
    mid.put("f4v", Integer.valueOf(2131230818));
    mid.put("flv", Integer.valueOf(2131230818));
    mid.put("mkv", Integer.valueOf(2131230818));
    mid.put("wmv", Integer.valueOf(2131230818));
    mid.put("wm", Integer.valueOf(2131230818));
    mid.put("3gp", Integer.valueOf(2131230818));
    mid.put("mp4", Integer.valueOf(2131230818));
    mid.put("rmvb", Integer.valueOf(2131230818));
    mid.put("rm", Integer.valueOf(2131230818));
    mid.put("ra", Integer.valueOf(2131230818));
    mid.put("ram", Integer.valueOf(2131230818));
    mid.put("mp3pro", Integer.valueOf(2131230801));
    mid.put("vqf", Integer.valueOf(2131230801));
    mid.put("cd", Integer.valueOf(2131230801));
    mid.put("md", Integer.valueOf(2131230801));
    mid.put("mod", Integer.valueOf(2131230801));
    mid.put("vorbis", Integer.valueOf(2131230801));
    mid.put("au", Integer.valueOf(2131230801));
    mid.put("amr", Integer.valueOf(2131230801));
    mid.put("silk", Integer.valueOf(2131230801));
    mid.put("wma", Integer.valueOf(2131230801));
    mid.put("mmf", Integer.valueOf(2131230801));
    mid.put("mid", Integer.valueOf(2131230801));
    mid.put("midi", Integer.valueOf(2131230801));
    mid.put("mp3", Integer.valueOf(2131230801));
    mid.put("aac", Integer.valueOf(2131230801));
    mid.put("ape", Integer.valueOf(2131230801));
    mid.put("aiff", Integer.valueOf(2131230801));
    mid.put("aif", Integer.valueOf(2131230801));
    mid.put("doc", Integer.valueOf(2131230822));
    mid.put("docx", Integer.valueOf(2131230822));
    mid.put("ppt", Integer.valueOf(2131230808));
    mid.put("pptx", Integer.valueOf(2131230808));
    mid.put("xls", Integer.valueOf(2131230794));
    mid.put("xlsx", Integer.valueOf(2131230794));
    mid.put("pdf", Integer.valueOf(2131230805));
    mid.put("unknown", Integer.valueOf(2131230814));
    localHashMap = new HashMap();
    yUu = localHashMap;
    localHashMap.put("doc", Integer.valueOf(2131689669));
    yUu.put("docx", Integer.valueOf(2131689669));
    yUu.put("ppt", Integer.valueOf(2131689672));
    yUu.put("pptx", Integer.valueOf(2131689672));
    yUu.put("xls", Integer.valueOf(2131689675));
    yUu.put("xlsx", Integer.valueOf(2131689675));
    yUu.put("pdf", Integer.valueOf(2131689671));
    yUu.put("unknown", Integer.valueOf(2131689673));
    yUu.put("mp3pro", Integer.valueOf(2131689670));
    yUu.put("vqf", Integer.valueOf(2131689670));
    yUu.put("cd", Integer.valueOf(2131689670));
    yUu.put("md", Integer.valueOf(2131689670));
    yUu.put("mod", Integer.valueOf(2131689670));
    yUu.put("vorbis", Integer.valueOf(2131689670));
    yUu.put("au", Integer.valueOf(2131689670));
    yUu.put("amr", Integer.valueOf(2131689670));
    yUu.put("silk", Integer.valueOf(2131689670));
    yUu.put("wma", Integer.valueOf(2131689670));
    yUu.put("mmf", Integer.valueOf(2131689670));
    yUu.put("mid", Integer.valueOf(2131689670));
    yUu.put("midi", Integer.valueOf(2131689670));
    yUu.put("mp3", Integer.valueOf(2131689670));
    yUu.put("aac", Integer.valueOf(2131689670));
    yUu.put("ape", Integer.valueOf(2131689670));
    yUu.put("aiff", Integer.valueOf(2131689670));
    yUu.put("aif", Integer.valueOf(2131689670));
    AppMethodBeat.o(32033);
  }

  public d(Context paramContext, bi parambi, String paramString)
  {
    super(paramContext, parambi);
    AppMethodBeat.i(32022);
    this.elH = null;
    this.yUt = false;
    this.pZZ = false;
    this.yUs = ((ImageGalleryGridUI)paramContext);
    this.emo = paramString;
    this.mgP = f.kq(this.emo);
    if (this.mgP)
      this.yNB = parambi.field_bizChatId;
    aw.ZK();
    this.kuU = com.tencent.mm.model.c.isSDCardAvailable();
    this.mInflater = LayoutInflater.from(paramContext);
    parambi = new c.a();
    parambi.fHe = 1;
    parambi.eQa = true;
    parambi.ePO = (com.tencent.mm.bz.a.gd(paramContext) / 3);
    parambi.ePN = (com.tencent.mm.bz.a.gd(paramContext) / 3);
    parambi.ePV = 2131690335;
    this.elH = parambi.ahG();
    AppMethodBeat.o(32022);
  }

  private static String bx(bi parambi)
  {
    AppMethodBeat.i(32028);
    Object localObject1;
    if ((parambi.bws()) || (parambi.bwt()))
    {
      com.tencent.mm.modelvideo.o.all();
      localObject1 = t.ui(parambi.field_imgPath);
    }
    while (true)
    {
      ab.i("MicroMsg.ImageGalleryGridAdapter", "MsgInfoForMonetUri imgPath : %s", new Object[] { localObject1 });
      Object localObject2 = localObject1;
      if (parambi.dtA())
      {
        Object localObject3 = j.b.me(parambi.field_content);
        localObject2 = null;
        parambi = (bi)localObject2;
        if (localObject3 != null)
        {
          parambi = (bi)localObject2;
          if (((j.b)localObject3).csD != null)
          {
            parambi = (bi)localObject2;
            if (((j.b)localObject3).csD.length() > 0)
            {
              localObject3 = am.aUq().aiE(((j.b)localObject3).csD);
              parambi = (bi)localObject2;
              if (localObject3 != null)
                parambi = ((b)localObject3).field_fileFullPath;
            }
          }
        }
        localObject2 = localObject1;
        if (parambi != null)
          localObject2 = parambi;
      }
      AppMethodBeat.o(32028);
      return localObject2;
      localObject2 = com.tencent.mm.at.o.ahl().c(parambi.field_imgPath, false, false);
      localObject1 = localObject2;
      if (!ah.isNullOrNil((String)localObject2))
      {
        localObject1 = localObject2;
        if (!((String)localObject2).endsWith("hd"))
        {
          localObject1 = localObject2;
          if (e.ct((String)localObject2 + "hd"))
            localObject1 = (String)localObject2 + "hd";
        }
      }
    }
  }

  private static int f(j.b paramb)
  {
    int i = 2131230814;
    AppMethodBeat.i(32026);
    if (paramb == null)
    {
      ab.i("MicroMsg.ImageGalleryGridAdapter", "getIconId:2131230813");
      AppMethodBeat.o(32026);
    }
    while (true)
    {
      return i;
      if ((paramb.type == 5) || (paramb.type == 7) || (paramb.type == 15))
      {
        i = 2131230816;
        AppMethodBeat.o(32026);
      }
      else if (paramb.type == 3)
      {
        i = 2131230801;
        AppMethodBeat.o(32026);
      }
      else if ((paramb.type == 6) && (mid.containsKey(ah.nullAsNil(paramb.fgp))))
      {
        ab.i("MicroMsg.ImageGalleryGridAdapter", "getIconId:" + mid.get(ah.nullAsNil(paramb.fgp)));
        i = ((Integer)mid.get(ah.nullAsNil(paramb.fgp))).intValue();
        AppMethodBeat.o(32026);
      }
      else
      {
        AppMethodBeat.o(32026);
      }
    }
  }

  private static int g(j.b paramb)
  {
    int i = 2131689673;
    AppMethodBeat.i(32027);
    if (paramb == null)
    {
      ab.i("MicroMsg.ImageGalleryGridAdapter", "getIconId:2131689673");
      AppMethodBeat.o(32027);
    }
    while (true)
    {
      return i;
      if ((paramb.type == 5) || (paramb.type == 7) || (paramb.type == 15))
      {
        i = 2131689674;
        AppMethodBeat.o(32027);
      }
      else if ((paramb.type == 6) && (yUu.containsKey(ah.nullAsNil(paramb.fgp))))
      {
        ab.i("MicroMsg.ImageGalleryGridAdapter", "getIconId:" + yUu.get(ah.nullAsNil(paramb.fgp)));
        i = ((Integer)yUu.get(ah.nullAsNil(paramb.fgp))).intValue();
        AppMethodBeat.o(32027);
      }
      else
      {
        AppMethodBeat.o(32027);
      }
    }
  }

  public final void KC()
  {
    AppMethodBeat.i(32023);
    if (this.mgP)
    {
      aw.ZK();
      setCursor(com.tencent.mm.model.c.XP().aN(this.emo, this.yNB));
      AppMethodBeat.o(32023);
    }
    while (true)
    {
      return;
      aw.ZK();
      setCursor(com.tencent.mm.model.c.XO().Rf(this.emo));
      AppMethodBeat.o(32023);
    }
  }

  public final void KD()
  {
    AppMethodBeat.i(32024);
    if (this.mgP)
    {
      aw.ZK();
      setCursor(com.tencent.mm.model.c.XP().aN(this.emo, this.yNB));
      AppMethodBeat.o(32024);
    }
    while (true)
    {
      return;
      aw.ZK();
      setCursor(com.tencent.mm.model.c.XO().Rf(this.emo));
      AppMethodBeat.o(32024);
    }
  }

  public final boolean areAllItemsEnabled()
  {
    return false;
  }

  public final void bwq()
  {
    AppMethodBeat.i(32029);
    this.pZZ = false;
    notifyDataSetChanged();
    AppMethodBeat.o(32029);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(32025);
    if (paramView == null)
    {
      paramView = this.mInflater.inflate(2130969842, paramViewGroup, false);
      paramViewGroup = new d.a();
      paramViewGroup.mok = ((ImageView)paramView.findViewById(2131823900));
      paramViewGroup.mol = paramView.findViewById(2131823904);
      paramViewGroup.yUy = ((TextView)paramView.findViewById(2131823901));
      paramViewGroup.yUy.setVisibility(8);
      paramViewGroup.yUx = ((ImageView)paramView.findViewById(2131823903));
      paramViewGroup.kuL = ((TextView)paramView.findViewById(2131822745));
      paramViewGroup.mol.setVisibility(8);
      paramViewGroup.mon = paramView.findViewById(2131823906);
      paramViewGroup.mon.setVisibility(8);
      paramViewGroup.yUz = paramView.findViewById(2131823902);
      paramViewGroup.yUz.setVisibility(8);
      paramViewGroup.mom = ((ImageView)paramView.findViewById(2131823908));
      paramViewGroup.moo = ((CheckBox)paramView.findViewById(2131823909));
      paramViewGroup.mop = paramView.findViewById(2131823910);
      paramView.setTag(paramViewGroup);
    }
    bi localbi;
    while (true)
    {
      paramViewGroup.mon.setVisibility(8);
      paramViewGroup.mol.setVisibility(8);
      paramViewGroup.yUz.setVisibility(8);
      paramViewGroup.yUy.setVisibility(8);
      localbi = (bi)getItem(paramInt);
      if (localbi != null)
        break;
      AppMethodBeat.o(32025);
      return paramView;
      paramViewGroup = (d.a)paramView.getTag();
    }
    Object localObject1;
    Object localObject2;
    label408: int i;
    if (this.kuU)
    {
      if (!(this.yUs instanceof ImageGalleryGridUI))
      {
        paramView = new IllegalArgumentException("the context should be ImageGalleryGridUI");
        AppMethodBeat.o(32025);
        throw paramView;
      }
      localObject1 = localbi.field_content;
      localObject2 = null;
      if (localObject1 != null)
        localObject2 = j.b.X((String)localObject1, localbi.field_reserved);
      if (this.yUs.yUA == paramInt)
      {
        paramViewGroup.mom.setVisibility(0);
        if ((c.bq(localbi)) && (localObject2 != null) && (((j.b)localObject2).type != 3))
        {
          paramViewGroup.yUx.setImageDrawable(this.yUs.getResources().getDrawable(f((j.b)localObject2)));
          paramViewGroup.mok.setImageResource(g((j.b)localObject2));
          paramViewGroup.mok.setPadding(0, 0, 0, 0);
          i = paramViewGroup.mok.getMeasuredWidth();
          paramInt = paramViewGroup.mok.getMeasuredHeight();
          if ((i > 0) && (paramInt > 0))
            break label775;
          label445: if (!c.f(localbi))
            break label809;
          if (paramViewGroup != null)
          {
            paramViewGroup.mol.setVisibility(0);
            localObject2 = j.bG(localbi);
            if (localObject2 != null)
              paramViewGroup.kuL.setText(ah.mK(((s)localObject2).fXd));
          }
          label492: paramViewGroup.moo.setChecked(h.a.dFX().bE(localbi));
          paramViewGroup.moo.setTag(localbi);
          paramViewGroup.mop.setTag(paramViewGroup);
          paramViewGroup.mop.setOnClickListener(this);
          if (!h.a.dFX().mnY)
            break label980;
          paramViewGroup.moo.setVisibility(0);
          paramViewGroup.mop.setVisibility(0);
          paramViewGroup.mom.setVisibility(0);
        }
      }
    }
    while (true)
    {
      AppMethodBeat.o(32025);
      break;
      if ((localObject2 != null) && (((j.b)localObject2).type == 3))
        paramViewGroup.yUx.setImageDrawable(this.yUs.getResources().getDrawable(f((j.b)localObject2)));
      com.tencent.mm.at.o.ahp().a(bx(localbi), paramViewGroup.mok, this.elH, new d.1(this));
      break label408;
      paramViewGroup.mom.setVisibility(0);
      paramViewGroup.mom.setBackgroundResource(2131690176);
      if ((c.bq(localbi)) && (localObject2 != null) && (((j.b)localObject2).type != 3))
      {
        paramViewGroup.yUx.setImageDrawable(this.yUs.getResources().getDrawable(f((j.b)localObject2)));
        paramViewGroup.mok.setImageResource(g((j.b)localObject2));
        break label408;
      }
      if ((localObject2 != null) && (((j.b)localObject2).type == 3))
        paramViewGroup.yUx.setImageDrawable(this.yUs.getResources().getDrawable(f((j.b)localObject2)));
      com.tencent.mm.at.o.ahp().a(bx(localbi), paramViewGroup.mok, this.elH);
      break label408;
      label775: localObject1 = paramViewGroup.mom.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).width = i;
      ((ViewGroup.LayoutParams)localObject1).height = paramInt;
      paramViewGroup.mom.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      break label445;
      label809: if (c.bp(localbi))
      {
        paramViewGroup.mon.setVisibility(0);
        break label492;
      }
      if ((!c.bq(localbi)) || (paramViewGroup == null))
        break label492;
      paramViewGroup.yUz.setVisibility(0);
      paramViewGroup.yUy.setVisibility(0);
      if (localObject2 == null)
        break label492;
      ab.i("MicroMsg.ImageGalleryGridAdapter", "initFileName--->content:%s", new Object[] { ah.nullAsNil(((j.b)localObject2).title) });
      if (((j.b)localObject2).type != 24)
      {
        paramViewGroup.yUy.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, ah.nullAsNil(((j.b)localObject2).title), paramViewGroup.yUy.getTextSize()));
        break label492;
      }
      paramViewGroup.yUy.setText(com.tencent.mm.pluginsdk.ui.e.j.b(paramViewGroup.yUy.getContext(), paramViewGroup.yUy.getContext().getString(2131299765), paramViewGroup.yUy.getTextSize()));
      break label492;
      paramViewGroup.mok.setImageResource(2130839707);
      break label492;
      label980: paramViewGroup.moo.setVisibility(8);
      paramViewGroup.mop.setVisibility(8);
      paramViewGroup.mom.setVisibility(8);
    }
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(32030);
    super.notifyDataSetChanged();
    this.yUt = false;
    AppMethodBeat.o(32030);
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(32031);
    d.a locala = (d.a)paramView.getTag();
    if (locala.moo == null)
      AppMethodBeat.o(32031);
    while (true)
    {
      return;
      paramView = (bi)locala.moo.getTag();
      if (paramView != null)
        break;
      AppMethodBeat.o(32031);
    }
    h localh = h.a.dFX();
    if (localh.bE(paramView))
    {
      localh.bD(paramView);
      label69: if (!h.a.dFX().bE(paramView))
        break label155;
      locala.moo.setChecked(true);
      locala.mom.setBackgroundResource(2131690155);
    }
    while (true)
    {
      if ((!this.pZZ) && (h.a.dFX().mnX.size() > 1))
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(219L, 20L, 1L, true);
        this.pZZ = true;
      }
      AppMethodBeat.o(32031);
      break;
      localh.bC(paramView);
      break label69;
      label155: locala.moo.setChecked(false);
      locala.mom.setBackgroundResource(2131690176);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.d
 * JD-Core Version:    0.6.2
 */