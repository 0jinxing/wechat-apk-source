package com.tencent.mm.plugin.luckymoney.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

public class LuckyMoneyEmojiSwitch
  implements Parcelable
{
  public static final Parcelable.Creator<LuckyMoneyEmojiSwitch> CREATOR;
  public int nXp;
  public int nXq;
  public int nXr;
  public int nXs;

  static
  {
    AppMethodBeat.i(42299);
    CREATOR = new LuckyMoneyEmojiSwitch.1();
    AppMethodBeat.o(42299);
  }

  public LuckyMoneyEmojiSwitch()
  {
    this.nXp = 0;
    this.nXq = 0;
    this.nXr = 0;
    this.nXs = 0;
  }

  protected LuckyMoneyEmojiSwitch(Parcel paramParcel)
  {
    AppMethodBeat.i(42297);
    this.nXp = 0;
    this.nXq = 0;
    this.nXr = 0;
    this.nXs = 0;
    this.nXp = paramParcel.readInt();
    this.nXq = paramParcel.readInt();
    this.nXr = paramParcel.readInt();
    this.nXs = paramParcel.readInt();
    AppMethodBeat.o(42297);
  }

  public static LuckyMoneyEmojiSwitch V(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(42295);
    LuckyMoneyEmojiSwitch localLuckyMoneyEmojiSwitch = new LuckyMoneyEmojiSwitch();
    localLuckyMoneyEmojiSwitch.nXp = paramJSONObject.optInt("showOpenNormalExpression", 0);
    localLuckyMoneyEmojiSwitch.nXq = paramJSONObject.optInt("showDetailNormalExpression", 0);
    localLuckyMoneyEmojiSwitch.nXr = paramJSONObject.optInt("enableAnswerByExpression", 0);
    localLuckyMoneyEmojiSwitch.nXs = paramJSONObject.optInt("enableAnswerBySelfie", 0);
    AppMethodBeat.o(42295);
    return localLuckyMoneyEmojiSwitch;
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(42298);
    String str = "LuckyMoneyEmojiSwitch{showOpenNormalExpression=" + this.nXp + ", showDetailNormalExpression=" + this.nXq + ", enalbeAnswerByExpression=" + this.nXr + ", enableAnswerBySelfie=" + this.nXs + '}';
    AppMethodBeat.o(42298);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(42296);
    paramParcel.writeInt(this.nXp);
    paramParcel.writeInt(this.nXq);
    paramParcel.writeInt(this.nXr);
    paramParcel.writeInt(this.nXs);
    AppMethodBeat.o(42296);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch
 * JD-Core Version:    0.6.2
 */