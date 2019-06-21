package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.ef;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.as;
import java.io.IOException;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$AppMsgContextCache;", "", "()V", "TAG", "", "checkValid", "", "appMsgContext", "Lcom/tencent/mm/protocal/protobuf/AppMsgContext;", "lowerVersion", "", "clear", "get", "url", "has", "tmplType", "save", "", "plugin-brandservice_release"})
public final class PreloadLogic$a
{
  private final String TAG = "MicroMsg.Preload.BizAppMsgContextCache";

  private final boolean a(ef paramef, int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(14862);
    if (paramef == null)
    {
      ab.v(this.TAG, "checkValid: null");
      AppMethodBeat.o(14862);
    }
    for (boolean bool2 = bool1; ; bool2 = bool1)
    {
      return bool2;
      if ((paramef.vFY == 0) || (paramef.vFY >= paramInt))
        break;
      ab.v(this.TAG, "checkValid: lower version:data(" + paramef.vFY + ") < require(" + paramInt + ')');
      AppMethodBeat.o(14862);
    }
    Object localObject = g.jSD;
    if (g.a.aXh())
      ab.i(this.TAG, "checkValid: debug to expire");
    label229: 
    while (true)
    {
      AppMethodBeat.o(14862);
      bool2 = true;
      break;
      localObject = paramef.Url;
      j.o(localObject, "appMsgContext.Url");
      String str = b.FK((String)localObject);
      localObject = b.FL(str);
      if (localObject != null);
      for (bool2 = d.a((as)localObject, str, paramef.vFU * 1000L); ; bool2 = true)
      {
        if (!bool2)
          break label229;
        ab.i(this.TAG, "checkValid: expire for " + paramef.vFU);
        AppMethodBeat.o(14862);
        bool2 = bool1;
        break;
      }
    }
  }

  public final ef FP(String paramString)
  {
    AppMethodBeat.i(14861);
    j.p(paramString, "url");
    String str = b.FI(paramString);
    Object localObject = b.FL(str);
    ef localef;
    if (localObject != null)
    {
      localef = new ef();
      localObject = ((as)localObject).decodeBytes(str);
    }
    while (true)
    {
      try
      {
        localef.parseFrom((byte[])localObject);
        localef.Url = paramString;
        localObject = this.TAG;
        paramString = new java/lang/StringBuilder;
        paramString.<init>("found:");
        ab.i((String)localObject, str + " last modify:" + localef.vFW);
        AppMethodBeat.o(14861);
        paramString = localef;
        return paramString;
      }
      catch (IOException paramString)
      {
        ab.printErrStackTrace(this.TAG, (Throwable)paramString, "get:".concat(String.valueOf(str)), new Object[0]);
      }
      ab.i(this.TAG, "not found:".concat(String.valueOf(str)));
      paramString = null;
      AppMethodBeat.o(14861);
    }
  }

  public final void a(String paramString, ef paramef)
  {
    Object localObject = null;
    AppMethodBeat.i(14863);
    j.p(paramString, "url");
    if (paramef == null)
    {
      ab.e(this.TAG, "save fail, appMsgContext is null");
      AppMethodBeat.o(14863);
    }
    while (true)
    {
      return;
      String str1 = b.FI(paramString);
      as localas = b.aWO();
      String str2 = paramef.ncM;
      try
      {
        byte[] arrayOfByte = paramef.toByteArray();
        localObject = arrayOfByte;
        ef localef = new com/tencent/mm/protocal/protobuf/ef;
        localObject = arrayOfByte;
        localef.<init>();
        localObject = arrayOfByte;
        localef.parseFrom(arrayOfByte);
        localObject = arrayOfByte;
        localef.ncM = null;
        localObject = arrayOfByte;
        arrayOfByte = localef.toByteArray();
        localObject = arrayOfByte;
        if (localObject != null)
        {
          localas.encode(str1, localObject);
          if (str2 != null)
            localas.putString(b.FJ(paramString), str2);
          d.a(localas, b.FK(paramString));
        }
        ab.i(this.TAG, "save " + str1 + " last modify:" + paramef.vFW);
        AppMethodBeat.o(14863);
      }
      catch (IOException localIOException)
      {
        while (true)
          ab.printErrStackTrace(this.TAG, (Throwable)localIOException, "save ".concat(String.valueOf(str1)), new Object[0]);
      }
    }
  }

  public final boolean bK(String paramString, int paramInt)
  {
    AppMethodBeat.i(14860);
    j.p(paramString, "url");
    ef localef = FP(paramString);
    boolean bool;
    if (localef == null)
    {
      bool = false;
      AppMethodBeat.o(14860);
      return bool;
    }
    Object localObject = PreloadLogic.jSS;
    label52: int i;
    if (localef != null)
    {
      localObject = Integer.valueOf(localef.vGc);
      i = PreloadLogic.sn(((Integer)localObject).intValue());
      if (i != -1)
        break label130;
    }
    while (true)
    {
      localObject = PreloadLogic.jSS;
      bool = a(localef, PreloadLogic.so(paramInt));
      if (!bool)
        ab.d(this.TAG, "init valid:" + b.FI(paramString));
      AppMethodBeat.o(14860);
      break;
      localObject = null;
      break label52;
      label130: paramInt = i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic.a
 * JD-Core Version:    0.6.2
 */