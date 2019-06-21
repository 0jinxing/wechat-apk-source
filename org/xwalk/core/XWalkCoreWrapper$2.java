package org.xwalk.core;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.util.f;

class XWalkCoreWrapper$2 extends XWalkNotifyChannelListener
{
  XWalkCoreWrapper$2(XWalkCoreWrapper paramXWalkCoreWrapper)
  {
  }

  public void onNotifyCallBackChannel(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(85554);
    Log.i("XWalkLib", "XWalkNotifyChannelListener called  funid = " + paramInt + " para size = " + paramArrayOfObject.length);
    switch (paramInt)
    {
    default:
    case 50001:
    case 50002:
    }
    try
    {
      paramArrayOfObject = new java/lang/StringBuilder;
      paramArrayOfObject.<init>("XWalkNotifyChannelListener called  funid = ");
      Log.i("XWalkLib", paramInt + " do not match");
      AppMethodBeat.o(85554);
      while (true)
      {
        return;
        f.n(Long.parseLong((String)paramArrayOfObject[0]), Long.parseLong((String)paramArrayOfObject[1]), Integer.parseInt((String)paramArrayOfObject[2]));
        AppMethodBeat.o(85554);
      }
    }
    catch (RuntimeException paramArrayOfObject)
    {
      while (true)
      {
        Log.e("XWalkLib", "XWalkNotifyChannelListener error:" + paramArrayOfObject.getLocalizedMessage());
        AppMethodBeat.o(85554);
        continue;
        f.bX(Integer.parseInt((String)paramArrayOfObject[0]), (String)paramArrayOfObject[1]);
        AppMethodBeat.o(85554);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkCoreWrapper.2
 * JD-Core Version:    0.6.2
 */