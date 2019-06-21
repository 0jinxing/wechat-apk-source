package com.tencent.mm.plugin.fts.b;

import android.content.Context;
import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.t;
import com.tencent.mm.openim.a.c.b;
import com.tencent.mm.plugin.fts.PluginFTS;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.h;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.wcdb.database.SQLiteStatement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import junit.framework.AssertionFailedError;

public final class a extends com.tencent.mm.plugin.fts.a.b
{
  private static Set<String> mFJ;
  private m eAX;
  private Method mFA;
  private n.b mFB;
  private n.b mFC;
  private k.a mFD;
  private k.a mFE;
  private com.tencent.mm.sdk.b.c mFF;
  private com.tencent.mm.sdk.b.c mFG;
  private com.tencent.mm.sdk.platformtools.ap mFH;
  private com.tencent.mm.sdk.platformtools.ap mFI;
  private com.tencent.mm.plugin.fts.c.a mFv;
  private HashSet<String> mFw;
  private HashMap<String, List<Long>> mFx;
  private HashMap<String, String[]> mFy;
  private HashMap<String, List<Long>> mFz;
  private com.tencent.mm.plugin.fts.a.j mgD;

  static
  {
    AppMethodBeat.i(136713);
    mFJ = new HashSet();
    String[] arrayOfString = ah.getContext().getString(2131298792).split(";");
    if (arrayOfString != null)
    {
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        String str = arrayOfString[j];
        mFJ.add(str);
      }
    }
    AppMethodBeat.o(136713);
  }

  public a()
  {
    AppMethodBeat.i(136702);
    this.mFB = new a.1(this);
    this.mFC = new a.2(this);
    this.mFD = new a.3(this);
    this.mFE = new a.4(this);
    this.mFF = new a.5(this);
    this.mFG = new a.6(this);
    this.mFH = new com.tencent.mm.sdk.platformtools.ap(g.RS().oAl.getLooper(), new a.7(this), true);
    this.mFI = new com.tencent.mm.sdk.platformtools.ap(g.RS().oAl.getLooper(), new a.8(this), false);
    AppMethodBeat.o(136702);
  }

  static boolean G(ad paramad)
  {
    boolean bool = false;
    AppMethodBeat.i(136705);
    if ((paramad.isHidden()) && (!"notifymessage".equals(paramad.field_username)))
      AppMethodBeat.o(136705);
    while (true)
    {
      return bool;
      if (paramad.Oa())
      {
        AppMethodBeat.o(136705);
      }
      else if (paramad.field_deleteFlag != 0)
      {
        AppMethodBeat.o(136705);
      }
      else if (!com.tencent.mm.n.a.jh(paramad.field_type))
      {
        if (paramad.NZ())
          AppMethodBeat.o(136705);
        else if (paramad.dsf())
          AppMethodBeat.o(136705);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(136705);
      }
    }
  }

  static boolean Nk(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(136704);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(136704);
    while (true)
    {
      return bool;
      if (paramString.endsWith("@stranger"))
      {
        AppMethodBeat.o(136704);
      }
      else if (paramString.endsWith("@qqim"))
      {
        AppMethodBeat.o(136704);
      }
      else if (paramString.endsWith("@app"))
      {
        AppMethodBeat.o(136704);
      }
      else if (paramString.startsWith("fake_"))
      {
        AppMethodBeat.o(136704);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(136704);
      }
    }
  }

  private int a(long paramLong1, String paramString1, String paramString2, long paramLong2)
  {
    AppMethodBeat.i(136711);
    String str;
    int i;
    if (paramString2 != null)
    {
      str = paramString2;
      if (paramString2.endsWith(""))
        str = paramString2.substring(0, paramString2.length() - 1);
      if (str.length() != 0)
        break label73;
      i = 0;
      AppMethodBeat.o(136711);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(136711);
      continue;
      label73: ev(paramString1, str);
      paramString2 = this.mgD.MX(str);
      if (paramString2.size() == 0)
      {
        i = 0;
        AppMethodBeat.o(136711);
      }
      else
      {
        paramString2 = bo.c(paramString2, "​");
        this.mFv.a(131072, 11, paramLong1, paramString1, paramLong2, paramString2);
        i = 1;
        AppMethodBeat.o(136711);
      }
    }
  }

  private int a(ad paramad, long paramLong)
  {
    int i = 0;
    AppMethodBeat.i(136709);
    String str = paramad.duw;
    int j = i;
    if (!bo.isNullOrNil(str))
    {
      com.tencent.mm.openim.a.c localc = new com.tencent.mm.openim.a.c();
      localc.vj(str);
      StringBuffer localStringBuffer = new StringBuffer();
      for (j = 0; j < localc.geU.size(); j++)
      {
        Iterator localIterator = ((com.tencent.mm.openim.a.c.a)localc.geU.get(j)).geV.iterator();
        while (localIterator.hasNext())
        {
          str = ((c.b)localIterator.next()).vk(paramad.field_openImAppid);
          if (!bo.isNullOrNil(str))
          {
            localStringBuffer.append(str);
            localStringBuffer.append("‌");
          }
        }
        localStringBuffer.append("​");
      }
      j = i;
      if (!bo.isNullOrNil(localStringBuffer.toString()))
      {
        ab.i("MicroMsg.FTS.FTS5SearchContactLogic", "buildOpenIMContact %s", new Object[] { localStringBuffer.toString() });
        this.mFv.a(131081, 51, paramad.ewQ, paramad.field_username, paramLong, localStringBuffer.toString());
        j = 1;
      }
    }
    AppMethodBeat.o(136709);
    return j;
  }

  private void ev(String paramString1, String paramString2)
  {
    AppMethodBeat.i(136710);
    Object localObject = com.tencent.mm.plugin.fts.a.c.a.mCF.split(paramString2);
    if (localObject.length != 0)
    {
      paramString2 = new ArrayList(localObject.length);
      int i = localObject.length;
      for (int j = 0; j < i; j++)
        paramString2.add(Long.valueOf(bo.getLong(localObject[j], 0L)));
    }
    while (true)
    {
      localObject = (List)this.mFz.get(paramString1);
      if (localObject == null)
      {
        this.mFv.No(paramString1);
        if ((paramString2 == null) || (paramString2.isEmpty()))
          break label336;
        this.mFv.k(paramString1, paramString2);
        this.mFz.put(paramString1, paramString2);
        AppMethodBeat.o(136710);
      }
      while (true)
      {
        return;
        if ((paramString2 == null) || (paramString2.isEmpty()))
        {
          this.mFv.No(paramString1);
          this.mFz.remove(paramString1);
          AppMethodBeat.o(136710);
        }
        else
        {
          localObject = new HashSet((Collection)localObject);
          Iterator localIterator = paramString2.iterator();
          long l;
          while (localIterator.hasNext())
          {
            l = ((Long)localIterator.next()).longValue();
            if (!((HashSet)localObject).remove(Long.valueOf(l)))
            {
              com.tencent.mm.plugin.fts.c.a locala = this.mFv;
              locala.mHd.bindString(1, paramString1);
              locala.mHd.bindLong(2, l);
              locala.mHd.execute();
            }
          }
          localIterator = ((HashSet)localObject).iterator();
          while (localIterator.hasNext())
          {
            l = ((Long)localIterator.next()).longValue();
            localObject = this.mFv;
            ((com.tencent.mm.plugin.fts.c.a)localObject).mHe.bindString(1, paramString1);
            ((com.tencent.mm.plugin.fts.c.a)localObject).mHe.bindLong(2, l);
            ((com.tencent.mm.plugin.fts.c.a)localObject).mHe.execute();
          }
          this.mFz.put(paramString1, paramString2);
          label336: AppMethodBeat.o(136710);
        }
      }
      paramString2 = null;
    }
  }

  private static String mL(String paramString)
  {
    AppMethodBeat.i(136712);
    if (mFJ.contains(paramString))
    {
      paramString = "";
      AppMethodBeat.o(136712);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(136712);
    }
  }

  final void F(ad paramad)
  {
    AppMethodBeat.i(136703);
    try
    {
      this.mFA.invoke(paramad, new Object[0]);
      AppMethodBeat.o(136703);
      return;
    }
    catch (Exception paramad)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FTS.FTS5SearchContactLogic", paramad, "Failed parsing RContact LVBuffer.", new Object[0]);
        AppMethodBeat.o(136703);
      }
    }
  }

  final boolean H(ad paramad)
  {
    boolean bool = false;
    AppMethodBeat.i(136706);
    String str = paramad.field_username;
    if (!G(paramad))
      AppMethodBeat.o(136706);
    while (true)
    {
      return bool;
      if (!Nk(str))
      {
        AppMethodBeat.o(136706);
      }
      else if (!com.tencent.mm.n.a.jh(paramad.field_type))
      {
        if ((!paramad.NZ()) && (!paramad.dsf()))
        {
          if (this.mgD.MV(str))
          {
            AppMethodBeat.o(136706);
            bool = true;
          }
          else
          {
            AppMethodBeat.o(136706);
          }
        }
        else
          AppMethodBeat.o(136706);
      }
      else
      {
        AppMethodBeat.o(136706);
        bool = true;
      }
    }
  }

  final int I(ad paramad)
  {
    int i = 0;
    AppMethodBeat.i(136707);
    Object localObject1;
    Object localObject2;
    if (t.kH(paramad.field_username))
    {
      localObject1 = String.format("SELECT memberlist, roomdata FROM %s WHERE chatroomname = ?", new Object[] { "chatroom" });
      localObject2 = this.mgD.i((String)localObject1, new String[] { paramad.field_username });
    }
    while (true)
    {
      try
      {
        if (!((Cursor)localObject2).moveToNext())
          break label506;
        localObject3 = ((Cursor)localObject2).getString(0);
        localObject1 = ((Cursor)localObject2).getBlob(1);
        if (localObject2 != null)
          ((Cursor)localObject2).close();
        if ((bo.isNullOrNil((String)localObject3)) || (localObject1 == null))
        {
          ab.i("MicroMsg.FTS.FTS5SearchContactLogic", "error chatroom data %s", new Object[] { paramad.field_username });
          int j = j(paramad.field_username, null);
          if (j > 0)
            ab.i("MicroMsg.FTS.FTS5SearchContactLogic", "updateChatroomMember %s %d", new Object[] { paramad.field_username, Integer.valueOf(j) });
          AppMethodBeat.o(136707);
          return i;
        }
      }
      finally
      {
        if (localObject2 != null)
          ((Cursor)localObject2).close();
        AppMethodBeat.o(136707);
      }
      localObject2 = com.tencent.mm.plugin.fts.a.c.a.mCy.split((CharSequence)localObject3);
      Arrays.sort((Object[])localObject2, new a.9(this));
      i = j(paramad.field_username, (String[])localObject2);
      if (i > 0)
        ab.i("MicroMsg.FTS.FTS5SearchContactLogic", "updateChatroomMember %s %d", new Object[] { paramad.field_username, Integer.valueOf(i) });
      HashMap localHashMap = new HashMap();
      Object localObject3 = "SELECT rowid, username, alias, conRemark, nickname , lvbuff FROM rcontact WHERE username IN " + d.C((String[])localObject2) + ";";
      localObject3 = this.mgD.i((String)localObject3, null);
      try
      {
        if (((Cursor)localObject3).moveToNext())
        {
          ad localad = new com/tencent/mm/storage/ad;
          localad.<init>();
          localad.ewQ = ((Cursor)localObject3).getLong(0);
          localad.setUsername(((Cursor)localObject3).getString(1));
          localad.iy(((Cursor)localObject3).getString(2));
          localad.iz(((Cursor)localObject3).getString(3));
          localad.iB(((Cursor)localObject3).getString(4));
          localad.H(((Cursor)localObject3).getBlob(5));
          localHashMap.put(localad.field_username, localad);
        }
      }
      finally
      {
        if (localObject3 != null)
          ((Cursor)localObject3).close();
        AppMethodBeat.o(136707);
      }
      AppMethodBeat.o(136707);
      continue;
      i = J(paramad);
      AppMethodBeat.o(136707);
      continue;
      label506: localObject1 = null;
      localObject3 = null;
    }
  }

  final int J(ad paramad)
  {
    AppMethodBeat.i(136708);
    long l1 = paramad.ewQ;
    String str1 = paramad.field_username;
    Object localObject1 = paramad.Hq();
    Object localObject2 = paramad.field_nickname;
    Object localObject3 = d.aL((String)localObject2, false);
    Object localObject4 = d.aL((String)localObject2, true);
    Object localObject5 = paramad.field_conRemark;
    Object localObject6 = d.aL((String)localObject5, false);
    Object localObject7 = d.aL((String)localObject5, true);
    String str2 = paramad.dul;
    String str3 = paramad.field_contactLabelIds;
    String str4 = paramad.dur;
    int i = paramad.field_verifyFlag;
    long l2 = System.currentTimeMillis();
    int j;
    if ((i & ad.dsh()) != 0)
    {
      str3 = bo.c(((com.tencent.mm.api.j)g.K(com.tencent.mm.api.j.class)).cK(str1), "​");
      i = 0;
      j = 131076;
    }
    while (true)
    {
      localObject1 = d.eu(str1, (String)localObject1);
      if ((localObject1 != null) && (((String)localObject1).length() != 0))
        this.mFv.a(j, 15, l1, str1, l2, (String)localObject1);
      for (int k = i + 1; ; k = i)
      {
        if ((localObject5 == null) || (((String)localObject5).length() == 0))
        {
          localObject5 = null;
          localObject1 = null;
          localObject6 = localObject3;
          localObject7 = null;
          localObject3 = localObject5;
          localObject5 = localObject2;
          localObject2 = localObject1;
        }
        while (true)
        {
          i = k;
          if (localObject5 != null)
          {
            i = k;
            if (((String)localObject5).length() != 0)
            {
              if (!((String)localObject5).equalsIgnoreCase((String)localObject6))
                break label1046;
              localObject6 = null;
            }
          }
          label1046: 
          while (true)
          {
            if ((localObject6 != null) && (((String)localObject6).length() != 0))
            {
              localObject1 = localObject4;
              if (!((String)localObject6).equalsIgnoreCase((String)localObject4));
            }
            else
            {
              localObject1 = null;
            }
            this.mFv.a(j, 1, l1, str1, l2, (String)localObject5);
            if ((localObject6 != null) && (((String)localObject6).length() != 0))
              this.mFv.a(j, 2, l1, str1, l2, (String)localObject6);
            if ((localObject1 != null) && (((String)localObject1).length() != 0))
              this.mFv.a(j, 3, l1, str1, l2, (String)localObject1);
            i = k + 3;
            if ((localObject7 != null) && (((String)localObject7).length() != 0))
            {
              localObject4 = localObject3;
              if (((String)localObject7).equalsIgnoreCase((String)localObject3))
                localObject4 = null;
              if ((localObject4 == null) || (((String)localObject4).length() == 0) || (((String)localObject4).equalsIgnoreCase((String)localObject2)))
              {
                localObject2 = null;
                label424: this.mFv.a(j, 5, l1, str1, l2, (String)localObject7);
                if ((localObject4 != null) && (((String)localObject4).length() != 0))
                  this.mFv.a(j, 6, l1, str1, l2, (String)localObject4);
                if ((localObject2 != null) && (((String)localObject2).length() != 0))
                  this.mFv.a(j, 7, l1, str1, l2, (String)localObject2);
                i += 3;
              }
            }
            while (true)
            {
              k = i;
              if (str2 != null)
              {
                k = i;
                if (str2.length() > 0)
                {
                  this.mFv.a(j, 4, l1, str1, l2, str2);
                  k = i + 1;
                }
              }
              i = k;
              if (j == 131072)
              {
                if (bo.isNullOrNil(str4))
                  break label959;
                localObject2 = str4.replace(",", "​");
                this.mFv.a(j, 16, l1, str1, l2, (String)localObject2);
                i = k + 1;
              }
              while (true)
              {
                localObject2 = mL(paramad.getProvince());
                k = i;
                if (localObject2 != null)
                {
                  k = i;
                  if (((String)localObject2).length() != 0)
                  {
                    this.mFv.a(j, 18, l1, str1, l2, (String)localObject2);
                    k = i + 1;
                  }
                }
                localObject2 = paramad.getCity();
                i = k;
                if (localObject2 != null)
                {
                  i = k;
                  if (((String)localObject2).length() != 0)
                  {
                    this.mFv.a(j, 17, l1, str1, l2, (String)localObject2);
                    i = k + 1;
                  }
                }
                k = i;
                if (j == 131076)
                {
                  k = i;
                  if (!bo.isNullOrNil(str3))
                  {
                    this.mFv.a(j, 19, l1, str1, l2, str3);
                    k = i + 1;
                    localObject2 = d.aL(str3, false);
                    i = k;
                    if (!bo.isNullOrNil((String)localObject2))
                    {
                      this.mFv.a(j, 20, l1, str1, l2, (String)localObject2);
                      i = k + 1;
                    }
                    str3 = d.aL(str3, true);
                    k = i;
                    if (!bo.isNullOrNil(str3))
                    {
                      this.mFv.a(j, 21, l1, str1, l2, str3);
                      k = i + 1;
                    }
                  }
                }
                i = k;
                if (j == 131081)
                  i = k + a(paramad, l2);
                AppMethodBeat.o(136708);
                return i;
                if (ad.aox(str1))
                {
                  i = 0;
                  str3 = "";
                  j = 131081;
                  break;
                }
                l2 = this.mgD.MW(str1);
                if ((str3 == null) || (str3.length() <= 0))
                  break label1079;
                i = a(l1, str1, str3, l2) + 0;
                str3 = "";
                j = 131072;
                break;
                label959: localObject3 = this.mgD.i("SELECT moblie FROM addr_upload2 WHERE username=?;", new String[] { str1 });
                i = k;
                if (((Cursor)localObject3).moveToFirst())
                {
                  localObject2 = ((Cursor)localObject3).getString(0);
                  this.mFv.a(j, 16, l1, str1, l2, (String)localObject2);
                  i = k + 1;
                }
                ((Cursor)localObject3).close();
              }
              break label424;
            }
          }
          Object localObject8 = localObject4;
          localObject1 = localObject2;
          localObject4 = localObject7;
          localObject2 = localObject8;
          localObject7 = localObject1;
        }
      }
      label1079: i = 0;
      str3 = "";
      j = 131072;
    }
  }

  public final boolean Pq()
  {
    AppMethodBeat.i(136699);
    this.mFF.dead();
    this.mFG.dead();
    this.mFI.stopTimer();
    this.mFH.stopTimer();
    ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().b(this.mFC);
    ((com.tencent.mm.plugin.chatroom.a.c)g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().d(this.mFD);
    ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().b(this.mFB);
    k.a locala = this.mFE;
    if (com.tencent.mm.av.b.fHH != null)
      com.tencent.mm.av.b.fHH.b(locala);
    if (this.mFx != null)
      this.mFx.clear();
    if (this.mFw != null)
      this.mFw.clear();
    this.mFv = null;
    this.eAX = null;
    AppMethodBeat.o(136699);
    return true;
  }

  final int a(String paramString, ad paramad, String[] paramArrayOfString, byte[] paramArrayOfByte, HashMap<String, ad> paramHashMap)
  {
    AppMethodBeat.i(136700);
    int i = 0;
    String str1 = paramad.field_nickname;
    paramad = d.aL(str1, false);
    String str2 = d.aL(str1, true);
    long l1 = 0L;
    long l2 = this.mgD.MW(paramString);
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramArrayOfString != null)
    {
      long l3 = paramArrayOfString.length;
      HashMap localHashMap = new HashMap();
      Object localObject = new com.tencent.mm.j.a.a.a();
      int j;
      try
      {
        ((com.tencent.mm.j.a.a.a)localObject).parseFrom(paramArrayOfByte);
        paramArrayOfByte = ((com.tencent.mm.j.a.a.a)localObject).eow.iterator();
        while (paramArrayOfByte.hasNext())
        {
          localObject = (com.tencent.mm.j.a.a.b)paramArrayOfByte.next();
          if (!bo.isNullOrNil(((com.tencent.mm.j.a.a.b)localObject).eoz))
            localHashMap.put(((com.tencent.mm.j.a.a.b)localObject).userName, ((com.tencent.mm.j.a.a.b)localObject).eoz);
        }
      }
      catch (Exception paramArrayOfByte)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.FTS.FTS5SearchContactLogic", paramArrayOfByte, "parse chatroom data", new Object[0]);
        j = paramArrayOfString.length;
        k = 0;
      }
      while (true)
      {
        l1 = l3;
        if (k >= j)
          break;
        String str3 = paramArrayOfString[k];
        localObject = (ad)paramHashMap.get(str3);
        if (localObject != null)
        {
          String str4 = ((com.tencent.mm.g.c.ap)localObject).field_conRemark;
          paramArrayOfByte = ((com.tencent.mm.g.c.ap)localObject).field_nickname;
          String str5 = d.aL(str4, false);
          String str6 = d.aL(str4, true);
          localStringBuffer.append(bo.bc(str4, " ")).append("‌");
          localStringBuffer.append(bo.bc(str5, " ")).append("‌");
          localStringBuffer.append(bo.bc(str6, " ")).append("‌");
          str4 = d.aL(paramArrayOfByte, false);
          str6 = d.aL(paramArrayOfByte, true);
          localStringBuffer.append(bo.bc(paramArrayOfByte, " ")).append("‌");
          localStringBuffer.append(bo.bc(str4, " ")).append("‌");
          localStringBuffer.append(bo.bc(str6, " ")).append("‌");
          localStringBuffer.append(bo.bc((String)localHashMap.get(str3), " ")).append("‌");
          F((ad)localObject);
          localStringBuffer.append(bo.bc(((com.tencent.mm.g.c.ap)localObject).dul, " ")).append("‌");
          localStringBuffer.append(bo.bc(d.eu(str3, ((ad)localObject).Hq()), " ")).append("‌");
          localStringBuffer.append("​");
        }
        k++;
      }
    }
    int k = i;
    if (!bo.isNullOrNil(str1))
    {
      this.mFv.a(131075, 5, l1, paramString, l2, str1);
      if (bo.isNullOrNil(paramad))
        break label634;
      this.mFv.a(131075, 6, l1, paramString, l2, paramad);
    }
    label634: for (i = 2; ; i = 1)
    {
      k = i;
      if (!bo.isNullOrNil(str2))
      {
        this.mFv.a(131075, 7, l1, paramString, l2, str2);
        k = i + 1;
      }
      i = k;
      if (localStringBuffer.length() > 0)
      {
        localStringBuffer.setLength(localStringBuffer.length() - 1);
        this.mFv.a(131075, 38, l1, paramString, l2, localStringBuffer.toString());
        i = k + 1;
      }
      AppMethodBeat.o(136700);
      return i;
    }
  }

  public final com.tencent.mm.plugin.fts.a.a.a a(i parami)
  {
    AppMethodBeat.i(136697);
    switch (parami.hbo)
    {
    default:
      parami = new a.j(this, parami);
    case 16:
    case 32:
    case 48:
    case 64:
    case 5:
    case 6:
    case 7:
    case 96:
    case 8:
    case 9:
    }
    while (true)
    {
      parami = this.eAX.a(-65536, parami);
      AppMethodBeat.o(136697);
      return parami;
      parami = new a.q(this, parami);
      continue;
      parami = new a.n(this, parami);
      continue;
      parami = new a.t(this, parami);
      continue;
      parami = new a.s(this, parami);
      continue;
      parami = new a.l(this, parami);
      continue;
      parami = new a.k(this, parami);
      continue;
      parami = new a.m(this, parami);
      continue;
      parami = new a.r(this, parami);
      continue;
      parami = new a.o(this, parami);
      continue;
      parami = new a.p(this, parami);
    }
  }

  public final String getName()
  {
    return "FTS5SearchContactLogic";
  }

  public final int j(String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(136701);
    Object localObject1 = (String[])this.mFy.get(paramString);
    this.mFv.beginTransaction();
    int i;
    int j;
    if (localObject1 == null)
    {
      this.mFv.Nq(paramString);
      i = (int)this.mFv.mHg.simpleQueryForLong() + 0;
      j = i;
      if (paramArrayOfString != null)
      {
        this.mFv.k(paramString, paramArrayOfString);
        this.mFy.put(paramString, paramArrayOfString);
        j = i + paramArrayOfString.length;
      }
    }
    while (true)
    {
      this.mFv.commit();
      AppMethodBeat.o(136701);
      return j;
      if (paramArrayOfString == null)
      {
        this.mFv.Nq(paramString);
        j = (int)this.mFv.mHg.simpleQueryForLong() + 0;
        this.mFy.remove(paramString);
      }
      else
      {
        Object localObject2 = new HashSet(Arrays.asList((Object[])localObject1));
        int k = paramArrayOfString.length;
        i = 0;
        int m;
        for (j = 0; i < k; j = m)
        {
          localObject3 = paramArrayOfString[i];
          m = j;
          if (!((HashSet)localObject2).remove(localObject3))
          {
            localObject1 = this.mFv;
            ((com.tencent.mm.plugin.fts.c.a)localObject1).mHa.bindString(1, paramString);
            ((com.tencent.mm.plugin.fts.c.a)localObject1).mHa.bindString(2, (String)localObject3);
            ((com.tencent.mm.plugin.fts.c.a)localObject1).mHa.execute();
            m = j + 1;
          }
          i++;
        }
        Object localObject3 = ((HashSet)localObject2).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject1 = (String)((Iterator)localObject3).next();
          localObject2 = this.mFv;
          ((com.tencent.mm.plugin.fts.c.a)localObject2).mHb.bindString(1, paramString);
          ((com.tencent.mm.plugin.fts.c.a)localObject2).mHb.bindString(2, (String)localObject1);
          ((com.tencent.mm.plugin.fts.c.a)localObject2).mHb.execute();
          j++;
        }
        this.mFy.put(paramString, paramArrayOfString);
      }
    }
  }

  public final boolean onCreate()
  {
    AppMethodBeat.i(136698);
    boolean bool;
    if (!((n)g.M(n.class)).isFTSContextReady())
    {
      ab.i("MicroMsg.FTS.FTS5SearchContactLogic", "Create Fail!");
      AppMethodBeat.o(136698);
      bool = false;
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.FTS.FTS5SearchContactLogic", "Create Success!");
      this.mFv = ((com.tencent.mm.plugin.fts.c.a)((n)g.M(n.class)).getFTSIndexStorage(3));
      this.eAX = ((n)g.M(n.class)).getFTSTaskDaemon();
      this.mgD = ((n)g.M(n.class)).getFTSMainDB();
      this.mFw = new HashSet();
      this.mFx = new HashMap();
      this.mFy = new HashMap();
      this.mFz = new HashMap();
      try
      {
        this.mFA = com.tencent.mm.g.c.ap.class.getDeclaredMethod("Hw", new Class[0]);
        this.mFA.setAccessible(true);
        this.eAX.a(131072, new a.f(this, (byte)0));
        this.eAX.a(131082, new a((byte)0));
        this.eAX.a(131092, new a.b(this, (byte)0));
        this.eAX.a(2147483647, new a.c(this, (byte)0));
        ((com.tencent.mm.plugin.chatroom.a.c)g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().c(this.mFD);
        ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().a(this.mFC);
        ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().a(this.mFB);
        k.a locala = this.mFE;
        if (com.tencent.mm.av.b.fHH != null)
          com.tencent.mm.av.b.fHH.a(locala);
        this.mFH.ae(600000L, 600000L);
        this.mFF.dnU();
        this.mFG.dnU();
        AppMethodBeat.o(136698);
        bool = true;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        AssertionFailedError localAssertionFailedError = new AssertionFailedError("Can't find BaseContact.parseBuff method, class prototype has changed.");
        localAssertionFailedError.initCause(localNoSuchMethodException);
        AppMethodBeat.o(136698);
        throw localAssertionFailedError;
      }
    }
  }

  final class a extends com.tencent.mm.plugin.fts.a.a.a
  {
    private int mgK = 0;
    private int mgL = 0;

    private a()
    {
    }

    public final String aAo()
    {
      AppMethodBeat.i(136664);
      String str = String.format("{new: %d removed: %d}", new Object[] { Integer.valueOf(this.mgK), Integer.valueOf(this.mgL) });
      AppMethodBeat.o(136664);
      return str;
    }

    public final boolean execute()
    {
      AppMethodBeat.i(136663);
      ab.i("MicroMsg.FTS.FTS5SearchContactLogic", "Start building chatroom index.");
      Object localObject1 = new HashSet();
      Object localObject2 = a.a(a.this).mBT.rawQuery("SELECT DISTINCT chatroom FROM FTS5ChatRoomMembers;", null);
      while (((Cursor)localObject2).moveToNext())
        ((HashSet)localObject1).add(((Cursor)localObject2).getString(0));
      ((Cursor)localObject2).close();
      localObject2 = a.d(a.this).i("SELECT chatroomname, memberlist FROM chatroom;", null);
      int i = 5;
      int j;
      while (((Cursor)localObject2).moveToNext())
      {
        if (Thread.interrupted())
        {
          ((Cursor)localObject2).close();
          a.a(a.this).commit();
          localObject1 = new InterruptedException();
          AppMethodBeat.o(136663);
          throw ((Throwable)localObject1);
        }
        String str = ((Cursor)localObject2).getString(0);
        String[] arrayOfString = com.tencent.mm.plugin.fts.a.c.a.mCy.split(((Cursor)localObject2).getString(1));
        a.f(a.this).put(str, arrayOfString);
        if (!((HashSet)localObject1).remove(str))
        {
          j = i;
          if (i >= 5)
          {
            a.a(a.this).commit();
            a.a(a.this).beginTransaction();
            j = 0;
          }
          a.a(a.this).k(str, arrayOfString);
          i = j + 1;
          this.mgK += 1;
        }
      }
      ((Cursor)localObject2).close();
      a.a(a.this).commit();
      localObject1 = ((HashSet)localObject1).iterator();
      for (i = 5; ((Iterator)localObject1).hasNext(); i = j + 1)
      {
        localObject2 = (String)((Iterator)localObject1).next();
        j = i;
        if (i >= 5)
        {
          a.a(a.this).commit();
          a.a(a.this).beginTransaction();
          j = 0;
        }
        a.a(a.this).Nq((String)localObject2);
        this.mgL += 1;
      }
      a.a(a.this).commit();
      AppMethodBeat.o(136663);
      return true;
    }

    public final int getId()
    {
      return 3;
    }

    public final String getName()
    {
      return "BuildChatroomIndexTask";
    }
  }

  final class h extends com.tencent.mm.plugin.fts.a.a.a
  {
    private boolean eBp = false;
    private String edV;
    private boolean mGe = false;

    public h(String arg2)
    {
      Object localObject;
      this.edV = localObject;
    }

    public final String aAo()
    {
      AppMethodBeat.i(136679);
      String str = String.format("{username: %s cached: %b isSkipped: %b}", new Object[] { this.edV, Boolean.valueOf(this.mGe), Boolean.valueOf(this.eBp) });
      AppMethodBeat.o(136679);
      return str;
    }

    public final boolean execute()
    {
      AppMethodBeat.i(136678);
      ab.i("MicroMsg.FTS.FTS5SearchContactLogic", "Dirty Contact %s", new Object[] { this.edV });
      if (a.b(a.this).containsKey(this.edV))
      {
        this.mGe = true;
        AppMethodBeat.o(136678);
      }
      while (true)
      {
        return true;
        a.a(a.this).MY(this.edV);
        Object localObject1 = a.a(a.this).c(com.tencent.mm.plugin.fts.a.c.mCk, this.edV);
        a.b(a.this).put(this.edV, localObject1);
        if (((List)localObject1).isEmpty())
        {
          this.eBp = true;
          a.e(a.this).a(65556, new a.e(a.this, this.edV));
          AppMethodBeat.o(136678);
        }
        else
        {
          localObject1 = a.a(a.this).Np(this.edV);
          Object localObject2 = new HashSet();
          while (((Cursor)localObject1).moveToNext())
            ((HashSet)localObject2).add(((Cursor)localObject1).getString(0));
          ((Cursor)localObject1).close();
          Iterator localIterator = ((HashSet)localObject2).iterator();
          while (localIterator.hasNext())
          {
            localObject1 = (String)localIterator.next();
            a.a(a.this).MY((String)localObject1);
            if (!a.b(a.this).containsKey(localObject1))
            {
              localObject2 = a.a(a.this).c(com.tencent.mm.plugin.fts.a.c.mCk, (String)localObject1);
              a.b(a.this).put(localObject1, localObject2);
            }
          }
          a.c(a.this).remove(this.edV);
          ((PluginFTS)g.M(PluginFTS.class)).getTopHitsLogic().Nn(this.edV);
          AppMethodBeat.o(136678);
        }
      }
    }

    public final int getId()
    {
      return 17;
    }

    public final String getName()
    {
      return "MarkContactDirtyTask";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a
 * JD-Core Version:    0.6.2
 */