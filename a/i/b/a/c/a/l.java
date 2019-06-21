package a.i.b.a.c.a;

import a.f.b.j;
import a.i.b.a.c.f.a;
import a.i.b.a.c.f.b;
import a.i.b.a.c.f.c;
import a.i.b.a.c.f.f;
import com.tencent.matrix.trace.core.AppMethodBeat;

public enum l
{
  final f BbZ;
  final a BcA;
  final a BcB;

  static
  {
    AppMethodBeat.i(119115);
    Object localObject1 = a.avW("kotlin/UByte");
    j.o(localObject1, "ClassId.fromString(\"kotlin/UByte\")");
    localObject1 = new l("UBYTE", 0, (a)localObject1);
    Bcv = (l)localObject1;
    Object localObject2 = a.avW("kotlin/UShort");
    j.o(localObject2, "ClassId.fromString(\"kotlin/UShort\")");
    localObject2 = new l("USHORT", 1, (a)localObject2);
    Bcw = (l)localObject2;
    Object localObject3 = a.avW("kotlin/UInt");
    j.o(localObject3, "ClassId.fromString(\"kotlin/UInt\")");
    localObject3 = new l("UINT", 2, (a)localObject3);
    Bcx = (l)localObject3;
    Object localObject4 = a.avW("kotlin/ULong");
    j.o(localObject4, "ClassId.fromString(\"kotlin/ULong\")");
    localObject4 = new l("ULONG", 3, (a)localObject4);
    Bcy = (l)localObject4;
    Bcz = new l[] { localObject1, localObject2, localObject3, localObject4 };
    AppMethodBeat.o(119115);
  }

  private l(a parama)
  {
    // Byte code:
    //   0: aload_3
    //   1: ldc 81
    //   3: invokestatic 84	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: aload_1
    //   8: iload_2
    //   9: invokespecial 87	java/lang/Enum:<init>	(Ljava/lang/String;I)V
    //   12: ldc 88
    //   14: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   17: aload_0
    //   18: aload_3
    //   19: putfield 90	a/i/b/a/c/a/l:BcB	La/i/b/a/c/f/a;
    //   22: aload_0
    //   23: getfield 90	a/i/b/a/c/a/l:BcB	La/i/b/a/c/f/a;
    //   26: getfield 94	a/i/b/a/c/f/a:ByN	La/i/b/a/c/f/b;
    //   29: getfield 100	a/i/b/a/c/f/b:ByQ	La/i/b/a/c/f/c;
    //   32: invokevirtual 106	a/i/b/a/c/f/c:ehK	()La/i/b/a/c/f/f;
    //   35: astore_1
    //   36: aload_1
    //   37: ldc 108
    //   39: invokestatic 42	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   42: aload_0
    //   43: aload_1
    //   44: putfield 110	a/i/b/a/c/a/l:BbZ	La/i/b/a/c/f/f;
    //   47: aload_0
    //   48: new 30	a/i/b/a/c/f/a
    //   51: dup
    //   52: aload_0
    //   53: getfield 90	a/i/b/a/c/a/l:BcB	La/i/b/a/c/f/a;
    //   56: getfield 113	a/i/b/a/c/f/a:BcW	La/i/b/a/c/f/b;
    //   59: new 115	java/lang/StringBuilder
    //   62: dup
    //   63: invokespecial 117	java/lang/StringBuilder:<init>	()V
    //   66: aload_0
    //   67: getfield 110	a/i/b/a/c/a/l:BbZ	La/i/b/a/c/f/f;
    //   70: getfield 123	a/i/b/a/c/f/f:name	Ljava/lang/String;
    //   73: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: ldc 129
    //   78: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   84: invokestatic 137	a/i/b/a/c/f/f:avX	(Ljava/lang/String;)La/i/b/a/c/f/f;
    //   87: invokespecial 140	a/i/b/a/c/f/a:<init>	(La/i/b/a/c/f/b;La/i/b/a/c/f/f;)V
    //   90: putfield 142	a/i/b/a/c/a/l:BcA	La/i/b/a/c/f/a;
    //   93: ldc 88
    //   95: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   98: return
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.l
 * JD-Core Version:    0.6.2
 */