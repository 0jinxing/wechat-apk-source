package com.tencent.mm.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bbv;
import com.tencent.mm.protocal.protobuf.bcm;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bq;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class t
{
  private static ah fkO;
  public static final String fkP;
  public static final String fkQ;
  public static final String fkR;
  public static final String fkS;
  public static final String fkT;
  public static final String fkU;
  public static final String fkV;
  public static final String fkW;
  public static final String fkX;
  public static final String[] fkY;

  static
  {
    AppMethodBeat.i(59878);
    fkO = null;
    fkP = b("rconversation.username", new String[] { "@im.chatroom", "@chatroom", "@openim", "@micromsg.qq.com" });
    fkQ = b("rconversation.username", new String[] { "@chatroom", "@micromsg.qq.com" });
    fkR = b("rconversation.username", new String[] { "@t.qq.com" });
    fkS = b("rconversation.username", new String[] { "@qqim" });
    fkT = b("rconversation.username", new String[] { "@chatroom_exclusive" });
    fkU = b("rconversation.username", new String[] { "@micromsg.qq.com" });
    fkV = b("rconversation.username", new String[] { "@app" });
    fkW = b("rconversation.username", new String[] { "@chatroom" });
    fkX = b("rconversation.username", new String[] { "@im.chatroom" });
    fkY = new String[] { "qqmail", "fmessage", "tmessage", "qmessage", "qqsync", "floatbottle", "lbsapp", "shakeapp", "medianote", "qqfriend", "newsapp", "blogapp", "facebookapp", "topstoryapp", "masssendapp", "feedsapp", "voipapp", "cardpackage", "voicevoipapp", "voiceinputapp", "officialaccounts", "linkedinplugin", "notifymessage", "appbrandcustomerservicemsg" };
    AppMethodBeat.o(59878);
  }

  public static int[] V(List<String> paramList)
  {
    AppMethodBeat.i(59824);
    long l = System.currentTimeMillis();
    int[] arrayOfInt1 = ((j)g.K(j.class)).XM().eF(paramList);
    ab.d("MicroMsg.ContactStorageLogic", "kevin service(IMessengerStorage.class).getContactStg().getShowHeadDistinct(" + (System.currentTimeMillis() - l));
    if (arrayOfInt1.length <= 0)
    {
      AppMethodBeat.o(59824);
      paramList = null;
    }
    while (true)
    {
      return paramList;
      l = System.currentTimeMillis();
      int[] arrayOfInt2 = ((j)g.K(j.class)).XM().eG(paramList);
      ab.d("MicroMsg.ContactStorageLogic", "kevin service(IMessengerStorage.class).getContactStg().getSectionNumByShowHead" + (System.currentTimeMillis() - l));
      if (arrayOfInt2 == null)
      {
        AppMethodBeat.o(59824);
        paramList = null;
      }
      else
      {
        if (arrayOfInt1.length == arrayOfInt2.length);
        for (boolean bool = true; ; bool = false)
        {
          Assert.assertTrue(bool);
          paramList = new int[arrayOfInt2.length];
          int i = 0;
          int j = 0;
          for (int k = 0; i < arrayOfInt1.length; k++)
          {
            paramList[k] = j;
            j += arrayOfInt2[i];
            i++;
          }
        }
        AppMethodBeat.o(59824);
      }
    }
  }

  public static String[] W(List<String> paramList)
  {
    AppMethodBeat.i(59828);
    long l = System.currentTimeMillis();
    int[] arrayOfInt = ((j)g.K(j.class)).XM().eF(paramList);
    ab.d("MicroMsg.ContactStorageLogic", "kevin service(IMessengerStorage.class).getContactStg().getShowSectionByShowHead" + (System.currentTimeMillis() - l));
    if (arrayOfInt.length <= 0)
    {
      paramList = null;
      AppMethodBeat.o(59828);
    }
    while (true)
    {
      return paramList;
      paramList = new String[arrayOfInt.length];
      int i = 0;
      int j = 0;
      if (i < arrayOfInt.length)
      {
        char c = (char)arrayOfInt[i];
        int k;
        if (c == '{')
        {
          k = j + 1;
          paramList[j] = "#";
          j = k;
        }
        while (true)
        {
          i++;
          break;
          if (c == ' ')
          {
            k = j + 1;
            paramList[j] = "$";
            j = k;
          }
          else
          {
            k = j + 1;
            paramList[j] = String.valueOf(c);
            j = k;
          }
        }
      }
      AppMethodBeat.o(59828);
    }
  }

  public static List<String> Zh()
  {
    AppMethodBeat.i(59794);
    List localList = ((j)g.K(j.class)).XM().dsr();
    AppMethodBeat.o(59794);
    return localList;
  }

  public static List<ad> Zi()
  {
    AppMethodBeat.i(59795);
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = ((j)g.K(j.class)).XM().dss();
    if (localCursor.moveToFirst())
      do
      {
        ad localad = new ad();
        localad.d(localCursor);
        localArrayList.add(localad);
      }
      while (localCursor.moveToNext());
    localCursor.close();
    AppMethodBeat.o(59795);
    return localArrayList;
  }

  public static boolean Zj()
  {
    return false;
  }

  public static boolean Zk()
  {
    AppMethodBeat.i(59869);
    boolean bool;
    if (!r.Ze())
    {
      AppMethodBeat.o(59869);
      bool = false;
    }
    while (true)
    {
      return bool;
      bq localbq = ((j)g.K(j.class)).XU().RA("@t.qq.com");
      if ((localbq == null) || (bo.isNullOrNil(localbq.name)))
      {
        AppMethodBeat.o(59869);
        bool = false;
      }
      else
      {
        bool = true;
        AppMethodBeat.o(59869);
      }
    }
  }

  public static boolean Zl()
  {
    AppMethodBeat.i(59870);
    boolean bool;
    if (!r.Ze())
    {
      AppMethodBeat.o(59870);
      bool = false;
    }
    while (true)
    {
      return bool;
      bq localbq = ((j)g.K(j.class)).XU().RA("@t.qq.com");
      if ((localbq == null) || (bo.nullAsNil(localbq.name).length() == 0))
      {
        AppMethodBeat.o(59870);
        bool = false;
      }
      else
      {
        bool = true;
        AppMethodBeat.o(59870);
      }
    }
  }

  public static List<ad> Zm()
  {
    AppMethodBeat.i(59871);
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = ((j)g.K(j.class)).XM().dsv();
    if (localCursor.getCount() == 0)
    {
      localCursor.close();
      AppMethodBeat.o(59871);
    }
    while (true)
    {
      return localLinkedList;
      localCursor.moveToFirst();
      do
      {
        ad localad = new ad();
        localad.d(localCursor);
        localLinkedList.add(localad);
      }
      while (localCursor.moveToNext());
      localCursor.close();
      ab.d("MicroMsg.ContactStorageLogic", "getFavourList size:  " + localLinkedList.size());
      AppMethodBeat.o(59871);
    }
  }

  public static List<String> Zn()
  {
    AppMethodBeat.i(59872);
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = ((j)g.K(j.class)).XM().dst();
    if (localCursor.getCount() == 0)
    {
      localCursor.close();
      AppMethodBeat.o(59872);
    }
    while (true)
    {
      return localLinkedList;
      localCursor.moveToFirst();
      do
      {
        ad localad = new ad();
        localad.d(localCursor);
        localLinkedList.add(localad.field_username);
      }
      while (localCursor.moveToNext());
      localCursor.close();
      ab.d("MicroMsg.ContactStorageLogic", "getSnsBlackContactList size:  " + localLinkedList.size());
      AppMethodBeat.o(59872);
    }
  }

  public static int Zo()
  {
    AppMethodBeat.i(59875);
    int i = ((j)g.K(j.class)).XM().b(fkY, new String[] { r.Yz(), "weixin", "helper_entry", "filehelper" });
    AppMethodBeat.o(59875);
    return i;
  }

  public static String a(ad paramad, String paramString)
  {
    AppMethodBeat.i(59796);
    if (paramad == null)
      AppMethodBeat.o(59796);
    while (true)
    {
      return paramString;
      if ((mN(paramString)) && (bo.isNullOrNil(paramad.field_nickname)))
      {
        String str = ((c)g.K(c.class)).XV().mJ(paramString);
        if (!bo.isNullOrNil(str))
        {
          AppMethodBeat.o(59796);
          paramString = str;
        }
      }
      else if ((paramad.Oj() != null) && (paramad.Oj().length() > 0))
      {
        paramString = paramad.Oj();
        AppMethodBeat.o(59796);
      }
      else
      {
        AppMethodBeat.o(59796);
      }
    }
  }

  public static void a(ah paramah)
  {
    fkO = paramah;
  }

  public static boolean a(ak paramak)
  {
    boolean bool = false;
    AppMethodBeat.i(59873);
    String str = paramak.field_username;
    if (nI(str))
      AppMethodBeat.o(59873);
    while (true)
    {
      return bool;
      if (nG(str))
      {
        AppMethodBeat.o(59873);
      }
      else if (ny(str))
      {
        AppMethodBeat.o(59873);
      }
      else if (nz(str))
      {
        AppMethodBeat.o(59873);
      }
      else if (paramak.field_conversationTime == -1L)
      {
        AppMethodBeat.o(59873);
      }
      else if (mZ(str))
      {
        AppMethodBeat.o(59873);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(59873);
        bool = true;
      }
    }
  }

  public static int[] a(String paramString1, String paramString2, List<String> paramList, String paramString3)
  {
    AppMethodBeat.i(59823);
    long l = System.currentTimeMillis();
    int[] arrayOfInt = ((j)g.K(j.class)).XM().b(paramString1, paramString2, paramString3, paramList);
    ab.d("MicroMsg.ContactStorageLogic", "kevin service(IMessengerStorage.class).getContactStg().getShowHeadDistinct(" + (System.currentTimeMillis() - l));
    if (arrayOfInt.length <= 0)
    {
      AppMethodBeat.o(59823);
      paramString1 = null;
    }
    while (true)
    {
      return paramString1;
      l = System.currentTimeMillis();
      paramString2 = ((j)g.K(j.class)).XM().c(paramString1, paramString2, paramString3, paramList);
      ab.d("MicroMsg.ContactStorageLogic", "kevin service(IMessengerStorage.class).getContactStg().getSectionNumByShowHead" + (System.currentTimeMillis() - l));
      if (paramString2 == null)
      {
        AppMethodBeat.o(59823);
        paramString1 = null;
      }
      else
      {
        if (arrayOfInt.length == paramString2.length);
        for (boolean bool = true; ; bool = false)
        {
          Assert.assertTrue(bool);
          paramString1 = new int[paramString2.length];
          int i = 0;
          int j = 0;
          for (int k = 0; i < arrayOfInt.length; k++)
          {
            paramString1[k] = j;
            j += paramString2[i];
            i++;
          }
        }
        AppMethodBeat.o(59823);
      }
    }
  }

  public static int[] a(String paramString1, String paramString2, List<String> paramList, String[] paramArrayOfString)
  {
    AppMethodBeat.i(59825);
    int[] arrayOfInt = ((j)g.K(j.class)).XM().b(paramString1, paramString2, paramArrayOfString, paramList);
    if (arrayOfInt.length <= 0)
    {
      AppMethodBeat.o(59825);
      paramString1 = null;
    }
    while (true)
    {
      return paramString1;
      paramString2 = ((j)g.K(j.class)).XM().c(paramString1, paramString2, paramArrayOfString, paramList);
      if (paramString2 == null)
      {
        AppMethodBeat.o(59825);
        paramString1 = null;
      }
      else
      {
        if (arrayOfInt.length == paramString2.length);
        for (boolean bool = true; ; bool = false)
        {
          Assert.assertTrue(bool);
          paramString1 = new int[paramString2.length];
          int i = 0;
          int j = 0;
          for (int k = 0; i < arrayOfInt.length; k++)
          {
            paramString1[k] = j;
            j += paramString2[i];
            i++;
          }
        }
        AppMethodBeat.o(59825);
      }
    }
  }

  public static String[] a(String paramString1, String paramString2, String paramString3, List<String> paramList)
  {
    AppMethodBeat.i(59827);
    long l = System.currentTimeMillis();
    paramString2 = ((j)g.K(j.class)).XM().b(paramString1, paramString2, paramString3, paramList);
    ab.d("MicroMsg.ContactStorageLogic", "kevin service(IMessengerStorage.class).getContactStg().getShowSectionByShowHead" + (System.currentTimeMillis() - l));
    if (paramString2.length <= 0)
    {
      paramString1 = null;
      AppMethodBeat.o(59827);
    }
    while (true)
    {
      return paramString1;
      paramString1 = new String[paramString2.length];
      int i = 0;
      int j = 0;
      if (i < paramString2.length)
      {
        char c = (char)paramString2[i];
        int k;
        if (c == '{')
        {
          k = j + 1;
          paramString1[j] = "#";
          j = k;
        }
        while (true)
        {
          i++;
          break;
          if (c == ' ')
          {
            k = j + 1;
            paramString1[j] = "$";
            j = k;
          }
          else
          {
            k = j + 1;
            paramString1[j] = String.valueOf(c);
            j = k;
          }
        }
      }
      AppMethodBeat.o(59827);
    }
  }

  public static String[] a(String paramString1, String paramString2, String[] paramArrayOfString, List<String> paramList)
  {
    AppMethodBeat.i(59826);
    long l = System.currentTimeMillis();
    paramString2 = ((j)g.K(j.class)).XM().b(paramString1, paramString2, paramArrayOfString, paramList);
    ab.d("MicroMsg.ContactStorageLogic", "kevin service(IMessengerStorage.class).getContactStg().getShowSectionByShowHead" + (System.currentTimeMillis() - l));
    if (paramString2.length <= 0)
    {
      paramString1 = null;
      AppMethodBeat.o(59826);
    }
    while (true)
    {
      return paramString1;
      paramString1 = new String[paramString2.length];
      int i = 0;
      int j = 0;
      if (i < paramString2.length)
      {
        char c = (char)paramString2[i];
        int k;
        if (c == '{')
        {
          k = j + 1;
          paramString1[j] = "#";
          j = k;
        }
        while (true)
        {
          i++;
          break;
          if (c == ' ')
          {
            k = j + 1;
            paramString1[j] = "$";
            j = k;
          }
          else
          {
            k = j + 1;
            paramString1[j] = String.valueOf(c);
            j = k;
          }
        }
      }
      AppMethodBeat.o(59826);
    }
  }

  private static String b(String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(59876);
    Object localObject1 = " and ( 1 != 1 ";
    int i = paramArrayOfString.length;
    int j = 0;
    if (j < i)
    {
      String str = paramArrayOfString[j];
      Object localObject2;
      if ("@all.android".equals(str))
        localObject2 = (String)localObject1 + " or 1 = 1";
      while (true)
      {
        j++;
        localObject1 = localObject2;
        break;
        if ("@micromsg.qq.com".equals(str))
        {
          localObject2 = (String)localObject1 + " or " + paramString + " not like '%@%'";
        }
        else if ("@chatroom".equals(str))
        {
          localObject2 = (String)localObject1 + " or " + paramString + " like '%@chatroom'";
        }
        else if ("@talkroom".equals(str))
        {
          localObject2 = (String)localObject1 + " or " + paramString + " like '%@talkroom'";
        }
        else if ("@t.qq.com".equals(str))
        {
          localObject2 = (String)localObject1 + " or " + paramString + " like '%@t.qq.com'";
        }
        else if ("@qqim".equals(str))
        {
          localObject2 = (String)localObject1 + " or " + paramString + " like '%@qqim'";
        }
        else if ("@chatroom_exclusive".equals(str))
        {
          localObject2 = (String)localObject1 + " or " + paramString + "not like %@chatroom";
        }
        else if ("@app".equals(str))
        {
          localObject2 = (String)localObject1 + " or " + paramString + " like '%@app'";
        }
        else if ("@openim".equals(str))
        {
          localObject2 = (String)localObject1 + " or " + paramString + " like '%@openim'";
        }
        else
        {
          localObject2 = localObject1;
          if ("@im.chatroom".equals(str))
            localObject2 = (String)localObject1 + " or " + paramString + " like '%@im.chatroom'";
        }
      }
    }
    paramString = (String)localObject1 + " ) ";
    AppMethodBeat.o(59876);
    return paramString;
  }

  public static void b(ad paramad, String paramString)
  {
    AppMethodBeat.i(59817);
    ad localad = ((j)g.K(j.class)).XM().aoO(paramad.field_username);
    if ((localad != null) && (paramString != null));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      localad.iz(paramString);
      if ((ad.aox(paramad.field_username)) && (fkO != null))
        fkO.ah(paramad.field_username, paramString);
      u(localad);
      AppMethodBeat.o(59817);
      return;
    }
  }

  public static boolean b(ak paramak)
  {
    boolean bool = false;
    AppMethodBeat.i(59874);
    paramak = paramak.field_username;
    if (ny(paramak))
      AppMethodBeat.o(59874);
    while (true)
    {
      return bool;
      if (nH(paramak))
      {
        AppMethodBeat.o(59874);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(59874);
      }
    }
  }

  public static boolean e(ad paramad)
  {
    boolean bool = false;
    AppMethodBeat.i(59789);
    if (paramad == null)
      AppMethodBeat.o(59789);
    while (true)
    {
      return bool;
      if (!mN(paramad.field_username))
      {
        AppMethodBeat.o(59789);
      }
      else if (!a.jh(paramad.field_type))
      {
        AppMethodBeat.o(59789);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(59789);
      }
    }
  }

  public static void f(ad paramad)
  {
    AppMethodBeat.i(59800);
    boolean bool;
    ad localad1;
    if (paramad != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      localad1 = ((j)g.K(j.class)).XM().aoO(paramad.field_username);
      localad2 = paramad;
      if (localad1 != null)
        if (!bo.isNullOrNil(localad1.field_username))
          break label77;
    }
    label77: for (ad localad2 = paramad; ; localad2 = localad1)
    {
      localad2.NH();
      u(localad2);
      AppMethodBeat.o(59800);
      return;
      bool = false;
      break;
    }
  }

  public static void g(ad paramad)
  {
    AppMethodBeat.i(59802);
    boolean bool;
    ad localad1;
    if (paramad != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      localad1 = ((j)g.K(j.class)).XM().aoO(paramad.field_username);
      localad2 = paramad;
      if (localad1 != null)
        if (!bo.isNullOrNil(localad1.field_username))
          break label77;
    }
    label77: for (ad localad2 = paramad; ; localad2 = localad1)
    {
      localad2.NF();
      u(localad2);
      AppMethodBeat.o(59802);
      return;
      bool = false;
      break;
    }
  }

  public static void h(ad paramad)
  {
    AppMethodBeat.i(59803);
    boolean bool;
    ad localad1;
    if (paramad != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      localad1 = ((j)g.K(j.class)).XM().aoO(paramad.field_username);
      localad2 = paramad;
      if (localad1 != null)
        if (!bo.isNullOrNil(localad1.field_username))
          break label77;
    }
    label77: for (ad localad2 = paramad; ; localad2 = localad1)
    {
      localad2.NG();
      u(localad2);
      AppMethodBeat.o(59803);
      return;
      bool = false;
      break;
    }
  }

  public static void i(ad paramad)
  {
    AppMethodBeat.i(59804);
    if (paramad != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      ad localad1 = ((j)g.K(j.class)).XM().aoO(paramad.field_username);
      ad localad2;
      if (localad1 != null)
      {
        localad2 = localad1;
        if (!bo.isNullOrNil(localad1.field_username));
      }
      else
      {
        localad2 = paramad;
      }
      localad2.ND();
      if ((ad.aox(paramad.field_username)) && (fkO != null))
        fkO.ok(paramad.field_username);
      u(localad2);
      AppMethodBeat.o(59804);
      return;
    }
  }

  public static void j(ad paramad)
  {
    AppMethodBeat.i(59805);
    if (paramad != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      ad localad1 = ((j)g.K(j.class)).XM().aoO(paramad.field_username);
      ad localad2;
      if (localad1 != null)
      {
        localad2 = localad1;
        if (!bo.isNullOrNil(localad1.field_username));
      }
      else
      {
        localad2 = paramad;
      }
      localad2.NE();
      if ((ad.aox(paramad.field_username)) && (fkO != null))
        fkO.ol(paramad.field_username);
      u(localad2);
      paramad = ((j)g.K(j.class)).XR().aoZ(paramad.field_username);
      if ((paramad != null) && ("@blacklist".equals(paramad.field_parentRef)))
        ((j)g.K(j.class)).XR().c(new String[] { paramad.field_username }, "");
      AppMethodBeat.o(59805);
      return;
    }
  }

  public static void k(ad paramad)
  {
    AppMethodBeat.i(59806);
    if (paramad != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      ad localad1 = ((j)g.K(j.class)).XM().aoO(paramad.field_username);
      ad localad2;
      if (localad1 != null)
      {
        localad2 = localad1;
        if (!bo.isNullOrNil(localad1.field_username));
      }
      else
      {
        localad2 = paramad;
      }
      localad2.NQ();
      localad2.hu(paramad.Ny());
      t(localad2);
      AppMethodBeat.o(59806);
      return;
    }
  }

  public static boolean kH(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(59783);
    if ((paramString == null) || (paramString.length() <= 0))
      AppMethodBeat.o(59783);
    while (true)
    {
      return bool;
      if ((paramString.endsWith("@chatroom")) || (paramString.endsWith("@im.chatroom")))
      {
        bool = true;
        AppMethodBeat.o(59783);
      }
      else
      {
        AppMethodBeat.o(59783);
      }
    }
  }

  public static boolean kv(int paramInt)
  {
    AppMethodBeat.i(59799);
    boolean bool = ad.Mn(paramInt);
    AppMethodBeat.o(59799);
    return bool;
  }

  public static void l(ad paramad)
  {
    AppMethodBeat.i(59807);
    if (paramad != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      ad localad1 = ((j)g.K(j.class)).XM().aoO(paramad.field_username);
      ad localad2;
      if (localad1 != null)
      {
        localad2 = localad1;
        if (!bo.isNullOrNil(localad1.field_username));
      }
      else
      {
        localad2 = paramad;
      }
      localad2.NR();
      localad2.hu(paramad.Ny());
      t(localad2);
      AppMethodBeat.o(59807);
      return;
    }
  }

  public static void m(ad paramad)
  {
    AppMethodBeat.i(59808);
    if (paramad != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      ad localad1 = ((j)g.K(j.class)).XM().aoO(paramad.field_username);
      ad localad2;
      if (localad1 != null)
      {
        localad2 = localad1;
        if (!bo.isNullOrNil(localad1.field_username));
      }
      else
      {
        localad2 = paramad;
      }
      localad2.NM();
      localad2.hu(paramad.Ny());
      if ((ad.aox(paramad.field_username)) && (fkO != null))
        fkO.om(paramad.field_username);
      u(localad2);
      AppMethodBeat.o(59808);
      return;
    }
  }

  public static boolean mM(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(59780);
    if ((paramString == null) || (paramString.length() <= 0))
      AppMethodBeat.o(59780);
    while (true)
    {
      return bool;
      if ((!paramString.contains("@")) || (paramString.endsWith("@micromsg.qq.com")))
      {
        bool = true;
        AppMethodBeat.o(59780);
      }
      else
      {
        AppMethodBeat.o(59780);
      }
    }
  }

  public static boolean mN(String paramString)
  {
    AppMethodBeat.i(59781);
    boolean bool;
    if ((mO(paramString)) || (mP(paramString)))
    {
      bool = true;
      AppMethodBeat.o(59781);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59781);
    }
  }

  public static boolean mO(String paramString)
  {
    AppMethodBeat.i(59782);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      bool = false;
      AppMethodBeat.o(59782);
    }
    while (true)
    {
      return bool;
      bool = paramString.endsWith("@chatroom");
      AppMethodBeat.o(59782);
    }
  }

  public static boolean mP(String paramString)
  {
    AppMethodBeat.i(59784);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      bool = false;
      AppMethodBeat.o(59784);
    }
    while (true)
    {
      return bool;
      bool = paramString.endsWith("@im.chatroom");
      AppMethodBeat.o(59784);
    }
  }

  public static boolean mQ(String paramString)
  {
    AppMethodBeat.i(59785);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      bool = false;
      AppMethodBeat.o(59785);
    }
    while (true)
    {
      return bool;
      bool = paramString.endsWith("@qy_u");
      AppMethodBeat.o(59785);
    }
  }

  public static boolean mR(String paramString)
  {
    AppMethodBeat.i(59786);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      bool = false;
      AppMethodBeat.o(59786);
    }
    while (true)
    {
      return bool;
      bool = paramString.endsWith("@bottle");
      AppMethodBeat.o(59786);
    }
  }

  public static boolean mS(String paramString)
  {
    AppMethodBeat.i(59787);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      bool = false;
      AppMethodBeat.o(59787);
    }
    while (true)
    {
      return bool;
      bool = paramString.endsWith("@qqim");
      AppMethodBeat.o(59787);
    }
  }

  public static boolean mT(String paramString)
  {
    AppMethodBeat.i(59788);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      bool = false;
      AppMethodBeat.o(59788);
    }
    while (true)
    {
      return bool;
      bool = paramString.endsWith("@lbsroom");
      AppMethodBeat.o(59788);
    }
  }

  public static boolean mU(String paramString)
  {
    AppMethodBeat.i(59790);
    boolean bool = "gh_43f2581f6fd6".equals(paramString);
    AppMethodBeat.o(59790);
    return bool;
  }

  public static boolean mV(String paramString)
  {
    AppMethodBeat.i(59791);
    boolean bool = "downloaderapp".equals(paramString);
    AppMethodBeat.o(59791);
    return bool;
  }

  public static boolean mW(String paramString)
  {
    AppMethodBeat.i(59792);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      AppMethodBeat.o(59792);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (!mN(paramString))
      {
        AppMethodBeat.o(59792);
        bool = false;
      }
      else
      {
        paramString = ((j)g.K(j.class)).XM().aoO(paramString);
        if ((paramString == null) || (!a.jh(paramString.field_type)))
        {
          AppMethodBeat.o(59792);
          bool = false;
        }
        else
        {
          bool = true;
          AppMethodBeat.o(59792);
        }
      }
    }
  }

  public static boolean mX(String paramString)
  {
    AppMethodBeat.i(59793);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      bool = false;
      AppMethodBeat.o(59793);
    }
    while (true)
    {
      return bool;
      bool = paramString.endsWith("@stranger");
      AppMethodBeat.o(59793);
    }
  }

  public static boolean mY(String paramString)
  {
    AppMethodBeat.i(59797);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      bool = true;
      AppMethodBeat.o(59797);
    }
    while (true)
    {
      return bool;
      bool = a.jh(((j)g.K(j.class)).XM().aoO(paramString).field_type);
      AppMethodBeat.o(59797);
    }
  }

  public static boolean mZ(String paramString)
  {
    AppMethodBeat.i(59798);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(59798);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramString = ((j)g.K(j.class)).XM().aoO(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(59798);
        bool = false;
      }
      else
      {
        bool = ad.Mn(paramString.field_verifyFlag);
        AppMethodBeat.o(59798);
      }
    }
  }

  public static void n(ad paramad)
  {
    AppMethodBeat.i(59809);
    if (paramad != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      ad localad1 = ((j)g.K(j.class)).XM().aoO(paramad.field_username);
      ad localad2;
      if (localad1 != null)
      {
        localad2 = localad1;
        if (!bo.isNullOrNil(localad1.field_username));
      }
      else
      {
        localad2 = paramad;
      }
      localad2.NN();
      localad2.hu(paramad.Ny());
      if ((ad.aox(paramad.field_username)) && (fkO != null))
        fkO.on(paramad.field_username);
      u(localad2);
      AppMethodBeat.o(59809);
      return;
    }
  }

  public static boolean nA(String paramString)
  {
    AppMethodBeat.i(59853);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("qqfriend");
      AppMethodBeat.o(59853);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59853);
    }
  }

  public static boolean nB(String paramString)
  {
    AppMethodBeat.i(59854);
    boolean bool = "filehelper".equalsIgnoreCase(paramString);
    AppMethodBeat.o(59854);
    return bool;
  }

  public static boolean nC(String paramString)
  {
    AppMethodBeat.i(59855);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("pc_share");
      AppMethodBeat.o(59855);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59855);
    }
  }

  public static boolean nD(String paramString)
  {
    AppMethodBeat.i(59856);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("notifymessage");
      AppMethodBeat.o(59856);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59856);
    }
  }

  public static boolean nE(String paramString)
  {
    AppMethodBeat.i(59857);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("notification_messages");
      AppMethodBeat.o(59857);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59857);
    }
  }

  public static boolean nF(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(59858);
    if (nG(paramString))
      AppMethodBeat.o(59858);
    while (true)
    {
      return bool;
      if (nI(paramString))
      {
        AppMethodBeat.o(59858);
      }
      else if (ny(paramString))
      {
        AppMethodBeat.o(59858);
      }
      else if (nz(paramString))
      {
        AppMethodBeat.o(59858);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(59858);
      }
    }
  }

  public static boolean nG(String paramString)
  {
    AppMethodBeat.i(59859);
    g.RQ();
    String str = (String)g.RP().Ry().get(21, null);
    boolean bool;
    if (((str != null) && (str.equalsIgnoreCase(paramString))) || (paramString.equalsIgnoreCase("weixin")))
    {
      bool = true;
      AppMethodBeat.o(59859);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59859);
    }
  }

  public static boolean nH(String paramString)
  {
    AppMethodBeat.i(59860);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("appbrandcustomerservicemsg");
      AppMethodBeat.o(59860);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59860);
    }
  }

  public static boolean nI(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(59861);
    String[] arrayOfString = fkY;
    int i = arrayOfString.length;
    int j = 0;
    if (j < i)
      if (arrayOfString[j].equalsIgnoreCase(paramString))
      {
        bool = true;
        AppMethodBeat.o(59861);
      }
    while (true)
    {
      return bool;
      j++;
      break;
      AppMethodBeat.o(59861);
    }
  }

  public static boolean nJ(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(59862);
    if (nI(paramString))
      AppMethodBeat.o(59862);
    while (true)
    {
      return bool;
      if (ad.aow(paramString))
      {
        AppMethodBeat.o(59862);
      }
      else if (ad.aou(paramString))
      {
        AppMethodBeat.o(59862);
      }
      else if (ad.mR(paramString))
      {
        AppMethodBeat.o(59862);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(59862);
      }
    }
  }

  public static int nK(String paramString)
  {
    int i = 1;
    AppMethodBeat.i(59863);
    boolean bool;
    if (bo.nullAsNil(paramString).length() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      paramString = paramString.trim().toLowerCase();
      if (!paramString.endsWith("@chatroom"))
        break label54;
      AppMethodBeat.o(59863);
    }
    while (true)
    {
      return i;
      bool = false;
      break;
      label54: if (ad.aou(paramString))
      {
        i = 11;
        AppMethodBeat.o(59863);
      }
      else if (ad.aow(paramString))
      {
        i = 36;
        AppMethodBeat.o(59863);
      }
      else if (ad.mR(paramString))
      {
        AppMethodBeat.o(59863);
      }
      else
      {
        AppMethodBeat.o(59863);
      }
    }
  }

  public static int nL(String paramString)
  {
    AppMethodBeat.i(59864);
    boolean bool;
    int i;
    if (bo.nullAsNil(paramString).length() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      paramString = paramString.trim().toLowerCase();
      if (!paramString.endsWith("@chatroom"))
        break label54;
      AppMethodBeat.o(59864);
      i = 3;
    }
    while (true)
    {
      return i;
      bool = false;
      break;
      label54: if (ad.aou(paramString))
      {
        i = 13;
        AppMethodBeat.o(59864);
      }
      else if (ad.aow(paramString))
      {
        i = 39;
        AppMethodBeat.o(59864);
      }
      else if (ad.mR(paramString))
      {
        AppMethodBeat.o(59864);
        i = 3;
      }
      else if (paramString.contains("@"))
      {
        AppMethodBeat.o(59864);
        i = 3;
      }
      else
      {
        AppMethodBeat.o(59864);
        i = 3;
      }
    }
  }

  public static boolean nM(String paramString)
  {
    AppMethodBeat.i(59865);
    boolean bool;
    if (((j)g.K(j.class)).XM().aoO(paramString).dua != 1)
    {
      bool = false;
      AppMethodBeat.o(59865);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(59865);
      bool = true;
    }
  }

  public static boolean nN(String paramString)
  {
    AppMethodBeat.i(59866);
    paramString = ((j)g.K(j.class)).XM().aoO(paramString);
    boolean bool;
    if ((paramString != null) && (paramString.DX()))
    {
      bool = true;
      AppMethodBeat.o(59866);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59866);
    }
  }

  public static boolean nO(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(59867);
    if ((paramString == null) || (paramString.length() <= 0))
      AppMethodBeat.o(59867);
    while (true)
    {
      return bool;
      if ((paramString.startsWith("t.qq.com/")) || (paramString.startsWith("http://t.qq.com/")))
      {
        bool = true;
        AppMethodBeat.o(59867);
      }
      else
      {
        AppMethodBeat.o(59867);
      }
    }
  }

  public static String nP(String paramString)
  {
    AppMethodBeat.i(59868);
    if (nO(paramString))
    {
      paramString = paramString.replace("http://t.qq.com/", "").replace("t.qq.com/", "");
      AppMethodBeat.o(59868);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(59868);
    }
  }

  public static boolean nQ(String paramString)
  {
    AppMethodBeat.i(59877);
    boolean bool;
    if ((paramString.equals("weixinsrc")) || (paramString.equalsIgnoreCase("gh_6e99ff560306")))
    {
      bool = true;
      AppMethodBeat.o(59877);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59877);
    }
  }

  public static void na(String paramString)
  {
    AppMethodBeat.i(59811);
    ak localak1 = ((j)g.K(j.class)).XR().aoZ(paramString);
    int i = 0;
    ak localak2 = localak1;
    if (localak1 == null)
    {
      localak2 = new ak();
      localak2.dsI();
      i = 1;
      localak2.setUsername(paramString);
    }
    localak2.eD(System.currentTimeMillis());
    if (i != 0)
    {
      ((j)g.K(j.class)).XR().d(localak2);
      AppMethodBeat.o(59811);
    }
    while (true)
    {
      return;
      ((j)g.K(j.class)).XR().a(localak2, paramString);
      AppMethodBeat.o(59811);
    }
  }

  public static void nb(String paramString)
  {
    AppMethodBeat.i(59822);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(59822);
    while (true)
    {
      return;
      ad localad = ((j)g.K(j.class)).XM().aoO(paramString);
      if (localad == null)
      {
        AppMethodBeat.o(59822);
      }
      else
      {
        localad.setSource(0);
        localad.Nz();
        ((j)g.K(j.class)).XM().b(paramString, localad);
        AppMethodBeat.o(59822);
      }
    }
  }

  public static boolean nc(String paramString)
  {
    AppMethodBeat.i(59829);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("qqmail");
      AppMethodBeat.o(59829);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59829);
    }
  }

  public static boolean nd(String paramString)
  {
    AppMethodBeat.i(59830);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("fmessage");
      AppMethodBeat.o(59830);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59830);
    }
  }

  public static boolean ne(String paramString)
  {
    AppMethodBeat.i(59831);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("tmessage");
      AppMethodBeat.o(59831);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59831);
    }
  }

  public static boolean nf(String paramString)
  {
    AppMethodBeat.i(59832);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("floatbottle");
      AppMethodBeat.o(59832);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59832);
    }
  }

  public static boolean ng(String paramString)
  {
    AppMethodBeat.i(59833);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("qmessage");
      AppMethodBeat.o(59833);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59833);
    }
  }

  public static boolean nh(String paramString)
  {
    AppMethodBeat.i(59834);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("facebookapp");
      AppMethodBeat.o(59834);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59834);
    }
  }

  public static boolean ni(String paramString)
  {
    AppMethodBeat.i(59835);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("masssendapp");
      AppMethodBeat.o(59835);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59835);
    }
  }

  public static boolean nj(String paramString)
  {
    AppMethodBeat.i(59836);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("feedsapp");
      AppMethodBeat.o(59836);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59836);
    }
  }

  public static boolean nk(String paramString)
  {
    AppMethodBeat.i(59837);
    boolean bool = "qqsync".equalsIgnoreCase(paramString);
    AppMethodBeat.o(59837);
    return bool;
  }

  public static boolean nl(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(59838);
    if (paramString != null)
      if ((paramString.equalsIgnoreCase("weixin")) || (paramString.equalsIgnoreCase("gh_9639b5a92773")))
      {
        bool = true;
        AppMethodBeat.o(59838);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(59838);
      continue;
      AppMethodBeat.o(59838);
    }
  }

  public static boolean nm(String paramString)
  {
    AppMethodBeat.i(59839);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("lbsapp");
      AppMethodBeat.o(59839);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59839);
    }
  }

  public static boolean nn(String paramString)
  {
    AppMethodBeat.i(59840);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("shakeapp");
      AppMethodBeat.o(59840);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59840);
    }
  }

  public static boolean no(String paramString)
  {
    AppMethodBeat.i(59841);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("medianote");
      AppMethodBeat.o(59841);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59841);
    }
  }

  public static boolean np(String paramString)
  {
    AppMethodBeat.i(59842);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("newsapp");
      AppMethodBeat.o(59842);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59842);
    }
  }

  public static boolean nq(String paramString)
  {
    AppMethodBeat.i(59843);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("topstoryapp");
      AppMethodBeat.o(59843);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59843);
    }
  }

  public static boolean nr(String paramString)
  {
    AppMethodBeat.i(59844);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("voipapp");
      AppMethodBeat.o(59844);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59844);
    }
  }

  public static boolean ns(String paramString)
  {
    AppMethodBeat.i(59845);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("voicevoipapp");
      AppMethodBeat.o(59845);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59845);
    }
  }

  public static boolean nt(String paramString)
  {
    AppMethodBeat.i(59846);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("voiceinputapp");
      AppMethodBeat.o(59846);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59846);
    }
  }

  public static boolean nu(String paramString)
  {
    AppMethodBeat.i(59847);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("linkedinplugin");
      AppMethodBeat.o(59847);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59847);
    }
  }

  public static boolean nv(String paramString)
  {
    AppMethodBeat.i(59848);
    boolean bool = nw(paramString);
    AppMethodBeat.o(59848);
    return bool;
  }

  public static boolean nw(String paramString)
  {
    AppMethodBeat.i(59849);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("gh_22b87fa7cb3c");
      AppMethodBeat.o(59849);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59849);
    }
  }

  public static boolean nx(String paramString)
  {
    AppMethodBeat.i(59850);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("blogapp");
      AppMethodBeat.o(59850);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59850);
    }
  }

  public static boolean ny(String paramString)
  {
    AppMethodBeat.i(59851);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("officialaccounts");
      AppMethodBeat.o(59851);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59851);
    }
  }

  public static boolean nz(String paramString)
  {
    AppMethodBeat.i(59852);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.equalsIgnoreCase("helper_entry");
      AppMethodBeat.o(59852);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59852);
    }
  }

  public static void o(ad paramad)
  {
    AppMethodBeat.i(59813);
    if (paramad != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      ad localad1 = ((j)g.K(j.class)).XM().aoO(paramad.field_username);
      ad localad2;
      if (localad1 != null)
      {
        localad2 = localad1;
        if (!bo.isNullOrNil(localad1.field_username));
      }
      else
      {
        localad2 = paramad;
      }
      localad2.NO();
      if ((ad.aox(paramad.field_username)) && (fkO != null))
        fkO.oo(paramad.field_username);
      u(localad2);
      AppMethodBeat.o(59813);
      return;
    }
  }

  public static void p(ad paramad)
  {
    AppMethodBeat.i(59814);
    if (paramad != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      ad localad1 = ((j)g.K(j.class)).XM().aoO(paramad.field_username);
      ad localad2;
      if (localad1 != null)
      {
        localad2 = localad1;
        if (!bo.isNullOrNil(localad1.field_username));
      }
      else
      {
        localad2 = paramad;
      }
      localad2.NP();
      if ((ad.aox(paramad.field_username)) && (fkO != null))
        fkO.op(paramad.field_username);
      u(localad2);
      AppMethodBeat.o(59814);
      return;
    }
  }

  public static void q(ad paramad)
  {
    boolean bool1 = true;
    AppMethodBeat.i(59815);
    if (paramad != null)
    {
      bool2 = true;
      Assert.assertTrue("MicroMsg.ContactStorageLogic: user is null", bool2);
      if ((int)paramad.ewQ == 0)
        break label97;
      bool2 = true;
      label31: Assert.assertTrue("MicroMsg.ContactStorageLogic: contactId == 0", bool2);
      if (paramad.field_username.length() <= 0)
        break label102;
    }
    label97: label102: for (boolean bool2 = bool1; ; bool2 = false)
    {
      Assert.assertTrue("MicroMsg.ContactStorageLogic: username length <= 0", bool2);
      paramad.NB();
      ((j)g.K(j.class)).XM().b(paramad.field_username, paramad);
      AppMethodBeat.o(59815);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label31;
    }
  }

  public static void r(ad paramad)
  {
    boolean bool1 = true;
    AppMethodBeat.i(59816);
    if (paramad != null)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      if ((int)paramad.ewQ == 0)
        break label92;
      bool2 = true;
      label28: Assert.assertTrue(bool2);
      if (paramad.field_username.length() <= 0)
        break label97;
    }
    label92: label97: for (boolean bool2 = bool1; ; bool2 = false)
    {
      Assert.assertTrue(bool2);
      paramad.NB();
      ((j)g.K(j.class)).XM().b(paramad.field_username, paramad);
      u(paramad);
      AppMethodBeat.o(59816);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label28;
    }
  }

  public static void s(ad paramad)
  {
    boolean bool1 = true;
    AppMethodBeat.i(59818);
    if (paramad != null)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      if ((int)paramad.ewQ == 0)
        break label68;
      bool2 = true;
      label28: Assert.assertTrue(bool2);
      if (paramad.field_username.length() <= 0)
        break label73;
    }
    label68: label73: for (boolean bool2 = bool1; ; bool2 = false)
    {
      Assert.assertTrue(bool2);
      paramad.Og();
      u(paramad);
      AppMethodBeat.o(59818);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label28;
    }
  }

  private static void t(ad paramad)
  {
    AppMethodBeat.i(59819);
    boolean bool;
    bcm localbcm;
    if (paramad != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if ((int)paramad.ewQ == 0)
      {
        ((j)g.K(j.class)).XM().aa(paramad);
        ((j)g.K(j.class)).XM().aoO(paramad.field_username);
      }
      ((j)g.K(j.class)).XM().b(paramad.field_username, paramad);
      localbcm = new bcm();
      localbcm.wGA = paramad.field_username;
      if (!paramad.Od())
        break label159;
    }
    label159: for (localbcm.wGN = 1; ; localbcm.wGN = 2)
    {
      ((j)g.K(j.class)).XL().c(new j.a(52, localbcm));
      AppMethodBeat.o(59819);
      return;
      bool = false;
      break;
    }
  }

  public static void u(ad paramad)
  {
    AppMethodBeat.i(59820);
    if (paramad != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      if ((int)paramad.ewQ == 0)
      {
        ((j)g.K(j.class)).XM().aa(paramad);
        ((j)g.K(j.class)).XM().aoO(paramad.field_username);
      }
      ((j)g.K(j.class)).XM().b(paramad.field_username, paramad);
      if (!ad.aox(paramad.field_username))
        v(paramad);
      AppMethodBeat.o(59820);
      return;
    }
  }

  public static void v(ad paramad)
  {
    AppMethodBeat.i(59821);
    ab.i("MicroMsg.ContactStorageLogic", "oplog modContact user:%s remark:%s type:%d ", new Object[] { paramad.field_username, paramad.field_conRemark, Integer.valueOf(paramad.field_type) });
    bbv localbbv = new bbv();
    localbbv.wcB = new bts().alV(bo.nullAsNil(paramad.field_username));
    localbbv.wyX = new bts().alV(bo.nullAsNil(paramad.field_nickname));
    localbbv.wce = new bts().alV(bo.nullAsNil(paramad.Ht()));
    localbbv.wcf = new bts().alV(bo.nullAsNil(paramad.Hu()));
    localbbv.guN = paramad.dtS;
    localbbv.wbu = 561023;
    localbbv.wbv = paramad.field_type;
    localbbv.wFK = new bts().alV(bo.nullAsNil(paramad.field_conRemark));
    localbbv.wFL = new bts().alV(bo.nullAsNil(paramad.field_conRemarkPYShort));
    localbbv.wFM = new bts().alV(bo.nullAsNil(paramad.field_conRemarkPYFull));
    localbbv.wbA = paramad.dtX;
    localbbv.wGf = new bts().alV(bo.nullAsNil(paramad.field_domainList));
    localbbv.wbE = paramad.dua;
    localbbv.guR = paramad.dub;
    localbbv.guQ = bo.nullAsNil(paramad.signature);
    localbbv.guP = bo.nullAsNil(paramad.getCityCode());
    localbbv.guO = bo.nullAsNil(paramad.dsj());
    localbbv.wBV = bo.nullAsNil(paramad.dug);
    localbbv.wBX = paramad.field_weiboFlag;
    localbbv.wGb = 0;
    localbbv.vEF = new SKBuiltinBuffer_t();
    localbbv.guW = bo.nullAsNil(paramad.getCountryCode());
    ((j)g.K(j.class)).XL().c(new j.a(2, localbbv));
    AppMethodBeat.o(59821);
  }

  public static void v(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(59801);
    paramString = ((j)g.K(j.class)).XM().aoO(paramString);
    if ((paramString == null) || (bo.isNullOrNil(paramString.field_username)))
    {
      AppMethodBeat.o(59801);
      return;
    }
    if (paramBoolean)
      paramString.NQ();
    while (true)
    {
      t(paramString);
      AppMethodBeat.o(59801);
      break;
      paramString.NR();
    }
  }

  public static void w(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(59810);
    boolean bool;
    ad localad;
    if (!bo.isNullOrNil(paramString))
    {
      bool = true;
      Assert.assertTrue(bool);
      localad = ((j)g.K(j.class)).XM().aoO(paramString);
      if ((localad != null) && (!bo.isNullOrNil(localad.field_username)))
        break label65;
      AppMethodBeat.o(59810);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label65: localad.setType(localad.field_type | 0x800);
      if (((ad.aox(paramString)) || (mP(paramString))) && (fkO != null))
        fkO.oi(paramString);
      u(localad);
      if (paramBoolean)
        ((j)g.K(j.class)).XR().apf(paramString);
      AppMethodBeat.o(59810);
    }
  }

  public static boolean w(ad paramad)
  {
    if ((paramad.field_weiboFlag & 0x1) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static void x(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(59812);
    boolean bool;
    ad localad;
    if (!bo.isNullOrNil(paramString))
    {
      bool = true;
      Assert.assertTrue(bool);
      localad = ((j)g.K(j.class)).XM().aoO(paramString);
      if ((localad != null) && (!bo.isNullOrNil(localad.field_username)))
        break label65;
      AppMethodBeat.o(59812);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label65: localad.setType(localad.field_type & 0xFFFFF7FF);
      if (((ad.aox(paramString)) || (mP(paramString))) && (fkO != null))
        fkO.oj(paramString);
      u(localad);
      if (paramBoolean)
        ((j)g.K(j.class)).XR().apg(paramString);
      AppMethodBeat.o(59812);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.t
 * JD-Core Version:    0.6.2
 */