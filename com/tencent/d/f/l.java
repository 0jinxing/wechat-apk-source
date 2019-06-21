package com.tencent.d.f;

import com.qq.taf.RequestPacket;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Set;

public final class l
{
  static HashMap<String, byte[]> AuE = null;
  protected String AuA;
  protected RequestPacket AuB;
  protected HashMap<String, byte[]> AuC;
  private HashMap<String, Object> AuD;

  public l()
  {
    AppMethodBeat.i(114622);
    this.AuA = "UTF-8";
    this.AuB = new RequestPacket();
    this.AuC = new HashMap();
    this.AuD = new HashMap();
    this.AuB.iVersion = ((short)3);
    AppMethodBeat.o(114622);
  }

  public final byte[] AL()
  {
    AppMethodBeat.i(114624);
    if (this.AuB.sServantName == null)
      this.AuB.sServantName = "";
    if (this.AuB.sFuncName == null)
      this.AuB.sFuncName = "";
    Object localObject = new JceOutputStream(0);
    ((JceOutputStream)localObject).setServerEncoding(this.AuA);
    ((JceOutputStream)localObject).write(this.AuC, 0);
    this.AuB.sBuffer = JceUtil.getJceBufArray(((JceOutputStream)localObject).getByteBuffer());
    localObject = new JceOutputStream(0);
    ((JceOutputStream)localObject).setServerEncoding(this.AuA);
    this.AuB.writeTo((JceOutputStream)localObject);
    byte[] arrayOfByte = JceUtil.getJceBufArray(((JceOutputStream)localObject).getByteBuffer());
    int i = arrayOfByte.length;
    localObject = ByteBuffer.allocate(i + 4);
    ((ByteBuffer)localObject).putInt(i + 4).put(arrayOfByte).flip();
    localObject = ((ByteBuffer)localObject).array();
    AppMethodBeat.o(114624);
    return localObject;
  }

  public final void atW(String paramString)
  {
    this.AuA = paramString;
  }

  public final void atX(String paramString)
  {
    this.AuB.sServantName = paramString;
  }

  public final void atY(String paramString)
  {
    this.AuB.sFuncName = paramString;
  }

  public final void dQJ()
  {
    this.AuB.iRequestId = 3;
  }

  public final <T> void put(String paramString, T paramT)
  {
    AppMethodBeat.i(114623);
    if ((paramString.startsWith(".")) || (paramT == null) || ((paramT instanceof Set)))
    {
      paramString = new IllegalArgumentException("wup put err");
      AppMethodBeat.o(114623);
      throw paramString;
    }
    JceOutputStream localJceOutputStream = new JceOutputStream();
    localJceOutputStream.setServerEncoding(this.AuA);
    localJceOutputStream.write(paramT, 0);
    paramT = JceUtil.getJceBufArray(localJceOutputStream.getByteBuffer());
    this.AuC.put(paramString, paramT);
    AppMethodBeat.o(114623);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.d.f.l
 * JD-Core Version:    0.6.2
 */