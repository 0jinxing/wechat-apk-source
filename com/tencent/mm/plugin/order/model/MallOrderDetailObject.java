package com.tencent.mm.plugin.order.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MallOrderDetailObject
{
  public String cBb;
  public String lCb;
  public MallTransactionObject pbI;
  public MallOrderDetailObject.b pbJ;
  public ArrayList<ProductSectionItem> pbK;
  public List<MallOrderDetailObject.a> pbL;
  public List<HelpCenter> pbM;
  int pbN;
  public String pbO;
  public String pbP;
  public int pbQ;

  public MallOrderDetailObject()
  {
    AppMethodBeat.i(43743);
    this.pbM = new LinkedList();
    this.pbN = -1;
    AppMethodBeat.o(43743);
  }

  static ArrayList<ProductSectionItem> ac(JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = null;
    AppMethodBeat.i(43744);
    paramJSONObject = paramJSONObject.getJSONObject("product_section");
    if (paramJSONObject == null)
    {
      AppMethodBeat.o(43744);
      paramJSONObject = localJSONObject;
    }
    while (true)
    {
      return paramJSONObject;
      JSONArray localJSONArray = paramJSONObject.getJSONArray("items");
      if ((localJSONArray == null) || (localJSONArray.length() == 0))
      {
        AppMethodBeat.o(43744);
        paramJSONObject = localJSONObject;
      }
      else
      {
        paramJSONObject = new ArrayList();
        int i = 0;
        while (true)
          if (i < localJSONArray.length())
          {
            localJSONObject = localJSONArray.getJSONObject(i);
            ProductSectionItem localProductSectionItem = new ProductSectionItem();
            localProductSectionItem.iconUrl = localJSONObject.optString("icon_url");
            localProductSectionItem.name = localJSONObject.optString("name");
            try
            {
              localProductSectionItem.pdy = ad(localJSONObject);
              localProductSectionItem.count = localJSONObject.optInt("count");
              localProductSectionItem.pdz = localJSONObject.optString("price");
              localProductSectionItem.jumpUrl = localJSONObject.optString("jump_url");
              localProductSectionItem.pdA = localJSONObject.optString("pid");
              localProductSectionItem.scene = localJSONObject.optInt("scene");
              paramJSONObject.add(localProductSectionItem);
              i++;
            }
            catch (JSONException localJSONException)
            {
              while (true)
                ab.printErrStackTrace("MicroMsg.MallOrderDetailObject", localJSONException, "", new Object[0]);
            }
            catch (Exception localException)
            {
              while (true)
                ab.printErrStackTrace("MicroMsg.MallOrderDetailObject", localException, "", new Object[0]);
            }
          }
        AppMethodBeat.o(43744);
      }
    }
  }

  private static List<ProductSectionItem.Skus> ad(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(43745);
    JSONArray localJSONArray = paramJSONObject.getJSONArray("skus");
    if ((localJSONArray == null) || (localJSONArray.length() == 0))
    {
      paramJSONObject = null;
      AppMethodBeat.o(43745);
    }
    while (true)
    {
      return paramJSONObject;
      paramJSONObject = new ArrayList();
      for (int i = 0; i < localJSONArray.length(); i++)
      {
        JSONObject localJSONObject = localJSONArray.getJSONObject(i);
        ProductSectionItem.Skus localSkus = new ProductSectionItem.Skus();
        localSkus.key = localJSONObject.optString("key");
        localSkus.value = localJSONObject.optString("value");
        paramJSONObject.add(localSkus);
      }
      AppMethodBeat.o(43745);
    }
  }

  public static class HelpCenter
    implements Parcelable
  {
    public static final Parcelable.Creator<HelpCenter> CREATOR;
    public boolean cui;
    public String name;
    public String url;

    static
    {
      AppMethodBeat.i(43742);
      CREATOR = new MallOrderDetailObject.HelpCenter.1();
      AppMethodBeat.o(43742);
    }

    protected HelpCenter()
    {
    }

    protected HelpCenter(Parcel paramParcel)
    {
      AppMethodBeat.i(43740);
      this.name = paramParcel.readString();
      this.url = paramParcel.readString();
      if (paramParcel.readByte() != 0);
      for (boolean bool = true; ; bool = false)
      {
        this.cui = bool;
        AppMethodBeat.o(43740);
        return;
      }
    }

    public int describeContents()
    {
      return 0;
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      AppMethodBeat.i(43741);
      paramParcel.writeString(this.name);
      paramParcel.writeString(this.url);
      if (this.cui);
      for (paramInt = 1; ; paramInt = 0)
      {
        paramParcel.writeByte((byte)paramInt);
        AppMethodBeat.o(43741);
        return;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.model.MallOrderDetailObject
 * JD-Core Version:    0.6.2
 */