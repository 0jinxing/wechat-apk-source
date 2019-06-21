package com.tencent.mm.plugin.webview.luggage.permission;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.bt.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.h;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.protocal.protobuf.adp;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

public final class LuggageGetA8Key$RunCgiTask extends MainProcessTask
  implements f
{
  public static final Parcelable.Creator<RunCgiTask> CREATOR;
  String aIm;
  String appId;
  int boZ;
  byte[] cPB;
  int ctE;
  int errCode;
  int errType;
  int scene;
  adp uli;
  Runnable ulj;
  h ulk;
  private byte[] ull;
  String url;
  String username;

  static
  {
    AppMethodBeat.i(6466);
    CREATOR = new LuggageGetA8Key.RunCgiTask.1();
    AppMethodBeat.o(6466);
  }

  public LuggageGetA8Key$RunCgiTask()
  {
  }

  public LuggageGetA8Key$RunCgiTask(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6460);
    this.url = paramString1;
    this.username = paramString2;
    this.scene = paramInt1;
    this.boZ = paramInt2;
    this.ctE = paramInt3;
    this.appId = paramString3;
    this.cPB = paramArrayOfByte;
    aBV();
    AppMethodBeat.o(6460);
  }

  public final void asP()
  {
    AppMethodBeat.i(6461);
    ab.i("MicroMsg.LuggageGetA8Key.RunCgiTask", "start, url: %s", new Object[] { this.url });
    this.ulk = new h(this.url, this.username, this.scene, this.boZ, 0, LuggageGetA8Key.access$200(), this.ctE, this.appId, "", 0, this.cPB);
    g.RO().eJo.a(233, this);
    g.RO().eJo.a(this.ulk, 0);
    AppMethodBeat.o(6461);
  }

  public final void asQ()
  {
    AppMethodBeat.i(6463);
    ab.i("MicroMsg.LuggageGetA8Key.RunCgiTask", "runInClientProcess: %s", new Object[] { this.url });
    try
    {
      aBW();
      if (this.ull != null)
      {
        adp localadp = new com/tencent/mm/protocal/protobuf/adp;
        localadp.<init>();
        this.uli = localadp;
        this.uli.parseFrom(this.ull);
      }
      this.ulj.run();
      AppMethodBeat.o(6463);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.LuggageGetA8Key.RunCgiTask", localIOException, "", new Object[0]);
        AppMethodBeat.o(6463);
      }
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(6464);
    this.url = paramParcel.readString();
    this.username = paramParcel.readString();
    this.scene = paramParcel.readInt();
    this.boZ = paramParcel.readInt();
    this.ctE = paramParcel.readInt();
    this.appId = paramParcel.readString();
    this.cPB = paramParcel.createByteArray();
    this.ull = paramParcel.createByteArray();
    this.errType = paramParcel.readInt();
    this.errCode = paramParcel.readInt();
    this.aIm = paramParcel.readString();
    AppMethodBeat.o(6464);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(6462);
    if (paramm != this.ulk)
      AppMethodBeat.o(6462);
    while (true)
    {
      return;
      ab.i("MicroMsg.LuggageGetA8Key.RunCgiTask", "onSceneEnd, url: %s", new Object[] { this.url });
      g.RO().eJo.b(233, this);
      this.errType = paramInt1;
      this.errCode = paramInt2;
      this.aIm = paramString;
      try
      {
        this.ull = ((h)paramm).ehh.fsH.fsP.toByteArray();
        label89: aCb();
        AppMethodBeat.o(6462);
      }
      catch (Exception paramString)
      {
        break label89;
      }
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(6465);
    paramParcel.writeString(this.url);
    paramParcel.writeString(this.username);
    paramParcel.writeInt(this.scene);
    paramParcel.writeInt(this.boZ);
    paramParcel.writeInt(this.ctE);
    paramParcel.writeString(this.appId);
    paramParcel.writeByteArray(this.cPB);
    paramParcel.writeByteArray(this.ull);
    paramParcel.writeInt(this.errType);
    paramParcel.writeInt(this.errCode);
    paramParcel.writeString(this.aIm);
    AppMethodBeat.o(6465);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.permission.LuggageGetA8Key.RunCgiTask
 * JD-Core Version:    0.6.2
 */