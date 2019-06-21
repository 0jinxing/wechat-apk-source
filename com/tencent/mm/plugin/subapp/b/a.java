package com.tencent.mm.plugin.subapp.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.alu;
import com.tencent.mm.protocal.protobuf.alv;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.RandomAccessFile;

public final class a extends m
  implements k
{
  private RandomAccessFile bqD;
  private f ehi;
  private String filePath;
  private int frO;
  private int ssK;
  String url;

  public a(String paramString)
  {
    this.url = paramString;
    this.ssK = 0;
    this.frO = 0;
    this.filePath = null;
    this.bqD = null;
  }

  // ERROR //
  private boolean d(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: sipush 25239
    //   6: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: iload_3
    //   10: ifne +102 -> 112
    //   13: aload_0
    //   14: getfield 31	com/tencent/mm/plugin/subapp/b/a:bqD	Ljava/io/RandomAccessFile;
    //   17: ifnonnull +10 -> 27
    //   20: aload_0
    //   21: getfield 29	com/tencent/mm/plugin/subapp/b/a:filePath	Ljava/lang/String;
    //   24: ifnull +19 -> 43
    //   27: ldc 46
    //   29: ldc 48
    //   31: invokestatic 54	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: sipush 25239
    //   37: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   40: iload 4
    //   42: ireturn
    //   43: aload_0
    //   44: aload_1
    //   45: invokestatic 63	com/tencent/mm/pluginsdk/h/a/a:ajk	(Ljava/lang/String;)Ljava/lang/String;
    //   48: putfield 29	com/tencent/mm/plugin/subapp/b/a:filePath	Ljava/lang/String;
    //   51: aload_0
    //   52: getfield 29	com/tencent/mm/plugin/subapp/b/a:filePath	Ljava/lang/String;
    //   55: ifnonnull +38 -> 93
    //   58: ldc 46
    //   60: new 65	java/lang/StringBuilder
    //   63: dup
    //   64: ldc 67
    //   66: invokespecial 69	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   69: aload_1
    //   70: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: ldc 75
    //   75: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   81: invokestatic 54	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   84: sipush 25239
    //   87: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   90: goto -50 -> 40
    //   93: new 81	java/io/RandomAccessFile
    //   96: astore_1
    //   97: aload_1
    //   98: aload_0
    //   99: getfield 29	com/tencent/mm/plugin/subapp/b/a:filePath	Ljava/lang/String;
    //   102: ldc 83
    //   104: invokespecial 85	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   107: aload_0
    //   108: aload_1
    //   109: putfield 31	com/tencent/mm/plugin/subapp/b/a:bqD	Ljava/io/RandomAccessFile;
    //   112: aload_0
    //   113: getfield 31	com/tencent/mm/plugin/subapp/b/a:bqD	Ljava/io/RandomAccessFile;
    //   116: iload_3
    //   117: i2l
    //   118: invokevirtual 89	java/io/RandomAccessFile:seek	(J)V
    //   121: aload_0
    //   122: getfield 31	com/tencent/mm/plugin/subapp/b/a:bqD	Ljava/io/RandomAccessFile;
    //   125: aload_2
    //   126: iconst_0
    //   127: aload_2
    //   128: arraylength
    //   129: invokevirtual 93	java/io/RandomAccessFile:write	([BII)V
    //   132: iconst_1
    //   133: istore 4
    //   135: sipush 25239
    //   138: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   141: goto -101 -> 40
    //   144: astore_1
    //   145: ldc 46
    //   147: new 65	java/lang/StringBuilder
    //   150: dup
    //   151: ldc 95
    //   153: invokespecial 69	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   156: aload_0
    //   157: getfield 29	com/tencent/mm/plugin/subapp/b/a:filePath	Ljava/lang/String;
    //   160: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: ldc 97
    //   165: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: aload_1
    //   169: invokevirtual 100	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   172: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   178: invokestatic 54	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   181: sipush 25239
    //   184: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   187: goto -147 -> 40
    //   190: astore_1
    //   191: ldc 46
    //   193: new 65	java/lang/StringBuilder
    //   196: dup
    //   197: ldc 102
    //   199: invokespecial 69	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   202: aload_0
    //   203: getfield 29	com/tencent/mm/plugin/subapp/b/a:filePath	Ljava/lang/String;
    //   206: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: ldc 104
    //   211: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: aload_1
    //   215: invokevirtual 105	java/io/IOException:getMessage	()Ljava/lang/String;
    //   218: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   224: invokestatic 54	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   227: sipush 25239
    //   230: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   233: goto -193 -> 40
    //
    // Exception table:
    //   from	to	target	type
    //   93	112	144	java/lang/Exception
    //   112	132	190	java/io/IOException
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(25236);
    this.ehi = paramf;
    paramf = new b.a();
    paramf.fsJ = new alu();
    paramf.fsK = new alv();
    paramf.uri = "/cgi-bin/micromsg-bin/getpsmimg";
    paramf.fsI = 141;
    paramf.fsL = 29;
    paramf.fsM = 1000000029;
    com.tencent.mm.ai.b localb = paramf.acD();
    paramf = (alu)localb.fsG.fsP;
    paramf.URL = this.url;
    paramf.vOq = this.ssK;
    ab.v("MicroMsg.NetSceneGetPSMImg", "doscene url:[" + this.url + "] + offset:" + this.ssK + " totallen:" + this.frO);
    int i = a(parame, localb, this);
    AppMethodBeat.o(25236);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(25238);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneGetPSMImg", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(25238);
    }
    while (true)
    {
      return;
      paramq = (alv)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      ab.d("MicroMsg.NetSceneGetPSMImg", "onGYNetEnd url:[" + this.url + "] + offset:" + this.ssK + " Resp[ totallen:" + paramq.vOp + " bufSize:" + paramq.ptz.getILen() + " ]");
      if (paramq.vOp > 0)
        this.frO = paramq.vOp;
      if (!d(this.url, paramq.ptz.getBuffer().wR, this.ssK))
      {
        this.ehi.onSceneEnd(3, -1, paramString, this);
        AppMethodBeat.o(25238);
      }
      else
      {
        paramInt1 = this.ssK;
        this.ssK = (paramq.ptz.getILen() + paramInt1);
        if (this.frO <= this.ssK)
        {
          ab.d("MicroMsg.NetSceneGetPSMImg", "down url:[" + this.url + "] final size: " + this.frO);
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(25238);
        }
        else
        {
          if (a(this.ftf, this.ehi) < 0)
            this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(25238);
        }
      }
    }
  }

  public final int acn()
  {
    return 10;
  }

  public final m.b b(q paramq)
  {
    AppMethodBeat.i(25237);
    paramq = ((alu)((com.tencent.mm.ai.b)paramq).fsG.fsP).URL;
    int i;
    if (paramq == null)
    {
      i = 0;
      if (i != 0)
        break label88;
      ab.e("MicroMsg.NetSceneGetPSMImg", "security checked failed : url invalid:" + this.url);
      paramq = m.b.ftv;
      AppMethodBeat.o(25237);
    }
    while (true)
    {
      return paramq;
      if (paramq.indexOf("weixin://") != 0)
      {
        i = 0;
        break;
      }
      i = 1;
      break;
      label88: if ((this.ssK < 0) || (this.frO < 0))
      {
        ab.e("MicroMsg.NetSceneGetPSMImg", "security checked failed : offset:" + this.ssK + " total:" + this.frO);
        paramq = m.b.ftv;
        AppMethodBeat.o(25237);
      }
      else if (this.ssK == 0)
      {
        if (this.frO != 0)
        {
          ab.e("MicroMsg.NetSceneGetPSMImg", "security checked failed : offset:" + this.ssK + " total:" + this.frO);
          paramq = m.b.ftv;
          AppMethodBeat.o(25237);
        }
      }
      else if (this.ssK >= this.frO)
      {
        ab.e("MicroMsg.NetSceneGetPSMImg", "security checked failed : offset:" + this.ssK + " total:" + this.frO);
        paramq = m.b.ftv;
        AppMethodBeat.o(25237);
      }
      else
      {
        paramq = m.b.ftu;
        AppMethodBeat.o(25237);
      }
    }
  }

  public final int getType()
  {
    return 141;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.b.a
 * JD-Core Version:    0.6.2
 */