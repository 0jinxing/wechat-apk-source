package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.os.Looper;
import android.view.ViewStub;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ba.h;
import com.tencent.mm.cb.f.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class aa
{
  public List<bi> kbM;
  public ak mHandler;
  public ChattingAnimFrame yLy;
  public Activity yLz;

  public aa()
  {
    AppMethodBeat.i(30918);
    this.yLy = null;
    this.mHandler = new aa.1(this, Looper.getMainLooper());
    AppMethodBeat.o(30918);
  }

  private boolean a(Activity paramActivity, bi parambi)
  {
    AppMethodBeat.i(30920);
    dCH();
    Object localObject = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().bjQ();
    boolean bool;
    if (localObject == null)
    {
      ab.d("MicroMsg.EggMgr", "eggList is null");
      bool = false;
      AppMethodBeat.o(30920);
    }
    while (true)
    {
      return bool;
      int i = (int)bo.anT();
      ab.d("MicroMsg.EggMgr", "cursecond is %d, getEggList.size is %d", new Object[] { Integer.valueOf(i), Integer.valueOf(((com.tencent.mm.ba.f)localObject).fMi.size()) });
      Iterator localIterator1 = ((com.tencent.mm.ba.f)localObject).fMi.iterator();
      while (true)
        if (localIterator1.hasNext())
        {
          com.tencent.mm.ba.d locald = (com.tencent.mm.ba.d)localIterator1.next();
          if (are(locald.fMc))
          {
            Iterator localIterator2 = locald.fLY.iterator();
            String str1;
            while (localIterator2.hasNext())
            {
              com.tencent.mm.ba.e locale = (com.tencent.mm.ba.e)localIterator2.next();
              str1 = locale.fMh;
              if (com.tencent.mm.platformtools.ah.isNullOrNil(str1))
              {
                ab.e("MicroMsg.EggMgr", "error egg keyWord");
              }
              else
              {
                String str2 = parambi.field_content;
                localObject = str2;
                if (t.kH(parambi.field_talker))
                  localObject = bf.ow(str2);
                if (aF((String)localObject, str1, locale.lang))
                {
                  if (this.yLy == null)
                  {
                    localObject = (ViewStub)paramActivity.findViewById(2131822381);
                    if (localObject != null)
                      ((ViewStub)localObject).inflate();
                    this.yLy = ((ChattingAnimFrame)paramActivity.findViewById(2131822727));
                  }
                  if (this.yLy != null)
                    break label284;
                  ab.e("MicroMsg.EggMgr", "AnimFrameView should not be null");
                }
              }
            }
            continue;
            label284: if ((locald.fMa <= i) && (i <= locald.fMb + 86400L))
            {
              this.yLy.a(locald);
              i = locald.cKB;
              if (parambi.field_isSend == 1);
              for (bool = true; ; bool = false)
              {
                aE(i, bool);
                ab.d("MicroMsg.EggMgr", "match keyWord[%s], time[%d - %d]", new Object[] { str1, Integer.valueOf(locald.fMa), Integer.valueOf(locald.fMb) });
                bool = true;
                AppMethodBeat.o(30920);
                break;
              }
            }
            if ((locald.fMa == locald.fMb) && (locald.fMa == 0))
            {
              this.yLy.a(locald);
              i = locald.cKB;
              if (parambi.field_isSend == 1);
              for (bool = true; ; bool = false)
              {
                aE(i, bool);
                ab.d("MicroMsg.EggMgr", "match keyWord[%s], time[0 - 0]", new Object[] { str1 });
                bool = true;
                AppMethodBeat.o(30920);
                break;
              }
            }
            ab.d("MicroMsg.EggMgr", "match keyWord[%s], but not match time[%d - %d]", new Object[] { str1, Integer.valueOf(locald.fMa), Integer.valueOf(locald.fMb) });
            bool = false;
            AppMethodBeat.o(30920);
            break;
          }
        }
      ab.d("MicroMsg.EggMgr", "no match");
      bool = false;
      AppMethodBeat.o(30920);
    }
  }

  private static void aE(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(30924);
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      aw.ZK();
      localObject2 = com.tencent.mm.vfs.e.e(c.Rt() + "eggresult.rep", 0, -1);
      if (localObject2 != null)
      {
        ab.d("MicroMsg.EggMgr", "data not null, parse it");
        localObject1 = new com/tencent/mm/ba/h;
        ((h)localObject1).<init>();
        localObject1 = (h)((h)localObject1).parseFrom((byte[])localObject2);
        Iterator localIterator = ((h)localObject1).fMm.iterator();
        do
        {
          if (!localIterator.hasNext())
            break;
          localObject2 = (com.tencent.mm.ba.g)localIterator.next();
        }
        while (((com.tencent.mm.ba.g)localObject2).cKB != paramInt);
        if (!paramBoolean)
          break label242;
        ((com.tencent.mm.ba.g)localObject2).fMk += 1;
      }
      while (true)
      {
        i = 1;
        if (i == 0)
        {
          localObject2 = new com/tencent/mm/ba/g;
          ((com.tencent.mm.ba.g)localObject2).<init>();
          ((com.tencent.mm.ba.g)localObject2).cKB = paramInt;
          if (!paramBoolean)
            break label297;
          ((com.tencent.mm.ba.g)localObject2).fMk = 1;
          ((h)localObject1).fMm.add(localObject2);
        }
        localObject2 = ((h)localObject1).toByteArray();
        ab.d("MicroMsg.EggMgr", "report list is %s, then save it", new Object[] { localObject1.toString() });
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        aw.ZK();
        com.tencent.mm.vfs.e.b(c.Rt() + "eggresult.rep", (byte[])localObject2, localObject2.length);
        AppMethodBeat.o(30924);
        return;
        ab.d("MicroMsg.EggMgr", "data is null, new one");
        localObject1 = new h();
        break;
        label242: ((com.tencent.mm.ba.g)localObject2).fMl += 1;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject2;
        ab.w("MicroMsg.EggMgr", "statistics crash : %s", new Object[] { localException.getLocalizedMessage() });
        ab.printErrStackTrace("MicroMsg.EggMgr", localException, "", new Object[0]);
        AppMethodBeat.o(30924);
        continue;
        label297: ((com.tencent.mm.ba.g)localObject2).fMl = 1;
        continue;
        int i = 0;
      }
    }
  }

  private static boolean aF(String paramString1, String paramString2, String paramString3)
  {
    boolean bool1 = false;
    AppMethodBeat.i(30922);
    boolean bool2;
    if ((com.tencent.mm.platformtools.ah.isNullOrNil(paramString1)) || (com.tencent.mm.platformtools.ah.isNullOrNil(paramString2)) || (com.tencent.mm.sdk.platformtools.ah.getContext() == null))
    {
      AppMethodBeat.o(30922);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      String str = paramString1.toLowerCase();
      int i = str.indexOf(paramString2.toLowerCase());
      int j = i;
      if (i == -1)
      {
        AppMethodBeat.o(30922);
        bool2 = bool1;
        continue;
      }
      try
      {
        label416: label422: 
        do
        {
          if ((j >= str.length() - 1) || (com.tencent.mm.platformtools.ah.isNullOrNil(paramString3)))
            break label501;
          if ((j <= 0) || (str.charAt(j - 1) < 'a') || (str.charAt(j - 1) > 'z'))
            break label495;
          ab.v("MicroMsg.EggMgr", "letter in the prefix");
          Object localObject = paramString1.substring(0, j);
          int k = ((String)localObject).lastIndexOf('/');
          i = k;
          if (k != -1)
          {
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localObject = ((String)localObject).subSequence(k, ((String)localObject).length());
            com.tencent.mm.cb.g.dqQ();
            com.tencent.mm.sdk.platformtools.ah.getContext();
            localObject = com.tencent.mm.cb.f.dqL().anW((String)localObject);
            if (localObject == null)
              break label416;
          }
          for (localObject = ((f.a)localObject).text; ; localObject = null)
          {
            i = k;
            if (!com.tencent.mm.platformtools.ah.isNullOrNil((String)localObject))
            {
              i = k;
              if (((String)localObject).length() + k == j)
              {
                ab.v("MicroMsg.EggMgr", "letter in the prefix is smiley");
                i = -2;
              }
            }
            if (i == -2)
              break label495;
            bool3 = false;
            bool2 = bool3;
            if (bool3)
            {
              bool2 = bool3;
              if (paramString2.length() + j < str.length())
              {
                bool2 = bool3;
                if (str.charAt(paramString2.length() + j) >= 'a')
                {
                  bool2 = bool3;
                  if (str.charAt(paramString2.length() + j) <= 'z')
                  {
                    ab.v("MicroMsg.EggMgr", "letter in the suffix");
                    bool2 = false;
                  }
                }
              }
            }
            if (!bool2)
              break label422;
            ab.v("MicroMsg.EggMgr", "full match, matchPos = %s, TextLength = %s, keyLength = %s", new Object[] { Integer.valueOf(j), Integer.valueOf(str.length()), Integer.valueOf(paramString2.length()) });
            AppMethodBeat.o(30922);
            break;
          }
          i = str.indexOf(paramString2.toLowerCase(), j + 1);
          j = i;
        }
        while (i != -1);
        AppMethodBeat.o(30922);
        bool2 = bool1;
      }
      catch (Exception paramString1)
      {
        while (true)
        {
          ab.v("MicroMsg.EggMgr", "Exception in isKeywordMatch, %s", new Object[] { paramString1.getMessage() });
          ab.printErrStackTrace("MicroMsg.EggMgr", paramString1, "", new Object[0]);
          continue;
          label495: boolean bool3 = true;
          continue;
          label501: bool2 = true;
        }
      }
    }
  }

  private static boolean are(String paramString)
  {
    boolean bool1 = true;
    AppMethodBeat.i(30921);
    boolean bool2;
    if (com.tencent.mm.platformtools.ah.isNullOrNil(paramString))
      bool2 = bool1;
    while (true)
    {
      AppMethodBeat.o(30921);
      return bool2;
      paramString = paramString.split(",");
      int i = paramString.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label66;
        bool2 = bool1;
        if (paramString[j].equals(com.tencent.mm.sdk.platformtools.aa.dor()))
          break;
      }
      label66: bool2 = false;
    }
  }

  private void dCH()
  {
    AppMethodBeat.i(30923);
    aw.ZK();
    if (com.tencent.mm.platformtools.ah.fp(com.tencent.mm.platformtools.ah.d((Long)c.Ry().get(68108, null))) * 1000L > 21600000L)
      new ak().postDelayed(new aa.2(this), 10000L);
    AppMethodBeat.o(30923);
  }

  public final void a(Activity paramActivity, List<bi> paramList)
  {
    AppMethodBeat.i(30919);
    if (paramList == null)
      AppMethodBeat.o(30919);
    while (true)
    {
      return;
      paramList = paramList.iterator();
      while (true)
        if (paramList.hasNext())
          if (a(paramActivity, (bi)paramList.next()))
          {
            AppMethodBeat.o(30919);
            break;
          }
      AppMethodBeat.o(30919);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.aa
 * JD-Core Version:    0.6.2
 */