package com.tencent.mm.plugin.wenote.model;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.nt;
import com.tencent.mm.g.a.nt.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.wenote.model.a.m;
import com.tencent.mm.plugin.wenote.model.a.o;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aat;
import com.tencent.mm.protocal.protobuf.aaz;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import java.util.HashMap;
import java.util.LinkedList;

public final class j extends d
{
  private static HashMap<String, m> uNJ;
  private abh cAS;
  private String cHP;
  private boolean cHc;
  private com.tencent.mm.protocal.b.a.c pKz;
  private Long uNH;
  private boolean uNI;
  private int uNj;
  private int uNk;
  private String uNl;

  static
  {
    AppMethodBeat.i(26663);
    uNJ = new HashMap();
    AppMethodBeat.o(26663);
  }

  public j()
  {
    AppMethodBeat.i(26651);
    this.pKz = null;
    this.uNj = 0;
    this.uNk = 0;
    this.uNI = false;
    this.cAS = new abh();
    this.uMR.clear();
    com.tencent.mm.plugin.fav.ui.c.bvD();
    AppMethodBeat.o(26651);
  }

  private static com.tencent.mm.protocal.b.a.c VI(String paramString)
  {
    AppMethodBeat.i(26654);
    nt localnt = new nt();
    localnt.cJY.type = 0;
    localnt.cJY.cKa = paramString;
    a.xxA.m(localnt);
    paramString = localnt.cJZ.cKi;
    AppMethodBeat.o(26654);
    return paramString;
  }

  private void fx(Context paramContext)
  {
    AppMethodBeat.i(26653);
    Intent localIntent = new Intent();
    localIntent.putExtra("note_open_from_scene", 1);
    localIntent.putExtra("edit_status", this.uMY);
    localIntent.putExtra("note_msgid", this.uNH);
    localIntent.putExtra("record_show_share", this.cHc);
    localIntent.putExtra("fav_note_xml", this.cHP);
    localIntent.putExtra("fav_note_out_of_date", this.uNI);
    localIntent.putExtra("fav_note_scroll_to_position", this.uNj);
    localIntent.putExtra("fav_note_scroll_to_offset", this.uNk);
    localIntent.putExtra("fav_note_scroll_to_offset", this.uNk);
    if (!bo.isNullOrNil(this.uNl))
      localIntent.putExtra("fav_note_link_source_info", this.uNl);
    localIntent.putExtra("key_detail_fav_scene", this.cAS.scene);
    localIntent.putExtra("key_detail_fav_sub_scene", this.cAS.jSW);
    localIntent.putExtra("key_detail_fav_index", this.cAS.index);
    com.tencent.mm.bp.d.b(paramContext, "wenote", ".ui.nativenote.NoteEditorUI", localIntent);
    AppMethodBeat.o(26653);
  }

  public final void a(aar paramaar, String paramString)
  {
    AppMethodBeat.i(26658);
    nt localnt = new nt();
    localnt.cJY.type = 8;
    localnt.cJY.cAv = paramaar;
    localnt.cJY.cvx = this.uNH.longValue();
    localnt.cJY.thumbPath = paramString;
    a.xxA.m(localnt);
    AppMethodBeat.o(26658);
  }

  public final void a(String paramString, Long paramLong, boolean paramBoolean, Context paramContext, int paramInt1, int paramInt2, abh paramabh)
  {
    AppMethodBeat.i(26652);
    this.cHP = paramString;
    this.uNH = paramLong;
    this.cHc = paramBoolean;
    this.uNj = paramInt1;
    this.uNk = paramInt2;
    this.cAS = paramabh;
    this.pKz = VI(paramString);
    if ((this.pKz != null) && (this.pKz.fjr != null) && (this.pKz.fjr.size() > 1))
    {
      paramString = new nt();
      paramString.cJY.type = 9;
      paramString.cJY.cAv = ((aar)this.pKz.fjr.get(0));
      paramString.cJY.cvx = this.uNH.longValue();
      a.xxA.m(paramString);
      this.uNI = paramString.cJZ.cKj;
    }
    if ((this.pKz != null) && (this.pKz.vzK != null));
    for (this.uNl = (this.pKz.vzK.wim + ";" + this.pKz.vzK.win + ";" + this.pKz.lgR); ; this.uNl = null)
    {
      fx(paramContext);
      aw.RS().aa(new j.1(this));
      AppMethodBeat.o(26652);
      return;
    }
  }

