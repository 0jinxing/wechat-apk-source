package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cer extends com.tencent.mm.bt.a
{
  public String jBB;
  public String jCH;
  public int pcX;
  public long vQE;
  public int wGu;
  public int xar;
  public int xek;
  public int xem;
  public SKBuiltinBuffer_t xen;
  public LinkedList<cdv> xeo;
  public int xep;
  public LinkedList<cdv> xeq;
  public int xer;
  public int xes;

  public cer()
  {
    AppMethodBeat.i(56534);
    this.xeo = new LinkedList();
    this.xeq = new LinkedList();
    AppMethodBeat.o(56534);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56535);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xen == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ObjDesc");
        AppMethodBeat.o(56535);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.ai(1, this.vQE);
      if (this.jBB != null)
        paramArrayOfObject.e(2, this.jBB);
      if (this.jCH != null)
        paramArrayOfObject.e(3, this.jCH);
      paramArrayOfObject.iz(4, this.pcX);
      paramArrayOfObject.iz(5, this.xem);
      if (this.xen != null)
      {
        paramArrayOfObject.iy(6, this.xen.computeSize());
        this.xen.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(7, this.xar);
      paramArrayOfObject.e(8, 8, this.xeo);
      paramArrayOfObject.iz(9, this.xep);
      paramArrayOfObject.e(10, 8, this.xeq);
      paramArrayOfObject.iz(11, this.wGu);
      paramArrayOfObject.iz(12, this.xer);
      paramArrayOfObject.iz(13, this.xek);
      paramArrayOfObject.iz(14, this.xes);
      AppMethodBeat.o(56535);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.o(1, this.vQE) + 0;
        paramInt = i;
        if (this.jBB != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.jBB);
        i = paramInt;
        if (this.jCH != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.jCH);
        i = i + e.a.a.b.b.a.bs(4, this.pcX) + e.a.a.b.b.a.bs(5, this.xem);
        paramInt = i;
        if (this.xen != null)
          paramInt = i + e.a.a.a.ix(6, this.xen.computeSize());
        paramInt = paramInt + e.a.a.b.b.a.bs(7, this.xar) + e.a.a.a.c(8, 8, this.xeo) + e.a.a.b.b.a.bs(9, this.xep) + e.a.a.a.c(10, 8, this.xeq) + e.a.a.b.b.a.bs(11, this.wGu) + e.a.a.b.b.a.bs(12, this.xer) + e.a.a.b.b.a.bs(13, this.xek) + e.a.a.b.b.a.bs(14, this.xes);
        AppMethodBeat.o(56535);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xeo.clear();
        this.xeq.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xen == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ObjDesc");
          AppMethodBeat.o(56535);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56535);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cer localcer = (cer)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56535);
          break;
        case 1:
          localcer.vQE = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56535);
          paramInt = 0;
          break;
        case 2:
          localcer.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56535);
          paramInt = 0;
          break;
        case 3:
          localcer.jCH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56535);
          paramInt = 0;
          break;
        case 4:
          localcer.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56535);
          paramInt = 0;
          break;
        case 5:
          localcer.xem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56535);
          paramInt = 0;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcer.xen = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(56535);
          paramInt = 0;
          break;
        case 7:
          localcer.xar = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56535);
          paramInt = 0;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cdv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cdv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcer.xeo.add(localObject1);
          }
          AppMethodBeat.o(56535);
          paramInt = 0;
          break;
        case 9:
          localcer.xep = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56535);
          paramInt = 0;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cdv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcer.xeq.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56535);
          paramInt = 0;
          break;
        case 11:
          localcer.wGu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56535);
          paramInt = 0;
          break;
        case 12:
          localcer.xer = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56535);
          paramInt = 0;
          break;
        case 13:
          localcer.xek = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56535);
          paramInt = 0;
          break;
        case 14:
          localcer.xes = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56535);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56535);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cer
 * JD-Core Version:    0.6.2
 */