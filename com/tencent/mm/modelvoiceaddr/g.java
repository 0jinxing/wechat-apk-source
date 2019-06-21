package com.tencent.mm.modelvoiceaddr;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac;
import java.util.List;

public final class g
  implements f, b
{
  private static int cri;
  private static final String gaQ;
  public static int gbc;
  public static int gbd;
  public static int gbe;
  private com.tencent.mm.audio.b.c coZ;
  private com.tencent.mm.audio.b.c.a cpM;
  private int gaD;
  private int gaS;
  private int gaT;
  private boolean gaU;
  private com.tencent.mm.audio.d.a gaY;
  private a gba;
  private boolean gbf;
  private g.b gbg;
  private com.tencent.mm.modelvoiceaddr.a.c gbh;
  private com.tencent.mm.modelvoiceaddr.a.c.a gbi;
  private int scene;

  static
  {
    AppMethodBeat.i(116721);
    gbc = 1;
    gbd = 2;
    gbe = 4;
    gaQ = ac.eSj + "voice_temp.silk";
    cri = 5000;
    AppMethodBeat.o(116721);
  }

  public g()
  {
    AppMethodBeat.i(116712);
    this.gaS = 0;
    this.gaT = 0;
    this.gaU = false;
    this.gbf = false;
    this.scene = 0;
    this.gaD = gbc;
    this.gbg = null;
    this.gba = null;
    this.cpM = new g.1(this);
    this.gbi = new g.2(this);
    AppMethodBeat.o(116712);
  }

  public g(int paramInt1, int paramInt2, g.b paramb)
  {
    AppMethodBeat.i(116713);
    this.gaS = 0;
    this.gaT = 0;
    this.gaU = false;
    this.gbf = false;
    this.scene = 0;
    this.gaD = gbc;
    this.gbg = null;
    this.gba = null;
    this.cpM = new g.1(this);
    this.gbi = new g.2(this);
    this.gaD = paramInt1;
    this.gbg = paramb;
    this.scene = paramInt2;
    AppMethodBeat.o(116713);
  }

  // ERROR //
  private void l(boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: ldc 168
    //   2: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 132
    //   7: ldc 170
    //   9: iconst_2
    //   10: anewarray 4	java/lang/Object
    //   13: dup
    //   14: iconst_0
    //   15: iload_1
    //   16: invokestatic 175	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   19: aastore
    //   20: dup
    //   21: iconst_1
    //   22: iload_2
    //   23: invokestatic 175	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   26: aastore
    //   27: invokestatic 177	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   30: aload_0
    //   31: monitorenter
    //   32: aload_0
    //   33: iconst_1
    //   34: putfield 93	com/tencent/mm/modelvoiceaddr/g:gbf	Z
    //   37: aload_0
    //   38: getfield 120	com/tencent/mm/modelvoiceaddr/g:coZ	Lcom/tencent/mm/audio/b/c;
    //   41: ifnull +16 -> 57
    //   44: aload_0
    //   45: getfield 120	com/tencent/mm/modelvoiceaddr/g:coZ	Lcom/tencent/mm/audio/b/c;
    //   48: invokevirtual 183	com/tencent/mm/audio/b/c:EB	()Z
    //   51: pop
    //   52: aload_0
    //   53: aconst_null
    //   54: putfield 120	com/tencent/mm/modelvoiceaddr/g:coZ	Lcom/tencent/mm/audio/b/c;
    //   57: aload_0
    //   58: getfield 124	com/tencent/mm/modelvoiceaddr/g:gaY	Lcom/tencent/mm/audio/d/a;
    //   61: ifnull +17 -> 78
    //   64: aload_0
    //   65: getfield 124	com/tencent/mm/modelvoiceaddr/g:gaY	Lcom/tencent/mm/audio/d/a;
    //   68: invokeinterface 188 1 0
    //   73: aload_0
    //   74: aconst_null
    //   75: putfield 124	com/tencent/mm/modelvoiceaddr/g:gaY	Lcom/tencent/mm/audio/d/a;
    //   78: aload_0
    //   79: getfield 127	com/tencent/mm/modelvoiceaddr/g:gbh	Lcom/tencent/mm/modelvoiceaddr/a/c;
    //   82: astore_3
    //   83: aload_3
    //   84: ifnull +15 -> 99
    //   87: aload_0
    //   88: getfield 127	com/tencent/mm/modelvoiceaddr/g:gbh	Lcom/tencent/mm/modelvoiceaddr/a/c;
    //   91: invokevirtual 193	com/tencent/mm/modelvoiceaddr/a/c:release	()V
    //   94: aload_0
    //   95: aconst_null
    //   96: putfield 127	com/tencent/mm/modelvoiceaddr/g:gbh	Lcom/tencent/mm/modelvoiceaddr/a/c;
    //   99: aload_0
    //   100: iconst_0
    //   101: putfield 89	com/tencent/mm/modelvoiceaddr/g:gaT	I
    //   104: aload_0
    //   105: getfield 101	com/tencent/mm/modelvoiceaddr/g:gba	Lcom/tencent/mm/modelvoiceaddr/a;
    //   108: ifnull +40 -> 148
    //   111: aload_0
    //   112: getfield 101	com/tencent/mm/modelvoiceaddr/g:gba	Lcom/tencent/mm/modelvoiceaddr/a;
    //   115: instanceof 195
    //   118: ifeq +30 -> 148
    //   121: aload_0
    //   122: getfield 101	com/tencent/mm/modelvoiceaddr/g:gba	Lcom/tencent/mm/modelvoiceaddr/a;
    //   125: invokevirtual 200	com/tencent/mm/modelvoiceaddr/a:amj	()V
    //   128: getstatic 77	com/tencent/mm/modelvoiceaddr/g:gaQ	Ljava/lang/String;
    //   131: invokestatic 206	com/tencent/mm/a/e:cs	(Ljava/lang/String;)I
    //   134: istore 4
    //   136: aload_0
    //   137: getfield 101	com/tencent/mm/modelvoiceaddr/g:gba	Lcom/tencent/mm/modelvoiceaddr/a;
    //   140: checkcast 195	com/tencent/mm/modelvoiceaddr/c
    //   143: iload 4
    //   145: invokevirtual 209	com/tencent/mm/modelvoiceaddr/c:mw	(I)V
    //   148: iload_1
    //   149: ifne +10 -> 159
    //   152: aload_0
    //   153: getfield 91	com/tencent/mm/modelvoiceaddr/g:gaU	Z
    //   156: ifne +60 -> 216
    //   159: aload_0
    //   160: monitorexit
    //   161: ldc 168
    //   163: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   166: return
    //   167: astore_3
    //   168: ldc 132
    //   170: aload_3
    //   171: ldc 211
    //   173: iconst_0
    //   174: anewarray 4	java/lang/Object
    //   177: invokestatic 215	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   180: goto -81 -> 99
    //   183: astore_3
    //   184: aload_0
    //   185: monitorexit
    //   186: ldc 168
    //   188: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   191: aload_3
    //   192: athrow
    //   193: astore_3
    //   194: ldc 132
    //   196: aload_3
    //   197: ldc 217
    //   199: iconst_0
    //   200: anewarray 4	java/lang/Object
    //   203: invokestatic 215	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   206: aload_0
    //   207: bipush 6
    //   209: iconst_m1
    //   210: invokevirtual 221	com/tencent/mm/modelvoiceaddr/g:cG	(II)V
    //   213: goto -65 -> 148
    //   216: aload_0
    //   217: getfield 101	com/tencent/mm/modelvoiceaddr/g:gba	Lcom/tencent/mm/modelvoiceaddr/a;
    //   220: ifnull +55 -> 275
    //   223: aload_0
    //   224: getfield 101	com/tencent/mm/modelvoiceaddr/g:gba	Lcom/tencent/mm/modelvoiceaddr/a;
    //   227: instanceof 195
    //   230: ifeq +45 -> 275
    //   233: ldc 132
    //   235: ldc 223
    //   237: iconst_1
    //   238: anewarray 4	java/lang/Object
    //   241: dup
    //   242: iconst_0
    //   243: iload_2
    //   244: invokestatic 175	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   247: aastore
    //   248: invokestatic 177	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   251: iload_2
    //   252: ifeq +13 -> 265
    //   255: aload_0
    //   256: getfield 101	com/tencent/mm/modelvoiceaddr/g:gba	Lcom/tencent/mm/modelvoiceaddr/a;
    //   259: checkcast 195	com/tencent/mm/modelvoiceaddr/c
    //   262: invokevirtual 226	com/tencent/mm/modelvoiceaddr/c:amp	()V
    //   265: invokestatic 232	com/tencent/mm/kernel/g:Rg	()Lcom/tencent/mm/ai/p;
    //   268: sipush 235
    //   271: aload_0
    //   272: invokevirtual 237	com/tencent/mm/ai/p:b	(ILcom/tencent/mm/ai/f;)V
    //   275: aload_0
    //   276: aconst_null
    //   277: putfield 101	com/tencent/mm/modelvoiceaddr/g:gba	Lcom/tencent/mm/modelvoiceaddr/a;
    //   280: aload_0
    //   281: iconst_0
    //   282: putfield 91	com/tencent/mm/modelvoiceaddr/g:gaU	Z
    //   285: aload_0
    //   286: monitorexit
    //   287: ldc 168
    //   289: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   292: goto -126 -> 166
    //
    // Exception table:
    //   from	to	target	type
    //   87	99	167	java/lang/Exception
    //   32	57	183	finally
    //   57	78	183	finally
    //   78	83	183	finally
    //   87	99	183	finally
    //   99	136	183	finally
    //   136	148	183	finally
    //   152	159	183	finally
    //   159	161	183	finally
    //   168	180	183	finally
    //   184	186	183	finally
    //   194	213	183	finally
    //   216	251	183	finally
    //   255	265	183	finally
    //   265	275	183	finally
    //   275	287	183	finally
    //   136	148	193	java/lang/Exception
  }

  public final void cG(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(116716);
    ab.i("MicroMsg.SceneVoiceInputAddr", "error localCode = %s,errType = %s,errCode = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(-1) });
    if (this.gbg != null)
      this.gbg.c(paramInt1, paramInt2, -1, -1L);
    l(false, true);
    AppMethodBeat.o(116716);
  }

  public final void cancel(boolean paramBoolean)
  {
    AppMethodBeat.i(116718);
    ab.i("MicroMsg.SceneVoiceInputAddr", "cancel fromUI = %s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.gbg = null;
    l(false, paramBoolean);
    AppMethodBeat.o(116718);
  }

  public final int getMaxAmplitudeRate()
  {
    int i = this.gaS;
    this.gaS = 0;
    if (i > cri)
      cri = i;
    return i * 100 / cri;
  }

  public final void init(int paramInt1, int paramInt2, g.b paramb)
  {
    this.gaD = paramInt1;
    this.gbg = paramb;
    this.scene = paramInt2;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(116715);
    String[] arrayOfString = ((a)paramm).amk();
    List localList = ((a)paramm).amn();
    long l = System.currentTimeMillis();
    int i;
    int k;
    if (arrayOfString == null)
    {
      i = -1;
      int j = paramm.hashCode();
      if (this.gba != null)
        break label160;
      k = -1;
      label56: ab.d("MicroMsg.SceneVoiceInputAddr", "onSceneEnd time %s errType:%s errCode:%s list:%s scene.hashCode():%s,this.hashCode():%s", new Object[] { Long.valueOf(l), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
      if ((this.gba != null) && (paramm.hashCode() == this.gba.hashCode()))
        break label172;
      ab.d("MicroMsg.SceneVoiceInputAddr", "onSceneEnd scene.hashCode() != mVoiceRecogScene.hashCode()");
      AppMethodBeat.o(116715);
    }
    while (true)
    {
      return;
      i = arrayOfString.length;
      break;
      label160: k = this.gba.hashCode();
      break label56;
      label172: if (this.gbg != null)
      {
        if ((paramInt2 != 0) || (paramInt1 != 0))
        {
          if ((paramString != null) && (paramString.equalsIgnoreCase("SecurityCheckError")))
            this.gbg.c(13, 132, -1, -1L);
          while (true)
          {
            cancel(false);
            AppMethodBeat.o(116715);
            break;
            if ((paramString != null) && (paramString.equalsIgnoreCase("ReadFileLengthError")))
              this.gbg.c(13, 133, -1, -1L);
            else
              this.gbg.c(11, paramInt1, paramInt2, ((a)paramm).amm());
          }
        }
        this.gbg.b(arrayOfString, localList);
        if (((paramm instanceof c)) && (this.gaT == 0) && (((c)paramm).gay.amy()))
        {
          this.gbg.amw();
          cancel(false);
        }
      }
      AppMethodBeat.o(116715);
    }
  }

  public final void start()
  {
    AppMethodBeat.i(116714);
    ab.i("MicroMsg.SceneVoiceInputAddr", "start record");
    d.f(new g.a(this, (byte)0), "SceneVoiceInputAddr_record");
    AppMethodBeat.o(116714);
  }

  public final void stop(boolean paramBoolean)
  {
    AppMethodBeat.i(116717);
    ab.i("MicroMsg.SceneVoiceInputAddr", "stop fromUI = %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((!paramBoolean) && (this.gbg != null))
      this.gbg.ams();
    l(true, true);
    AppMethodBeat.o(116717);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.g
 * JD-Core Version:    0.6.2
 */