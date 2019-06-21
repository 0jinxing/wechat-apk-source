package com.tencent.mm.storage.emotion;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.g;
import com.tencent.mm.cd.g.a;
import com.tencent.mm.plugin.emoji.h.b;
import com.tencent.mm.protocal.protobuf.xx;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class d extends j<EmojiInfo>
  implements g.a
{
  public static final String[] fnj;
  private static int[] yaY;
  public com.tencent.mm.sdk.e.e bSd;

  static
  {
    AppMethodBeat.i(62845);
    fnj = new String[] { j.a(EmojiInfo.ccO, "EmojiInfo"), "CREATE INDEX IF NOT EXISTS emojiinfogrouptempindex  on EmojiInfo  (  groupId,temp )", "CREATE INDEX IF NOT EXISTS emojiinfogatalogindex  on EmojiInfo  (  catalog )" };
    yaY = new int[] { 2, 4, 8 };
    AppMethodBeat.o(62845);
  }

  public d(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, EmojiInfo.ccO, "EmojiInfo", null);
    this.bSd = parame;
  }

  private int Mx(int paramInt)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(62813);
    Object localObject1 = null;
    Object localObject2 = null;
    try
    {
      Cursor localCursor = this.bSd.a("select count(*) from EmojiInfo where groupId= ? and temp=?", new String[] { String.valueOf(paramInt), "0" }, 2);
      paramInt = j;
      if (localCursor != null)
      {
        paramInt = j;
        localObject2 = localCursor;
        localObject1 = localCursor;
        if (localCursor.moveToFirst())
        {
          localObject2 = localCursor;
          localObject1 = localCursor;
          paramInt = localCursor.getInt(0);
        }
      }
      j = paramInt;
      if (localCursor != null)
      {
        localCursor.close();
        j = paramInt;
      }
      AppMethodBeat.o(62813);
      return j;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject1 = localObject2;
        ab.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bo.l(localException) });
        localObject1 = localObject2;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localObject1 = localObject2;
        localStringBuilder.<init>("[countProductId]Count ProductId fail.");
        localObject1 = localObject2;
        ab.e("MicroMsg.emoji.EmojiInfoStorage", localException.getMessage());
        j = i;
        if (localObject2 != null)
        {
          localObject2.close();
          j = i;
        }
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(62813);
    }
  }

  private static List<EmojiInfo> a(InputStream[] paramArrayOfInputStream)
  {
    AppMethodBeat.i(62826);
    ArrayList localArrayList = new ArrayList();
    Object localObject = DocumentBuilderFactory.newInstance();
    label352: 
    while (true)
      try
      {
        DocumentBuilder localDocumentBuilder = ((DocumentBuilderFactory)localObject).newDocumentBuilder();
        int i = 0;
        if (i <= 0)
        {
          localObject = paramArrayOfInputStream[i];
          if (localObject != null)
          {
            NodeList localNodeList1 = localDocumentBuilder.parse((InputStream)localObject).getDocumentElement().getElementsByTagName("catalog");
            int j = 0;
            if (j < localNodeList1.getLength())
            {
              localObject = (Element)localNodeList1.item(j);
              int k = Integer.decode(((Element)localObject).getAttribute("id")).intValue();
              NodeList localNodeList2 = ((Element)localObject).getElementsByTagName("emoji");
              int m = 0;
              if (m < localNodeList2.getLength())
              {
                EmojiInfo localEmojiInfo = new com/tencent/mm/storage/emotion/EmojiInfo;
                com.tencent.mm.plugin.emoji.e.bjc();
                localEmojiInfo.<init>(com.tencent.mm.plugin.emoji.e.bjd());
                localObject = (Element)localNodeList2.item(m);
                localEmojiInfo.field_md5 = ((Element)localObject).getAttribute("md5");
                if (localEmojiInfo.cVD())
                {
                  localEmojiInfo.field_catalog = k;
                  localEmojiInfo.field_groupId = String.valueOf(k);
                  localEmojiInfo.field_name = ((Element)localObject).getAttribute("name");
                  localEmojiInfo.field_type = Integer.decode(((Element)localObject).getAttribute("type")).intValue();
                  localObject = ((Element)localObject).getFirstChild();
                  if ((localObject instanceof CharacterData))
                  {
                    localObject = ((CharacterData)localObject).getData();
                    if (localEmojiInfo.field_type != EmojiInfo.TYPE_TEXT)
                      break label352;
                    String str = new java/lang/String;
                    str.<init>(Base64.decode((String)localObject, 0));
                    localObject = str;
                    localEmojiInfo.field_content = ((String)localObject);
                    localArrayList.add(localEmojiInfo);
                  }
                }
                else
                {
                  m++;
                  continue;
                }
                localObject = "";
                continue;
              }
              j++;
              continue;
            }
          }
          i++;
        }
      }
      catch (Exception paramArrayOfInputStream)
      {
        ab.e("MicroMsg.emoji.EmojiInfoStorage", "parse xml error; " + paramArrayOfInputStream.getMessage());
        AppMethodBeat.o(62826);
        return localArrayList;
      }
  }

  private EmojiInfo c(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, String paramString4)
  {
    AppMethodBeat.i(62807);
    Object localObject;
    if ((paramString1 == null) || (paramString1.length() <= 0))
    {
      ab.f("MicroMsg.emoji.EmojiInfoStorage", "create assertion!, invalid md5");
      AppMethodBeat.o(62807);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      EmojiInfo localEmojiInfo = aqi(paramString1);
      localObject = localEmojiInfo;
      if (localEmojiInfo == null)
      {
        com.tencent.mm.plugin.emoji.e.bjc();
        localObject = new EmojiInfo(com.tencent.mm.plugin.emoji.e.bjd());
        ((EmojiInfo)localObject).field_catalog = paramInt1;
      }
      ((EmojiInfo)localObject).field_md5 = paramString1;
      ((EmojiInfo)localObject).field_svrid = paramString2;
      ((EmojiInfo)localObject).field_type = paramInt2;
      ((EmojiInfo)localObject).field_size = paramInt3;
      ((EmojiInfo)localObject).field_state = EmojiInfo.yar;
      ((EmojiInfo)localObject).field_reserved1 = null;
      ((EmojiInfo)localObject).field_reserved2 = null;
      ((EmojiInfo)localObject).field_app_id = paramString3;
      ((EmojiInfo)localObject).field_temp = 1;
      ((EmojiInfo)localObject).field_reserved4 = 0;
      if (!TextUtils.isEmpty(paramString4))
        ((EmojiInfo)localObject).field_groupId = paramString4;
      AppMethodBeat.o(62807);
    }
  }

  public final EmojiInfo E(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(62802);
    if ((paramEmojiInfo == null) || (bo.isNullOrNil(paramEmojiInfo.Aq())) || (paramEmojiInfo.Aq().length() <= 0))
    {
      ab.f("MicroMsg.emoji.EmojiInfoStorage", "create assertion!, invalid md5");
      AppMethodBeat.o(62802);
      paramEmojiInfo = null;
    }
    while (true)
    {
      return paramEmojiInfo;
      ab.i("MicroMsg.emoji.EmojiInfoStorage", "create: %s", new Object[] { paramEmojiInfo.field_md5 });
      if (F(paramEmojiInfo))
      {
        anF("create_emoji_info_notify");
        AppMethodBeat.o(62802);
      }
      else
      {
        AppMethodBeat.o(62802);
        paramEmojiInfo = null;
      }
    }
  }

  public final boolean F(EmojiInfo paramEmojiInfo)
  {
    boolean bool = true;
    AppMethodBeat.i(62808);
    if ((paramEmojiInfo == null) || (!paramEmojiInfo.cVD()))
    {
      ab.f("MicroMsg.emoji.EmojiInfoStorage", "insert assertion!, invalid emojiInfo");
      AppMethodBeat.o(62808);
      bool = false;
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.emoji.EmojiInfoStorage", "insert: %s", new Object[] { paramEmojiInfo.field_md5 });
      ContentValues localContentValues = paramEmojiInfo.Hl();
      long l = this.bSd.replace("EmojiInfo", "md5", localContentValues);
      ab.i("MicroMsg.emoji.EmojiInfoStorage", "insert: %s, %s", new Object[] { paramEmojiInfo.field_md5, Long.valueOf(l) });
      if (l != -1L)
        anF(paramEmojiInfo.Aq());
      if (l >= 0L)
      {
        AppMethodBeat.o(62808);
      }
      else
      {
        AppMethodBeat.o(62808);
        bool = false;
      }
    }
  }

  public final boolean G(EmojiInfo paramEmojiInfo)
  {
    boolean bool = true;
    AppMethodBeat.i(62809);
    if ((paramEmojiInfo == null) || (!paramEmojiInfo.cVD()))
    {
      ab.f("MicroMsg.emoji.EmojiInfoStorage", "insert assertion!, invalid emojiInfo");
      AppMethodBeat.o(62809);
      bool = false;
    }
    while (true)
    {
      return bool;
      int i = this.bSd.update("EmojiInfo", paramEmojiInfo.Hl(), "md5=?", new String[] { paramEmojiInfo.Aq() });
      if (i > 0)
      {
        anF(paramEmojiInfo.Aq());
        anF("event_update_emoji");
      }
      if (i > 0)
      {
        AppMethodBeat.o(62809);
      }
      else
      {
        AppMethodBeat.o(62809);
        bool = false;
      }
    }
  }

  public final boolean H(EmojiInfo paramEmojiInfo)
  {
    boolean bool = true;
    AppMethodBeat.i(62810);
    if ((paramEmojiInfo == null) || (!paramEmojiInfo.cVD()))
    {
      ab.f("MicroMsg.emoji.EmojiInfoStorage", "insert assertion!, invalid emojiInfo");
      AppMethodBeat.o(62810);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (this.bSd.update("EmojiInfo", paramEmojiInfo.Hl(), "md5=?", new String[] { paramEmojiInfo.Aq() }) > 0)
      {
        AppMethodBeat.o(62810);
      }
      else
      {
        AppMethodBeat.o(62810);
        bool = false;
      }
    }
  }

  public final List<EmojiInfo> Jg(String paramString)
  {
    AppMethodBeat.i(62828);
    ArrayList localArrayList = new ArrayList();
    Object localObject = null;
    String str = null;
    try
    {
      paramString = this.bSd.a("select * from EmojiInfo where groupId=? and temp=? order by idx asc", new String[] { paramString, "0" }, 2);
      if (paramString != null)
      {
        str = paramString;
        localObject = paramString;
        if (paramString.moveToFirst())
        {
          boolean bool;
          do
          {
            str = paramString;
            localObject = paramString;
            EmojiInfo localEmojiInfo = new com/tencent/mm/storage/emotion/EmojiInfo;
            str = paramString;
            localObject = paramString;
            com.tencent.mm.plugin.emoji.e.bjc();
            str = paramString;
            localObject = paramString;
            localEmojiInfo.<init>(com.tencent.mm.plugin.emoji.e.bjd());
            str = paramString;
            localObject = paramString;
            localEmojiInfo.d(paramString);
            str = paramString;
            localObject = paramString;
            localArrayList.add(localEmojiInfo);
            str = paramString;
            localObject = paramString;
            bool = paramString.moveToNext();
          }
          while (bool);
        }
      }
      if (paramString != null)
        paramString.close();
      AppMethodBeat.o(62828);
      return localArrayList;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        localObject = str;
        ab.w("MicroMsg.emoji.EmojiInfoStorage", "[getEmojiListByGroupId] Exception:%s", new Object[] { paramString.toString() });
        if (str != null)
          str.close();
      }
    }
    finally
    {
      if (localObject != null)
        ((Cursor)localObject).close();
      AppMethodBeat.o(62828);
    }
    throw paramString;
  }

  public final int Jp(String paramString)
  {
    AppMethodBeat.i(62814);
    long l = System.currentTimeMillis();
    Object localObject = null;
    String str = null;
    while (true)
    {
      try
      {
        paramString = this.bSd.a("select count(*) from EmojiInfo where groupId= ? and temp=?", new String[] { paramString, "0" }, 2);
        if (paramString == null)
          break label235;
        str = paramString;
        localObject = paramString;
        if (!paramString.moveToFirst())
          break label235;
        str = paramString;
        localObject = paramString;
        i = paramString.getInt(0);
        j = i;
        if (paramString != null)
        {
          paramString.close();
          j = i;
        }
        ab.d("MicroMsg.emoji.EmojiInfoStorage", "count product id use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        AppMethodBeat.o(62814);
        return j;
      }
      catch (Exception localException)
      {
        localObject = str;
        ab.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bo.l(localException) });
        localObject = str;
        paramString = new java/lang/StringBuilder;
        localObject = str;
        paramString.<init>("[countProductId]Count ProductId fail.");
        localObject = str;
        ab.e("MicroMsg.emoji.EmojiInfoStorage", localException.getMessage());
        if (str != null)
        {
          str.close();
          j = 0;
          continue;
        }
      }
      finally
      {
        if (localObject != null)
          ((Cursor)localObject).close();
        AppMethodBeat.o(62814);
      }
      int j = 0;
      continue;
      label235: int i = 0;
    }
  }

  public final List<String> MA(int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(62820);
    ArrayList localArrayList = new ArrayList();
    Object localObject4 = new StringBuilder();
    ((StringBuilder)localObject4).append(" select md5 from EmojiInfo");
    if (paramInt == 1)
      ((StringBuilder)localObject4).append(" where groupId = \"capture\" and captureStatus = 0");
    while (true)
    {
      ((StringBuilder)localObject4).append(" and state in (").append(EmojiInfo.yat);
      ((StringBuilder)localObject4).append(" , ").append(EmojiInfo.yau);
      ((StringBuilder)localObject4).append(" ) ");
      localObject4 = ((StringBuilder)localObject4).toString();
      try
      {
        localObject4 = this.bSd.a((String)localObject4, null, 2);
        if (localObject4 != null)
        {
          localObject2 = localObject4;
          localObject1 = localObject4;
          if (((Cursor)localObject4).moveToFirst())
          {
            boolean bool;
            do
            {
              localObject2 = localObject4;
              localObject1 = localObject4;
              localArrayList.add(((Cursor)localObject4).getString(0));
              localObject2 = localObject4;
              localObject1 = localObject4;
              bool = ((Cursor)localObject4).moveToNext();
            }
            while (bool);
          }
        }
        if (localObject4 != null)
          ((Cursor)localObject4).close();
        AppMethodBeat.o(62820);
        return localArrayList;
        ((StringBuilder)localObject4).append(" where catalog = ").append(EmojiInfo.yal);
      }
      catch (Exception localException)
      {
        while (true)
        {
          localObject1 = localObject2;
          ab.e("MicroMsg.emoji.EmojiInfoStorage", "get download custom emoji MD5 list failed :%s", new Object[] { bo.l(localException) });
          if (localObject2 != null)
            localObject2.close();
        }
      }
      finally
      {
        if (localObject1 != null)
          localObject1.close();
        AppMethodBeat.o(62820);
      }
    }
  }

  public final Cursor MB(int paramInt)
  {
    AppMethodBeat.i(62821);
    Cursor localCursor = this.bSd.query("EmojiInfo", null, "catalog=? and temp=?", new String[] { String.valueOf(paramInt), "0" }, null, null, null);
    AppMethodBeat.o(62821);
    return localCursor;
  }

  public final boolean MC(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(62824);
    if (this.bSd.delete("EmojiInfo", "catalog=?", new String[] { String.valueOf(paramInt) }) >= 0)
      AppMethodBeat.o(62824);
    while (true)
    {
      return bool;
      AppMethodBeat.o(62824);
      bool = false;
    }
  }

  public final List<String> MD(int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(62837);
    ArrayList localArrayList = new ArrayList();
    Object localObject4 = new StringBuilder();
    ((StringBuilder)localObject4).append(" select md5 from EmojiInfo");
    if (paramInt == 1)
      ((StringBuilder)localObject4).append(" where groupId = \"capture\"");
    while (true)
    {
      ((StringBuilder)localObject4).append(" and state = ").append(EmojiInfo.yau);
      try
      {
        localObject4 = this.bSd.a(((StringBuilder)localObject4).toString(), null, 2);
        if (localObject4 != null)
        {
          localObject2 = localObject4;
          localObject1 = localObject4;
          if (((Cursor)localObject4).moveToFirst())
          {
            boolean bool;
            do
            {
              localObject2 = localObject4;
              localObject1 = localObject4;
              localArrayList.add(((Cursor)localObject4).getString(0));
              localObject2 = localObject4;
              localObject1 = localObject4;
              bool = ((Cursor)localObject4).moveToNext();
            }
            while (bool);
          }
        }
        if (localObject4 != null)
          ((Cursor)localObject4).close();
        AppMethodBeat.o(62837);
        return localArrayList;
        ((StringBuilder)localObject4).append(" where catalog = ").append(EmojiInfo.yal);
      }
      catch (Exception localException)
      {
        while (true)
        {
          localObject1 = localObject2;
          ab.e("MicroMsg.emoji.EmojiInfoStorage", "get need to sync emoji MD5 list failed :%s", new Object[] { bo.l(localException) });
          if (localObject2 != null)
            localObject2.close();
        }
      }
      finally
      {
        if (localObject1 != null)
          localObject1.close();
        AppMethodBeat.o(62837);
      }
    }
  }

  public final List<EmojiInfo> My(int paramInt)
  {
    AppMethodBeat.i(62817);
    ArrayList localArrayList = new ArrayList();
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("select * from EmojiInfo where catalog = ").append(paramInt);
    ((StringBuilder)localObject).append(" and state != ").append(EmojiInfo.yau);
    ((StringBuilder)localObject).append(" order by reserved3 asc ");
    Cursor localCursor = this.bSd.rawQuery(((StringBuilder)localObject).toString(), null);
    if (localCursor != null)
    {
      if (localCursor.moveToFirst())
        do
        {
          localObject = new EmojiInfo();
          ((EmojiInfo)localObject).d(localCursor);
          localArrayList.add(localObject);
        }
        while (localCursor.moveToNext());
      localCursor.close();
    }
    AppMethodBeat.o(62817);
    return localArrayList;
  }

  public final List<String> Mz(int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(62819);
    ArrayList localArrayList = new ArrayList();
    Object localObject4 = new StringBuilder();
    ((StringBuilder)localObject4).append("select md5 from EmojiInfo");
    if (paramInt == 1)
      ((StringBuilder)localObject4).append(" where groupId = \"capture\" order by idx asc ");
    try
    {
      while (true)
      {
        localObject4 = this.bSd.a(((StringBuilder)localObject4).toString(), null, 2);
        if (localObject4 != null)
        {
          localObject2 = localObject4;
          localObject1 = localObject4;
          if (((Cursor)localObject4).moveToFirst())
          {
            boolean bool;
            do
            {
              localObject2 = localObject4;
              localObject1 = localObject4;
              localArrayList.add(((Cursor)localObject4).getString(0));
              localObject2 = localObject4;
              localObject1 = localObject4;
              bool = ((Cursor)localObject4).moveToNext();
            }
            while (bool);
          }
        }
        if (localObject4 != null)
          ((Cursor)localObject4).close();
        AppMethodBeat.o(62819);
        return localArrayList;
        ((StringBuilder)localObject4).append(" where catalog = ").append(EmojiGroupInfo.yae).append(" order by reserved3 asc ");
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject1 = localObject2;
        ab.e("MicroMsg.emoji.EmojiInfoStorage", "get download custom emoji MD5 list failed :%s", new Object[] { bo.l(localException) });
        if (localObject2 != null)
          localObject2.close();
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(62819);
    }
  }

  public final int a(g paramg)
  {
    this.bSd = paramg;
    return 0;
  }

  public final EmojiInfo a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, String paramString4)
  {
    AppMethodBeat.i(62804);
    paramString1 = b(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramString3, paramString4);
    AppMethodBeat.o(62804);
    return paramString1;
  }

  public final void a(Context paramContext, EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(62825);
    Object localObject;
    Context localContext;
    if ((paramEmojiInfo.field_catalog == EmojiInfo.yah) || (paramEmojiInfo.field_catalog == EmojiInfo.yak) || (paramEmojiInfo.field_catalog == EmojiInfo.yaj))
    {
      localObject = null;
      localContext = null;
    }
    while (true)
    {
      try
      {
        paramContext = EmojiInfo.bJ(paramContext, paramEmojiInfo.getName());
        if (paramContext == null)
          break label261;
        localContext = paramContext;
        localObject = paramContext;
        i = paramContext.available();
        j = i;
        if (paramContext != null);
        try
        {
          paramContext.close();
          j = i;
          if ((j != 0) && (j != paramEmojiInfo.field_size))
          {
            paramEmojiInfo.field_size = j;
            G(paramEmojiInfo);
          }
          AppMethodBeat.o(62825);
          return;
        }
        catch (IOException paramContext)
        {
          ab.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bo.l(paramContext) });
          j = i;
          continue;
        }
      }
      catch (IOException paramContext)
      {
        localObject = localContext;
        ab.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bo.l(paramContext) });
        if (localContext == null)
          break label255;
        try
        {
          localContext.close();
          j = 0;
        }
        catch (IOException paramContext)
        {
          ab.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bo.l(paramContext) });
          j = 0;
        }
        continue;
      }
      finally
      {
        if (localObject == null);
      }
      try
      {
        ((InputStream)localObject).close();
        AppMethodBeat.o(62825);
        throw paramContext;
      }
      catch (IOException paramEmojiInfo)
      {
        while (true)
          ab.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bo.l(paramEmojiInfo) });
      }
      int j = (int)com.tencent.mm.vfs.e.asZ(paramEmojiInfo.dve());
      continue;
      label255: j = 0;
      continue;
      label261: int i = 0;
    }
  }

  public final boolean aG(LinkedList<String> paramLinkedList)
  {
    boolean bool = false;
    AppMethodBeat.i(62838);
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      ab.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] updateNeedUploadEmojiList failed. list is null");
      AppMethodBeat.o(62838);
    }
    while (true)
    {
      return bool;
      com.tencent.mm.plugin.report.service.h.pYm.k(164L, 12L, 1L);
      ab.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] updateNeedUploadEmojiList list size :%d.", new Object[] { Integer.valueOf(paramLinkedList.size()) });
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("UPDATE");
      localStringBuilder.append(" EmojiInfo ");
      localStringBuilder.append(" SET ");
      localStringBuilder.append("needupload");
      localStringBuilder.append("=");
      localStringBuilder.append(EmojiInfo.yaA);
      localStringBuilder.append(" where ");
      localStringBuilder.append("md5");
      localStringBuilder.append(" IN (");
      for (int i = 0; i < paramLinkedList.size(); i++)
      {
        localStringBuilder.append("'" + (String)paramLinkedList.get(i) + "'");
        if (i < paramLinkedList.size() - 1)
          localStringBuilder.append(",");
      }
      localStringBuilder.append(")");
      ab.d("MicroMsg.emoji.EmojiInfoStorage", localStringBuilder.toString());
      bool = this.bSd.hY("EmojiInfo", localStringBuilder.toString());
      AppMethodBeat.o(62838);
    }
  }

  // ERROR //
  public final EmojiInfo aqi(String paramString)
  {
    // Byte code:
    //   0: ldc_w 588
    //   3: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: invokestatic 316	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   10: ifne +12 -> 22
    //   13: aload_1
    //   14: invokevirtual 264	java/lang/String:length	()I
    //   17: bipush 32
    //   19: if_icmpeq +29 -> 48
    //   22: ldc 87
    //   24: ldc_w 590
    //   27: iconst_1
    //   28: anewarray 91	java/lang/Object
    //   31: dup
    //   32: iconst_0
    //   33: aload_1
    //   34: aastore
    //   35: invokestatic 320	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   38: ldc_w 588
    //   41: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   44: aconst_null
    //   45: astore_2
    //   46: aload_2
    //   47: areturn
    //   48: aload_0
    //   49: getfield 55	com/tencent/mm/storage/emotion/d:bSd	Lcom/tencent/mm/sdk/e/e;
    //   52: ldc 32
    //   54: aconst_null
    //   55: ldc_w 355
    //   58: iconst_1
    //   59: anewarray 24	java/lang/String
    //   62: dup
    //   63: iconst_0
    //   64: aload_1
    //   65: aastore
    //   66: aconst_null
    //   67: aconst_null
    //   68: aconst_null
    //   69: iconst_2
    //   70: invokeinterface 593 9 0
    //   75: astore_3
    //   76: aload_3
    //   77: ifnull +147 -> 224
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: invokeinterface 79 1 0
    //   88: ifeq +136 -> 224
    //   91: aload_3
    //   92: astore_2
    //   93: new 26	com/tencent/mm/storage/emotion/EmojiInfo
    //   96: astore_1
    //   97: aload_3
    //   98: astore_2
    //   99: invokestatic 193	com/tencent/mm/plugin/emoji/e:bjc	()Lcom/tencent/mm/plugin/emoji/e;
    //   102: pop
    //   103: aload_3
    //   104: astore_2
    //   105: aload_1
    //   106: invokestatic 196	com/tencent/mm/plugin/emoji/e:bjd	()Ljava/lang/String;
    //   109: invokespecial 197	com/tencent/mm/storage/emotion/EmojiInfo:<init>	(Ljava/lang/String;)V
    //   112: aload_3
    //   113: astore_2
    //   114: aload_1
    //   115: aload_3
    //   116: invokevirtual 372	com/tencent/mm/storage/emotion/EmojiInfo:d	(Landroid/database/Cursor;)V
    //   119: aload_1
    //   120: astore_2
    //   121: aload_3
    //   122: ifnull +11 -> 133
    //   125: aload_3
    //   126: invokeinterface 85 1 0
    //   131: aload_1
    //   132: astore_2
    //   133: ldc_w 588
    //   136: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   139: goto -93 -> 46
    //   142: astore 4
    //   144: aconst_null
    //   145: astore_3
    //   146: aconst_null
    //   147: astore_1
    //   148: aload_3
    //   149: astore_2
    //   150: ldc 87
    //   152: ldc_w 595
    //   155: iconst_1
    //   156: anewarray 91	java/lang/Object
    //   159: dup
    //   160: iconst_0
    //   161: aload 4
    //   163: invokevirtual 378	java/lang/Exception:toString	()Ljava/lang/String;
    //   166: aastore
    //   167: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   170: aload_1
    //   171: astore_2
    //   172: aload_3
    //   173: ifnull -40 -> 133
    //   176: aload_3
    //   177: invokeinterface 85 1 0
    //   182: aload_1
    //   183: astore_2
    //   184: goto -51 -> 133
    //   187: astore_1
    //   188: aconst_null
    //   189: astore_2
    //   190: aload_2
    //   191: ifnull +9 -> 200
    //   194: aload_2
    //   195: invokeinterface 85 1 0
    //   200: ldc_w 588
    //   203: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   206: aload_1
    //   207: athrow
    //   208: astore_1
    //   209: goto -19 -> 190
    //   212: astore 4
    //   214: aconst_null
    //   215: astore_1
    //   216: goto -68 -> 148
    //   219: astore 4
    //   221: goto -73 -> 148
    //   224: aconst_null
    //   225: astore_1
    //   226: goto -107 -> 119
    //
    // Exception table:
    //   from	to	target	type
    //   48	76	142	java/lang/Exception
    //   48	76	187	finally
    //   82	91	208	finally
    //   93	97	208	finally
    //   99	103	208	finally
    //   105	112	208	finally
    //   114	119	208	finally
    //   150	170	208	finally
    //   82	91	212	java/lang/Exception
    //   93	97	212	java/lang/Exception
    //   99	103	212	java/lang/Exception
    //   105	112	212	java/lang/Exception
    //   114	119	219	java/lang/Exception
  }

  public final boolean aqj(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(62822);
    if ((paramString == null) || (paramString.length() != 32))
    {
      ab.f("MicroMsg.emoji.EmojiInfoStorage", "delete by md5 assertion");
      AppMethodBeat.o(62822);
      bool = false;
    }
    while (true)
    {
      return bool;
      int i = this.bSd.delete("EmojiInfo", "md5=?", new String[] { String.valueOf(paramString) });
      if (i > 0)
        anF("event_update_emoji");
      if (i > 0)
      {
        AppMethodBeat.o(62822);
      }
      else
      {
        AppMethodBeat.o(62822);
        bool = false;
      }
    }
  }

  // ERROR //
  public final EmojiInfo aqk(String paramString)
  {
    // Byte code:
    //   0: ldc_w 604
    //   3: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 55	com/tencent/mm/storage/emotion/d:bSd	Lcom/tencent/mm/sdk/e/e;
    //   10: ldc_w 606
    //   13: iconst_2
    //   14: anewarray 24	java/lang/String
    //   17: dup
    //   18: iconst_0
    //   19: aload_1
    //   20: aastore
    //   21: dup
    //   22: iconst_1
    //   23: ldc 68
    //   25: aastore
    //   26: iconst_2
    //   27: invokeinterface 73 4 0
    //   32: astore_2
    //   33: aload_2
    //   34: astore_3
    //   35: aload_2
    //   36: invokeinterface 79 1 0
    //   41: ifeq +150 -> 191
    //   44: aload_2
    //   45: astore_3
    //   46: new 26	com/tencent/mm/storage/emotion/EmojiInfo
    //   49: astore_1
    //   50: aload_2
    //   51: astore_3
    //   52: invokestatic 193	com/tencent/mm/plugin/emoji/e:bjc	()Lcom/tencent/mm/plugin/emoji/e;
    //   55: pop
    //   56: aload_2
    //   57: astore_3
    //   58: aload_1
    //   59: invokestatic 196	com/tencent/mm/plugin/emoji/e:bjd	()Ljava/lang/String;
    //   62: invokespecial 197	com/tencent/mm/storage/emotion/EmojiInfo:<init>	(Ljava/lang/String;)V
    //   65: aload_2
    //   66: astore_3
    //   67: aload_1
    //   68: aload_2
    //   69: invokevirtual 372	com/tencent/mm/storage/emotion/EmojiInfo:d	(Landroid/database/Cursor;)V
    //   72: aload_1
    //   73: astore_3
    //   74: aload_2
    //   75: ifnull +11 -> 86
    //   78: aload_2
    //   79: invokeinterface 85 1 0
    //   84: aload_1
    //   85: astore_3
    //   86: ldc_w 604
    //   89: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   92: aload_3
    //   93: areturn
    //   94: astore 4
    //   96: aconst_null
    //   97: astore_2
    //   98: aconst_null
    //   99: astore_1
    //   100: aload_2
    //   101: astore_3
    //   102: new 105	java/lang/StringBuilder
    //   105: astore 5
    //   107: aload_2
    //   108: astore_3
    //   109: aload 5
    //   111: ldc_w 608
    //   114: invokespecial 110	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   117: aload_2
    //   118: astore_3
    //   119: ldc 87
    //   121: aload 5
    //   123: aload 4
    //   125: invokevirtual 114	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   128: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   134: invokestatic 124	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   137: aload_1
    //   138: astore_3
    //   139: aload_2
    //   140: ifnull -54 -> 86
    //   143: aload_2
    //   144: invokeinterface 85 1 0
    //   149: aload_1
    //   150: astore_3
    //   151: goto -65 -> 86
    //   154: astore_1
    //   155: aconst_null
    //   156: astore_3
    //   157: aload_3
    //   158: ifnull +9 -> 167
    //   161: aload_3
    //   162: invokeinterface 85 1 0
    //   167: ldc_w 604
    //   170: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   173: aload_1
    //   174: athrow
    //   175: astore_1
    //   176: goto -19 -> 157
    //   179: astore 4
    //   181: aconst_null
    //   182: astore_1
    //   183: goto -83 -> 100
    //   186: astore 4
    //   188: goto -88 -> 100
    //   191: aconst_null
    //   192: astore_1
    //   193: goto -121 -> 72
    //
    // Exception table:
    //   from	to	target	type
    //   6	33	94	java/lang/Exception
    //   6	33	154	finally
    //   35	44	175	finally
    //   46	50	175	finally
    //   52	56	175	finally
    //   58	65	175	finally
    //   67	72	175	finally
    //   102	107	175	finally
    //   109	117	175	finally
    //   119	137	175	finally
    //   35	44	179	java/lang/Exception
    //   46	50	179	java/lang/Exception
    //   52	56	179	java/lang/Exception
    //   58	65	179	java/lang/Exception
    //   67	72	186	java/lang/Exception
  }

  public final boolean aql(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(62834);
    Object localObject1 = null;
    Object localObject2 = null;
    try
    {
      Cursor localCursor = this.bSd.a("select * from EmojiInfo where md5=?", new String[] { paramString }, 2);
      boolean bool3 = bool2;
      if (localCursor != null)
      {
        localObject2 = localCursor;
        localObject1 = localCursor;
        boolean bool4 = localCursor.moveToFirst();
        bool3 = bool2;
        if (bool4)
          bool3 = true;
      }
      bool2 = bool3;
      if (localCursor != null)
      {
        localCursor.close();
        bool2 = bool3;
      }
      AppMethodBeat.o(62834);
      return bool2;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject1 = localObject2;
        ab.e("MicroMsg.emoji.EmojiInfoStorage", "get judge is Exist EmojiInfo fail. md5 id is %s, err: %s", new Object[] { paramString, localException.getMessage() });
        bool2 = bool1;
        if (localObject2 != null)
        {
          localObject2.close();
          bool2 = bool1;
        }
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(62834);
    }
    throw paramString;
  }

  public final boolean aqm(String paramString)
  {
    AppMethodBeat.i(62835);
    if (!TextUtils.isEmpty(paramString))
      paramString = "groupId = '" + paramString + "'";
    while (true)
    {
      try
      {
        if (this.bSd.delete("EmojiInfo", paramString, null) >= 0)
        {
          bool = true;
          AppMethodBeat.o(62835);
          return bool;
        }
        AppMethodBeat.o(62835);
        bool = false;
        continue;
      }
      catch (Exception paramString)
      {
        ab.i("MicroMsg.emoji.EmojiInfoStorage", "Delete By ProductId fail." + paramString.getMessage());
      }
      AppMethodBeat.o(62835);
      boolean bool = false;
    }
  }

  public final EmojiInfo b(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, String paramString4)
  {
    AppMethodBeat.i(62806);
    if ((paramString1 == null) || (paramString1.length() <= 0))
    {
      ab.f("MicroMsg.emoji.EmojiInfoStorage", "create assertion!, invalid md5");
      AppMethodBeat.o(62806);
      paramString1 = null;
    }
    while (true)
    {
      return paramString1;
      paramString1 = c(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramString3, paramString4);
      paramString1.field_state = EmojiInfo.yat;
      if (F(paramString1))
      {
        anF("create_emoji_info_notify");
        AppMethodBeat.o(62806);
      }
      else
      {
        AppMethodBeat.o(62806);
        paramString1 = null;
      }
    }
  }

  public final EmojiInfo d(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3)
  {
    AppMethodBeat.i(62803);
    paramString1 = b(paramString1, paramString2, paramInt1, paramInt2, paramInt3, null, paramString3);
    AppMethodBeat.o(62803);
    return paramString1;
  }

  public final ArrayList<String> dvh()
  {
    AppMethodBeat.i(62839);
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = null;
    Object localObject2 = null;
    int i = EmojiInfo.yaA;
    int j = EmojiGroupInfo.yae;
    try
    {
      Cursor localCursor = this.bSd.a("select md5 from EmojiInfo where needupload=? and catalog=?", new String[] { String.valueOf(i), String.valueOf(j) }, 2);
      if (localCursor != null)
      {
        localObject2 = localCursor;
        localObject1 = localCursor;
        if (localCursor.moveToFirst())
        {
          boolean bool;
          do
          {
            localObject2 = localCursor;
            localObject1 = localCursor;
            localArrayList.add(localCursor.getString(0));
            localObject2 = localCursor;
            localObject1 = localCursor;
            bool = localCursor.moveToNext();
          }
          while (bool);
        }
      }
      return localArrayList;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject1 = localObject2;
        ab.e("MicroMsg.emoji.EmojiInfoStorage", "get need upload emoji MD5 list failed :%s", new Object[] { bo.l(localException) });
        if (localObject2 != null)
          localObject2.close();
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(62839);
    }
  }

  public final int dvi()
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(62840);
    Object localObject1 = null;
    Object localObject2 = null;
    int k = EmojiGroupInfo.yae;
    try
    {
      Cursor localCursor = this.bSd.a("select reserved3 from EmojiInfo where catalog=? order by reserved3 desc limit 1", new String[] { String.valueOf(k) }, 2);
      k = j;
      if (localCursor != null)
      {
        k = j;
        localObject2 = localCursor;
        localObject1 = localCursor;
        if (localCursor.moveToFirst())
        {
          localObject2 = localCursor;
          localObject1 = localCursor;
          k = localCursor.getInt(0);
        }
      }
      j = k;
      if (localCursor != null)
      {
        localCursor.close();
        j = k;
      }
      AppMethodBeat.o(62840);
      return j;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject1 = localObject2;
        ab.e("MicroMsg.emoji.EmojiInfoStorage", "getCustomEmojiMaxIndex :%s", new Object[] { bo.l(localException) });
        j = i;
        if (localObject2 != null)
        {
          localObject2.close();
          j = i;
        }
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(62840);
    }
  }

  // ERROR //
  public final ArrayList<EmojiInfo> dvj()
  {
    // Byte code:
    //   0: ldc_w 644
    //   3: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: getstatic 480	com/tencent/mm/storage/emotion/EmojiGroupInfo:yae	I
    //   9: istore_1
    //   10: getstatic 647	com/tencent/mm/storage/emotion/EmojiGroupInfo:yaf	I
    //   13: istore_2
    //   14: aload_0
    //   15: getfield 55	com/tencent/mm/storage/emotion/d:bSd	Lcom/tencent/mm/sdk/e/e;
    //   18: ldc_w 649
    //   21: iconst_2
    //   22: anewarray 24	java/lang/String
    //   25: dup
    //   26: iconst_0
    //   27: iload_1
    //   28: invokestatic 66	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   31: aastore
    //   32: dup
    //   33: iconst_1
    //   34: iload_2
    //   35: invokestatic 66	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   38: aastore
    //   39: iconst_2
    //   40: invokeinterface 73 4 0
    //   45: astore_3
    //   46: aload_3
    //   47: ifnull +124 -> 171
    //   50: aload_3
    //   51: astore 4
    //   53: aload_3
    //   54: invokeinterface 79 1 0
    //   59: ifeq +112 -> 171
    //   62: aload_3
    //   63: astore 4
    //   65: new 128	java/util/ArrayList
    //   68: astore 5
    //   70: aload_3
    //   71: astore 4
    //   73: aload 5
    //   75: invokespecial 130	java/util/ArrayList:<init>	()V
    //   78: aload_3
    //   79: astore 4
    //   81: new 26	com/tencent/mm/storage/emotion/EmojiInfo
    //   84: astore 6
    //   86: aload_3
    //   87: astore 4
    //   89: aload 6
    //   91: invokespecial 468	com/tencent/mm/storage/emotion/EmojiInfo:<init>	()V
    //   94: aload_3
    //   95: astore 4
    //   97: aload 6
    //   99: aload_3
    //   100: invokevirtual 372	com/tencent/mm/storage/emotion/EmojiInfo:d	(Landroid/database/Cursor;)V
    //   103: aload_3
    //   104: astore 4
    //   106: aload 6
    //   108: getfield 300	com/tencent/mm/storage/emotion/EmojiInfo:field_reserved4	I
    //   111: getstatic 652	com/tencent/mm/storage/emotion/EmojiInfo:yaB	I
    //   114: iand
    //   115: getstatic 652	com/tencent/mm/storage/emotion/EmojiInfo:yaB	I
    //   118: if_icmpeq +14 -> 132
    //   121: aload_3
    //   122: astore 4
    //   124: aload 5
    //   126: aload 6
    //   128: invokevirtual 633	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   131: pop
    //   132: aload_3
    //   133: astore 4
    //   135: aload_3
    //   136: invokeinterface 375 1 0
    //   141: istore 7
    //   143: iload 7
    //   145: ifne -67 -> 78
    //   148: aload_3
    //   149: ifnull +9 -> 158
    //   152: aload_3
    //   153: invokeinterface 85 1 0
    //   158: ldc_w 644
    //   161: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   164: aload 5
    //   166: astore 4
    //   168: aload 4
    //   170: areturn
    //   171: aload_3
    //   172: ifnull +9 -> 181
    //   175: aload_3
    //   176: invokeinterface 85 1 0
    //   181: ldc_w 644
    //   184: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   187: aconst_null
    //   188: astore 4
    //   190: goto -22 -> 168
    //   193: astore 5
    //   195: aconst_null
    //   196: astore_3
    //   197: aload_3
    //   198: astore 4
    //   200: ldc 87
    //   202: ldc_w 654
    //   205: iconst_1
    //   206: anewarray 91	java/lang/Object
    //   209: dup
    //   210: iconst_0
    //   211: aload 5
    //   213: invokestatic 97	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   216: aastore
    //   217: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   220: aload_3
    //   221: ifnull -40 -> 181
    //   224: aload_3
    //   225: invokeinterface 85 1 0
    //   230: goto -49 -> 181
    //   233: astore_3
    //   234: aconst_null
    //   235: astore 4
    //   237: aload 4
    //   239: ifnull +10 -> 249
    //   242: aload 4
    //   244: invokeinterface 85 1 0
    //   249: ldc_w 644
    //   252: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   255: aload_3
    //   256: athrow
    //   257: astore_3
    //   258: goto -21 -> 237
    //   261: astore 5
    //   263: goto -66 -> 197
    //
    // Exception table:
    //   from	to	target	type
    //   14	46	193	java/lang/Exception
    //   14	46	233	finally
    //   53	62	257	finally
    //   65	70	257	finally
    //   73	78	257	finally
    //   81	86	257	finally
    //   89	94	257	finally
    //   97	103	257	finally
    //   106	121	257	finally
    //   124	132	257	finally
    //   135	143	257	finally
    //   200	220	257	finally
    //   53	62	261	java/lang/Exception
    //   65	70	261	java/lang/Exception
    //   73	78	261	java/lang/Exception
    //   81	86	261	java/lang/Exception
    //   89	94	261	java/lang/Exception
    //   97	103	261	java/lang/Exception
    //   106	121	261	java/lang/Exception
    //   124	132	261	java/lang/Exception
    //   135	143	261	java/lang/Exception
  }

  public final EmojiInfo e(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3)
  {
    AppMethodBeat.i(62805);
    paramString1 = b(paramString1, paramString2, paramInt1, paramInt2, paramInt3, null, paramString3);
    AppMethodBeat.o(62805);
    return paramString1;
  }

  public final boolean eJ(List<String> paramList)
  {
    boolean bool = false;
    AppMethodBeat.i(62830);
    if ((paramList == null) || (paramList.size() <= 0))
      AppMethodBeat.o(62830);
    while (true)
    {
      return bool;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("UPDATE");
      localStringBuilder.append(" EmojiInfo ");
      localStringBuilder.append(" SET ");
      localStringBuilder.append("catalog");
      localStringBuilder.append("=");
      localStringBuilder.append(EmojiInfo.yaf);
      localStringBuilder.append(",");
      localStringBuilder.append("source");
      localStringBuilder.append("=");
      localStringBuilder.append(EmojiInfo.yax);
      localStringBuilder.append(",");
      localStringBuilder.append("needupload");
      localStringBuilder.append("=");
      localStringBuilder.append(EmojiInfo.yaz);
      localStringBuilder.append(" where ");
      localStringBuilder.append("md5");
      localStringBuilder.append(" IN (");
      for (int i = 0; i < paramList.size(); i++)
      {
        localStringBuilder.append("'" + (String)paramList.get(i) + "'");
        if (i < paramList.size() - 1)
          localStringBuilder.append(",");
      }
      localStringBuilder.append(")");
      ab.d("MicroMsg.emoji.EmojiInfoStorage", localStringBuilder.toString());
      if (this.bSd.hY("EmojiInfo", localStringBuilder.toString()))
        anF("delete_emoji_info_notify");
      bool = true;
      AppMethodBeat.o(62830);
    }
  }

  public final boolean eK(List<String> paramList)
  {
    boolean bool = false;
    AppMethodBeat.i(62831);
    if ((paramList == null) || (paramList.size() <= 0))
      AppMethodBeat.o(62831);
    while (true)
    {
      return bool;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("UPDATE");
      localStringBuilder.append(" EmojiInfo ");
      localStringBuilder.append(" SET ");
      localStringBuilder.append("groupId");
      localStringBuilder.append("=");
      localStringBuilder.append("\"\"");
      localStringBuilder.append(" where ");
      localStringBuilder.append("md5");
      localStringBuilder.append(" IN (");
      for (int i = 0; i < paramList.size(); i++)
      {
        localStringBuilder.append("'" + (String)paramList.get(i) + "'");
        if (i < paramList.size() - 1)
          localStringBuilder.append(",");
      }
      localStringBuilder.append(")");
      ab.d("MicroMsg.emoji.EmojiInfoStorage", localStringBuilder.toString());
      if (this.bSd.hY("EmojiInfo", localStringBuilder.toString()))
        anF("delete_emoji_info_notify");
      bool = true;
      AppMethodBeat.o(62831);
    }
  }

  public final boolean eL(List<xx> paramList)
  {
    boolean bool = false;
    AppMethodBeat.i(62843);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      ab.i("MicroMsg.emoji.EmojiInfoStorage", "updateEmojiURL failed. empty list");
      AppMethodBeat.o(62843);
      return bool;
    }
    ab.i("MicroMsg.emoji.EmojiInfoStorage", "updateEmojiURL size:%d", new Object[] { Integer.valueOf(paramList.size()) });
    com.tencent.mm.cd.h localh = null;
    long l;
    if ((this.bSd instanceof com.tencent.mm.cd.h))
    {
      localh = (com.tencent.mm.cd.h)this.bSd;
      l = localh.iV(Thread.currentThread().getId());
      ab.i("MicroMsg.emoji.EmojiInfoStorage", "surround updateEmojiURL in a transaction, ticket = %d", new Object[] { Long.valueOf(l) });
    }
    while (true)
    {
      for (int i = 0; i < paramList.size(); i++)
      {
        xx localxx = (xx)paramList.get(i);
        EmojiInfo localEmojiInfo1 = aqi(localxx.Md5);
        EmojiInfo localEmojiInfo2 = localEmojiInfo1;
        if (localEmojiInfo1 == null)
        {
          localEmojiInfo2 = new EmojiInfo();
          localEmojiInfo2.field_md5 = localxx.Md5;
          localEmojiInfo2.field_catalog = EmojiInfo.yaf;
          ab.i("MicroMsg.emoji.EmojiInfoStorage", "new emoji as received when updateEmoji url");
        }
        b.a(localxx, localEmojiInfo2);
        G(localEmojiInfo2);
      }
      if (localh != null)
      {
        localh.mB(l);
        ab.i("MicroMsg.emoji.EmojiInfoStorage", "end updateList transaction");
      }
      AppMethodBeat.o(62843);
      bool = true;
      break;
      l = -1L;
    }
  }

  // ERROR //
  public final String getKey()
  {
    // Byte code:
    //   0: ldc_w 725
    //   3: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 55	com/tencent/mm/storage/emotion/d:bSd	Lcom/tencent/mm/sdk/e/e;
    //   10: ldc_w 727
    //   13: iconst_1
    //   14: anewarray 24	java/lang/String
    //   17: dup
    //   18: iconst_0
    //   19: ldc_w 729
    //   22: aastore
    //   23: iconst_2
    //   24: invokeinterface 73 4 0
    //   29: astore_1
    //   30: aload_1
    //   31: ifnull +80 -> 111
    //   34: aload_1
    //   35: astore_2
    //   36: aload_1
    //   37: invokeinterface 79 1 0
    //   42: ifeq +69 -> 111
    //   45: aload_1
    //   46: astore_2
    //   47: aload_1
    //   48: iconst_0
    //   49: invokeinterface 421 2 0
    //   54: astore_3
    //   55: aload_1
    //   56: astore_2
    //   57: new 105	java/lang/StringBuilder
    //   60: astore 4
    //   62: aload_1
    //   63: astore_2
    //   64: aload 4
    //   66: ldc_w 731
    //   69: invokespecial 110	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   72: aload_1
    //   73: astore_2
    //   74: ldc 87
    //   76: aload 4
    //   78: aload_3
    //   79: invokestatic 734	com/tencent/mm/sdk/platformtools/bo:anv	(Ljava/lang/String;)Ljava/lang/String;
    //   82: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   88: invokestatic 534	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   91: aload_1
    //   92: ifnull +9 -> 101
    //   95: aload_1
    //   96: invokeinterface 85 1 0
    //   101: ldc_w 725
    //   104: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   107: aload_3
    //   108: astore_2
    //   109: aload_2
    //   110: areturn
    //   111: aload_1
    //   112: ifnull +9 -> 121
    //   115: aload_1
    //   116: invokeinterface 85 1 0
    //   121: invokestatic 740	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   124: invokestatic 744	com/tencent/mm/sdk/platformtools/bo:gN	(Landroid/content/Context;)Ljava/lang/String;
    //   127: astore_2
    //   128: aload_2
    //   129: invokestatic 316	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   132: ifne +133 -> 265
    //   135: aload_2
    //   136: invokevirtual 748	java/lang/String:getBytes	()[B
    //   139: invokestatic 754	com/tencent/mm/a/g:x	([B)Ljava/lang/String;
    //   142: astore_2
    //   143: ldc 87
    //   145: new 105	java/lang/StringBuilder
    //   148: dup
    //   149: ldc_w 756
    //   152: invokespecial 110	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   155: aload_2
    //   156: invokestatic 734	com/tencent/mm/sdk/platformtools/bo:anv	(Ljava/lang/String;)Ljava/lang/String;
    //   159: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   165: invokestatic 534	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   168: new 26	com/tencent/mm/storage/emotion/EmojiInfo
    //   171: dup
    //   172: invokespecial 468	com/tencent/mm/storage/emotion/EmojiInfo:<init>	()V
    //   175: astore_1
    //   176: aload_1
    //   177: aload_2
    //   178: putfield 203	com/tencent/mm/storage/emotion/EmojiInfo:field_md5	Ljava/lang/String;
    //   181: aload_1
    //   182: sipush 153
    //   185: putfield 210	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   188: aload_0
    //   189: aload_1
    //   190: invokevirtual 324	com/tencent/mm/storage/emotion/d:F	(Lcom/tencent/mm/storage/emotion/EmojiInfo;)Z
    //   193: ifeq +85 -> 278
    //   196: ldc_w 725
    //   199: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   202: goto -93 -> 109
    //   205: astore_3
    //   206: aconst_null
    //   207: astore_1
    //   208: aload_1
    //   209: astore_2
    //   210: ldc 87
    //   212: ldc_w 758
    //   215: iconst_1
    //   216: anewarray 91	java/lang/Object
    //   219: dup
    //   220: iconst_0
    //   221: aload_3
    //   222: invokestatic 97	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   225: aastore
    //   226: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   229: aload_1
    //   230: ifnull -109 -> 121
    //   233: aload_1
    //   234: invokeinterface 85 1 0
    //   239: goto -118 -> 121
    //   242: astore_2
    //   243: aconst_null
    //   244: astore_3
    //   245: aload_2
    //   246: astore_1
    //   247: aload_3
    //   248: ifnull +9 -> 257
    //   251: aload_3
    //   252: invokeinterface 85 1 0
    //   257: ldc_w 725
    //   260: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   263: aload_1
    //   264: athrow
    //   265: ldc_w 760
    //   268: invokevirtual 748	java/lang/String:getBytes	()[B
    //   271: invokestatic 754	com/tencent/mm/a/g:x	([B)Ljava/lang/String;
    //   274: astore_2
    //   275: goto -132 -> 143
    //   278: ldc_w 725
    //   281: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   284: aconst_null
    //   285: astore_2
    //   286: goto -177 -> 109
    //   289: astore_1
    //   290: aload_2
    //   291: astore_3
    //   292: goto -45 -> 247
    //   295: astore_3
    //   296: goto -88 -> 208
    //
    // Exception table:
    //   from	to	target	type
    //   6	30	205	java/lang/Exception
    //   6	30	242	finally
    //   36	45	289	finally
    //   47	55	289	finally
    //   57	62	289	finally
    //   64	72	289	finally
    //   74	91	289	finally
    //   210	229	289	finally
    //   36	45	295	java/lang/Exception
    //   47	55	295	java/lang/Exception
    //   57	62	295	java/lang/Exception
    //   64	72	295	java/lang/Exception
    //   74	91	295	java/lang/Exception
  }

  public final String getTableName()
  {
    return "EmojiInfo";
  }

  // ERROR //
  public final boolean hi(Context paramContext)
  {
    // Byte code:
    //   0: ldc_w 764
    //   3: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 87
    //   8: ldc_w 766
    //   11: invokestatic 534	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   14: aload_0
    //   15: ldc_w 768
    //   18: invokevirtual 273	com/tencent/mm/storage/emotion/d:aqi	(Ljava/lang/String;)Lcom/tencent/mm/storage/emotion/EmojiInfo;
    //   21: astore_2
    //   22: aload_0
    //   23: ldc_w 770
    //   26: invokevirtual 273	com/tencent/mm/storage/emotion/d:aqi	(Ljava/lang/String;)Lcom/tencent/mm/storage/emotion/EmojiInfo;
    //   29: astore_3
    //   30: aload_0
    //   31: getstatic 773	com/tencent/mm/storage/emotion/EmojiInfo:yai	I
    //   34: invokespecial 775	com/tencent/mm/storage/emotion/d:Mx	(I)I
    //   37: istore 4
    //   39: ldc 87
    //   41: ldc_w 777
    //   44: iconst_1
    //   45: anewarray 91	java/lang/Object
    //   48: dup
    //   49: iconst_0
    //   50: iload 4
    //   52: invokestatic 553	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   55: aastore
    //   56: invokestatic 320	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   59: aload_2
    //   60: ifnonnull +23 -> 83
    //   63: aload_3
    //   64: ifnull +13 -> 77
    //   67: aload_3
    //   68: invokevirtual 780	com/tencent/mm/storage/emotion/EmojiInfo:getContent	()Ljava/lang/String;
    //   71: invokevirtual 264	java/lang/String:length	()I
    //   74: ifeq +9 -> 83
    //   77: iload 4
    //   79: iconst_2
    //   80: if_icmpgt +35 -> 115
    //   83: ldc 87
    //   85: ldc_w 782
    //   88: invokestatic 534	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   91: aload_0
    //   92: getstatic 492	com/tencent/mm/storage/emotion/EmojiInfo:yah	I
    //   95: invokevirtual 784	com/tencent/mm/storage/emotion/d:MC	(I)Z
    //   98: pop
    //   99: aload_0
    //   100: getstatic 495	com/tencent/mm/storage/emotion/EmojiInfo:yak	I
    //   103: invokevirtual 784	com/tencent/mm/storage/emotion/d:MC	(I)Z
    //   106: pop
    //   107: aload_0
    //   108: getstatic 498	com/tencent/mm/storage/emotion/EmojiInfo:yaj	I
    //   111: invokevirtual 784	com/tencent/mm/storage/emotion/d:MC	(I)Z
    //   114: pop
    //   115: aload_0
    //   116: ldc_w 786
    //   119: invokevirtual 273	com/tencent/mm/storage/emotion/d:aqi	(Ljava/lang/String;)Lcom/tencent/mm/storage/emotion/EmojiInfo;
    //   122: astore_2
    //   123: aload_2
    //   124: ifnull +45 -> 169
    //   127: aload_2
    //   128: getfield 210	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   131: getstatic 492	com/tencent/mm/storage/emotion/EmojiInfo:yah	I
    //   134: if_icmpne +35 -> 169
    //   137: ldc 87
    //   139: ldc_w 788
    //   142: invokestatic 534	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   145: aload_0
    //   146: getstatic 492	com/tencent/mm/storage/emotion/EmojiInfo:yah	I
    //   149: invokevirtual 784	com/tencent/mm/storage/emotion/d:MC	(I)Z
    //   152: pop
    //   153: aload_0
    //   154: getstatic 495	com/tencent/mm/storage/emotion/EmojiInfo:yak	I
    //   157: invokevirtual 784	com/tencent/mm/storage/emotion/d:MC	(I)Z
    //   160: pop
    //   161: aload_0
    //   162: getstatic 498	com/tencent/mm/storage/emotion/EmojiInfo:yaj	I
    //   165: invokevirtual 784	com/tencent/mm/storage/emotion/d:MC	(I)Z
    //   168: pop
    //   169: aload_1
    //   170: ldc_w 790
    //   173: invokestatic 505	com/tencent/mm/storage/emotion/EmojiInfo:bJ	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   176: astore_2
    //   177: aload_2
    //   178: ifnull +35 -> 213
    //   181: ldc 87
    //   183: ldc_w 792
    //   186: invokestatic 534	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   189: aload_0
    //   190: getstatic 492	com/tencent/mm/storage/emotion/EmojiInfo:yah	I
    //   193: invokevirtual 784	com/tencent/mm/storage/emotion/d:MC	(I)Z
    //   196: pop
    //   197: aload_0
    //   198: getstatic 495	com/tencent/mm/storage/emotion/EmojiInfo:yak	I
    //   201: invokevirtual 784	com/tencent/mm/storage/emotion/d:MC	(I)Z
    //   204: pop
    //   205: aload_0
    //   206: getstatic 498	com/tencent/mm/storage/emotion/EmojiInfo:yaj	I
    //   209: invokevirtual 784	com/tencent/mm/storage/emotion/d:MC	(I)Z
    //   212: pop
    //   213: aload_2
    //   214: ifnull +7 -> 221
    //   217: aload_2
    //   218: invokevirtual 511	java/io/InputStream:close	()V
    //   221: aload_0
    //   222: getstatic 492	com/tencent/mm/storage/emotion/EmojiInfo:yah	I
    //   225: invokespecial 775	com/tencent/mm/storage/emotion/d:Mx	(I)I
    //   228: ifeq +11 -> 239
    //   231: ldc_w 764
    //   234: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   237: iconst_1
    //   238: ireturn
    //   239: aconst_null
    //   240: astore 5
    //   242: aconst_null
    //   243: astore 6
    //   245: aload 6
    //   247: astore_3
    //   248: aload 5
    //   250: astore_2
    //   251: ldc 87
    //   253: ldc_w 794
    //   256: invokestatic 534	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   259: aload 6
    //   261: astore_3
    //   262: aload 5
    //   264: astore_2
    //   265: invokestatic 391	java/lang/System:currentTimeMillis	()J
    //   268: lstore 7
    //   270: aload 6
    //   272: astore_3
    //   273: aload 5
    //   275: astore_2
    //   276: aload_1
    //   277: invokevirtual 800	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   280: ldc_w 802
    //   283: invokevirtual 808	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   286: astore_1
    //   287: aload_1
    //   288: astore_3
    //   289: aload_1
    //   290: astore_2
    //   291: iconst_1
    //   292: anewarray 507	java/io/InputStream
    //   295: dup
    //   296: iconst_0
    //   297: aload_1
    //   298: aastore
    //   299: invokestatic 810	com/tencent/mm/storage/emotion/d:a	([Ljava/io/InputStream;)Ljava/util/List;
    //   302: astore 5
    //   304: aload_1
    //   305: astore_3
    //   306: aload_1
    //   307: astore_2
    //   308: ldc 87
    //   310: ldc_w 812
    //   313: iconst_1
    //   314: anewarray 91	java/lang/Object
    //   317: dup
    //   318: iconst_0
    //   319: invokestatic 391	java/lang/System:currentTimeMillis	()J
    //   322: lload 7
    //   324: lsub
    //   325: invokestatic 349	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   328: aastore
    //   329: invokestatic 320	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   332: aload_1
    //   333: astore_3
    //   334: aload_1
    //   335: astore_2
    //   336: invokestatic 391	java/lang/System:currentTimeMillis	()J
    //   339: lstore 9
    //   341: aload_1
    //   342: astore_3
    //   343: aload_1
    //   344: astore_2
    //   345: aload 5
    //   347: invokeinterface 660 1 0
    //   352: ifle +153 -> 505
    //   355: aload_1
    //   356: astore_3
    //   357: aload_1
    //   358: astore_2
    //   359: aload 5
    //   361: invokeinterface 660 1 0
    //   366: ifle +139 -> 505
    //   369: ldc2_w 350
    //   372: lstore 7
    //   374: aload_1
    //   375: astore_3
    //   376: aload_1
    //   377: astore_2
    //   378: aload_0
    //   379: getfield 55	com/tencent/mm/storage/emotion/d:bSd	Lcom/tencent/mm/sdk/e/e;
    //   382: instanceof 689
    //   385: ifeq +331 -> 716
    //   388: aload_1
    //   389: astore_3
    //   390: aload_1
    //   391: astore_2
    //   392: aload_0
    //   393: getfield 55	com/tencent/mm/storage/emotion/d:bSd	Lcom/tencent/mm/sdk/e/e;
    //   396: checkcast 689	com/tencent/mm/cd/h
    //   399: astore 6
    //   401: aload_1
    //   402: astore_3
    //   403: aload_1
    //   404: astore_2
    //   405: aload 6
    //   407: invokestatic 695	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   410: invokevirtual 698	java/lang/Thread:getId	()J
    //   413: invokevirtual 702	com/tencent/mm/cd/h:iV	(J)J
    //   416: lstore 7
    //   418: aload_1
    //   419: astore_3
    //   420: aload_1
    //   421: astore_2
    //   422: aload 5
    //   424: invokeinterface 816 1 0
    //   429: astore 5
    //   431: aload_1
    //   432: astore_3
    //   433: aload_1
    //   434: astore_2
    //   435: aload 5
    //   437: invokeinterface 821 1 0
    //   442: ifeq +120 -> 562
    //   445: aload_1
    //   446: astore_3
    //   447: aload_1
    //   448: astore_2
    //   449: aload 5
    //   451: invokeinterface 825 1 0
    //   456: checkcast 26	com/tencent/mm/storage/emotion/EmojiInfo
    //   459: invokevirtual 338	com/tencent/mm/storage/emotion/EmojiInfo:Hl	()Landroid/content/ContentValues;
    //   462: astore 11
    //   464: aload_1
    //   465: astore_3
    //   466: aload_1
    //   467: astore_2
    //   468: aload_0
    //   469: getfield 55	com/tencent/mm/storage/emotion/d:bSd	Lcom/tencent/mm/sdk/e/e;
    //   472: ldc 32
    //   474: ldc 199
    //   476: aload 11
    //   478: invokeinterface 342 4 0
    //   483: lconst_0
    //   484: lcmp
    //   485: ifge -54 -> 431
    //   488: aload 6
    //   490: ifnull +15 -> 505
    //   493: aload_1
    //   494: astore_3
    //   495: aload_1
    //   496: astore_2
    //   497: aload 6
    //   499: lload 7
    //   501: invokevirtual 720	com/tencent/mm/cd/h:mB	(J)I
    //   504: pop
    //   505: aload_1
    //   506: astore_3
    //   507: aload_1
    //   508: astore_2
    //   509: ldc 87
    //   511: ldc_w 827
    //   514: iconst_1
    //   515: anewarray 91	java/lang/Object
    //   518: dup
    //   519: iconst_0
    //   520: invokestatic 391	java/lang/System:currentTimeMillis	()J
    //   523: lload 9
    //   525: lsub
    //   526: invokestatic 349	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   529: aastore
    //   530: invokestatic 320	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   533: aload_1
    //   534: astore_3
    //   535: aload_1
    //   536: astore_2
    //   537: ldc 87
    //   539: ldc_w 829
    //   542: invokestatic 582	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   545: aload_1
    //   546: ifnull +7 -> 553
    //   549: aload_1
    //   550: invokevirtual 511	java/io/InputStream:close	()V
    //   553: ldc_w 764
    //   556: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   559: goto -322 -> 237
    //   562: aload 6
    //   564: ifnull -59 -> 505
    //   567: aload_1
    //   568: astore_3
    //   569: aload_1
    //   570: astore_2
    //   571: aload 6
    //   573: lload 7
    //   575: invokevirtual 720	com/tencent/mm/cd/h:mB	(J)I
    //   578: pop
    //   579: goto -74 -> 505
    //   582: astore 6
    //   584: aload_3
    //   585: astore_2
    //   586: new 105	java/lang/StringBuilder
    //   589: astore_1
    //   590: aload_3
    //   591: astore_2
    //   592: aload_1
    //   593: ldc_w 831
    //   596: invokespecial 110	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   599: aload_3
    //   600: astore_2
    //   601: ldc 87
    //   603: aload_1
    //   604: aload 6
    //   606: invokevirtual 832	java/io/IOException:getMessage	()Ljava/lang/String;
    //   609: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   612: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   615: invokestatic 124	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   618: aload_3
    //   619: ifnull -66 -> 553
    //   622: aload_3
    //   623: invokevirtual 511	java/io/InputStream:close	()V
    //   626: goto -73 -> 553
    //   629: astore_1
    //   630: ldc 87
    //   632: ldc 89
    //   634: iconst_1
    //   635: anewarray 91	java/lang/Object
    //   638: dup
    //   639: iconst_0
    //   640: aload_1
    //   641: invokestatic 97	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   644: aastore
    //   645: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   648: goto -95 -> 553
    //   651: astore_1
    //   652: ldc 87
    //   654: ldc 89
    //   656: iconst_1
    //   657: anewarray 91	java/lang/Object
    //   660: dup
    //   661: iconst_0
    //   662: aload_1
    //   663: invokestatic 97	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   666: aastore
    //   667: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   670: goto -117 -> 553
    //   673: astore_1
    //   674: aload_2
    //   675: ifnull +7 -> 682
    //   678: aload_2
    //   679: invokevirtual 511	java/io/InputStream:close	()V
    //   682: ldc_w 764
    //   685: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   688: aload_1
    //   689: athrow
    //   690: astore_2
    //   691: ldc 87
    //   693: ldc 89
    //   695: iconst_1
    //   696: anewarray 91	java/lang/Object
    //   699: dup
    //   700: iconst_0
    //   701: aload_2
    //   702: invokestatic 97	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   705: aastore
    //   706: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   709: goto -27 -> 682
    //   712: astore_2
    //   713: goto -492 -> 221
    //   716: aconst_null
    //   717: astore 6
    //   719: goto -301 -> 418
    //
    // Exception table:
    //   from	to	target	type
    //   251	259	582	java/io/IOException
    //   265	270	582	java/io/IOException
    //   276	287	582	java/io/IOException
    //   291	304	582	java/io/IOException
    //   308	332	582	java/io/IOException
    //   336	341	582	java/io/IOException
    //   345	355	582	java/io/IOException
    //   359	369	582	java/io/IOException
    //   378	388	582	java/io/IOException
    //   392	401	582	java/io/IOException
    //   405	418	582	java/io/IOException
    //   422	431	582	java/io/IOException
    //   435	445	582	java/io/IOException
    //   449	464	582	java/io/IOException
    //   468	488	582	java/io/IOException
    //   497	505	582	java/io/IOException
    //   509	533	582	java/io/IOException
    //   537	545	582	java/io/IOException
    //   571	579	582	java/io/IOException
    //   622	626	629	java/lang/Exception
    //   549	553	651	java/lang/Exception
    //   251	259	673	finally
    //   265	270	673	finally
    //   276	287	673	finally
    //   291	304	673	finally
    //   308	332	673	finally
    //   336	341	673	finally
    //   345	355	673	finally
    //   359	369	673	finally
    //   378	388	673	finally
    //   392	401	673	finally
    //   405	418	673	finally
    //   422	431	673	finally
    //   435	445	673	finally
    //   449	464	673	finally
    //   468	488	673	finally
    //   497	505	673	finally
    //   509	533	673	finally
    //   537	545	673	finally
    //   571	579	673	finally
    //   586	590	673	finally
    //   592	599	673	finally
    //   601	618	673	finally
    //   678	682	690	java/lang/Exception
    //   217	221	712	java/lang/Exception
  }

  public final boolean j(List<EmojiInfo> paramList, String paramString)
  {
    AppMethodBeat.i(62833);
    boolean bool;
    if (paramList.size() <= 0)
    {
      ab.i("MicroMsg.emoji.EmojiInfoStorage", "insert emoji list faild. list is null or size is 0.");
      bool = false;
      AppMethodBeat.o(62833);
      return bool;
    }
    ab.i("MicroMsg.emoji.EmojiInfoStorage", "insertEmojiList groupId:%s size:%d", new Object[] { paramString, Integer.valueOf(paramList.size()) });
    com.tencent.mm.cd.h localh = null;
    if ((this.bSd instanceof com.tencent.mm.cd.h))
      localh = (com.tencent.mm.cd.h)this.bSd;
    for (long l = localh.iV(Thread.currentThread().getId()); ; l = -1L)
    {
      Object localObject = Jg(paramString);
      paramString = new HashMap();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        EmojiInfo localEmojiInfo = (EmojiInfo)((Iterator)localObject).next();
        paramString.put(localEmojiInfo.Aq(), localEmojiInfo);
      }
      for (int i = 0; i < paramList.size(); i++)
      {
        localObject = (EmojiInfo)paramList.get(i);
        ((EmojiInfo)localObject).field_temp = 0;
        this.bSd.replace("EmojiInfo", "md5", ((EmojiInfo)localObject).Hl());
        paramString.remove(((EmojiInfo)localObject).Aq());
      }
      paramString = paramString.entrySet().iterator();
      while (paramString.hasNext())
      {
        localObject = (Map.Entry)paramString.next();
        paramList = (String)((Map.Entry)localObject).getKey();
        localObject = (EmojiInfo)((Map.Entry)localObject).getValue();
        ((EmojiInfo)localObject).field_temp = 1;
        this.bSd.update("EmojiInfo", ((EmojiInfo)localObject).Hl(), "md5=?", new String[] { paramList });
        ab.d("MicroMsg.emoji.EmojiInfoStorage", "jacks modify excess emoji to %s", new Object[] { ((EmojiInfo)localObject).field_groupId });
      }
      if (localh != null)
        localh.mB(l);
      bool = true;
      AppMethodBeat.o(62833);
      break;
    }
  }

  public final boolean l(int paramInt, List<String> paramList)
  {
    AppMethodBeat.i(62832);
    ab.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] begin topCustomEmojiByMd5");
    long l1 = System.currentTimeMillis();
    boolean bool;
    if ((paramList == null) || (paramList.size() <= 0))
    {
      ab.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] topCustomEmojiByMd5 failed. list is null");
      bool = false;
      AppMethodBeat.o(62832);
      return bool;
    }
    Object localObject1 = Mz(paramInt);
    com.tencent.mm.cd.h localh = null;
    if ((this.bSd instanceof com.tencent.mm.cd.h))
      localh = (com.tencent.mm.cd.h)this.bSd;
    for (long l2 = localh.iV(Thread.currentThread().getId()); ; l2 = -1L)
    {
      Object localObject2 = paramList.iterator();
      int j;
      label281: for (int i = 1; ; i = j)
      {
        if (!((Iterator)localObject2).hasNext())
          break label288;
        Object localObject3 = (String)((Iterator)localObject2).next();
        EmojiInfo localEmojiInfo = aqi((String)localObject3);
        j = i;
        if (localEmojiInfo != null)
        {
          j = i;
          if (!bo.isNullOrNil(localEmojiInfo.Aq()))
          {
            if (paramInt == 1)
              localEmojiInfo.field_idx = i;
            while (true)
            {
              if (!((List)localObject1).isEmpty())
                ((List)localObject1).remove(localObject3);
              j = i + 1;
              localObject3 = localEmojiInfo.Hl();
              if (this.bSd.replace("EmojiInfo", "md5", (ContentValues)localObject3) >= 0L)
                break label281;
              if (localh != null)
                localh.mB(l2);
              ab.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end topCustomEmojiByMd5 user time:%d faild ", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
              bool = false;
              AppMethodBeat.o(62832);
              break;
              localEmojiInfo.field_reserved3 = i;
            }
          }
        }
      }
      label288: if (!((List)localObject1).isEmpty())
      {
        localObject1 = ((List)localObject1).iterator();
        label307: 
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = aqi((String)((Iterator)localObject1).next());
          if ((localObject2 != null) && (!bo.isNullOrNil(((EmojiInfo)localObject2).Aq())))
          {
            if (paramInt == 1)
              ((EmojiInfo)localObject2).field_idx = i;
            while (true)
            {
              i++;
              localObject2 = ((EmojiInfo)localObject2).Hl();
              if (this.bSd.replace("EmojiInfo", "md5", (ContentValues)localObject2) >= 0L)
                break label307;
              if (localh != null)
                localh.mB(l2);
              ab.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end topCustomEmojiByMd5 user time:%d faild ", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
              bool = false;
              AppMethodBeat.o(62832);
              break;
              ((EmojiInfo)localObject2).field_reserved3 = i;
            }
          }
        }
      }
      if (localh != null)
        localh.mB(l2);
      l2 = System.currentTimeMillis();
      if (paramList == null);
      for (paramInt = 0; ; paramInt = paramList.size())
      {
        ab.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end topCustomEmojiByMd5 user time:%d succes. size:%d", new Object[] { Long.valueOf(l2 - l1), Integer.valueOf(paramInt) });
        bool = true;
        AppMethodBeat.o(62832);
        break;
      }
    }
  }

  public final boolean m(int paramInt, List<EmojiInfo> paramList)
  {
    while (true)
    {
      long l1;
      boolean bool;
      int i;
      Object localObject;
      try
      {
        AppMethodBeat.i(62836);
        ab.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] begin preparedDownloadCustomEmojiList %s, %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramList.size()) });
        l1 = System.currentTimeMillis();
        if ((paramList == null) || (paramList.size() <= 0))
        {
          ab.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] perparedDownloadCustomEmojiList failed. list is null");
          bool = false;
          AppMethodBeat.o(62836);
          return bool;
        }
        if (!(this.bSd instanceof com.tencent.mm.cd.h))
          break label643;
        localh = (com.tencent.mm.cd.h)this.bSd;
        l2 = localh.iV(Thread.currentThread().getId());
        Iterator localIterator = paramList.iterator();
        i = 1;
        if (!localIterator.hasNext())
          break label568;
        EmojiInfo localEmojiInfo = (EmojiInfo)localIterator.next();
        String str = localEmojiInfo.Aq();
        localObject = aqi(str);
        if ((localObject == null) || (bo.isNullOrNil(((EmojiInfo)localObject).Aq())))
        {
          localObject = new com/tencent/mm/storage/emotion/EmojiInfo;
          ((EmojiInfo)localObject).<init>();
          ((EmojiInfo)localObject).field_md5 = str;
          ((EmojiInfo)localObject).field_source = EmojiInfo.yay;
          ((EmojiInfo)localObject).field_lastUseTime = System.currentTimeMillis();
          if (paramInt != 1)
            break label533;
          if (((EmojiInfo)localObject).field_catalog != EmojiInfo.yal)
            ((EmojiInfo)localObject).field_catalog = EmojiInfo.yaf;
          ((EmojiInfo)localObject).field_groupId = "capture";
          ((EmojiInfo)localObject).field_idx = i;
          if (!((EmojiInfo)localObject).duP())
            break label551;
          ((EmojiInfo)localObject).field_reserved4 |= EmojiInfo.yaB;
          ((EmojiInfo)localObject).field_state = EmojiInfo.yat;
          ((EmojiInfo)localObject).field_size = ((int)com.tencent.mm.vfs.e.asZ(((EmojiInfo)localObject).dve()));
          ((EmojiInfo)localObject).field_cdnUrl = localEmojiInfo.field_cdnUrl;
          ((EmojiInfo)localObject).field_thumbUrl = localEmojiInfo.field_thumbUrl;
          ((EmojiInfo)localObject).field_designerID = localEmojiInfo.field_designerID;
          ((EmojiInfo)localObject).field_encrypturl = localEmojiInfo.field_encrypturl;
          ((EmojiInfo)localObject).field_aeskey = localEmojiInfo.field_aeskey;
          ((EmojiInfo)localObject).field_externUrl = localEmojiInfo.field_externUrl;
          ((EmojiInfo)localObject).field_externMd5 = localEmojiInfo.field_externMd5;
          ((EmojiInfo)localObject).field_activityid = localEmojiInfo.field_activityid;
          ((EmojiInfo)localObject).field_attachedText = localEmojiInfo.field_attachedText;
          ((EmojiInfo)localObject).field_attachTextColor = localEmojiInfo.field_attachTextColor;
          ((EmojiInfo)localObject).field_lensId = localEmojiInfo.field_lensId;
          ab.i("MicroMsg.emoji.EmojiInfoStorage", "preparedDownloadCustomEmojiList: %s, %s, %s", new Object[] { ((EmojiInfo)localObject).Aq(), Integer.valueOf(((EmojiInfo)localObject).field_state), Integer.valueOf(((EmojiInfo)localObject).field_size) });
          localObject = ((EmojiInfo)localObject).Hl();
          if (this.bSd.replace("EmojiInfo", "md5", (ContentValues)localObject) >= 0L)
            break label562;
          if (localh != null)
            localh.mB(l2);
          ab.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end preparedDownloadCustomEmojiList user time:%d faild ", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
          bool = false;
          AppMethodBeat.o(62836);
          continue;
        }
      }
      finally
      {
      }
      ((EmojiInfo)localObject).field_source = EmojiInfo.yay;
      continue;
      label533: ((EmojiInfo)localObject).field_catalog = EmojiInfo.yal;
      ((EmojiInfo)localObject).field_reserved3 = i;
      continue;
      label551: ((EmojiInfo)localObject).field_state = EmojiInfo.yau;
      continue;
      label562: i++;
      continue;
      label568: if (localh != null)
        localh.mB(l2);
      long l2 = System.currentTimeMillis();
      if (paramList == null);
      for (paramInt = 0; ; paramInt = paramList.size())
      {
        ab.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end preparedDownloadCustomEmojiList user time:%d succes. size:%d", new Object[] { Long.valueOf(l2 - l1), Integer.valueOf(paramInt) });
        bool = true;
        AppMethodBeat.o(62836);
        break;
      }
      label643: l2 = -1L;
      com.tencent.mm.cd.h localh = null;
    }
  }

  // ERROR //
  public final EmojiInfo mU(long paramLong)
  {
    // Byte code:
    //   0: ldc_w 956
    //   3: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: lload_1
    //   7: lconst_0
    //   8: lcmp
    //   9: ifne +13 -> 22
    //   12: ldc_w 956
    //   15: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   18: aconst_null
    //   19: astore_3
    //   20: aload_3
    //   21: areturn
    //   22: aload_0
    //   23: getfield 55	com/tencent/mm/storage/emotion/d:bSd	Lcom/tencent/mm/sdk/e/e;
    //   26: ldc 32
    //   28: aconst_null
    //   29: ldc_w 958
    //   32: iconst_1
    //   33: anewarray 24	java/lang/String
    //   36: dup
    //   37: iconst_0
    //   38: lload_1
    //   39: invokestatic 961	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   42: aastore
    //   43: aconst_null
    //   44: aconst_null
    //   45: aconst_null
    //   46: iconst_2
    //   47: invokeinterface 593 9 0
    //   52: astore 4
    //   54: aload 4
    //   56: ifnull +165 -> 221
    //   59: aload 4
    //   61: astore_3
    //   62: aload 4
    //   64: invokeinterface 79 1 0
    //   69: ifeq +152 -> 221
    //   72: aload 4
    //   74: astore_3
    //   75: new 26	com/tencent/mm/storage/emotion/EmojiInfo
    //   78: astore 5
    //   80: aload 4
    //   82: astore_3
    //   83: invokestatic 193	com/tencent/mm/plugin/emoji/e:bjc	()Lcom/tencent/mm/plugin/emoji/e;
    //   86: pop
    //   87: aload 4
    //   89: astore_3
    //   90: aload 5
    //   92: invokestatic 196	com/tencent/mm/plugin/emoji/e:bjd	()Ljava/lang/String;
    //   95: invokespecial 197	com/tencent/mm/storage/emotion/EmojiInfo:<init>	(Ljava/lang/String;)V
    //   98: aload 4
    //   100: astore_3
    //   101: aload 5
    //   103: aload 4
    //   105: invokevirtual 372	com/tencent/mm/storage/emotion/EmojiInfo:d	(Landroid/database/Cursor;)V
    //   108: aload 5
    //   110: astore_3
    //   111: aload 4
    //   113: ifnull +13 -> 126
    //   116: aload 4
    //   118: invokeinterface 85 1 0
    //   123: aload 5
    //   125: astore_3
    //   126: ldc_w 956
    //   129: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   132: goto -112 -> 20
    //   135: astore 6
    //   137: aconst_null
    //   138: astore 4
    //   140: aconst_null
    //   141: astore 5
    //   143: aload 4
    //   145: astore_3
    //   146: ldc 87
    //   148: aload 6
    //   150: ldc 254
    //   152: iconst_0
    //   153: anewarray 91	java/lang/Object
    //   156: invokestatic 965	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   159: aload 5
    //   161: astore_3
    //   162: aload 4
    //   164: ifnull -38 -> 126
    //   167: aload 4
    //   169: invokeinterface 85 1 0
    //   174: aload 5
    //   176: astore_3
    //   177: goto -51 -> 126
    //   180: astore 5
    //   182: aconst_null
    //   183: astore_3
    //   184: aload_3
    //   185: ifnull +9 -> 194
    //   188: aload_3
    //   189: invokeinterface 85 1 0
    //   194: ldc_w 956
    //   197: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   200: aload 5
    //   202: athrow
    //   203: astore 5
    //   205: goto -21 -> 184
    //   208: astore 6
    //   210: aconst_null
    //   211: astore 5
    //   213: goto -70 -> 143
    //   216: astore 6
    //   218: goto -75 -> 143
    //   221: aconst_null
    //   222: astore 5
    //   224: goto -116 -> 108
    //
    // Exception table:
    //   from	to	target	type
    //   22	54	135	java/lang/Exception
    //   22	54	180	finally
    //   62	72	203	finally
    //   75	80	203	finally
    //   83	87	203	finally
    //   90	98	203	finally
    //   101	108	203	finally
    //   146	159	203	finally
    //   62	72	208	java/lang/Exception
    //   75	80	208	java/lang/Exception
    //   83	87	208	java/lang/Exception
    //   90	98	208	java/lang/Exception
    //   101	108	216	java/lang/Exception
  }

  public final boolean mV(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(62823);
    if (paramLong == 0L)
      AppMethodBeat.o(62823);
    while (true)
    {
      return bool;
      int i = this.bSd.delete("EmojiInfo", "captureEnterTime=".concat(String.valueOf(paramLong)), null);
      if (i > 0)
        anF("event_update_emoji");
      if (i > 0)
      {
        bool = true;
        AppMethodBeat.o(62823);
      }
      else
      {
        AppMethodBeat.o(62823);
      }
    }
  }

  public final int pr(boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(62816);
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject4;
    String[] arrayOfString;
    if (!paramBoolean)
    {
      localObject4 = "select count(*) from EmojiInfo where groupId=?";
      arrayOfString = new String[1];
      arrayOfString[0] = "capture";
    }
    try
    {
      while (true)
      {
        localObject4 = this.bSd.a((String)localObject4, arrayOfString, 2);
        int k = j;
        if (localObject4 != null)
        {
          k = j;
          localObject2 = localObject4;
          localObject1 = localObject4;
          if (((Cursor)localObject4).moveToFirst())
          {
            localObject2 = localObject4;
            localObject1 = localObject4;
            k = ((Cursor)localObject4).getInt(0);
          }
        }
        j = k;
        if (localObject4 != null)
        {
          ((Cursor)localObject4).close();
          j = k;
        }
        AppMethodBeat.o(62816);
        return j;
        localObject4 = "select count(*) from EmojiInfo where groupId=? AND captureStatus=0";
        arrayOfString = new String[1];
        arrayOfString[0] = "capture";
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject1 = localObject2;
        ab.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bo.l(localException) });
        localObject1 = localObject2;
        ab.e("MicroMsg.emoji.EmojiInfoStorage", "[countCustomEmoji]Exception:%s", new Object[] { localException.toString() });
        j = i;
        if (localObject2 != null)
        {
          localObject2.close();
          j = i;
        }
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(62816);
    }
  }

  public final List<EmojiInfo> ps(boolean paramBoolean)
  {
    AppMethodBeat.i(62818);
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean);
    for (Object localObject1 = "select * from EmojiInfo where catalog =?  order by reserved3 asc"; ; localObject1 = "select * from EmojiInfo where catalog =? and state != " + EmojiInfo.yau + " order by reserved3 asc")
    {
      Object localObject2 = EmojiGroupInfo.yae;
      localObject2 = this.bSd.a((String)localObject1, new String[] { localObject2 }, 2);
      if (((Cursor)localObject2).moveToFirst())
        do
        {
          com.tencent.mm.plugin.emoji.e.bjc();
          localObject1 = new EmojiInfo(com.tencent.mm.plugin.emoji.e.bjd());
          ((EmojiInfo)localObject1).d((Cursor)localObject2);
          localArrayList.add(localObject1);
        }
        while (((Cursor)localObject2).moveToNext());
      ((Cursor)localObject2).close();
      AppMethodBeat.o(62818);
      return localArrayList;
    }
  }

  public final boolean u(List<String> paramList, int paramInt)
  {
    AppMethodBeat.i(62829);
    boolean bool;
    if (paramInt == 1)
    {
      bool = eK(paramList);
      AppMethodBeat.o(62829);
    }
    while (true)
    {
      return bool;
      bool = eJ(paramList);
      AppMethodBeat.o(62829);
    }
  }

  public final int y(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(62815);
    Object localObject1 = null;
    Object localObject2 = null;
    String str;
    Object localObject3;
    if (paramBoolean1)
      if (!paramBoolean2)
      {
        str = "select count(*) from EmojiInfo where catalog IN (?,?)";
        localObject3 = new String[2];
        localObject3[0] = String.valueOf(EmojiGroupInfo.yad);
        localObject3[1] = String.valueOf(EmojiGroupInfo.yae);
      }
    try
    {
      while (true)
      {
        localObject3 = this.bSd.a(str, (String[])localObject3, 2);
        int k = j;
        if (localObject3 != null)
        {
          k = j;
          localObject2 = localObject3;
          localObject1 = localObject3;
          if (((Cursor)localObject3).moveToFirst())
          {
            localObject2 = localObject3;
            localObject1 = localObject3;
            k = ((Cursor)localObject3).getInt(0);
          }
        }
        j = k;
        if (localObject3 != null)
        {
          ((Cursor)localObject3).close();
          j = k;
        }
        AppMethodBeat.o(62815);
        return j;
        str = "select count(*) from EmojiInfo where catalog IN (?,?) AND captureStatus=0";
        localObject3 = new String[2];
        localObject3[0] = String.valueOf(EmojiGroupInfo.yad);
        localObject3[1] = String.valueOf(EmojiGroupInfo.yae);
        continue;
        if (!paramBoolean2)
        {
          str = "select count(*) from EmojiInfo where catalog=?";
          localObject3 = new String[1];
          localObject3[0] = EmojiGroupInfo.yae;
        }
        else
        {
          str = "select count(*) from EmojiInfo where catalog=? AND captureStatus=0";
          localObject3 = new String[1];
          localObject3[0] = EmojiGroupInfo.yae;
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject1 = localObject2;
        ab.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bo.l(localException) });
        localObject1 = localObject2;
        ab.e("MicroMsg.emoji.EmojiInfoStorage", "[countCustomEmoji]Exception:%s", new Object[] { localException.toString() });
        j = i;
        if (localObject2 != null)
        {
          localObject2.close();
          j = i;
        }
      }
    }
    finally
    {
      if (localObject1 != null)
        localObject1.close();
      AppMethodBeat.o(62815);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.d
 * JD-Core Version:    0.6.2
 */