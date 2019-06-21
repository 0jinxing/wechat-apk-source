package com.tencent.mm.bt;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.OutputStream;

public class a
{
  protected static final int OPCODE_COMPUTESIZE = 1;
  protected static final int OPCODE_PARSEFROM = 2;
  protected static final int OPCODE_POPULATEBUILDERWITHFIELD = 3;
  protected static final int OPCODE_WRITEFIELDS = 0;
  public static e.a.a.a.a.b unknownTagHandler;

  static
  {
    AppMethodBeat.i(51815);
    unknownTagHandler = new e.a.a.a.a.a();
    AppMethodBeat.o(51815);
  }

  public static int getNextFieldNumber(e.a.a.a.a parama)
  {
    int i = 0;
    AppMethodBeat.i(51817);
    e.a.a.b.a.a locala = parama.BTU;
    if ((locala.bxm == locala.bufferSize) && (!locala.sd(false)))
      locala.bxn = 0;
    while (true)
    {
      parama.BTV = i;
      i = e.a.a.b.a.fz(parama.BTV);
      AppMethodBeat.o(51817);
      return i;
      locala.bxn = locala.vd();
      if (locala.bxn == 0)
      {
        parama = e.a.a.b.a.b.emy();
        AppMethodBeat.o(51817);
        throw parama;
      }
      i = locala.bxn;
    }
  }

  public int computeSize()
  {
    int i = 0;
    AppMethodBeat.i(51820);
    try
    {
      j = op(1, new Object[0]);
      AppMethodBeat.o(51820);
      return j;
    }
    catch (Exception localException)
    {
      while (true)
      {
        AppMethodBeat.o(51820);
        int j = i;
      }
    }
  }

  protected int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(51818);
    paramArrayOfObject = new Error("Cannot use this method");
    AppMethodBeat.o(51818);
    throw paramArrayOfObject;
  }

  public a parseFrom(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(51821);
    op(2, new Object[] { paramArrayOfByte });
    AppMethodBeat.o(51821);
    return this;
  }

  public boolean populateBuilderWithField(e.a.a.a.a parama, a parama1, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(51822);
    if (op(3, new Object[] { parama, parama1, Integer.valueOf(paramInt) }) == 0)
      AppMethodBeat.o(51822);
    while (true)
    {
      return bool;
      AppMethodBeat.o(51822);
      bool = false;
    }
  }

  public byte[] toByteArray()
  {
    AppMethodBeat.i(51816);
    validate();
    byte[] arrayOfByte = new byte[computeSize()];
    e.a.a.c.a locala = new e.a.a.c.a(arrayOfByte);
    writeFields(locala);
    if (locala.output != null)
    {
      locala.output.write(locala.BTW);
      locala.output.flush();
    }
    AppMethodBeat.o(51816);
    return arrayOfByte;
  }

  protected a validate()
  {
    return this;
  }

  public void writeFields(e.a.a.c.a parama)
  {
    AppMethodBeat.i(51819);
    op(0, new Object[] { parama });
    AppMethodBeat.o(51819);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bt.a
 * JD-Core Version:    0.6.2
 */