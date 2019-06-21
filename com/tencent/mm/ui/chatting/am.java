package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.z;
import com.tencent.mm.at.g;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.tools.j;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class am
{
  public static void a(bi parambi, Context paramContext, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(31023);
    if (paramContext == null)
    {
      ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptImgConnector: context is null");
      AppMethodBeat.o(31023);
    }
    while (true)
    {
      return;
      if (parambi == null)
      {
        ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptImgConnector: msg is null");
        AppMethodBeat.o(31023);
      }
      else
      {
        aw.ZK();
        if (!com.tencent.mm.model.c.isSDCardAvailable())
        {
          t.hO(paramContext);
          ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptImgConnector: sd card is not available");
          AppMethodBeat.o(31023);
        }
        else
        {
          a(eW(z.aeR().le(4)), paramContext, new am.5(parambi, paramContext, paramBoolean, paramString));
          AppMethodBeat.o(31023);
        }
      }
    }
  }

  public static void a(bi parambi, String paramString, Context paramContext)
  {
    AppMethodBeat.i(31028);
    a(parambi, paramString, paramContext, 512);
    AppMethodBeat.o(31028);
  }

  private static void a(bi parambi, final String paramString, final Context paramContext, final int paramInt)
  {
    AppMethodBeat.i(31031);
    if (paramContext == null)
    {
      ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptMusicConnector: context is null");
      AppMethodBeat.o(31031);
    }
    while (true)
    {
      return;
      if (parambi != null)
        break;
      ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptMusicConnector: msg is null");
      AppMethodBeat.o(31031);
    }
    List localList = null;
    switch (paramInt)
    {
    default:
    case 256:
    case 128:
    case 512:
    }
    while (true)
    {
      a(localList, paramContext, new n.d()
      {
        public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          AppMethodBeat.i(31019);
          String str1 = paramAnonymousMenuItem.getTitle();
          Object localObject1 = this.fku;
          j.b localb = j.b.me(bo.anj(paramString));
          if (localb == null)
          {
            ab.w("MicroMsg.LongClickBrandServiceHelper", "send: parse app msg content return null");
            switch (paramInt)
            {
            default:
            case 256:
            case 128:
            case 512:
            }
          }
          while (true)
          {
            while (true)
            {
              com.tencent.mm.ui.base.h.bQ(paramContext, paramContext.getString(2131297039));
              AppMethodBeat.o(31019);
              return;
              paramAnonymousMenuItem = null;
              Object localObject2 = paramAnonymousMenuItem;
              if (((cy)localObject1).field_imgPath != null)
              {
                localObject2 = paramAnonymousMenuItem;
                if (!((cy)localObject1).field_imgPath.equals(""))
                  localObject2 = o.ahl().I(((cy)localObject1).field_imgPath, true);
              }
              try
              {
                localObject2 = com.tencent.mm.vfs.e.e((String)localObject2, 0, -1);
                localObject1 = new b();
                paramAnonymousMenuItem = (MenuItem)localObject1;
                if (!bo.isNullOrNil(localb.csD))
                {
                  long l = bo.getLong(localb.csD, -1L);
                  if (l == -1L)
                    break label418;
                  com.tencent.mm.pluginsdk.model.app.am.aUq().b(l, (com.tencent.mm.sdk.e.c)localObject1);
                  paramAnonymousMenuItem = (MenuItem)localObject1;
                  if (((b)localObject1).xDa != l)
                  {
                    localObject1 = com.tencent.mm.pluginsdk.model.app.am.aUq().aiE(localb.csD);
                    if (localObject1 != null)
                    {
                      paramAnonymousMenuItem = (MenuItem)localObject1;
                      if (((b)localObject1).field_mediaSvrId.equals(localb.csD));
                    }
                    else
                    {
                      paramAnonymousMenuItem = null;
                    }
                  }
                }
                String str2 = "";
                localObject1 = str2;
                if (paramAnonymousMenuItem != null)
                {
                  localObject1 = str2;
                  if (paramAnonymousMenuItem.field_fileFullPath != null)
                  {
                    localObject1 = str2;
                    if (!paramAnonymousMenuItem.field_fileFullPath.equals(""))
                    {
                      aw.ZK();
                      localObject1 = l.X(com.tencent.mm.model.c.Ye(), localb.title, localb.fgp);
                      com.tencent.mm.vfs.e.y(paramAnonymousMenuItem.field_fileFullPath, (String)localObject1);
                    }
                  }
                }
                paramAnonymousMenuItem = j.b.a(localb);
                paramAnonymousMenuItem.fgr = 3;
                l.a(paramAnonymousMenuItem, localb.appId, localb.appName, str1, (String)localObject1, (byte[])localObject2, null);
              }
              catch (Exception localException)
              {
                while (true)
                {
                  ab.e("MicroMsg.LongClickBrandServiceHelper", "send appmsg to %s, error:%s", new Object[] { str1, localException.getLocalizedMessage() });
                  MenuItem localMenuItem = paramAnonymousMenuItem;
                  continue;
                  label418: localObject1 = com.tencent.mm.pluginsdk.model.app.am.aUq().aiE(localb.csD);
                  if (localObject1 != null)
                  {
                    paramAnonymousMenuItem = (MenuItem)localObject1;
                    if (((b)localObject1).field_mediaSvrId.equals(localb.csD));
                  }
                  else
                  {
                    paramAnonymousMenuItem = null;
                  }
                }
              }
            }
            com.tencent.mm.plugin.report.service.h.pYm.e(10424, new Object[] { Integer.valueOf(49), Integer.valueOf(256), str1 });
            continue;
            com.tencent.mm.plugin.report.service.h.pYm.e(10424, new Object[] { Integer.valueOf(49), Integer.valueOf(128), str1 });
            continue;
            com.tencent.mm.plugin.report.service.h.pYm.e(10424, new Object[] { Integer.valueOf(49), Integer.valueOf(512), str1 });
          }
        }
      });
      AppMethodBeat.o(31031);
      break;
      localList = eW(f.aeE());
      continue;
      localList = eW(f.aeC());
      continue;
      localList = eW(f.aeG());
    }
  }

  private static void a(List<String> paramList, Context paramContext, n.d paramd)
  {
    AppMethodBeat.i(31033);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      ab.w("MicroMsg.LongClickBrandServiceHelper", "tryShowConnectorDialog: careList is null or empty");
      AppMethodBeat.o(31033);
    }
    while (true)
    {
      return;
      j localj = new j(paramContext);
      localj.zFT = new am.11();
      localj.zFU = new am.2(paramContext);
      localj.rBl = new am.3(paramList);
      localj.rBm = paramd;
      localj.cuu();
      AppMethodBeat.o(31033);
    }
  }

  public static void b(bi parambi, Context paramContext)
  {
    AppMethodBeat.i(31022);
    if (paramContext == null)
    {
      ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVoiceConnector: context is null");
      AppMethodBeat.o(31022);
    }
    while (true)
    {
      return;
      if (parambi == null)
      {
        ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVoiceConnector: msg is null");
        AppMethodBeat.o(31022);
      }
      else
      {
        aw.ZK();
        if (!com.tencent.mm.model.c.isSDCardAvailable())
        {
          t.hO(paramContext);
          ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVoiceConnector: sd card not available");
          AppMethodBeat.o(31022);
        }
        else
        {
          a(eW(z.aeR().le(2)), paramContext, new am.4(parambi, paramContext));
          AppMethodBeat.o(31022);
        }
      }
    }
  }

  public static void b(bi parambi, String paramString, Context paramContext)
  {
    AppMethodBeat.i(31029);
    a(parambi, paramString, paramContext, 256);
    AppMethodBeat.o(31029);
  }

  public static void c(bi parambi, Context paramContext)
  {
    AppMethodBeat.i(31024);
    if (paramContext == null)
    {
      ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVideoConnector: context is null");
      AppMethodBeat.o(31024);
    }
    while (true)
    {
      return;
      if (parambi == null)
      {
        ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVideoConnector: msg is null");
        AppMethodBeat.o(31024);
      }
      else
      {
        aw.ZK();
        if (!com.tencent.mm.model.c.isSDCardAvailable())
        {
          t.hO(paramContext);
          ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptVideoConnector: sd card is not available");
          AppMethodBeat.o(31024);
        }
        else
        {
          a(eW(z.aeR().le(8)), paramContext, new am.6(parambi, paramContext));
          AppMethodBeat.o(31024);
        }
      }
    }
  }

  public static void c(bi parambi, String paramString, Context paramContext)
  {
    AppMethodBeat.i(31030);
    a(parambi, paramString, paramContext, 128);
    AppMethodBeat.o(31030);
  }

  public static void d(bi parambi, Context paramContext)
  {
    AppMethodBeat.i(31027);
    if (paramContext == null)
    {
      ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptEmojiConnector: context is null");
      AppMethodBeat.o(31027);
    }
    while (true)
    {
      return;
      if (parambi == null)
      {
        ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptEmojiConnector: msg is null");
        AppMethodBeat.o(31027);
      }
      else
      {
        aw.ZK();
        if (!com.tencent.mm.model.c.isSDCardAvailable())
        {
          t.hO(paramContext);
          ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptEmojiConnector: sd card is not available");
          AppMethodBeat.o(31027);
        }
        else
        {
          a(eW(z.aeR().le(64)), paramContext, new am.9(parambi, paramContext));
          AppMethodBeat.o(31027);
        }
      }
    }
  }

  private static List<String> eW(List<String> paramList)
  {
    AppMethodBeat.i(31032);
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (!f.ra(str))
        localLinkedList.add(str);
    }
    ab.d("MicroMsg.LongClickBrandServiceHelper", "get selected accept list, size %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
    AppMethodBeat.o(31032);
    return localLinkedList;
  }

  public static void m(String paramString, Context paramContext)
  {
    AppMethodBeat.i(31021);
    if (paramContext == null)
    {
      ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptTextConnector: context is null");
      AppMethodBeat.o(31021);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramString))
      {
        ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptTextConnector: content is null");
        AppMethodBeat.o(31021);
      }
      else
      {
        a(eW(z.aeR().le(1)), paramContext, new am.1(paramString, paramContext));
        AppMethodBeat.o(31021);
      }
    }
  }

  public static void n(String paramString, Context paramContext)
  {
    AppMethodBeat.i(31025);
    if (paramContext == null)
    {
      ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptLocationConnector: context is null");
      AppMethodBeat.o(31025);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramString))
      {
        ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptLocationConnector: locationXML is null");
        AppMethodBeat.o(31025);
      }
      else
      {
        a(eW(z.aeR().le(16)), paramContext, new am.7(paramString, paramContext));
        AppMethodBeat.o(31025);
      }
    }
  }

  public static void o(String paramString, Context paramContext)
  {
    AppMethodBeat.i(31026);
    if (paramContext == null)
    {
      ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptPersonalCardConnector: context is null");
      AppMethodBeat.o(31026);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramString))
      {
        ab.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptPersonalCardConnector: locationXML is null");
        AppMethodBeat.o(31026);
      }
      else
      {
        a(eW(z.aeR().le(32)), paramContext, new am.8(paramString, paramContext));
        AppMethodBeat.o(31026);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.am
 * JD-Core Version:    0.6.2
 */