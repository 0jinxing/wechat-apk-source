package com.tencent.mm.plugin.wenote.model;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.wenote.model.a.o;
import com.tencent.mm.plugin.wenote.model.a.s;
import com.tencent.mm.plugin.wenote.model.a.u;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class g extends d
  implements com.tencent.mm.ai.f
{
  private static HashMap<com.tencent.mm.plugin.fav.a.g, com.tencent.mm.plugin.wenote.model.a.m> uNi;
  private abh cAS;
  public boolean cHc;
  public long cHh;
  private com.tencent.mm.plugin.fav.a.g mjP;
  public String uNg;
  public String uNh;
  private int uNj;
  private int uNk;
  public String uNl;
  public int uNm;
  public long uNn;
  public String uNo;
  public String uNp;
  public boolean uNq;

  static
  {
    AppMethodBeat.i(26634);
    uNi = new HashMap();
    AppMethodBeat.o(26634);
  }

  public g()
  {
    AppMethodBeat.i(26620);
    this.cHh = -1L;
    this.uNh = "";
    this.cHc = true;
    this.uNj = 0;
    this.uNk = 0;
    this.uNm = 0;
    this.uNn = 0L;
    this.cAS = new abh();
    this.uNq = false;
    this.uMR.clear();
    this.uMQ = null;
    uMW = "";
    this.uMY = false;
    com.tencent.mm.plugin.fav.ui.c.bvD();
    aw.Rg().a(426, this);
    AppMethodBeat.o(26620);
  }

  private String agX(String paramString)
  {
    AppMethodBeat.i(26632);
    Object localObject = f.jD(this.cHh);
    if (localObject == null)
    {
      paramString = ((o)this.uMT.get(paramString)).mnd;
      AppMethodBeat.o(26632);
    }
    while (true)
    {
      return paramString;
      localObject = ((com.tencent.mm.plugin.fav.a.g)localObject).field_favProto.wiv.iterator();
      while (true)
        if (((Iterator)localObject).hasNext())
        {
          aar localaar = (aar)((Iterator)localObject).next();
          if ((!bo.isNullOrNil(localaar.whb)) && (localaar.whb.equals(paramString)))
          {
            paramString = localaar.mnd;
            AppMethodBeat.o(26632);
            break;
          }
        }
      paramString = ((o)this.uMT.get(paramString)).mnd;
      AppMethodBeat.o(26632);
    }
  }

  private void ddJ()
  {
    AppMethodBeat.i(26623);
    this.mjP = f.jD(this.cHh);
    if (this.mjP == null)
      AppMethodBeat.o(26623);
    while (true)
    {
      return;
      if (this.uNn <= 0L)
        this.uNn = this.mjP.field_updateTime;
      this.uMZ = this.mjP.field_favProto;
      this.uMQ = this.mjP;
      AppMethodBeat.o(26623);
    }
  }

  public final void a(long paramLong, Context paramContext, Boolean paramBoolean, int paramInt1, int paramInt2, abh paramabh, abf paramabf)
  {
    AppMethodBeat.i(26621);
    this.cHh = paramLong;
    this.cHc = paramBoolean.booleanValue();
    this.uNj = paramInt1;
    this.uNk = paramInt2;
    this.cAS = paramabh;
    ddJ();
    if ((this.uNm == 0) && (this.uMZ.wit != null))
      this.uNm = this.uMZ.wit.cvp;
    ab(paramContext, 2);
    com.tencent.mm.sdk.g.d.xDH.ak(new g.2(this, paramabf));
    AppMethodBeat.o(26621);
  }

  public final void a(aar paramaar, String paramString)
  {
    AppMethodBeat.i(26627);
    com.tencent.mm.plugin.wenote.model.a.m localm = this.uMP;
    gh localgh = new gh();
    localgh.cAH.type = 28;
    localgh.cAH.cvv = localm.mnW.field_localId;
    localgh.cAH.cAJ = paramaar;
    localgh.cAH.path = paramString;
    localgh.cAH.cAO = 18;
    a.xxA.m(localgh);
    AppMethodBeat.o(26627);
  }

  public final void ab(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(26622);
    Intent localIntent = new Intent();
    localIntent.putExtra("note_open_from_scene", paramInt);
    if (paramInt == 4)
    {
      localIntent.putExtra("fav_note_thumbpath", this.uNo);
      localIntent.putExtra("fav_note_link_sns_xml", this.uNp);
    }
    localIntent.putExtra("edit_status", this.uMY);
    localIntent.putExtra("need_save", this.uNq);
    localIntent.putExtra("show_share", this.cHc);
    localIntent.putExtra("note_fav_localid", this.cHh);
    localIntent.putExtra("note_link_sns_localid", this.uNg);
    localIntent.putExtra("fav_note_xml", this.uNh);
    localIntent.putExtra("fav_note_scroll_to_position", this.uNj);
    localIntent.putExtra("fav_note_scroll_to_offset", this.uNk);
    localIntent.putExtra("fav_note_link_source_info", this.uNl);
    localIntent.putExtra("note_fav_post_scene", this.uNm);
    localIntent.putExtra("key_detail_fav_scene", this.cAS.scene);
    localIntent.putExtra("key_detail_fav_sub_scene", this.cAS.jSW);
    localIntent.putExtra("key_detail_fav_index", this.cAS.index);
    localIntent.putExtra("key_detail_fav_query", this.cAS.query);
    localIntent.putExtra("key_detail_fav_sessionid", this.cAS.cvF);
    localIntent.putExtra("key_detail_fav_tags", this.cAS.mfg);
    com.tencent.mm.bp.d.b(paramContext, "wenote", ".ui.nativenote.NoteEditorUI", localIntent);
    AppMethodBeat.o(26622);
  }

  public final void agU(String paramString)
  {
    this.uNh = paramString;
  }

  public final String b(aar paramaar)
  {
    AppMethodBeat.i(26624);
    paramaar = f.o(paramaar);
    AppMethodBeat.o(26624);
    return paramaar;
  }

  public final void bm(Context paramContext, String paramString)
  {
    AppMethodBeat.i(26628);
    u localu = (u)this.uMT.get(paramString);
    Intent localIntent = new Intent();
    localIntent.putExtra("fav_open_from_wnnote", true);
    localIntent.putExtra("fav_note_xml", this.uNh);
    if (localu != null)
      localIntent.putExtra("key_detail_data_id", agX(paramString));
    localIntent.putExtra("key_detail_can_delete", false);
    localIntent.putExtra("key_detail_info_id", this.cHh);
    localIntent.putExtra("key_detail_fav_scene", this.cAS.scene);
    localIntent.putExtra("key_detail_fav_sub_scene", this.cAS.jSW);
    localIntent.putExtra("key_detail_fav_index", this.cAS.index);
    b.a(paramContext, ".ui.detail.FavoriteFileDetailUI", localIntent, 1);
    AppMethodBeat.o(26628);
  }

  public final void bn(Context paramContext, String paramString)
  {
    AppMethodBeat.i(26630);
    s locals = (s)this.uMT.get(paramString);
    if (locals == null)
    {
      h.bQ(paramContext, ah.getContext().getString(2131299703));
      AppMethodBeat.o(26630);
    }
    while (true)
    {
      return;
      paramString = new Intent();
      paramString.putExtra("kwebmap_slat", locals.lat);
      paramString.putExtra("kwebmap_lng", locals.lng);
      paramString.putExtra("kPoiName", locals.eUu);
      paramString.putExtra("Kwebmap_locaion", locals.fBg);
      if (locals.scale >= 0.0D)
        paramString.putExtra("kwebmap_scale", locals.scale);
      paramString.putExtra("kisUsername", "");
      paramString.putExtra("kwebmap_from_to", true);
      paramString.putExtra("KFavLocSigleView", true);
      paramString.putExtra("map_view_type", 2);
      paramString.putExtra("kFavInfoLocalId", this.cHh);
      paramString.putExtra("kFavCanDel", false);
      paramString.putExtra("kFavCanRemark", false);
      com.tencent.mm.bp.d.b(paramContext, "location", ".ui.RedirectUI", paramString, 1);
      AppMethodBeat.o(26630);
    }
  }

  public final void bo(Context paramContext, String paramString)
  {
    AppMethodBeat.i(26629);
    Intent localIntent = new Intent();
    localIntent.putExtra("fav_open_from_wnnote", true);
    localIntent.putExtra("fav_note_xml", this.uNh);
    if (this.uMT.get(paramString) != null)
      localIntent.putExtra("key_detail_data_id", ((o)this.uMT.get(paramString)).mnd);
    localIntent.putExtra("key_detail_info_id", this.cHh);
    localIntent.putExtra("key_detail_fav_scene", this.cAS.scene);
    localIntent.putExtra("key_detail_fav_sub_scene", this.cAS.jSW);
    localIntent.putExtra("key_detail_fav_index", this.cAS.index);
    b.a(paramContext, ".ui.FavImgGalleryUI", localIntent, 1);
    AppMethodBeat.o(26629);
  }

  public final String c(aar paramaar)
  {
    AppMethodBeat.i(26625);
    paramaar = f.c(paramaar);
    AppMethodBeat.o(26625);
    return paramaar;
  }

  public final String ddH()
  {
    return this.uNh;
  }

  public final void n(aar paramaar)
  {
    AppMethodBeat.i(26626);
    com.tencent.mm.plugin.wenote.model.a.m localm = this.uMP;
    gh localgh = new gh();
    localgh.cAH.type = 28;
    localgh.cAH.cvv = localm.mnW.field_localId;
    localgh.cAH.cAJ = paramaar;
    localgh.cAH.path = "";
    localgh.cAH.cAO = 18;
    a.xxA.m(localgh);
    AppMethodBeat.o(26626);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(26631);
    if (paramm.getType() == 426)
    {
      paramString = new gh();
      paramString.cAH.cwn = paramm;
      paramString.cAH.type = 31;
      a.xxA.m(paramString);
      if ((!bo.isNullOrNil(paramString.cAI.path)) && (paramInt2 == -435))
        ab.e("MicroMsg.WNNoteFavProcess", "wenote conflict when commit");
      aw.Rg().b(426, this);
      AppMethodBeat.o(26631);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(26631);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.g
 * JD-Core Version:    0.6.2
 */