package a.i.b.a.c.b.a;

import a.f.b.j;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

public enum e
{
  public final String BfB;

  static
  {
    AppMethodBeat.i(119319);
    e locale1 = new e("FIELD", 0);
    Bfr = locale1;
    e locale2 = new e("FILE", 1);
    Bfs = locale2;
    e locale3 = new e("PROPERTY", 2);
    Bft = locale3;
    e locale4 = new e("PROPERTY_GETTER", 3, "get");
    Bfu = locale4;
    e locale5 = new e("PROPERTY_SETTER", 4, "set");
    Bfv = locale5;
    e locale6 = new e("RECEIVER", 5);
    Bfw = locale6;
    e locale7 = new e("CONSTRUCTOR_PARAMETER", 6, "param");
    Bfx = locale7;
    e locale8 = new e("SETTER_PARAMETER", 7, "setparam");
    Bfy = locale8;
    e locale9 = new e("PROPERTY_DELEGATE_FIELD", 8, "delegate");
    Bfz = locale9;
    BfA = new e[] { locale1, locale2, locale3, locale4, locale5, locale6, locale7, locale8, locale9 };
    AppMethodBeat.o(119319);
  }

  private e(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iload_2
    //   3: invokespecial 88	java/lang/Enum:<init>	(Ljava/lang/String;I)V
    //   6: ldc 89
    //   8: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   11: aload_3
    //   12: astore_1
    //   13: aload_3
    //   14: ifnonnull +40 -> 54
    //   17: aload_0
    //   18: invokevirtual 93	a/i/b/a/c/b/a/e:name	()Ljava/lang/String;
    //   21: astore_1
    //   22: aload_1
    //   23: ifnonnull +20 -> 43
    //   26: new 95	a/v
    //   29: dup
    //   30: ldc 97
    //   32: invokespecial 100	a/v:<init>	(Ljava/lang/String;)V
    //   35: astore_1
    //   36: ldc 89
    //   38: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   41: aload_1
    //   42: athrow
    //   43: aload_1
    //   44: invokevirtual 105	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   47: astore_1
    //   48: aload_1
    //   49: ldc 107
    //   51: invokestatic 112	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   54: aload_0
    //   55: aload_1
    //   56: putfield 114	a/i/b/a/c/b/a/e:BfB	Ljava/lang/String;
    //   59: ldc 89
    //   61: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   64: return
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.a.e
 * JD-Core Version:    0.6.2
 */