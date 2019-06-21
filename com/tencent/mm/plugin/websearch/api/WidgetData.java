package com.tencent.mm.plugin.websearch.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URLEncoder;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WidgetData
  implements Parcelable
{
  public static final Parcelable.Creator<WidgetData> CREATOR;
  public String query;
  public MoreFooter ubr;
  public WidgetData.Info ubs;
  public WidgetData.Style ubt;
  public int ubu;
  public String ubv;

  static
  {
    AppMethodBeat.i(124287);
    CREATOR = new WidgetData.1();
    AppMethodBeat.o(124287);
  }

  public WidgetData()
  {
  }

  protected WidgetData(Parcel paramParcel)
  {
    AppMethodBeat.i(124286);
    this.ubr = ((MoreFooter)paramParcel.readParcelable(MoreFooter.class.getClassLoader()));
    this.ubs = ((WidgetData.Info)paramParcel.readParcelable(WidgetData.Info.class.getClassLoader()));
    this.ubt = ((WidgetData.Style)paramParcel.readParcelable(WidgetData.Style.class.getClassLoader()));
    this.ubu = paramParcel.readInt();
    this.query = paramParcel.readString();
    this.ubv = paramParcel.readString();
    AppMethodBeat.o(124286);
  }

  public static WidgetData adQ(String paramString)
  {
    AppMethodBeat.i(124284);
    if ((paramString == null) || (paramString.length() == 0))
    {
      d.i("WidgetData", "insert args invalid");
      AppMethodBeat.o(124284);
      paramString = null;
      return paramString;
    }
    WidgetData localWidgetData = cVI();
    while (true)
    {
      try
      {
        while (true)
        {
          JSONObject localJSONObject1 = new org/json/JSONObject;
          localJSONObject1.<init>(paramString);
          localWidgetData.ubs.csB = localJSONObject1.optString("appid");
          localWidgetData.ubs.version = localJSONObject1.optInt("version");
          localWidgetData.ubs.bCu = localJSONObject1.optString("nickName");
          localWidgetData.ubs.userName = localJSONObject1.optString("username");
          localWidgetData.ubs.fpS = localJSONObject1.optString("srcAppid");
          localWidgetData.ubs.ubw = localJSONObject1.optString("inputData");
          localWidgetData.ubs.csu = localJSONObject1.optString("pagePath");
          localWidgetData.ubs.ubx = localJSONObject1.optString("wxaData");
          localWidgetData.ubs.uby = localJSONObject1.optString("launchwxawidget");
          localWidgetData.ubs.fmr = bo.ank(localJSONObject1.optString("serviceType"));
          paramString = localWidgetData.ubs;
          if (!localJSONObject1.has("debugMode"))
          {
            i = 0;
            paramString.ubz = i;
            localWidgetData.ubs.hlm = localJSONObject1.optString("searchId");
            paramString = localJSONObject1.optString("relayInfoStr");
          }
          try
          {
            if (!TextUtils.isEmpty(paramString))
            {
              JSONObject localJSONObject2 = new org/json/JSONObject;
              localJSONObject2.<init>(paramString);
              if (localJSONObject2.has("openapp_permission"))
                localWidgetData.ubs.ubC = localJSONObject2.optLong("openapp_permission");
            }
            paramString = localWidgetData.ubt;
            if (!localJSONObject1.has("maxHeight"))
              break label467;
            i = localJSONObject1.optInt("maxHeight");
            paramString.ubI = i;
            localWidgetData.ubt.height = localJSONObject1.optInt("height");
            localWidgetData.ubt.width = localJSONObject1.optInt("width");
            localWidgetData.ubt.hfo = localJSONObject1.optString("backgroundColor");
            paramString = localWidgetData.ubt;
            if (!localJSONObject1.has("minHeight"))
              break label474;
            d = localJSONObject1.optDouble("minHeight");
            paramString.ubH = d;
            localWidgetData.ubt.offsetX = localJSONObject1.optInt("offsetX");
            localWidgetData.ubt.offsetY = localJSONObject1.optInt("offsetY");
            paramString = localWidgetData.ubt;
            if (!localJSONObject1.has("show"))
              break label480;
            bool = localJSONObject1.optBoolean("show");
            paramString.cNN = bool;
            AppMethodBeat.o(124284);
            paramString = localWidgetData;
            break;
            i = localJSONObject1.optInt("debugMode");
          }
          catch (JSONException paramString)
          {
            while (true)
              d.printErrStackTrace("WidgetData", paramString, "", new Object[0]);
          }
        }
      }
      catch (JSONException paramString)
      {
        d.printErrStackTrace("WidgetData", paramString, "", new Object[0]);
        AppMethodBeat.o(124284);
        paramString = null;
      }
      break;
      label467: int i = 2147483647;
      continue;
      label474: double d = 0.0D;
      continue;
      label480: boolean bool = true;
    }
  }

  private static WidgetData cVI()
  {
    AppMethodBeat.i(124283);
    WidgetData localWidgetData = new WidgetData();
    localWidgetData.ubs = new WidgetData.Info();
    localWidgetData.ubt = new WidgetData.Style();
    AppMethodBeat.o(124283);
    return localWidgetData;
  }

  public static WidgetData l(JSONObject paramJSONObject, String paramString)
  {
    Object localObject1 = null;
    int i = 1;
    AppMethodBeat.i(124282);
    WidgetData localWidgetData = cVI();
    try
    {
      JSONObject localJSONObject = paramJSONObject.getJSONObject("boxInfo").getJSONObject("providerInfo");
      if (localJSONObject == null)
      {
        AppMethodBeat.o(124282);
        paramJSONObject = localObject1;
      }
      while (true)
      {
        label43: return paramJSONObject;
        localWidgetData.ubs.csB = paramJSONObject.optString("appID");
        localWidgetData.ubs.version = paramJSONObject.optInt("appVersion");
        localWidgetData.ubs.ubA = paramJSONObject.optString("docID");
        localWidgetData.ubs.iconUrl = paramJSONObject.optString("iconUrl");
        localWidgetData.ubs.bCu = paramJSONObject.optString("nickName");
        localWidgetData.ubs.userName = paramJSONObject.optString("username");
        Object localObject2 = URLEncoder.encode(localJSONObject.optString("widgetData"));
        localWidgetData.ubs.ubw = "widgetData=".concat(String.valueOf(localObject2));
        localObject3 = localWidgetData.ubs;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((WidgetData.Info)localObject3).csu = (localJSONObject.optString("jumpUrl") + "&" + localWidgetData.ubs.ubw);
        localWidgetData.ubs.ubx = localJSONObject.optString("wxaData");
        localWidgetData.ubs.fmr = localJSONObject.optInt("type");
        try
        {
          localObject3 = localJSONObject.optString("relay_info");
          if (localObject3 != null)
          {
            localObject2 = new org/json/JSONObject;
            ((JSONObject)localObject2).<init>((String)localObject3);
            localWidgetData.ubs.ubB = ((JSONObject)localObject2).optString("widget_stat_buffer");
            localWidgetData.ubs.downloadUrl = ((JSONObject)localObject2).optString("downloadurl");
            localWidgetData.ubs.uby = ((JSONObject)localObject2).optString("launchwxawidget");
            localWidgetData.ubs.ubz = ((JSONObject)localObject2).optInt("widget_version_type");
            localWidgetData.ubs.fpS = ((JSONObject)localObject2).optString("appid");
            localObject3 = ((JSONObject)localObject2).optJSONArray("widget_labels");
            if ((localObject3 == null) || (((JSONArray)localObject3).length() <= 0))
              break label640;
          }
          label640: for (localWidgetData.ubs.label = ((JSONArray)localObject3).optString(0); ; localWidgetData.ubs.label = null)
          {
            localObject3 = localWidgetData.ubs;
            if (((JSONObject)localObject2).optInt("need_localsearch_footer") != 1)
              break label694;
            bool = true;
            ((WidgetData.Info)localObject3).ubE = bool;
            localWidgetData.ubs.ubD = ((JSONObject)localObject2).optString("localsearch_header");
            localWidgetData.ubs.kcx = ((JSONObject)localObject2).optString("localsearch_footer");
            localWidgetData.ubs.ubC = ((JSONObject)localObject2).optLong("openapp_permission");
            if (!((JSONObject)localObject2).has("footer"))
              break label767;
            localObject2 = ((JSONObject)localObject2).optJSONObject("footer");
            if (((JSONObject)localObject2).has("type"))
              i = ((JSONObject)localObject2).optInt("type");
            localWidgetData.ubu = i;
            switch (localWidgetData.ubu)
            {
            default:
              d.w("WidgetData", "unknow footer type %d", new Object[] { Integer.valueOf(localWidgetData.ubu) });
              localWidgetData.ubs.hlm = paramString;
              localWidgetData.ubt.ubI = paramJSONObject.optInt("maxHeight");
              localWidgetData.ubt.height = a.ao(ah.getContext(), localJSONObject.optInt("height"));
              localWidgetData.ubt.width = a.ao(ah.getContext(), localJSONObject.optInt("width"));
              AppMethodBeat.o(124282);
              paramJSONObject = localWidgetData;
              break label43;
            case 2:
            }
          }
        }
        catch (JSONException localJSONException)
        {
          while (true)
            d.printErrStackTrace("WidgetData", localJSONException, "", new Object[0]);
        }
      }
    }
    catch (JSONException paramJSONObject)
    {
      while (true)
      {
        d.printErrStackTrace("WidgetData", paramJSONObject, "", new Object[0]);
        AppMethodBeat.o(124282);
        paramJSONObject = localObject1;
        continue;
        label694: boolean bool = false;
        continue;
        Object localObject3 = new com/tencent/mm/plugin/websearch/api/WidgetData$MoreFooter;
        ((MoreFooter)localObject3).<init>();
        localWidgetData.ubr = ((MoreFooter)localObject3);
        localWidgetData.ubr.title = localJSONException.optString("title");
        localWidgetData.ubr.ubF = localJSONException.optString("username");
        localWidgetData.ubr.ubG = localJSONException.optString("jumpurl");
        continue;
        label767: localWidgetData.ubu = 1;
      }
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(124280);
    if (this == paramObject)
      AppMethodBeat.o(124280);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof WidgetData))
      {
        AppMethodBeat.o(124280);
        bool = false;
      }
      else
      {
        paramObject = (WidgetData)paramObject;
        if ((this.ubu == paramObject.ubu) && (Objects.equals(this.ubr, paramObject.ubr)) && (Objects.equals(this.ubs, paramObject.ubs)) && (Objects.equals(this.ubt, paramObject.ubt)) && (Objects.equals(this.query, paramObject.query)) && (Objects.equals(this.ubv, paramObject.ubv)))
        {
          AppMethodBeat.o(124280);
        }
        else
        {
          AppMethodBeat.o(124280);
          bool = false;
        }
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(124281);
    int i = Objects.hash(new Object[] { this.ubr, this.ubs, this.ubt, Integer.valueOf(this.ubu), this.query, this.ubv });
    AppMethodBeat.o(124281);
    return i;
  }

  public String toString()
  {
    AppMethodBeat.i(124279);
    String str1;
    if (this.ubs == null)
    {
      str1 = "";
      if (this.ubt != null)
        break label64;
    }
    label64: for (String str2 = ""; ; str2 = this.ubt.toString())
    {
      str1 = String.format("info: [%s], style:[%s]", new Object[] { str1, str2 });
      AppMethodBeat.o(124279);
      return str1;
      str1 = this.ubs.toString();
      break;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(124285);
    paramParcel.writeParcelable(this.ubr, paramInt);
    paramParcel.writeParcelable(this.ubs, paramInt);
    paramParcel.writeParcelable(this.ubt, paramInt);
    paramParcel.writeInt(this.ubu);
    paramParcel.writeString(this.query);
    paramParcel.writeString(this.ubv);
    AppMethodBeat.o(124285);
  }

  public static class MoreFooter
    implements Parcelable
  {
    public static final Parcelable.Creator<MoreFooter> CREATOR;
    public String title;
    public String ubF;
    public String ubG;

    static
    {
      AppMethodBeat.i(124271);
      CREATOR = new WidgetData.MoreFooter.1();
      AppMethodBeat.o(124271);
    }

    public MoreFooter()
    {
    }

    protected MoreFooter(Parcel paramParcel)
    {
      AppMethodBeat.i(124268);
      this.title = paramParcel.readString();
      this.ubF = paramParcel.readString();
      this.ubG = paramParcel.readString();
      AppMethodBeat.o(124268);
    }

    public int describeContents()
    {
      return 0;
    }

    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      AppMethodBeat.i(124269);
      if (this == paramObject)
        AppMethodBeat.o(124269);
      while (true)
      {
        return bool;
        if (!(paramObject instanceof MoreFooter))
        {
          AppMethodBeat.o(124269);
          bool = false;
        }
        else
        {
          paramObject = (MoreFooter)paramObject;
          if ((Objects.equals(this.title, paramObject.title)) && (Objects.equals(this.ubF, paramObject.ubF)) && (Objects.equals(this.ubG, paramObject.ubG)))
          {
            AppMethodBeat.o(124269);
          }
          else
          {
            AppMethodBeat.o(124269);
            bool = false;
          }
        }
      }
    }

    public int hashCode()
    {
      AppMethodBeat.i(124270);
      int i = Objects.hash(new Object[] { this.title, this.ubF, this.ubG });
      AppMethodBeat.o(124270);
      return i;
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      AppMethodBeat.i(124267);
      paramParcel.writeString(this.title);
      paramParcel.writeString(this.ubF);
      paramParcel.writeString(this.ubG);
      AppMethodBeat.o(124267);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.WidgetData
 * JD-Core Version:    0.6.2
 */