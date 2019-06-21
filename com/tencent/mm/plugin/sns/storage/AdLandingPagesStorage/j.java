package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.q;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.x;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.z;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class j
{
  private static j rev;
  ConcurrentLinkedQueue<String> reu;

  static
  {
    AppMethodBeat.i(37781);
    rev = new j();
    AppMethodBeat.o(37781);
  }

  private j()
  {
    AppMethodBeat.i(37775);
    this.reu = new ConcurrentLinkedQueue();
    AppMethodBeat.o(37775);
  }

  private boolean YP(String paramString)
  {
    AppMethodBeat.i(37776);
    boolean bool = this.reu.contains(paramString);
    AppMethodBeat.o(37776);
    return bool;
  }

  private void YQ(String paramString)
  {
    AppMethodBeat.i(37778);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(37778);
    while (true)
    {
      return;
      if (YP(paramString))
      {
        AppMethodBeat.o(37778);
      }
      else
      {
        this.reu.add(paramString);
        h.c("adId", paramString, true, 0, new j.8(this, paramString));
        AppMethodBeat.o(37778);
      }
    }
  }

  private void a(String paramString, r paramr)
  {
    AppMethodBeat.i(37777);
    Object localObject1;
    if (i.Dz(paramr.type))
    {
      localObject1 = new ArrayList();
      if (i.DA(paramr.type))
        ((List)localObject1).addAll(((x)paramr).cpf());
      while (true)
      {
        paramr = ((List)localObject1).iterator();
        while (paramr.hasNext())
          a(paramString, (r)paramr.next());
        if (i.DD(paramr.type))
          ((List)localObject1).addAll(((p)paramr).bnR);
        else if (i.DB(paramr.type))
          ((List)localObject1).addAll(((s)paramr).cpf());
        else if (i.DC(paramr.type))
          ((List)localObject1).addAll(((q)paramr).cpf());
      }
      AppMethodBeat.o(37777);
    }
    Object localObject2;
    while (true)
    {
      return;
      if (paramr.qWP == 41)
      {
        localObject1 = (n)paramr;
        if (YP(((n)localObject1).qWD))
        {
          AppMethodBeat.o(37777);
        }
        else
        {
          this.reu.add(((n)localObject1).qWD);
          h.c(paramString, ((n)localObject1).qWD, true, paramr.qWP, new j.1(this, (n)localObject1));
          AppMethodBeat.o(37777);
        }
      }
      else if (paramr.qWP == 44)
      {
        localObject1 = (m)paramr;
        if (YP(((m)localObject1).qWD))
        {
          AppMethodBeat.o(37777);
        }
        else
        {
          this.reu.add(((m)localObject1).qWD);
          h.c(paramString, ((m)localObject1).qWD, true, paramr.qWP, new j.2(this, (m)localObject1));
          AppMethodBeat.o(37777);
        }
      }
      else if (paramr.qWP == 45)
      {
        localObject1 = (n)paramr;
        if (YP(((n)localObject1).qWD))
        {
          AppMethodBeat.o(37777);
        }
        else
        {
          this.reu.add(((n)localObject1).qWD);
          h.c(paramString, ((n)localObject1).qWD, true, paramr.qWP, new j.3(this, (n)localObject1));
          AppMethodBeat.o(37777);
        }
      }
      else
      {
        if (paramr.qWP != 61)
          break;
        localObject1 = (o)paramr;
        if (!YP(((o)localObject1).qWF))
        {
          localObject2 = new PInt();
          paramr = new PInt();
          com.tencent.mm.modelcontrol.c.afC();
          if (com.tencent.mm.modelcontrol.c.a((PInt)localObject2, paramr))
          {
            this.reu.add(((o)localObject1).qWF);
            h.d(paramString, ((o)localObject1).qWF, true, 61, new j.4(this, (o)localObject1));
          }
        }
        if (!YP(((o)localObject1).qWG))
        {
          this.reu.add(((o)localObject1).qWG);
          h.c(paramString, ((o)localObject1).qWG, true, 1000000001, new f.a()
          {
            public final void YJ(String paramAnonymousString)
            {
              AppMethodBeat.i(37768);
              j.a(j.this, this.rez.qWG);
              AppMethodBeat.o(37768);
            }

            public final void cmD()
            {
              AppMethodBeat.i(37767);
              ab.e("AdLandingPagesPreDownloadResHelper", " pre download " + this.rez.qWG + "is error");
              j.a(j.this, this.rez.qWG);
              AppMethodBeat.o(37767);
            }

            public final void cpu()
            {
            }
          });
        }
        AppMethodBeat.o(37777);
      }
    }
    boolean bool;
    label554: final z localz;
    int i;
    c.a local6;
    if (paramr.qWP == 62)
    {
      if (com.tencent.mm.m.g.Nu().getInt("SnsAdNativePagePreloadStreamMedia", 0) <= 0)
        break label712;
      bool = true;
      ab.i("AdLandingPagesPreDownloadResHelper", "pre down video value: ".concat(String.valueOf(bool)));
      localz = (z)paramr;
      if ((bool) && (!YP(localz.qWH)))
      {
        this.reu.add(localz.qWH);
        localObject2 = localz.qWH;
        i = paramr.qWP;
        local6 = new c.a()
        {
          public final void BD(String paramAnonymousString)
          {
            AppMethodBeat.i(37769);
            ab.e("AdLandingPagesPreDownloadResHelper", " pre download " + localz.qWH + "is error");
            j.a(j.this, localz.qWH);
            AppMethodBeat.o(37769);
          }

          public final void de(String paramAnonymousString, int paramAnonymousInt)
          {
          }

          public final void lW(String paramAnonymousString)
          {
            AppMethodBeat.i(37770);
            j.a(j.this, localz.qWH);
            AppMethodBeat.o(37770);
          }
        };
        if ((!bo.isNullOrNil((String)localObject2)) && (!bo.isNullOrNil(paramString)))
          break label718;
        local6.BD("the res or adId is null");
      }
    }
    while (true)
    {
      if (!YP(localz.qXv))
      {
        this.reu.add(localz.qXv);
        h.c("adId", localz.qXv, true, paramr.qWP, new j.7(this, localz));
      }
      AppMethodBeat.o(37777);
      break;
      label712: bool = false;
      break label554;
      label718: ab.i("MicroMsg.AdLandingPagesDownloadResourceHelper", "start download video for " + (String)localObject2 + " for adid:" + paramString);
      localObject1 = h.cqi();
      String str = ag.ck((String)localObject2);
      str = paramString + "_stream_" + str;
      paramString = (String)localObject1 + str;
      if (!bo.isNullOrNil(paramString))
      {
        if (com.tencent.mm.vfs.e.ct(paramString))
        {
          ab.i("MicroMsg.AdLandingPageDownloadFileHelper", "big file %s is already exists", new Object[] { paramString });
          al.d(new e.4(local6, paramString));
        }
        else
        {
          new c((String)localObject1, str, i, new e.5(local6, (String)localObject2)).execute(new Void[0]);
        }
      }
      else
        al.d(new e.6(local6));
    }
  }

  public static j cql()
  {
    return rev;
  }

  public final void f(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    AppMethodBeat.i(37779);
    Object localObject = ((ConnectivityManager)ah.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
    paramString2 = i.gn(paramString2, paramString3);
    int i;
    if (paramInt == 0)
    {
      if ((localObject != null) && (((NetworkInfo)localObject).getType() == 1))
      {
        ab.i("AdLandingPagesPreDownloadResHelper", "start pre download all resource in wifi");
        paramString3 = paramString2.iterator();
        while (paramString3.hasNext())
        {
          paramString2 = (g)paramString3.next();
          localObject = paramString2.rej.iterator();
          while (((Iterator)localObject).hasNext())
            a(paramString1, (r)((Iterator)localObject).next());
          localObject = paramString2.rek.keySet().iterator();
          while (((Iterator)localObject).hasNext())
          {
            String str = (String)((Iterator)localObject).next();
            a(paramString1, (r)paramString2.rek.get(str));
          }
          YQ(paramString2.reh);
        }
        AppMethodBeat.o(37779);
        return;
      }
      ab.i("AdLandingPagesPreDownloadResHelper", "start pre download resource in no wifi");
      i = com.tencent.mm.m.g.Nu().getInt("SnsAdNativePageNormalFeedPreloadPageCount", 1);
      paramInt = com.tencent.mm.m.g.Nu().getInt("SnsAdNativePageNormalFeedPreloadResourceCount", 2);
      label284: if (paramString2.size() > 0)
      {
        paramString2 = paramString2.iterator();
        label239: if (paramString2.hasNext())
        {
          paramString3 = (g)paramString2.next();
          YQ(paramString3.reh);
          if ((paramInt > 0) && (i > 0))
          {
            paramString3 = paramString3.rej.iterator();
            if (!paramString3.hasNext())
              break label569;
            a(paramString1, (r)paramString3.next());
            paramInt--;
            if (paramInt > 0)
              break label566;
          }
        }
      }
    }
    label402: label560: label563: label566: label569: 
    while (true)
    {
      i--;
      break label239;
      AppMethodBeat.o(37779);
      break;
      if (paramInt == 1)
      {
        ab.i("AdLandingPagesPreDownloadResHelper", "start pre download first pages resource");
        if ((localObject != null) && (((NetworkInfo)localObject).getType() == 1))
        {
          ab.i("AdLandingPagesPreDownloadResHelper", "start pre download resource in shared scene in wifi");
          i = com.tencent.mm.m.g.Nu().getInt("SnsAdNativePageForwardFeedPreloadPageCount", 1);
          paramInt = com.tencent.mm.m.g.Nu().getInt("SnsAdNativePageForwardFeedPreloadResourceCount", 2);
          if (paramString2.size() > 0)
          {
            paramString2 = paramString2.iterator();
            if (paramString2.hasNext())
            {
              paramString3 = (g)paramString2.next();
              YQ(paramString3.reh);
              if ((paramInt > 0) && (i > 0))
              {
                paramString3 = paramString3.rej.iterator();
                label447: if (!paramString3.hasNext())
                  break label563;
                a(paramString1, (r)paramString3.next());
                paramInt--;
                if (paramInt > 0)
                  break label560;
              }
            }
          }
        }
      }
      while (true)
      {
        i--;
        break label402;
        AppMethodBeat.o(37779);
        break;
        ab.i("AdLandingPagesPreDownloadResHelper", "start pre download resource in shared scene in no wifi,this can't download everything");
        paramString1 = paramString2.iterator();
        while (paramString1.hasNext())
          YQ(((g)paramString1.next()).reh);
        AppMethodBeat.o(37779);
        break;
        ab.e("AdLandingPagesPreDownloadResHelper", "the dwnloadKind is error");
        AppMethodBeat.o(37779);
        break;
        break label447;
      }
      break label284;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.j
 * JD-Core Version:    0.6.2
 */