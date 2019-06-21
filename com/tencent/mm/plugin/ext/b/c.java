package com.tencent.mm.plugin.ext.b;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.hl;
import com.tencent.mm.g.a.hl.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.but;
import com.tencent.mm.protocal.protobuf.buv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import java.util.HashMap;
import java.util.Map;

public final class c
{
  private static Map<String, c.a> mCache = null;
  final com.tencent.mm.ai.f ehi;
  private String lPB;
  private boolean lPC;
  private Context mContext;

  public c(Context paramContext, String paramString)
  {
    AppMethodBeat.i(20299);
    this.lPB = "";
    this.lPC = false;
    this.mContext = null;
    this.ehi = new c.1(this);
    this.mContext = paramContext;
    this.lPB = paramString;
    this.lPC = true;
    AppMethodBeat.o(20299);
  }

  private void Lf(String paramString)
  {
    AppMethodBeat.i(20303);
    Intent localIntent = new Intent();
    localIntent.putExtra("Chat_User", paramString);
    localIntent.putExtra("finish_direct", false);
    d.f(this.mContext, ".ui.chatting.ChattingUI", localIntent);
    AppMethodBeat.o(20303);
  }

  private int a(String paramString, buv parambuv, but parambut)
  {
    int i = -1;
    AppMethodBeat.i(20302);
    if (this.mContext == null)
    {
      ab.w("MicroMsg.RedirectToChattingByPhoneHelper", "hy: error param. start redirect param error: context is null");
      AppMethodBeat.o(20302);
    }
    while (true)
    {
      return i;
      if (!bo.isNullOrNil(paramString))
      {
        aw.ZK();
        if (com.tencent.mm.model.c.XM().aoJ(paramString))
        {
          ab.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: is friend. direct to chatting");
          Lf(paramString);
          i = 0;
          AppMethodBeat.o(20302);
        }
      }
      else if (parambuv != null)
      {
        ab.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: direct via searchResp");
        a(parambuv);
        AppMethodBeat.o(20302);
        i = 1;
      }
      else if (parambut != null)
      {
        ab.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: direct via SearchContactItem");
        a(parambut);
        AppMethodBeat.o(20302);
        i = 1;
      }
      else
      {
        ab.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: no matching for starting redirect");
        AppMethodBeat.o(20302);
      }
    }
  }

  private void a(but parambut)
  {
    AppMethodBeat.i(20305);
    if (parambut == null)
    {
      ab.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start to profile failed: item or context is null");
      AppMethodBeat.o(20305);
    }
    while (true)
    {
      return;
      Object localObject = aa.a(parambut.wcB);
      if (!bo.isNullOrNil((String)localObject))
      {
        a(this.lPB, new c.a(this, aa.a(parambut.wcB), null, parambut));
        aw.ZK();
        if (com.tencent.mm.model.c.XM().aoJ((String)localObject))
        {
          ab.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: search item is friend. start to chatting");
          Lf((String)localObject);
          AppMethodBeat.o(20305);
        }
        else
        {
          localObject = new Intent();
          com.tencent.mm.api.b.a((Intent)localObject, parambut);
          ((Intent)localObject).putExtra("add_more_friend_search_scene", 2);
          com.tencent.mm.plugin.ext.a.gkE.c((Intent)localObject, this.mContext);
          AppMethodBeat.o(20305);
        }
      }
      else
      {
        ab.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start failed: no user name");
        AppMethodBeat.o(20305);
      }
    }
  }

  private void a(buv parambuv)
  {
    AppMethodBeat.i(20304);
    if (parambuv == null)
    {
      ab.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start to profile failed: resp or context is null");
      AppMethodBeat.o(20304);
    }
    while (true)
    {
      return;
      Object localObject = aa.a(parambuv.wcB);
      if (!bo.isNullOrNil((String)localObject))
      {
        a(this.lPB, new c.a(this, aa.a(parambuv.wcB), parambuv, null));
        aw.ZK();
        if (com.tencent.mm.model.c.XM().aoJ((String)localObject))
        {
          ab.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: search response is friend. start to chatting");
          Lf((String)localObject);
          AppMethodBeat.o(20304);
        }
        else
        {
          localObject = new Intent();
          com.tencent.mm.api.b.a((Intent)localObject, parambuv, 15);
          ((Intent)localObject).putExtra("add_more_friend_search_scene", 2);
          com.tencent.mm.plugin.ext.a.gkE.c((Intent)localObject, this.mContext);
          AppMethodBeat.o(20304);
        }
      }
      else
      {
        ab.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start failed: no user name");
        AppMethodBeat.o(20304);
      }
    }
  }

  private static void a(String paramString, c.a parama)
  {
    AppMethodBeat.i(20301);
    if (bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: username is null when put to cache");
      AppMethodBeat.o(20301);
    }
    while (true)
    {
      return;
      if (mCache == null)
        mCache = new HashMap();
      mCache.put(paramString, parama);
      AppMethodBeat.o(20301);
    }
  }

  public final int brH()
  {
    int i = -1;
    AppMethodBeat.i(20300);
    if (this.mContext == null)
    {
      ab.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: context is null");
      AppMethodBeat.o(20300);
    }
    while (true)
    {
      return i;
      if (bo.isNullOrNil(this.lPB))
      {
        ab.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: phone is null");
        AppMethodBeat.o(20300);
      }
      else
      {
        String str = av.amN(this.lPB);
        if (bo.isNullOrNil(str))
        {
          ab.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: pure num is null");
          AppMethodBeat.o(20300);
        }
        else
        {
          Object localObject = this.lPB;
          if (bo.isNullOrNil((String)localObject))
            ab.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: username is null when get from cache");
          for (localObject = null; ; localObject = (c.a)mCache.get(localObject))
          {
            if (localObject == null)
              break label177;
            ab.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: got from cache");
            i = a(((c.a)localObject).userName, ((c.a)localObject).lPE, ((c.a)localObject).lPF);
            AppMethodBeat.o(20300);
            break;
            if (mCache == null)
              mCache = new HashMap();
          }
          label177: localObject = new hl();
          ((hl)localObject).cCl.cCn = str;
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
          localObject = ((hl)localObject).cCm.userName;
          if (!bo.isNullOrNil((String)localObject))
          {
            ab.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: has found username: %s", new Object[] { localObject });
            i = a((String)localObject, null, null);
            AppMethodBeat.o(20300);
          }
          else
          {
            ab.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: not found from local storage. Try to find from search");
            aw.Rg().a(106, this.ehi);
            localObject = new com.tencent.mm.plugin.messenger.a.f(str, 3);
            aw.Rg().a((m)localObject, 0);
            localObject = new Intent();
            ((Intent)localObject).setClassName(this.mContext, "com.tencent.mm.plugin.ext.ui.RedirectToChattingByPhoneStubUI");
            ((Intent)localObject).setFlags(268435456);
            this.mContext.startActivity((Intent)localObject);
            i = 2;
            AppMethodBeat.o(20300);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.b.c
 * JD-Core Version:    0.6.2
 */