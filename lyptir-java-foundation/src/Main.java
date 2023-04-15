import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    ArrayList<Block> lyptir = new ArrayList<>();
    public static void main(String[] args){
        String[] genesisTransactions = {"genesis block string 12", "genesis block string 2"};
        Block genesisBlock = new Block(0, genesisTransactions);
        System.out.println(genesisBlock.getBlockHash());

        String[] block1Transactions = {"transaction_1 block string 36", "transaction_1 block string 2"};
        Block block1 = new Block(genesisBlock.getBlockHash(), block1Transactions);
        System.out.println(block1.getBlockHash());

        String[] block2Transactions = {"transaction_2 block string 3256", "transaction_2 block string 2"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
        System.out.println(block2.getBlockHash());

        String[] block3Transactions = {"transaction_2 block string 3256", "transaction_2 block string 24f"};
        Block block3 = new Block(genesisBlock.getBlockHash(), block3Transactions);
        System.out.println(block3.getBlockHash());

    }


}