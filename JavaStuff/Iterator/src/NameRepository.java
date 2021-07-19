import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameRepository implements Container{
    private List<String> nameList = new ArrayList<>();

    public void addName(String name){
        nameList.add(name);
    }

    @Override
    public Iterator getLefttoRightIterator() {
        return new LefttoRightIterator();
    }

    @Override
    public Iterator getRighttoLeftIterator() {
        return new RighttoLeftIterator();
    }

    @Override
    public Iterator getAlphabeticalIterator() {
        return new AlphabeticalIterator();
    }

    public class LefttoRightIterator implements Iterator{
        int index;
        @Override
        public Object next() {
            if(this.hasNext()){
                return nameList.get(index++);
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            if(index < nameList.size()){
                return true;
            }
            else{
                return false;
            }

        }
    }
    public class RighttoLeftIterator implements Iterator{
        int index = nameList.size() - 1;
        @Override
        public Object next() {
            if(this.hasNext()){
                return nameList.get(index--);
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            if(index >= 0){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public class AlphabeticalIterator implements Iterator{
        int index;
        private List<String>sortedName = nameList.stream().sorted().collect(Collectors.toList());

        @Override
        public Object next() {
            if(this.hasNext()){
                return sortedName.get(index++);
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            return index < nameList.size();
        }
    }
}
