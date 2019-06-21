package com.tencent.mm.plugin.remittance.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.abw;
import com.tencent.mm.protocal.protobuf.lp;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

public class BusiRemittanceResp
  implements Parcelable
{
  public static final Parcelable.Creator<BusiRemittanceResp> CREATOR;
  public int pOA;
  public String pOB;
  public String pOC;
  public List<abw> pOD;
  public lp pOE;
  public int pOF;
  public int pOG;
  public int pOH;
  public int pOx;
  public String pOy;
  public String pOz;

  static
  {
    AppMethodBeat.i(44726);
    CREATOR = new BusiRemittanceResp.1();
    AppMethodBeat.o(44726);
  }

  BusiRemittanceResp()
  {
    AppMethodBeat.i(44722);
    this.pOx = 0;
    this.pOy = "";
    this.pOz = "";
    this.pOD = new LinkedList();
    this.pOF = 0;
    this.pOG = 0;
    this.pOH = 400;
    AppMethodBeat.o(44722);
  }

  protected BusiRemittanceResp(Parcel paramParcel)
  {
    AppMethodBeat.i(44724);
    this.pOx = 0;
    this.pOy = "";
    this.pOz = "";
    this.pOD = new LinkedList();
    this.pOF = 0;
    this.pOG = 0;
    this.pOH = 400;
    this.pOx = paramParcel.readInt();
    this.pOy = paramParcel.readString();
    this.pOz = paramParcel.readString();
    this.pOA = paramParcel.readInt();
    this.pOB = paramParcel.readString();
    this.pOC = paramParcel.readString();
    this.pOF = paramParcel.readInt();
    this.pOG = paramParcel.readInt();
    this.pOH = paramParcel.readInt();
    this.pOD = new LinkedList();
    int i = paramParcel.readInt();
    int j = 0;
    while (true)
      if (j < i)
      {
        int k = paramParcel.readInt();
        byte[] arrayOfByte1;
        if (k > 0)
        {
          arrayOfByte1 = new byte[k];
          paramParcel.readByteArray(arrayOfByte1);
        }
        try
        {
          abw localabw = new com/tencent/mm/protocal/protobuf/abw;
          localabw.<init>();
          localabw.parseFrom(arrayOfByte1);
          this.pOD.add(localabw);
          j++;
        }
        catch (Exception localException)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.BusiRemittanceResp", localException, "", new Object[0]);
        }
      }
    j = paramParcel.readInt();
    byte[] arrayOfByte2;
    if (j > 0)
    {
      arrayOfByte2 = new byte[j];
      paramParcel.readByteArray(arrayOfByte2);
      this.pOE = new lp();
    }
    while (true)
    {
      try
      {
        this.pOE.parseFrom(arrayOfByte2);
        AppMethodBeat.o(44724);
        return;
      }
      catch (Exception paramParcel)
      {
        ab.printErrStackTrace("MicroMsg.BusiRemittanceResp", paramParcel, "", new Object[0]);
      }
      AppMethodBeat.o(44724);
    }
  }

  BusiRemittanceResp(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(44723);
    this.pOx = 0;
    this.pOy = "";
    this.pOz = "";
    this.pOD = new LinkedList();
    this.pOF = 0;
    this.pOG = 0;
    this.pOH = 400;
    this.pOx = paramJSONObject.optInt("show_photo", 0);
    this.pOy = paramJSONObject.optString("photo_url", "");
    this.pOz = paramJSONObject.optString("favor_desc", "");
    this.pOA = paramJSONObject.optInt("scan_scene", 0);
    this.pOB = paramJSONObject.optString("favor_req_sign", "");
    this.pOC = paramJSONObject.optString("favor_req_extend", "");
    this.pOF = paramJSONObject.optInt("get_favor_flag", 0);
    this.pOG = paramJSONObject.optInt("photo_style", 0);
    this.pOH = paramJSONObject.optInt("get_favor_interval", 400);
    this.pOD = b.w(paramJSONObject.optJSONArray("favor_list"));
    paramJSONObject = paramJSONObject.optJSONObject("favor_comm_resp");
    if (paramJSONObject != null)
    {
      this.pOE = new lp();
      this.pOE.vPi = paramJSONObject.optString("default_fav_compose_id");
      this.pOE.vPg = b.w(paramJSONObject.optJSONArray("favor_info_list"));
      this.pOE.vPj = paramJSONObject.optString("favor_resp_sign");
      this.pOE.vPk = paramJSONObject.optString("no_compose_wording");
      this.pOE.vPh = b.v(paramJSONObject.optJSONArray("favor_compose_result_list"));
    }
    AppMethodBeat.o(44723);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(44725);
    paramParcel.writeInt(this.pOx);
    paramParcel.writeString(this.pOy);
    paramParcel.writeString(this.pOz);
    paramParcel.writeInt(this.pOA);
    paramParcel.writeString(this.pOB);
    paramParcel.writeString(this.pOC);
    paramParcel.writeInt(this.pOF);
    paramParcel.writeInt(this.pOG);
    paramParcel.writeInt(this.pOH);
    paramParcel.writeInt(this.pOD.size());
    if (this.pOD.size() > 0)
    {
      paramInt = 0;
      while (true)
        if (paramInt < this.pOD.size())
        {
          Object localObject1 = (abw)this.pOD.get(paramInt);
          try
          {
            localObject1 = ((abw)localObject1).toByteArray();
            paramParcel.writeInt(localObject1.length);
            if (localObject1.length > 0)
              paramParcel.writeByteArray((byte[])localObject1);
            paramInt++;
          }
          catch (Exception localException1)
          {
            while (true)
            {
              ab.printErrStackTrace("MicroMsg.BusiRemittanceResp", localException1, "", new Object[0]);
              localObject2 = new byte[0];
            }
          }
        }
    }
    Object localObject2 = new byte[0];
    try
    {
      byte[] arrayOfByte = this.pOE.toByteArray();
      localObject2 = arrayOfByte;
      paramParcel.writeInt(localObject2.length);
      if (localObject2.length > 0)
        paramParcel.writeByteArray((byte[])localObject2);
      AppMethodBeat.o(44725);
      return;
    }
    catch (Exception localException2)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.BusiRemittanceResp", localException2, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.BusiRemittanceResp
 * JD-Core Version:    0.6.2
 */