package com.tencent.mm.plugin.websearch.c.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d extends a<l>
{
  public boolean ctn;
  private List<l> mEy;
  private List<String> uci;

  public d(String paramString, List<String> paramList)
  {
    super(paramString);
    this.uci = paramList;
  }

  public final void dZ(List<l> paramList)
  {
    AppMethodBeat.i(91374);
    this.mEy = paramList;
    if (this.mEy != null)
    {
      ArrayList localArrayList = new ArrayList(this.uci.size());
      paramList = this.mEy.iterator();
      while (paramList.hasNext())
      {
        l locall = (l)paramList.next();
        ad localad = ((j)g.K(j.class)).XM().aoO(locall.mDx);
        i = this.uci.indexOf(localad.field_username);
        if (i >= 0)
        {
          if (i < localArrayList.size())
            localArrayList.add(i, locall);
          while (true)
          {
            paramList.remove();
            break;
            localArrayList.add(locall);
          }
        }
      }
      for (int i = localArrayList.size() - 1; i >= 0; i--)
        this.mEy.add(0, localArrayList.get(i));
    }
    this.ctn = true;
    AppMethodBeat.o(91374);
  }

  public final JSONObject gq(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(91375);
    JSONObject localJSONObject1 = new JSONObject();
    if (!this.ctn)
      AppMethodBeat.o(91375);
    while (true)
    {
      return localJSONObject1;
      if ((paramInt1 >= 0) && (paramInt2 > 0))
        break;
      AppMethodBeat.o(91375);
    }
    paramInt2 = paramInt1 + paramInt2 - 1;
    if (paramInt2 > this.mEy.size() - 1)
      paramInt2 = this.mEy.size() - 1;
    while (true)
    {
      if (paramInt2 >= paramInt1)
        break label92;
      AppMethodBeat.o(91375);
      break;
    }
    label92: JSONObject localJSONObject2;
    JSONArray localJSONArray1;
    try
    {
      int i;
      if (paramInt2 == this.mEy.size() - 1)
        i = 0;
      while (true)
      {
        localJSONObject1.put("continueFlag", i);
        localJSONObject1.put("offset", paramInt2 + 1);
        localJSONObject1.put("query", this.query);
        localJSONObject1.put("ret", 0);
        localJSONObject2 = new org/json/JSONObject;
        localJSONObject2.<init>();
        localJSONObject2.put("count", paramInt2 - paramInt1 + 1);
        localJSONObject2.put("totalCount", t.Zo());
        localJSONArray1 = new org/json/JSONArray;
        localJSONArray1.<init>();
        label192: if (paramInt1 <= paramInt2)
        {
          Object localObject1 = (l)this.mEy.get(paramInt1);
          JSONObject localJSONObject3 = new org/json/JSONObject;
          localJSONObject3.<init>();
          Object localObject2 = ((j)g.K(j.class)).XM().aoO(((l)localObject1).mDx);
          localJSONObject3.put("userName", ((ap)localObject2).field_username);
          localJSONObject3.put("nickName", ((ap)localObject2).field_nickname);
          String str1 = ((l)localObject1).content;
          Object localObject3 = ah.getContext();
          String str2 = this.query;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("<em class=\\\"highlight\\\">");
          str1 = str1.replaceFirst(str2, this.query + "</em>");
          i = ((l)localObject1).mDw;
          localObject1 = str1;
          switch (i)
          {
          default:
            localObject1 = "";
          case 1:
          case 4:
          case 5:
          case 15:
          }
          try
          {
            while (true)
            {
              localJSONObject3.put("displayText", localObject1);
              localObject1 = "";
              localObject2 = o.act().qo(((ap)localObject2).field_username);
              if (localObject2 != null)
              {
                str1 = ((h)localObject2).acl();
                localObject1 = str1;
                if (bo.isNullOrNil(str1))
                  localObject1 = ((h)localObject2).ack();
              }
              localJSONObject3.put("thumbUrl", localObject1);
              localJSONArray1.put(localJSONObject3);
              paramInt1++;
              break label192;
              i = 1;
              break;
              localObject3 = ((Context)localObject3).getString(2131302833);
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              localObject1 = (String)localObject3 + str1;
            }
          }
          catch (JSONException localJSONException1)
          {
            while (true)
              ab.printErrStackTrace("JsapiFtsMatchContact", localJSONException1, "", new Object[0]);
          }
        }
      }
    }
    catch (JSONException localJSONException2)
    {
      ab.printErrStackTrace("JsapiFtsMatchContact", localJSONException2, "", new Object[0]);
    }
    while (true)
    {
      AppMethodBeat.o(91375);
      break;
      localJSONObject2.put("items", localJSONArray1);
      JSONArray localJSONArray2 = new org/json/JSONArray;
      localJSONArray2.<init>();
      localJSONArray2.put(localJSONObject2);
      localJSONObject1.put("data", localJSONArray2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.c.a.d
 * JD-Core Version:    0.6.2
 */