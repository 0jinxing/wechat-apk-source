package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public class BindCardOrder
  implements Parcelable
{
  public static final Parcelable.Creator<BindCardOrder> CREATOR;
  public static int txC;
  public static int txD;
  public static int txE;
  public int jumpType;
  public String pbn;
  private String txB;
  public int txF;
  public String txG;
  public String txH;
  public String txI;
  public String txJ;
  public String txK;
  public int txL;
  public int txM;
  public q txN;
  public q.a txO;
  public q.b txP;

  static
  {
    AppMethodBeat.i(46725);
    txC = 1;
    txD = 2;
    txE = 6;
    CREATOR = new BindCardOrder.1();
    AppMethodBeat.o(46725);
  }

  public BindCardOrder()
  {
    this.txB = "";
    this.txG = "";
    this.txH = "";
    this.txI = "";
    this.txJ = "";
    this.txK = "";
  }

  protected BindCardOrder(Parcel paramParcel)
  {
    AppMethodBeat.i(46722);
    this.txB = "";
    this.txG = "";
    this.txH = "";
    this.txI = "";
    this.txJ = "";
    this.txK = "";
    this.txB = paramParcel.readString();
    try
    {
      paramParcel = new org/json/JSONObject;
      paramParcel.<init>(this.txB);
      as(paramParcel);
      AppMethodBeat.o(46722);
      return;
    }
    catch (Exception paramParcel)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BindCardOrder", paramParcel, "", new Object[0]);
        AppMethodBeat.o(46722);
      }
    }
  }

  public final void as(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46724);
    Object localObject1;
    if (paramJSONObject == null)
      localObject1 = "";
    while (true)
    {
      this.txB = ((String)localObject1);
      ab.i("MicroMsg.BindCardOrder", "feed json %s", new Object[] { this.txB });
      try
      {
        this.txF = paramJSONObject.optInt("show_bind_succ_page", 0);
        this.txG = paramJSONObject.optString("bind_succ_btn_wording", "");
        this.txH = paramJSONObject.optString("bind_succ_remind_wording", "");
        this.jumpType = paramJSONObject.optInt("jump_type", 0);
        this.txK = paramJSONObject.optString("bind_serial");
        Object localObject2 = paramJSONObject.optJSONObject("activity_info");
        localObject1 = new com/tencent/mm/plugin/wallet_core/model/q;
        ((q)localObject1).<init>();
        this.txN = ((q)localObject1);
        if (localObject2 != null)
          this.txN.aA((JSONObject)localObject2);
        localObject2 = paramJSONObject.optJSONObject("h5_info");
        if (localObject2 != null)
        {
          localObject1 = new com/tencent/mm/plugin/wallet_core/model/q$a;
          ((q.a)localObject1).<init>();
          this.txO = ((q.a)localObject1);
          this.txO.aA((JSONObject)localObject2);
        }
        localObject1 = paramJSONObject.optJSONObject("native_info");
        if (localObject1 != null)
        {
          localObject2 = new com/tencent/mm/plugin/wallet_core/model/q$a;
          ((q.a)localObject2).<init>();
          this.txO = ((q.a)localObject2);
          this.txO.aA((JSONObject)localObject1);
        }
        paramJSONObject = paramJSONObject.optJSONObject("tinyapp_info");
        if (paramJSONObject != null)
        {
          localObject1 = new com/tencent/mm/plugin/wallet_core/model/q$b;
          ((q.b)localObject1).<init>();
          this.txP = ((q.b)localObject1);
          this.txP.aA(paramJSONObject);
        }
        AppMethodBeat.o(46724);
        return;
        localObject1 = paramJSONObject.toString();
      }
      catch (Exception paramJSONObject)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.BindCardOrder", paramJSONObject, "", new Object[0]);
          AppMethodBeat.o(46724);
        }
      }
    }
  }

  public final boolean cPi()
  {
    if ((this.jumpType == txC) && (this.txO != null));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean cPj()
  {
    if ((this.jumpType == txD) && (this.txP != null));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean cPk()
  {
    if ((this.jumpType == txE) && (this.txO != null));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(46723);
    paramParcel.writeString(this.txB);
    AppMethodBeat.o(46723);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.BindCardOrder
 * JD-Core Version:    0.6.2
 */