package com.tencent.mm.sdk.d;

import android.os.Message;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Calendar;

public final class d$a
{
  private a xCA;
  private a xCB;
  private d xCv;
  private long xCw;
  private int xCx;
  private String xCy;
  private a xCz;

  d$a(d paramd, Message paramMessage, String paramString, a parama1, a parama2, a parama3)
  {
    AppMethodBeat.i(52448);
    a(paramd, paramMessage, paramString, parama1, parama2, parama3);
    AppMethodBeat.o(52448);
  }

  public final void a(d paramd, Message paramMessage, String paramString, a parama1, a parama2, a parama3)
  {
    AppMethodBeat.i(52449);
    this.xCv = paramd;
    this.xCw = System.currentTimeMillis();
    if (paramMessage != null);
    for (int i = paramMessage.what; ; i = 0)
    {
      this.xCx = i;
      this.xCy = paramString;
      this.xCz = parama1;
      this.xCA = parama2;
      this.xCB = parama3;
      AppMethodBeat.o(52449);
      return;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(52450);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("time=");
    Object localObject = Calendar.getInstance();
    ((Calendar)localObject).setTimeInMillis(this.xCw);
    localStringBuilder.append(String.format("%tm-%td %tH:%tM:%tS.%tL", new Object[] { localObject, localObject, localObject, localObject, localObject, localObject }));
    localStringBuilder.append(" processed=");
    if (this.xCz == null)
    {
      localObject = "<null>";
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(" org=");
      if (this.xCA != null)
        break label249;
      localObject = "<null>";
      label111: localStringBuilder.append((String)localObject);
      localStringBuilder.append(" dest=");
      if (this.xCB != null)
        break label262;
      localObject = "<null>";
      label134: localStringBuilder.append((String)localObject);
      localStringBuilder.append(" what=");
      if (this.xCv == null)
        break label275;
      localObject = null;
      label156: if (!TextUtils.isEmpty((CharSequence)localObject))
        break label281;
      localStringBuilder.append(this.xCx);
      localStringBuilder.append("(0x");
      localStringBuilder.append(Integer.toHexString(this.xCx));
      localStringBuilder.append(")");
    }
    while (true)
    {
      if (!TextUtils.isEmpty(this.xCy))
      {
        localStringBuilder.append(" ");
        localStringBuilder.append(this.xCy);
      }
      localObject = localStringBuilder.toString();
      AppMethodBeat.o(52450);
      return localObject;
      localObject = this.xCz.getName();
      break;
      label249: localObject = this.xCA.getName();
      break label111;
      label262: localObject = this.xCB.getName();
      break label134;
      label275: localObject = "";
      break label156;
      label281: localStringBuilder.append((String)localObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.d.d.a
 * JD-Core Version:    0.6.2
 */