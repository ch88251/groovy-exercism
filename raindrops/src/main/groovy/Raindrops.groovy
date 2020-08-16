class Raindrops {

    def convert(num) {
        Map possibilities = [ 3: 'Pling', 5: 'Plang', 7: 'Plong' ]
        return possibilities.collect { factor, sound ->
            num % factor ? '' : sound 
        }.join() ?: "$num"
    }

}