  public final String b(aar paramaar)
  {
    AppMethodBeat.i(26655);
    nt localnt = new nt();
    localnt.cJY.type = 1;
    localnt.cJY.cAv = paramaar;
    localnt.cJY.cvx = this.uNH.longValue();
    a.xxA.m(localnt);
    paramaar = localnt.cJZ.dataPath;
    AppMethodBeat.o(26655);
    return paramaar;
  }

  public final void bm(Context paramContext, String paramString)
  {
    AppMethodBeat.i(26659);
    paramContext = new Intent();
    paramContext.putExtra("message_id", this.uNH);
    paramContext.putExtra("record_xml", this.cHP);
    paramContext.putExtra("record_data_id", ((o)this.uMT.get(paramString)).mnd);
    com.tencent.mm.bp.d.b(ah.getContext(), "record", ".ui.RecordMsgFileUI", paramContext);
    AppMethodBeat.o(26659);
  }

  public final void bn(Context paramContext, String paramString)
  {
    paramContext = null;
    AppMethodBeat.i(26661);
    Object localObject = ((o)this.uMT.get(paramString)).uOn;
    if (((aar)localObject).wgT != null);
    for (localObject = ((aar)localObject).wgT.whw; ; localObject = null)
    {
      if (localObject != null)
      {
        if (!bo.isNullOrNil(((aat)localObject).whU))
          paramContext = com.tencent.mm.model.s.mJ(((aat)localObject).whU);
      }
      else
      {
        localObject = (com.tencent.mm.plugin.wenote.model.a.s)this.uMT.get(paramString);
        if (localObject != null)
          break label110;
        h.bQ(ah.getContext(), ah.getContext().getString(2131299703));
        AppMethodBeat.o(26661);
      }
      while (true)
      {
        return;
        paramContext = com.tencent.mm.model.s.mJ(((aat)localObject).cEV);
        break;
        label110: paramString = new Intent();
        paramString.putExtra("map_view_type", 2);
        paramString.putExtra("kwebmap_slat", ((com.tencent.mm.plugin.wenote.model.a.s)localObject).lat);
        paramString.putExtra("kwebmap_lng", ((com.tencent.mm.plugin.wenote.model.a.s)localObject).lng);
        paramString.putExtra("kPoiName", ((com.tencent.mm.plugin.wenote.model.a.s)localObject).eUu);
        paramString.putExtra("Kwebmap_locaion", ((com.tencent.mm.plugin.wenote.model.a.s)localObject).fBg);
        if (((com.tencent.mm.plugin.wenote.model.a.s)localObject).scale >= 0.0D)
          paramString.putExtra("kwebmap_scale", ((com.tencent.mm.plugin.wenote.model.a.s)localObject).scale);
        paramString.putExtra("kisUsername", paramContext);
        paramString.putExtra("kwebmap_from_to", true);
        paramString.putExtra("KFavLocSigleView", true);
        paramString.putExtra("kFavCanDel", false);
        paramString.putExtra("kFavCanRemark", false);
        com.tencent.mm.bp.d.b(ah.getContext(), "location", ".ui.RedirectUI", paramString);
        AppMethodBeat.o(26661);
      }
    }
  }

  public final void bo(Context paramContext, String paramString)
  {
    AppMethodBeat.i(26660);
    paramContext = new Intent();
    paramContext.putExtra("message_id", this.uNH);
    paramContext.putExtra("record_data_id", ((o)this.uMT.get(paramString)).mnd);
    paramContext.putExtra("record_xml", this.cHP);
    com.tencent.mm.bp.d.b(ah.getContext(), "record", ".ui.RecordMsgImageUI", paramContext);
    AppMethodBeat.o(26660);
  }

  public final String c(aar paramaar)
  {
    AppMethodBeat.i(26656);
    nt localnt = new nt();
    localnt.cJY.type = 1;
    localnt.cJY.cAv = paramaar;
    localnt.cJY.cvx = this.uNH.longValue();
    a.xxA.m(localnt);
    paramaar = localnt.cJZ.thumbPath;
    AppMethodBeat.o(26656);
    return paramaar;
  }

  public final void n(aar paramaar)
  {
    AppMethodBeat.i(26657);
    nt localnt = new nt();
    localnt.cJY.type = 8;
    localnt.cJY.cAv = paramaar;
    localnt.cJY.cvx = this.uNH.longValue();
    localnt.cJY.thumbPath = "";
    a.xxA.m(localnt);
    AppMethodBeat.o(26657);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.j
 * JD-Core Version:    0.6.2
 */