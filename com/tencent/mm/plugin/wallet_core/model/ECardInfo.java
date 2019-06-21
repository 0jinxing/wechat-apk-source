package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.bpt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ECardInfo
  implements Parcelable
{
  public static final Parcelable.Creator<ECardInfo> CREATOR;
  public String cRb;
  public String cRf;
  public String cvQ;
  public int jSu;
  public String subtitle;
  public String title;
  public int tyj;
  public int tyk;
  public String tyl;
  public String tym;
  public String tyn;
  public int tyo;
  public ArrayList<String> typ;
  public String tyq;
  public String tyr;
  public String tys;
  public String tyt;

  static
  {
    AppMethodBeat.i(46750);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(46750);
  }

  public ECardInfo()
  {
    AppMethodBeat.i(46744);
    this.typ = new ArrayList();
    AppMethodBeat.o(46744);
  }

  public ECardInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(46745);
    this.typ = new ArrayList();
    this.jSu = paramParcel.readInt();
    this.cvQ = paramParcel.readString();
    this.tyj = paramParcel.readInt();
    this.tyk = paramParcel.readInt();
    this.tyl = paramParcel.readString();
    this.tym = paramParcel.readString();
    this.tyn = paramParcel.readString();
    this.tyo = paramParcel.readInt();
    this.title = paramParcel.readString();
    paramParcel.readStringList(this.typ);
    this.tyq = paramParcel.readString();
    this.tyr = paramParcel.readString();
    this.tys = paramParcel.readString();
    this.tyt = paramParcel.readString();
    this.cRb = paramParcel.readString();
    this.subtitle = paramParcel.readString();
    AppMethodBeat.o(46745);
  }

  public static void aw(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46747);
    if (paramJSONObject != null)
    {
      g.RP().Ry().set(ac.a.xWs, paramJSONObject.toString());
      AppMethodBeat.o(46747);
    }
    while (true)
    {
      return;
      g.RP().Ry().set(ac.a.xWs, "");
      AppMethodBeat.o(46747);
    }
  }

  public static bpt cPp()
  {
    AppMethodBeat.i(46748);
    String str = (String)g.RP().Ry().get(ac.a.xWs, null);
    if (!bo.isNullOrNil(str));
    while (true)
    {
      try
      {
        bpt localbpt = new com/tencent/mm/protocal/protobuf/bpt;
        localbpt.<init>();
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(str);
        localbpt.vAF = localJSONObject.optInt("guide_flag");
        localbpt.nZa = localJSONObject.optString("guide_wording");
        localbpt.nZb = localJSONObject.optString("left_button_wording");
        localbpt.nZc = localJSONObject.optString("right_button_wording");
        localbpt.nZd = localJSONObject.optString("upload_credit_url");
        AppMethodBeat.o(46748);
        return localbpt;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.ECardInfo", localException, "", new Object[0]);
      }
      AppMethodBeat.o(46748);
      Object localObject = null;
    }
  }

  public static ECardInfo cPq()
  {
    AppMethodBeat.i(46749);
    Object localObject1 = (String)g.RP().Ry().get(ac.a.xWs, null);
    if (!bo.isNullOrNil((String)localObject1));
    while (true)
    {
      try
      {
        JSONObject localJSONObject1 = new org/json/JSONObject;
        localJSONObject1.<init>((String)localObject1);
        localObject1 = localJSONObject1.optJSONArray("upload_reasons");
        ArrayList localArrayList1 = new java/util/ArrayList;
        localArrayList1.<init>();
        if (localObject1 != null)
        {
          int i = 0;
          if (i < ((JSONArray)localObject1).length())
          {
            localArrayList1.add(((JSONArray)localObject1).optString(i));
            i++;
            continue;
          }
        }
        if (localJSONObject1.has("ecard_info"))
        {
          JSONObject localJSONObject2 = localJSONObject1.optJSONObject("ecard_info");
          localObject1 = new com/tencent/mm/plugin/wallet_core/model/ECardInfo;
          ((ECardInfo)localObject1).<init>();
          ((ECardInfo)localObject1).cRb = localJSONObject1.optString("guide_flag");
          ((ECardInfo)localObject1).title = localJSONObject1.optString("title");
          ((ECardInfo)localObject1).subtitle = localJSONObject1.optString("subtitle");
          ArrayList localArrayList2 = new java/util/ArrayList;
          localArrayList2.<init>(localArrayList1);
          ((ECardInfo)localObject1).typ = localArrayList2;
          ((ECardInfo)localObject1).tyr = localJSONObject1.optString("protocol_url");
          ((ECardInfo)localObject1).tys = localJSONObject1.optString("left_protocol_wording");
          ((ECardInfo)localObject1).tyt = localJSONObject1.optString("right_protocol_wording");
          ((ECardInfo)localObject1).tyq = localJSONObject1.optString("done_button_wording");
          ((ECardInfo)localObject1).jSu = localJSONObject2.optInt("ecard_open_scene", 0);
          ((ECardInfo)localObject1).cvQ = localJSONObject2.optString("ecard_type", "");
          ((ECardInfo)localObject1).tyj = localJSONObject2.optInt("show_check_box", 0);
          ((ECardInfo)localObject1).tyk = localJSONObject2.optInt("check_box_selected", 0);
          ((ECardInfo)localObject1).tyl = localJSONObject2.optString("check_box_left_wording", "");
          ((ECardInfo)localObject1).tym = localJSONObject2.optString("check_box_right_wording", "");
          ((ECardInfo)localObject1).tyn = localJSONObject2.optString("check_box_url", "");
          ((ECardInfo)localObject1).tyo = localJSONObject2.optInt("is_upload_credid", 0);
          ((ECardInfo)localObject1).cRf = localJSONObject2.optString("upload_credit_url", "");
          AppMethodBeat.o(46749);
          return localObject1;
        }
        AppMethodBeat.o(46749);
        localObject1 = null;
        continue;
      }
      catch (JSONException localJSONException)
      {
        ab.printErrStackTrace("MicroMsg.ECardInfo", localJSONException, "", new Object[0]);
      }
      AppMethodBeat.o(46749);
      Object localObject2 = null;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(46746);
    paramParcel.writeInt(this.jSu);
    paramParcel.writeString(this.cvQ);
    paramParcel.writeInt(this.tyj);
    paramParcel.writeInt(this.tyk);
    paramParcel.writeString(this.tyl);
    paramParcel.writeString(this.tym);
    paramParcel.writeString(this.tyn);
    paramParcel.writeInt(this.tyo);
    paramParcel.writeString(this.title);
    paramParcel.writeStringList(this.typ);
    paramParcel.writeString(this.tyq);
    paramParcel.writeString(this.tyr);
    paramParcel.writeString(this.tys);
    paramParcel.writeString(this.tyt);
    paramParcel.writeString(this.cRb);
    paramParcel.writeString(this.subtitle);
    AppMethodBeat.o(46746);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.ECardInfo
 * JD-Core Version:    0.6.2
 */