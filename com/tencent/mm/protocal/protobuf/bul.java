package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bul extends bsr
{
  public String csB;
  public String state;
  public int wII;
  public LinkedList<String> wIJ;
  public String wWc;
  public int wcA;

  public bul()
  {
    AppMethodBeat.i(10234);
    this.wIJ = new LinkedList();
    AppMethodBeat.o(10234);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10235);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.wII);
      paramArrayOfObject.e(4, 1, this.wIJ);
      if (this.csB != null)
        paramArrayOfObject.e(5, this.csB);
      if (this.state != null)
        paramArrayOfObject.e(6, this.state);
      if (this.wWc != null)
        paramArrayOfObject.e(7, this.wWc);
      paramArrayOfObject.iz(8, this.wcA);
      AppMethodBeat.o(10235);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label691;
    label691: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(3, this.wII) + e.a.a.a.c(4, 1, this.wIJ);
      i = paramInt;
      if (this.csB != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.csB);
      paramInt = i;
      if (this.state != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.state);
      i = paramInt;
      if (this.wWc != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wWc);
      paramInt = i + e.a.a.b.b.a.bs(8, this.wcA);
      AppMethodBeat.o(10235);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wIJ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10235);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bul localbul = (bul)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        case 2:
        default:
          AppMethodBeat.o(10235);
          paramInt = -1;
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbul.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(10235);
          paramInt = i;
          break;
        case 3:
          localbul.wII = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10235);
          paramInt = i;
          break;
        case 4:
          localbul.wIJ.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(10235);
          paramInt = i;
          break;
        case 5:
          localbul.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10235);
          paramInt = i;
          break;
        case 6:
          localbul.state = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10235);
          paramInt = i;
          break;
        case 7:
          localbul.wWc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10235);
          paramInt = i;
          break;
        case 8:
          localbul.wcA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10235);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(10235);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bul
 * JD-Core Version:    0.6.2
 */