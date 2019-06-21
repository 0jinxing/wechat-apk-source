package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bsz extends com.tencent.mm.bt.a
{
  public int FileSize;
  public String Url;
  public int wVf;
  public int wVg;
  public LinkedList<bzu> wVh;
  public String wVi;
  public String wdO;
  public com.tencent.mm.bt.b wdt;

  public bsz()
  {
    AppMethodBeat.i(80164);
    this.wVh = new LinkedList();
    AppMethodBeat.o(80164);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80165);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wdO == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: MD5");
        AppMethodBeat.o(80165);
        throw paramArrayOfObject;
      }
      if (this.Url == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: Url");
        AppMethodBeat.o(80165);
        throw paramArrayOfObject;
      }
      if (this.wVi == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: OriginalMD5");
        AppMethodBeat.o(80165);
        throw paramArrayOfObject;
      }
      if (this.wdO != null)
        paramArrayOfObject.e(1, this.wdO);
      paramArrayOfObject.iz(2, this.wVf);
      if (this.Url != null)
        paramArrayOfObject.e(3, this.Url);
      paramArrayOfObject.iz(4, this.wVg);
      paramArrayOfObject.e(5, 8, this.wVh);
      if (this.wdt != null)
        paramArrayOfObject.c(6, this.wdt);
      if (this.wVi != null)
        paramArrayOfObject.e(7, this.wVi);
      paramArrayOfObject.iz(8, this.FileSize);
      AppMethodBeat.o(80165);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wdO == null)
        break label853;
    label853: for (paramInt = e.a.a.b.b.a.f(1, this.wdO) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wVf);
      paramInt = i;
      if (this.Url != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.Url);
      i = paramInt + e.a.a.b.b.a.bs(4, this.wVg) + e.a.a.a.c(5, 8, this.wVh);
      paramInt = i;
      if (this.wdt != null)
        paramInt = i + e.a.a.b.b.a.b(6, this.wdt);
      i = paramInt;
      if (this.wVi != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wVi);
      paramInt = i + e.a.a.b.b.a.bs(8, this.FileSize);
      AppMethodBeat.o(80165);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wVh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wdO == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: MD5");
          AppMethodBeat.o(80165);
          throw paramArrayOfObject;
        }
        if (this.Url == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: Url");
          AppMethodBeat.o(80165);
          throw paramArrayOfObject;
        }
        if (this.wVi == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: OriginalMD5");
          AppMethodBeat.o(80165);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80165);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bsz localbsz = (bsz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80165);
          break;
        case 1:
          localbsz.wdO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80165);
          paramInt = i;
          break;
        case 2:
          localbsz.wVf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80165);
          paramInt = i;
          break;
        case 3:
          localbsz.Url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80165);
          paramInt = i;
          break;
        case 4:
          localbsz.wVg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80165);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bzu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bzu)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbsz.wVh.add(localObject1);
          }
          AppMethodBeat.o(80165);
          paramInt = i;
          break;
        case 6:
          localbsz.wdt = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(80165);
          paramInt = i;
          break;
        case 7:
          localbsz.wVi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80165);
          paramInt = i;
          break;
        case 8:
          localbsz.FileSize = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80165);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80165);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bsz
 * JD-Core Version:    0.6.2
 */