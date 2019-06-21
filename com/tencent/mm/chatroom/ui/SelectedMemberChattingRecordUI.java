package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.af.j.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.storage.bi.b;
import com.tencent.mm.storage.bi.d;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import java.util.Map;

public class SelectedMemberChattingRecordUI extends MMActivity
{
  private static final f<Integer, com.tencent.mm.protocal.b.a.c> emX;
  private String ejD;
  private MMLoadMoreListView emT;
  private SelectedMemberChattingRecordUI.a emU;
  private String emV;
  private int emW = 0;
  private View emy;
  private String mTitle;

  static
  {
    AppMethodBeat.i(104450);
    emX = new com.tencent.mm.memory.a.c(32);
    AppMethodBeat.o(104450);
  }

  private boolean KA()
  {
    if (this.emW == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static String a(Context paramContext, int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    AppMethodBeat.i(104448);
    String str = "";
    j.b localb = j.b.me(paramString1);
    Object localObject;
    switch (paramInt1)
    {
    default:
      localObject = str;
    case 1:
    case 34:
    case 3:
    case 23:
    case 33:
    case 43:
    case 62:
    case 48:
    case 42:
    case 66:
      label224: label229: 
      do
      {
        while (true)
        {
          AppMethodBeat.o(104448);
          return localObject;
          localObject = paramString1.substring(paramString1.indexOf(":\n") + 1);
          continue;
          localObject = paramContext.getString(2131302210, new Object[] { Integer.valueOf((int)q.fY(new com.tencent.mm.modelvoice.n(paramString1).time)) });
          continue;
          localObject = paramContext.getString(2131297012);
          continue;
          if (62 == paramInt1);
          for (paramInt1 = 2131297051; ; paramInt1 = 2131297076)
          {
            localObject = paramContext.getString(paramInt1);
            break;
          }
          localObject = paramContext.getString(2131302202, new Object[] { ((j)g.K(j.class)).bOr().Ro(paramString1).label });
        }
        localObject = str;
      }
      while (bo.nullAsNil(paramString1).length() <= 0);
      localObject = bf.oy(paramString1);
      if (!TextUtils.isEmpty((CharSequence)localObject))
        break;
    case 49:
    case 47:
    case 419430449:
    case 436207665:
    case 469762097:
    case 503316529:
    case 369098801:
    case 452984881:
    case 520093745:
    case -1879048185:
    case -1879048183:
    case -1879048176:
    case -1879048186:
    case 37:
    }
    while (true)
    {
      localObject = ((j)g.K(j.class)).bOr().Rn(paramString1);
      paramString2 = ((j)g.K(j.class)).XM().aoO(paramString2).Oj();
      paramString1 = paramString2;
      if (t.kH(paramString2))
        paramString1 = com.tencent.mm.model.n.T(com.tencent.mm.model.n.mB(paramString2));
      if (paramInt2 == 1)
      {
        localObject = paramContext.getString(2131299927, new Object[] { paramString1, ((bi.a)localObject).getDisplayName() });
        break;
      }
      localObject = paramContext.getString(2131299928, new Object[] { paramString1, ((bi.a)localObject).getDisplayName() });
      break;
      if (localb == null)
      {
        ab.e("MicroMsg.SelectedMemberChattingRecordUI", "decode msg content failed");
        localObject = "";
        AppMethodBeat.o(104448);
        break label229;
      }
      localObject = str;
      switch (localb.type)
      {
      case 7:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 16:
      case 18:
      case 20:
      case 21:
      case 22:
      case 23:
      default:
        localObject = "";
        break;
      case 6:
        localObject = paramContext.getString(2131302201, new Object[] { localb.title });
        break;
      case 5:
        localObject = paramContext.getString(2131302208, new Object[] { localb.getTitle() });
        break;
      case 8:
        localObject = paramContext.getString(2131296896);
        break;
      case 15:
      case 26:
      case 27:
        localObject = paramContext.getString(2131296895);
        break;
      case 25:
        localObject = paramContext.getString(2131296883);
        break;
      case 17:
        localObject = paramContext.getString(2131302202, new Object[] { localb.title });
        break;
      case 19:
        localObject = paramContext.getString(2131302205, new Object[] { localb.title });
        break;
      case 24:
        paramString2 = localb.fgU;
        if (bo.isNullOrNil(paramString2))
        {
          ab.e("MicroMsg.SelectedMemberChattingRecordUI", "xml is null");
          paramString1 = null;
          if (paramString1 != null)
            break label1034;
        }
        for (paramString1 = ""; ; paramString1 = paramString1.desc)
        {
          localObject = paramContext.getString(2131302204, new Object[] { bo.bc(paramString1, "") });
          break;
          paramInt1 = paramString2.hashCode();
          paramString1 = (com.tencent.mm.protocal.b.a.c)emX.get(Integer.valueOf(paramInt1));
          if (paramString1 != null)
          {
            ab.d("MicroMsg.SelectedMemberChattingRecordUI", "get record msg data from cache");
            break label814;
          }
          if (paramString2.trim().startsWith("<recordinfo>"));
          for (paramString1 = br.z(paramString2, "recordinfo"); ; paramString1 = br.z("<recordinfo>" + paramString2 + "</recordinfo>", "recordinfo"))
          {
            if (paramString1 != null)
              break label959;
            ab.e("MicroMsg.SelectedMemberChattingRecordUI", "values is null: %s", new Object[] { paramString2 });
            paramString1 = null;
            break;
          }
          paramString2 = new com.tencent.mm.protocal.b.a.c();
          paramString2.title = ((String)paramString1.get(".recordinfo.title"));
          paramString2.desc = ((String)paramString1.get(".recordinfo.desc"));
          paramString2.vzJ = ((String)paramString1.get(".recordinfo.favusername"));
          emX.put(Integer.valueOf(paramInt1), paramString2);
          paramString1 = paramString2;
          break label814;
        }
      case 3:
        localObject = paramContext.getString(2131302203, new Object[] { localb.title });
        break;
      case 4:
        localObject = paramContext.getString(2131302209, new Object[] { localb.title });
        break;
      case 2:
        label814: label959: localObject = paramContext.getString(2131297012);
        label1034: break;
        localObject = paramContext.getString(2131296895);
        break;
        localObject = paramContext.getString(2131302206);
        if (localb == null)
          break;
        if (paramInt2 == 1);
        for (paramInt1 = 1; ; paramInt1 = 0)
          switch (localb.fhv)
          {
          case 2:
          default:
            localObject = bo.nullAsNil(localb.title);
            break label224;
          case 1:
          case 3:
          case 4:
          }
        if (paramInt1 != 0)
        {
          localObject = paramContext.getString(2131297174);
          break;
        }
        localObject = paramContext.getString(2131297177);
        break;
        if (paramInt1 != 0)
        {
          localObject = paramContext.getString(2131297175);
          break;
        }
        localObject = paramContext.getString(2131297172);
        break;
        if (paramInt1 != 0)
        {
          localObject = paramContext.getString(2131297176);
          break;
        }
        localObject = paramContext.getString(2131297173);
        break;
        if (localb == null)
        {
          ab.e("MicroMsg.SelectedMemberChattingRecordUI", "decode msg content failed");
          localObject = "";
          AppMethodBeat.o(104448);
          break label229;
        }
        if (paramInt2 == 1)
        {
          localObject = paramContext.getString(2131302198, new Object[] { localb.fhW, localb.fhT });
          break;
        }
        localObject = paramContext.getString(2131302198, new Object[] { localb.fhW, localb.fhS });
        break;
        if (localb == null)
        {
          ab.e("MicroMsg.SelectedMemberChattingRecordUI", "decode msg content failed");
          localObject = "";
          AppMethodBeat.o(104448);
          break label229;
        }
        if (paramInt2 == 1)
        {
          localObject = paramContext.getString(2131302198, new Object[] { localb.fhW, localb.fik });
          break;
        }
        localObject = paramContext.getString(2131302198, new Object[] { localb.fhW, localb.fij });
        break;
        localObject = paramContext.getString(2131302199, new Object[] { localb.title });
        break;
        localObject = paramContext.getString(2131302199, new Object[] { "" });
        break;
        localObject = paramContext.getString(2131302197, new Object[] { localb.title });
        break;
        localObject = paramContext.getString(2131302207, new Object[] { localb.title });
        break;
        localObject = str;
        if (paramString1 == null)
          break;
        localObject = str;
        if (paramString1.length() <= 0)
          break;
        paramString1 = bi.d.apF(paramString1);
        localObject = str;
        if (paramString1.svN == null)
          break;
        localObject = str;
        if (paramString1.svN.length() <= 0)
          break;
        switch (paramString1.scene)
        {
        case 19:
        case 20:
        case 21:
        default:
          localObject = paramContext.getString(2131300013, new Object[] { paramString1.getDisplayName() });
          break;
        case 18:
          localObject = paramContext.getString(2131299994, new Object[] { paramString1.getDisplayName() });
          break;
        case 22:
        case 23:
        case 24:
        case 26:
        case 27:
        case 28:
        case 29:
          localObject = paramContext.getString(2131300004, new Object[] { paramString1.getDisplayName() });
          break;
        case 25:
          localObject = paramContext.getString(2131299926, new Object[] { paramString1.getDisplayName() });
          break;
          paramString2 = (String)localObject;
        }
        break;
      }
    }
  }

  protected static String a(u paramu, String paramString)
  {
    AppMethodBeat.i(104447);
    if (paramu == null)
    {
      paramu = null;
      AppMethodBeat.o(104447);
    }
    while (true)
    {
      return paramu;
      paramu = paramu.mJ(paramString);
      AppMethodBeat.o(104447);
    }
  }

  public final int getLayoutId()
  {
    return 2130970596;
  }

  public final void initView()
  {
    AppMethodBeat.i(104446);
    super.initView();
    setMMTitle(bo.nullAsNil(this.mTitle));
    this.emT = ((MMLoadMoreListView)findViewById(2131827317));
    this.emT.dzN();
    this.emU = new SelectedMemberChattingRecordUI.a(this, this, this.ejD, this.emV, this.emW);
    this.emT.setAdapter(this.emU);
    this.emy = findViewById(2131827318);
    if (KA())
    {
      this.emy.setVisibility(0);
      this.emT.setVisibility(8);
    }
    this.emT.setOnItemClickListener(new SelectedMemberChattingRecordUI.1(this));
    this.emT.setOnLoadMoreListener(new SelectedMemberChattingRecordUI.2(this));
    setBackBtn(new SelectedMemberChattingRecordUI.3(this));
    AppMethodBeat.o(104446);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(104445);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.SelectedMemberChattingRecordUI", "[onCreate]");
    this.ejD = getIntent().getStringExtra("RoomInfo_Id");
    this.emV = getIntent().getStringExtra("room_member");
    ab.i("MicroMsg.SelectedMemberChattingRecordUI", "roomId:%s", new Object[] { this.ejD });
    this.mTitle = getIntent().getStringExtra("title");
    if ((!bo.isNullOrNil(this.emV)) && (r.mG(this.emV)))
      this.emW = ((j)g.K(j.class)).bOr().Rw(this.ejD);
    while (true)
    {
      initView();
      AppMethodBeat.o(104445);
      return;
      if (!r.mG(this.emV))
        this.emW = ((j)g.K(j.class)).bOr().fc(this.ejD, this.emV);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI
 * JD-Core Version:    0.6.2
 */