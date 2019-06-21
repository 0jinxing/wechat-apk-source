package com.tencent.mm.plugin.card.sharecard.model;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.sharecard.a.b;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

public final class k extends j<ShareCardInfo>
{
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(88083);
    fnj = new String[] { j.a(ShareCardInfo.ccO, "ShareCardInfo") };
    AppMethodBeat.o(88083);
  }

  public k(e parame)
  {
    super(parame, ShareCardInfo.ccO, "ShareCardInfo", null);
    this.bSd = parame;
  }

  public static String sT(int paramInt)
  {
    AppMethodBeat.i(88074);
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = b.sQ(paramInt);
    if ((localObject != null) && (((ArrayList)localObject).size() > 0))
    {
      localStringBuilder.append(" (");
      for (paramInt = 0; paramInt < ((ArrayList)localObject).size(); paramInt++)
      {
        if (paramInt != 0)
          localStringBuilder.append(" OR ");
        localStringBuilder.append("card_id").append(" = '" + (String)((ArrayList)localObject).get(paramInt) + "' ");
      }
      localStringBuilder.append(") AND ");
      localObject = localStringBuilder.toString();
      AppMethodBeat.o(88074);
    }
    while (true)
    {
      return localObject;
      localObject = "";
      AppMethodBeat.o(88074);
    }
  }

  public final ArrayList<String> GG(String paramString)
  {
    ArrayList localArrayList = null;
    AppMethodBeat.i(88075);
    ab.i("MicroMsg.ShareCardInfoStorage", "queryNameByCardtpId(), limit is 99");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(" where ( status=0) ");
    ((StringBuilder)localObject).append(" AND (card_tp_id = '" + paramString + "' )");
    ((StringBuilder)localObject).append(" order by share_time desc ");
    ((StringBuilder)localObject).append(" limit 99");
    localObject = "select ShareCardInfo.from_username from ShareCardInfo" + ((StringBuilder)localObject).toString();
    localObject = this.bSd.a((String)localObject, null, 2);
    if (localObject == null)
    {
      ab.i("MicroMsg.ShareCardInfoStorage", "queryNameByCardtpId(), cursor == null");
      AppMethodBeat.o(88075);
    }
    int i;
    for (paramString = localArrayList; ; paramString = localArrayList)
    {
      return paramString;
      i = ((Cursor)localObject).getColumnIndex("from_username");
      if (i != -1)
        break;
      ab.i("MicroMsg.ShareCardInfoStorage", "queryNameByCardtpId(), index is wrong");
      ((Cursor)localObject).close();
      AppMethodBeat.o(88075);
    }
    localArrayList = new ArrayList();
    label237: label252: 
    while (true)
    {
      if (((Cursor)localObject).moveToNext())
      {
        String str = ((Cursor)localObject).getString(i);
        if ((TextUtils.isEmpty(str)) || (localArrayList.contains(str)))
          break label237;
        localArrayList.add(str);
      }
      while (true)
      {
        if (localArrayList.size() < 99)
          break label252;
        ((Cursor)localObject).close();
        AppMethodBeat.o(88075);
        paramString = localArrayList;
        break;
        ab.e("MicroMsg.ShareCardInfoStorage", "the field_from_username is empty or username is added!, the card id is ".concat(String.valueOf(paramString)));
      }
    }
  }

  public final int GH(String paramString)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(88076);
    ab.i("MicroMsg.ShareCardInfoStorage", "getNormalCount()");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(" where ( status=0) ");
    localStringBuilder.append(" AND (card_tp_id = '" + paramString + "' )");
    paramString = "select count(*) from ShareCardInfo" + localStringBuilder.toString();
    paramString = this.bSd.a(paramString, null, 2);
    if (paramString == null)
    {
      ab.i("MicroMsg.ShareCardInfoStorage", "getNormalCount(), cursor == null");
      AppMethodBeat.o(88076);
    }
    while (true)
    {
      return j;
      j = i;
      if (paramString.moveToFirst())
        j = paramString.getInt(0);
      paramString.close();
      AppMethodBeat.o(88076);
    }
  }

  public final String GI(String paramString)
  {
    AppMethodBeat.i(88077);
    ab.i("MicroMsg.ShareCardInfoStorage", "queryCardIdByCardtpId()");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(" where ( status=0) ");
    ((StringBuilder)localObject).append(" AND (card_tp_id = '" + paramString + "' )");
    ((StringBuilder)localObject).append(" order by share_time desc ");
    ((StringBuilder)localObject).append(" limit 1");
    paramString = "select ShareCardInfo.card_id from ShareCardInfo" + ((StringBuilder)localObject).toString();
    localObject = this.bSd.a(paramString, null, 2);
    if (localObject == null)
    {
      ab.i("MicroMsg.ShareCardInfoStorage", "queryCardIdByCardtpId(), cursor == null");
      paramString = "";
      AppMethodBeat.o(88077);
    }
    while (true)
    {
      return paramString;
      int i = ((Cursor)localObject).getColumnIndex("card_id");
      if (i == -1)
      {
        ab.i("MicroMsg.ShareCardInfoStorage", "queryCardIdByCardtpId(), index is wrong");
        ((Cursor)localObject).close();
        paramString = "";
        AppMethodBeat.o(88077);
      }
      else
      {
        paramString = "";
        if (((Cursor)localObject).moveToFirst())
          paramString = ((Cursor)localObject).getString(i);
        ((Cursor)localObject).close();
        AppMethodBeat.o(88077);
      }
    }
  }

  public final void GJ(String paramString)
  {
    AppMethodBeat.i(88081);
    paramString = "delete from ShareCardInfo where card_id = '" + paramString + "'";
    this.bSd.hY("ShareCardInfo", paramString);
    AppMethodBeat.o(88081);
  }

  public final ShareCardInfo GK(String paramString)
  {
    AppMethodBeat.i(88082);
    ShareCardInfo localShareCardInfo = new ShareCardInfo();
    localShareCardInfo.field_card_id = paramString;
    if (super.b(localShareCardInfo, new String[0]))
    {
      AppMethodBeat.o(88082);
      paramString = localShareCardInfo;
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(88082);
    }
  }

  public final boolean N(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(88080);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(" where ( status=0) ");
    localStringBuilder.append(" AND (card_tp_id = '" + paramString + "' )");
    paramString = "update ShareCardInfo set categoryType = '" + paramInt1 + "', itemIndex = '" + paramInt2 + "' " + localStringBuilder.toString();
    boolean bool = this.bSd.hY("ShareCardInfo", paramString);
    paramString = new StringBuilder("updateCategoryInfo updateRet is ");
    if (bool);
    for (paramInt1 = 1; ; paramInt1 = 0)
    {
      ab.i("MicroMsg.ShareCardInfoStorage", paramInt1);
      AppMethodBeat.o(88080);
      return bool;
    }
  }

  public final String dq(String paramString1, String paramString2)
  {
    AppMethodBeat.i(88078);
    ab.i("MicroMsg.ShareCardInfoStorage", "queryNewCardIdByCardtpId()");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(" where ( status=0) ");
    ((StringBuilder)localObject).append(" AND (card_tp_id = '" + paramString2 + "' )");
    ((StringBuilder)localObject).append(" order by share_time desc ");
    ((StringBuilder)localObject).append(" limit 2");
    paramString2 = "select ShareCardInfo.card_id from ShareCardInfo" + ((StringBuilder)localObject).toString();
    Cursor localCursor = this.bSd.a(paramString2, null, 2);
    if (localCursor == null)
    {
      ab.i("MicroMsg.ShareCardInfoStorage", "queryNewCardIdByCardtpId(), cursor == null");
      paramString2 = "";
      AppMethodBeat.o(88078);
    }
    while (true)
    {
      return paramString2;
      int i = localCursor.getColumnIndex("card_id");
      if (i == -1)
      {
        ab.i("MicroMsg.ShareCardInfoStorage", "queryNewCardIdByCardtpId(), index is wrong");
        localCursor.close();
        paramString2 = "";
        AppMethodBeat.o(88078);
      }
      else
      {
        paramString2 = "";
        while (localCursor.moveToNext())
        {
          localObject = localCursor.getString(i);
          paramString2 = (String)localObject;
          if (paramString1 != null)
          {
            paramString2 = (String)localObject;
            if (!paramString1.equals(localObject))
              paramString2 = (String)localObject;
          }
        }
        localCursor.close();
        AppMethodBeat.o(88078);
      }
    }
  }

  public final boolean sU(int paramInt)
  {
    AppMethodBeat.i(88079);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(" where ( status=0) ");
    ((StringBuilder)localObject).append(" AND (");
    ((StringBuilder)localObject).append("categoryType").append(" = '" + paramInt + "'");
    ((StringBuilder)localObject).append(")");
    localObject = "update ShareCardInfo set categoryType = '0' , itemIndex = '0' " + ((StringBuilder)localObject).toString();
    boolean bool = this.bSd.hY("ShareCardInfo", (String)localObject);
    localObject = new StringBuilder("resetCategoryInfo updateRet is ");
    if (bool);
    for (paramInt = 1; ; paramInt = 0)
    {
      ab.i("MicroMsg.ShareCardInfoStorage", paramInt);
      AppMethodBeat.o(88079);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.model.k
 * JD-Core Version:    0.6.2
 */