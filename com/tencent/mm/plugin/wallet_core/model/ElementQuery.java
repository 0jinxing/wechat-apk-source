package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class ElementQuery
  implements Parcelable
{
  public static final Parcelable.Creator<ElementQuery> CREATOR;
  public static String tyu;
  public JSONObject fvc;
  public String nuL;
  public String pbn;
  public String pbo;
  public int tuo;
  public String twk;
  public String tyA;
  public String tyB;
  public boolean tyC;
  public int tyD;
  public int tyE;
  public String tyF;
  public String tyG;
  public String tyH;
  public String tyI;
  public String tyJ;
  public String tyK;
  public boolean tyL;
  public boolean tyM;
  public boolean tyN;
  public boolean tyO;
  public boolean tyP;
  public boolean tyQ;
  public boolean tyR;
  public boolean tyS;
  public boolean tyT;
  public String tyU;
  private List<Integer> tyV;
  public boolean tyW;
  public String tyX;
  public int tyY;
  public ArrayList<CreTypeRuleInfo> tyZ;
  public String tyv;
  public boolean tyw;
  public boolean tyx;
  public boolean tyy;
  public boolean tyz;
  public boolean tza;

  static
  {
    AppMethodBeat.i(46757);
    tyu = "bind_serial";
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(46757);
  }

  public ElementQuery()
  {
    this.tyV = null;
    this.tza = false;
  }

  public ElementQuery(Parcel paramParcel)
  {
    AppMethodBeat.i(46755);
    this.tyV = null;
    this.tza = false;
    this.pbo = paramParcel.readString();
    this.nuL = paramParcel.readString();
    this.tyv = paramParcel.readString();
    if (1 == paramParcel.readInt())
    {
      bool2 = true;
      this.tyw = bool2;
      if (1 != paramParcel.readInt())
        break label437;
      bool2 = true;
      label70: this.tyx = bool2;
      if (1 != paramParcel.readInt())
        break label442;
      bool2 = true;
      label85: this.tyy = bool2;
      if (1 != paramParcel.readInt())
        break label447;
      bool2 = true;
      label100: this.tyz = bool2;
      this.tyB = paramParcel.readString();
      this.pbo = paramParcel.readString();
      if (1 != paramParcel.readInt())
        break label452;
      bool2 = true;
      label131: this.tyC = bool2;
      this.tyD = paramParcel.readInt();
      this.tyE = paramParcel.readInt();
      this.pbn = paramParcel.readString();
      this.tyF = paramParcel.readString();
      this.tyG = paramParcel.readString();
      this.tyH = paramParcel.readString();
      this.tyK = paramParcel.readString();
      this.tyJ = paramParcel.readString();
      this.tyI = paramParcel.readString();
      if (1 != paramParcel.readInt())
        break label457;
      bool2 = true;
      label218: this.tyL = bool2;
      if (1 != paramParcel.readInt())
        break label462;
      bool2 = true;
      label233: this.tyM = bool2;
      if (1 != paramParcel.readInt())
        break label467;
      bool2 = true;
      label248: this.tyN = bool2;
      if (1 != paramParcel.readInt())
        break label472;
      bool2 = true;
      label263: this.tyO = bool2;
      if (1 != paramParcel.readInt())
        break label477;
      bool2 = true;
      label278: this.tyP = bool2;
      if (1 != paramParcel.readInt())
        break label482;
      bool2 = true;
      label293: this.tyQ = bool2;
      if (1 != paramParcel.readInt())
        break label487;
      bool2 = true;
      label308: this.tyS = bool2;
      if (1 != paramParcel.readInt())
        break label492;
      bool2 = true;
      label323: this.tyR = bool2;
      if (1 != paramParcel.readInt())
        break label497;
      bool2 = true;
      label338: this.tyT = bool2;
      this.tuo = paramParcel.readInt();
      this.tyU = paramParcel.readString();
      if (1 != paramParcel.readInt())
        break label502;
      bool2 = true;
      label369: this.tza = bool2;
      this.twk = paramParcel.readString();
      if (1 != paramParcel.readInt())
        break label507;
    }
    label437: label442: label447: label452: label457: label462: label467: label472: label477: label482: label487: label492: label497: label502: label507: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.tyW = bool2;
      this.tyX = paramParcel.readString();
      this.tyY = paramParcel.readInt();
      this.tyZ = paramParcel.readArrayList(CreTypeRuleInfo.class.getClassLoader());
      AppMethodBeat.o(46755);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label70;
      bool2 = false;
      break label85;
      bool2 = false;
      break label100;
      bool2 = false;
      break label131;
      bool2 = false;
      break label218;
      bool2 = false;
      break label233;
      bool2 = false;
      break label248;
      bool2 = false;
      break label263;
      bool2 = false;
      break label278;
      bool2 = false;
      break label293;
      bool2 = false;
      break label308;
      bool2 = false;
      break label323;
      bool2 = false;
      break label338;
      bool2 = false;
      break label369;
    }
  }

  public static ArrayList<CreTypeRuleInfo> ax(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46754);
    ArrayList localArrayList = new ArrayList();
    if (paramJSONObject != null)
    {
      JSONArray localJSONArray = paramJSONObject.optJSONArray("cre_rule_array");
      if (localJSONArray != null)
      {
        int i = localJSONArray.length();
        for (int j = 0; j < i; j++)
        {
          paramJSONObject = CreTypeRuleInfo.av(localJSONArray.optJSONObject(j));
          if (paramJSONObject != null)
            localArrayList.add(paramJSONObject);
        }
      }
    }
    AppMethodBeat.o(46754);
    return localArrayList;
  }

  public final boolean cPe()
  {
    if (2 == this.tyE);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean cPr()
  {
    boolean bool = true;
    if (1 == this.tyE);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final List<Integer> cPs()
  {
    AppMethodBeat.i(46753);
    Object localObject;
    if (this.tyV != null)
    {
      localObject = this.tyV;
      AppMethodBeat.o(46753);
    }
    while (true)
    {
      return localObject;
      if (!bo.isNullOrNil(this.tyU))
      {
        this.tyV = new ArrayList();
        localObject = this.tyU.split("\\|");
        int i = localObject.length;
        for (int j = 0; j < i; j++)
        {
          int k = bo.getInt(localObject[j], 0);
          if (k > 0)
            this.tyV.add(Integer.valueOf(k));
        }
        localObject = this.tyV;
        AppMethodBeat.o(46753);
      }
      else
      {
        localObject = null;
        AppMethodBeat.o(46753);
      }
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public final boolean isError()
  {
    AppMethodBeat.i(46752);
    boolean bool = "0".equals(bo.bc(this.tyG, "").trim());
    AppMethodBeat.o(46752);
    return bool;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(46756);
    paramParcel.writeString(bo.bc(this.pbo, ""));
    paramParcel.writeString(bo.bc(this.nuL, ""));
    paramParcel.writeString(bo.bc(this.tyv, ""));
    if (this.tyw)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.tyx)
        break label464;
      paramInt = 1;
      label70: paramParcel.writeInt(paramInt);
      if (!this.tyy)
        break label469;
      paramInt = 1;
      label84: paramParcel.writeInt(paramInt);
      if (!this.tyz)
        break label474;
      paramInt = 1;
      label98: paramParcel.writeInt(paramInt);
      paramParcel.writeString(bo.bc(this.tyB, ""));
      paramParcel.writeString(bo.bc(this.pbo, ""));
      if (!this.tyC)
        break label479;
      paramInt = 1;
      label138: paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.tyD);
      paramParcel.writeInt(this.tyE);
      paramParcel.writeString(bo.bc(this.pbn, ""));
      paramParcel.writeString(bo.bc(this.tyF, ""));
      paramParcel.writeString(bo.bc(this.tyG, ""));
      paramParcel.writeString(bo.bc(this.tyH, ""));
      paramParcel.writeString(bo.bc(this.tyK, ""));
      paramParcel.writeString(bo.bc(this.tyJ, ""));
      paramParcel.writeString(bo.bc(this.tyI, ""));
      if (!this.tyL)
        break label484;
      paramInt = 1;
      label259: paramParcel.writeInt(paramInt);
      if (!this.tyM)
        break label489;
      paramInt = 1;
      label273: paramParcel.writeInt(paramInt);
      if (!this.tyN)
        break label494;
      paramInt = 1;
      label287: paramParcel.writeInt(paramInt);
      if (!this.tyO)
        break label499;
      paramInt = 1;
      label301: paramParcel.writeInt(paramInt);
      if (!this.tyP)
        break label504;
      paramInt = 1;
      label315: paramParcel.writeInt(paramInt);
      if (!this.tyQ)
        break label509;
      paramInt = 1;
      label329: paramParcel.writeInt(paramInt);
      if (!this.tyS)
        break label514;
      paramInt = 1;
      label343: paramParcel.writeInt(paramInt);
      if (!this.tyR)
        break label519;
      paramInt = 1;
      label357: paramParcel.writeInt(paramInt);
      if (!this.tyT)
        break label524;
      paramInt = 1;
      label371: paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.tuo);
      paramParcel.writeString(this.tyU);
      if (!this.tza)
        break label529;
      paramInt = 1;
      label401: paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.twk);
      if (!this.tyW)
        break label534;
    }
    label514: label519: label524: label529: label534: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.tyX);
      paramParcel.writeInt(this.tyY);
      paramParcel.writeList(this.tyZ);
      AppMethodBeat.o(46756);
      return;
      paramInt = 0;
      break;
      label464: paramInt = 0;
      break label70;
      label469: paramInt = 0;
      break label84;
      label474: paramInt = 0;
      break label98;
      label479: paramInt = 0;
      break label138;
      label484: paramInt = 0;
      break label259;
      label489: paramInt = 0;
      break label273;
      label494: paramInt = 0;
      break label287;
      label499: paramInt = 0;
      break label301;
      label504: paramInt = 0;
      break label315;
      label509: paramInt = 0;
      break label329;
      paramInt = 0;
      break label343;
      paramInt = 0;
      break label357;
      paramInt = 0;
      break label371;
      paramInt = 0;
      break label401;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.ElementQuery
 * JD-Core Version:    0.6.2
 */