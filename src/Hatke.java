import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Hatke {
	public static void main(String[] args) throws Exception {
		int  q,t,n,j,k,x;
		long a[],maxl,maxr,res;
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		Reader r= new Reader();
		t=r.nextInt();
		for(int i=0;i<t;i++) {
	//		String[] nq=br.readLine().split(" ");
			n=r.nextInt();
			q=r.nextInt();
			a= new long[n];
		//	String inp[]= br.readLine().split(" ");
			for(j=0;j<n;j++) {
				a[j]=r.nextLong();
				}
			for(j=0;j<q;j++) {
				x=r.nextInt();
				maxl=0;
				maxr=0;
				res=0;
				for(k=0;k<x-1;k++) {
					maxl=max(maxl,a[k],a[x-1]);
				}
				for(k=x;k<n;k++) {
					maxr=max(maxr,a[k],a[x-1]);
				}
				res =maxl*a[x-1]*maxr;
				bw.append(String.valueOf(res) + System.lineSeparator());
			}
		}
		bw.close();
		r.close();


	}
	public static long max(long a1,long a2,long val) {
		if(a2<=val) {
			return a2>=a1?a2:a1;
		}
		return a1;
	}
	static class Reader
	{
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader()
		{
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}
		
		public String readLine() throws IOException
		{
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1)
			{
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException
		{
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do
			{
				ret = ret * 10 + c - '0';
			}  while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException
		{
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			}
			while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public double nextDouble() throws IOException
		{
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();

			do {
				ret = ret * 10 + c - '0';
			}
			while ((c = read()) >= '0' && c <= '9');

			if (c == '.')
			{
				while ((c = read()) >= '0' && c <= '9')
				{
					ret += (c - '0') / (div *= 10);
				}
			}

			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException
		{
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException
		{
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException
		{
			if (din == null)
				return;
			din.close();
		}
	}
}
