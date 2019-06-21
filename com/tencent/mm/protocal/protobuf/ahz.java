package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ahz extends com.tencent.mm.bt.a
{
  public int DesignerUin;
  public int OpCode;
  public int wdI;
  public SKBuiltinBuffer_t wok;
  public String wol;
  public int wom;
  public long won;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(62548);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.OpCode);
      paramArrayOfObject.iz(2, this.DesignerUin);
      if (this.wok != null)
      {
        paramArrayOfObject.iy(3, this.wok.computeSize());
        this.wok.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.wdI);
      if (this.wol != null)
        paramArrayOfObject.e(5, this.wol);
      paramArrayOfObject.iz(6, this.wom);
      paramArrayOfObject.ai(7, this.won);
      AppMethodBeat.o(62548);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.OpCode) + 0 + e.a.a.b.b.a.bs(2, this.DesignerUin);
        paramInt = i;
        if (this.wok != null)
          paramInt = i + e.a.a.a.ix(3, this.wok.computeSize());
        i = paramInt + e.a.a.b.b.a.bs(4, this.wdI);
        paramInt = i;
        if (this.wol != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.wol);
        paramInt = paramInt + e.a.a.b.b.a.bs(6, this.wom) + e.a.a.b.b.a.o(7, this.won);
        AppMethodBeat.o(62548);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(62548);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ahz localahz = (ahz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62548);
          break;
        case 1:
          localahz.OpCode = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62548);
          paramInt = 0;
          break;
        case 2:
          localahz.DesignerUin = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62548);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localahz.wok = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(62548);
          paramInt = 0;
          break;
        case 4:
          localahz.wdI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62548);
          paramInt = 0;
          break;
        case 5:
          localahz.wol = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62548);
          paramInt = 0;
          break;
        case 6:
          localahz.wom = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62548);
          paramInt = 0;
          break;
        case 7:
          localahz.won = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(62548);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(62548);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ahz
 * JD-Core Version:    0.6.2
 */