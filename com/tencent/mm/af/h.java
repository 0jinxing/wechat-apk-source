package com.tencent.mm.af;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.protocal.protobuf.cde;
import com.tencent.mm.protocal.protobuf.cdg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.util.Map;

public final class h extends f
{
  public final f Xz()
  {
    AppMethodBeat.i(16194);
    h localh = new h();
    AppMethodBeat.o(16194);
    return localh;
  }

  public final void a(StringBuilder paramStringBuilder, j.b paramb, String paramString, d paramd, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(16195);
    byte[] arrayOfByte;
    if (!bo.isNullOrNil(paramb.appId))
    {
      paramString = paramb.cMn;
      paramd = new cdg();
      if (paramString != null)
        arrayOfByte = Base64.decode(paramString, 0);
    }
    try
    {
      paramd.parseFrom(arrayOfByte);
      paramd.xcU = new cde();
      paramd.xcU.mVX = paramb.appId;
    }
    catch (Exception localException)
    {
      try
      {
        paramd = Base64.encodeToString(paramd.toByteArray(), 0);
        paramString = paramd;
        paramd = paramd.replace("\n", "");
        paramString = paramd;
        paramb.cMn = paramString;
        paramStringBuilder.append("<statextstr>" + bo.ani(paramb.cMn) + "</statextstr>");
        AppMethodBeat.o(16195);
        return;
        localException = localException;
        ab.printErrStackTrace("MicroMsg.AppContentStatExtStrPiece", localException, "", new Object[0]);
      }
      catch (IOException paramd)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.AppContentStatExtStrPiece", paramd, "", new Object[0]);
      }
    }
  }

  public final void a(Map<String, String> paramMap, j.b paramb)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.af.h
 * JD-Core Version:    0.6.2
 */